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
	file://defconfig "

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(imx7d-sbc-iot-imx7)"