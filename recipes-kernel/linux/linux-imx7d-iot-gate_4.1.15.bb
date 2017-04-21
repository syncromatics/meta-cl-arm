# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for the CompuLab IMX7 SoM"
DESCRIPTION = "Linux Kernel for the CompuLab IMX7 SoM"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
LOCALVERSION = "-2.0.1"
SRCREV = "42e130b08bdaf03be090a47922f566adce1b2ccf"

SRC_URI = "git.freescale.com/git/cgit.cgi/imx/linux-2.6-imx.git;protocol=http;branch=${SRCBRANCH} \
	file://defconfig \
    file://0001-ARM-dts-imx7d-cl-som-imx7-add-basic-module-support.patch \
    file://0002-use-gcc-inline-version.patch \
    file://0003-ARM-dts-imx7d-cl-som-imx7-add-support-for-gpio-led.patch \
    file://0004-ARM-dts-imx7d-sbc-imx7-add-support-for-pwm-backlight.patch \
    file://0005-ARM-dts-imx7d-sbc-imx7-add-gpio-extender-support.patch \
    file://0006-ARM-dts-imx7d-sbc-imx7-add-LCD-support.patch \
    file://0007-ARM-dts-imx7d-cl-som-imx7-add-support-for-touchscree.patch \
    file://0008-ARM-dts-imx7d-cl-som-imx7-add-support-for-SPI-flash.patch \
    file://0009-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-host.patch \
    file://0010-ARM-dts-imx7d-cl-som-imx7-add-support-for-RTC.patch \
    file://0011-ARM-dts-imx7d-cl-som-imx7-add-support-for-NAND-flash.patch \
    file://0012-platform-add-depends-property-handler.patch \
    file://0013-ARM-dts-imx7d-cl-som-imx7-add-depends-property-to-gp.patch \
    file://0014-ARM-dts-imx7d-sbc-imx7-add-support-for-baseboard-eep.patch \
    file://0015-ARM-dts-imx7d-cl-som-imx7-rework-Ethernet-PHY-init.patch \
    file://0016-sil164-add-dvi-transmitter-simple-driver.patch \
    file://0017-ARM-dts-imx7d-sbc-imx7-add-DVI-support.patch \
    file://0018-PCIe-imx6-imx7d-add-support-for-phy-refclk-source-co.patch \
    file://0019-ARM-dts-imx7d-sbc-imx7-add-PCIe-support.patch \
    file://0020-ARM-dts-imx7d-cl-som-imx7-add-WiLink8-WLAN-support.patch \
    file://0021-ARM-dts-imx7d-cl-som-imx7-add-defconfig.patch \
    file://0022-PCIe-imx6-refine-link-up-error-handle.patch \
    file://0023-MLK-11235-4-ARM-imx-gpcv2-add-reg_1p2-s-notifier.patch \
    file://0024-MLK-11235-5-usb-chipidea-imx-add-HSIC-support-for-im.patch \
    file://0025-MLK-11235-2-ARM-imx7d.dtsi-add-USB-HSIC-support.patch \
    file://0026-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-hub.patch \
    file://0027-ARM-dts-imx7d-cl-som-imx7-update-defconfig.patch \
    file://0028-Bluetooth-Add-tty-HCI-driver.patch \
    file://0029-btwilink-add-minimal-device-tree-support.patch \
    file://0030-ti-st-st_kim-use-gpio_set_value_cansleep-where-possi.patch \
    file://0031-ti-st-st_kim-fix-nshutdown_gpio-parsing.patch \
    file://0032-ti-st-st_kim-fix-build-time-warnings.patch \
    file://0033-ARM-dts-imx7d-cl-som-imx7-add-WiLink-Bluetooth-suppo.patch \
    file://0034-ASoC-simple-card-Add-tdm-slot-mask-support-to-simple.patch \
    file://0035-ASoC-simple-card-Add-system-clock-direction-DT-param.patch \
    file://0036-ASoC-simple-card-Add-system-clock-type-DT-parameter-.patch \
    file://0037-ASoC-fsl-add-analog-audio-support-switch-for-imx-boa.patch \
    file://0038-ARM-dts-imx7d-cl-som-imx7-add-analog-audio-support.patch \
    file://0039-ARM-dts-imx7d-sbc-imx7-add-CAN-bus-support.patch \
    file://0040-ARM-dts-imx7d-cl-som-imx7-update-defconfig.patch \
    file://0041-ARM-dts-imx7d-cl-som-imx7-release-kernel-v4.1.15-cl-.patch \
    file://0042-ARM-dts-imx7d-cl-som-imx7-change-codec-clock-source.patch \
    file://0043-ARM-dts-imx7d-cl-som-imx7-release-kernel-v4.1.15-cl-.patch \
    file://0044-ARM-dts-imx7d-cl-som-imx7-add-support-for-sb-iot-imx.patch \
    file://0045-ARM-dts-imx7d-cl-som-imx7-add-defconfig-for-sbc-iot-.patch \
    file://0046-ARM-dts-imx7d-cl-som-imx7-release-kernel-v4.1.15-cl-.patch \
    file://linux-4.1.15-cl-som-imx7-3.0.patch \
"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(imx7d-sbc-iot-imx7)"