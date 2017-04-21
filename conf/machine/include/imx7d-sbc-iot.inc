# Common settings for IMX7D Iot Gate boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_u-boot ?= "u-boot-imx7d-iot-gate"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-imx7d-iot-gate"
PREFERRED_VERSION_linux-imx7d-iot-gate ?= "4.1.15"

SERIAL_CONSOLE = "115200 ttymxc1"

MACHINE_FEATURES += " pci rtc"

KERNEL_IMAGETYPE = "uImage"

IMX_TEST_SUPPORT = "y"
