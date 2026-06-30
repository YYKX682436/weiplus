package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPSystemInfo {
    public static final int CHIP_ARM_AARCH64 = 7;
    public static final int CHIP_ARM_LATER = 50;
    public static final int CHIP_ARM_V5 = 3;
    public static final int CHIP_ARM_V6 = 4;
    public static final int CHIP_ARM_V7_NENO = 6;
    public static final int CHIP_ARM_V7_NO_NENO = 5;
    public static final int CHIP_MIPS = 2;
    public static final int CHIP_UNKNOW = 0;
    public static final int CHIP_X86 = 1;
    public static final int CPU_HW_HISI = 2;
    public static final int CPU_HW_MTK = 1;
    public static final int CPU_HW_OTHER = -1;
    public static final int CPU_HW_QUALCOMM = 0;
    public static final int CPU_HW_SAMSUNG = 3;
    public static final int SDK_INT;
    private static long sAppInstallTime;
    public static int sScreenHeight;
    public static int sScreenWidth;
    private static final java.lang.String DEVICE_MANUFACTURER = android.os.Build.MANUFACTURER;
    private static final java.lang.String DEVICE_OS_VERSION = android.os.Build.VERSION.RELEASE;
    private static final java.lang.String PRODUCT_DEVICE = android.os.Build.DEVICE;
    private static final java.lang.String PRODUCT_BOARD = android.os.Build.BOARD;
    private static java.lang.String sProcessorName = "N/A";
    private static java.lang.String sFeature = "";
    private static java.lang.String sCpuHardware = "";
    private static java.lang.String sDeviceName = "";
    private static int sCpuArchitecture = 0;
    private static int sCpuHWProducter = -1;
    private static int sCpuHWProductIdx = -1;
    private static int sAudioBestSampleRate = 0;
    private static int sAudioBestFramesPerBust = 0;
    private static final java.lang.String[][] sCpuPerfList = {new java.lang.String[]{"MSM7227", "MSM7627", "MSM7227T", "MSM7627T", "MSM7227A", "MSM7627A", "QSD8250", "QSD8650", "MSM7230", "MSM7630", "APQ8055", "MSM8255", "MSM8655", "MSM8255T", "MSM8655T", "MSM8225", "MSM8625", "MSM8260", "MSM8660", "MSM8x25Q", "MSM8x26", "MSM8x10", "MSM8x12", "MSM8x30", "MSM8260A", "MSM8660A", "MSM8960", "MSM8208", "MSM8916", "MSM8960T", "MSM8909", "MSM8916v2", "MSM8936", "MSM8909v2", "MSM8917", "APQ8064", "APQ8064T", "MSM8920", "MSM8939", "MSM8937", "MSM8939v2", "MSM8940", "MSM8952", "MSM8974", "MSM8x74AA", "MSM8x74AB", "MSM8x74AC", "MSM8953", "APQ8084", "MSM8953Pro", "MSM8992", "MSM8956", "MSM8976", "MSM8976Pro", "MSM8994", "MSM8996", "MSM8996Pro", "MSM8998", "SDM845", "SM8150", "SM8250", "SM8250-AB", "SM8250-AC", "SM8350", "SM8350-AC", "SM8450"}, new java.lang.String[]{"MT6516", "MT6513", "MT6573", "MT6515M", "MT6515", "MT6575", "MT6572", "MT6577", "MT6589", "MT6582", "MT6592", "MT6595", "MT6735", "MT6750", "MT6753", "MT6752", "MT6755", "MT6755", "MT6755T", "MT6795", "MT6757", "MT675x", "MT6797", "MT6797T", "MT6797X", "MT6771V", "MT6799", "MT6769Z", "MT6785T", "MT6853V", "MT6853V", "MT6873", "MT6874", "MT6875", "MT6877", "MT6885", "MT6889V", "MT6889Z", "MT6891Z", "MT6893", "MT6983"}, new java.lang.String[]{"K3V2", "K3V2E", "K3V2+", "Kirin910", "Kirin920", "Kirin925", "Kirin928", "Kirin620", "Kirin650", "Kirin655", "Kirin930", "Kirin935", "Kirin950", "Kirin955", "Kirin960", "Kirin970", "Kirin810", "Kirin980", "Kirin820", "Kirin985", "Kirin990", "Kirin9000E", "Kirin9000"}, new java.lang.String[]{"S5L8900", "S5PC100", "Exynos3110", "Exynos3475", "Exynos4210", "Exynos4212", "SMDK4x12", "Exynos4412", "Exynos5250", "Exynos5260", "Exynos5410", "Exynos5420", "Exynos5422", "Exynos5430", "Exynos5800", "Exynos5433", "Exynos7580", "Exynos7870", "Exynos7870", "Exynos7420", "Exynos8890", "Exynos890", "Exynos8895", "Exynos9810", "Exynos9820", "Exynos9825", "Exynos990", "Exynos1080", "Exynos2100", "Exynos2200"}};
    private static long sMaxCpuFreq = -1;
    private static long sCurrentCpuFreq = -1;
    private static int sNumOfCores = -1;
    private static int sCpuArch = -1;
    private static int sOpenGLVersion = 0;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 25) {
            java.lang.String str = android.os.Build.VERSION.CODENAME;
            if (!android.text.TextUtils.isEmpty(str) && str.charAt(0) == 'O') {
                i17 = 26;
            }
        }
        SDK_INT = i17;
    }

    private static boolean checkPermission(android.content.Context context, java.lang.String str) {
        if (!hasMarshmallow()) {
            return true;
        }
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return android.provider.Settings.System.canWrite(context);
        }
        try {
            return b3.l.checkSelfPermission(context, str) == 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static int getApiLevel() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static int getBestAudioFramesPerBust() {
        return sAudioBestFramesPerBust;
    }

    public static int getBestAudioSampleRate() {
        return sAudioBestSampleRate;
    }

    public static int getCpuArchFromId(int i17) {
        if (i17 != 64) {
            switch (i17) {
                case 5:
                    return 3;
                case 6:
                    return 4;
                case 7:
                    return 6;
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return 0;
            }
        }
        return 7;
    }

    public static int getCpuArchitecture() {
        int i17 = sCpuArch;
        if (-1 != i17) {
            return i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCpuArchitecture Build.CPU_ABI: ");
        java.lang.String str = android.os.Build.CPU_ABI;
        sb6.append(str);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, sb6.toString());
        if (str.contains("arm64-v8a")) {
            sCpuArch = 7;
            return 7;
        }
        if (str != null && (str.contains("x86") || str.contains("X86"))) {
            sCpuArch = 1;
        } else if (str == null || !(str.contains("mips") || str.contains("Mips"))) {
            if (sCpuArchitecture == 0) {
                getCpuInfo();
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getCpuArchitecture mCpuArchitecture:" + sCpuArchitecture);
            if (!android.text.TextUtils.isEmpty(sCpuHardware) && sCpuHardware.contains("MSM8994")) {
                sCpuArch = 7;
                return 7;
            }
            if (isARMV5Whitelist()) {
                sCpuArch = 3;
                return 3;
            }
            if (!android.text.TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("ARMv6")) {
                sCpuArch = 4;
                return 4;
            }
            if (!android.text.TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("AArch64")) {
                sCpuArch = 7;
                return 7;
            }
            if (sCpuArchitecture == 7 && !android.text.TextUtils.isEmpty(sFeature) && !sFeature.contains("neon") && !sFeature.contains("asimd")) {
                sCpuArch = 4;
                return 4;
            }
            sCpuArch = getCpuArchFromId(sCpuArchitecture);
        } else {
            sCpuArch = 2;
        }
        return sCpuArch;
    }

    private static int getCpuHWProducer(java.lang.String str) {
        if (str.isEmpty()) {
            return -1;
        }
        if (str.contains("Exynos") || str.contains("SMDK") || str.contains("S5L8900") || str.contains("S5PC100")) {
            return 3;
        }
        if (str.contains("Kirin") || str.contains("K3V")) {
            return 2;
        }
        if (str.contains("MSM") || str.contains("APQ") || str.contains("QSD") || str.contains("SDM") || str.contains("SM")) {
            return 0;
        }
        return str.contains("MT6") ? 1 : -1;
    }

    public static int getCpuHWProductIndex(java.lang.String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        int i17 = sCpuHWProducter;
        if (i17 >= 0 && sCpuHWProductIdx < 0) {
            java.lang.String[] strArr = sCpuPerfList[i17];
            int i18 = -1;
            for (int i19 = 0; i19 < strArr.length; i19++) {
                if (str.contains(strArr[i19]) && (-1 == i18 || strArr[i19].length() > strArr[i18].length())) {
                    i18 = i19;
                }
            }
            sCpuHWProductIdx = i18;
        }
        return sCpuHWProductIdx;
    }

    public static int getCpuHWProducter(java.lang.String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        return sCpuHWProducter;
    }

    public static java.lang.String getCpuHarewareName() {
        if (android.text.TextUtils.isEmpty(sCpuHardware)) {
            getCpuInfo();
        }
        return sCpuHardware;
    }

    public static void getCpuInfo() {
        java.io.BufferedReader bufferedReader;
        java.io.InputStreamReader inputStreamReader = null;
        try {
            try {
                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.tencent.mapsdk.internal.rv.f51270c);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader2);
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                inputStreamReader2.close();
                                bufferedReader.close();
                                return;
                            }
                            parseCpuInfoLine(readLine);
                        } catch (java.lang.Throwable unused) {
                            inputStreamReader = inputStreamReader2;
                            try {
                                sCpuHardware = "Unknown";
                                sCpuArchitecture = 0;
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    return;
                                }
                                return;
                            } catch (java.lang.Throwable th6) {
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (java.io.IOException e17) {
                                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
                                        throw th6;
                                    }
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th6;
                            }
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (java.io.IOException e18) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e18.getMessage());
            }
        } catch (java.lang.Throwable unused3) {
            bufferedReader = null;
        }
    }

    public static long getCurrentCpuFreq() {
        java.io.InputStreamReader inputStreamReader;
        java.lang.Throwable th6;
        java.io.BufferedReader bufferedReader;
        java.lang.Exception e17;
        java.io.IOException e18;
        java.io.FileNotFoundException e19;
        java.lang.String readLine;
        long j17 = sCurrentCpuFreq;
        if (j17 > 0) {
            return j17;
        }
        try {
            try {
                try {
                    inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"), com.tencent.mapsdk.internal.rv.f51270c);
                    try {
                        bufferedReader = new java.io.BufferedReader(inputStreamReader);
                        try {
                            readLine = bufferedReader.readLine();
                        } catch (java.io.FileNotFoundException e27) {
                            e19 = e27;
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e19.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.io.IOException e28) {
                            e18 = e28;
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e18.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.lang.Exception e29) {
                            e17 = e29;
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
                            return r4;
                        }
                    } catch (java.io.FileNotFoundException e37) {
                        bufferedReader = null;
                        e19 = e37;
                    } catch (java.io.IOException e38) {
                        bufferedReader = null;
                        e18 = e38;
                    } catch (java.lang.Exception e39) {
                        bufferedReader = null;
                        e17 = e39;
                    } catch (java.lang.Throwable th8) {
                        bufferedReader = null;
                        th6 = th8;
                    }
                } finally {
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                }
            } catch (java.io.FileNotFoundException e47) {
                inputStreamReader = null;
                e19 = e47;
                bufferedReader = null;
            } catch (java.io.IOException e48) {
                inputStreamReader = null;
                e18 = e48;
                bufferedReader = null;
            } catch (java.lang.Exception e49) {
                inputStreamReader = null;
                e17 = e49;
                bufferedReader = null;
            } catch (java.lang.Throwable th9) {
                inputStreamReader = null;
                th6 = th9;
                bufferedReader = null;
            }
            if (readLine == null) {
                inputStreamReader.close();
                bufferedReader.close();
                inputStreamReader.close();
                bufferedReader.close();
                return 0L;
            }
            java.lang.String trim = readLine.trim();
            r4 = trim.length() > 0 ? java.lang.Long.parseLong(trim) : 1024000L;
            sCurrentCpuFreq = r4;
            inputStreamReader.close();
            bufferedReader.close();
            return r4;
        } catch (java.lang.Throwable th10) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th10.getMessage());
            return 0L;
        }
    }

    public static java.lang.String getDeviceManufacturer() {
        return DEVICE_MANUFACTURER;
    }

    public static synchronized java.lang.String getDeviceName() {
        java.lang.String str;
        synchronized (com.tencent.thumbplayer.core.common.TPSystemInfo.class) {
            if (android.text.TextUtils.isEmpty(sDeviceName)) {
                sDeviceName = android.os.Build.MODEL;
            }
            str = sDeviceName;
        }
        return str;
    }

    public static long getMaxCpuFreq() {
        java.io.BufferedReader bufferedReader;
        java.io.InputStreamReader inputStreamReader;
        java.lang.String readLine;
        long j17 = sMaxCpuFreq;
        if (-1 != j17) {
            return j17;
        }
        java.io.InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"), com.tencent.mapsdk.internal.rv.f51270c);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader);
                } catch (java.io.IOException unused) {
                    bufferedReader = null;
                } catch (java.lang.Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (java.io.IOException e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
            }
        } catch (java.io.IOException unused3) {
            bufferedReader = null;
        } catch (java.lang.Throwable unused4) {
            bufferedReader = null;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (java.io.IOException unused5) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            sMaxCpuFreq = r2;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "MaxCpuFreq " + sMaxCpuFreq);
            return r2;
        } catch (java.lang.Throwable unused6) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            sMaxCpuFreq = r2;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "MaxCpuFreq " + sMaxCpuFreq);
            return r2;
        }
        if (readLine == null) {
            inputStreamReader.close();
            bufferedReader.close();
            try {
                inputStreamReader.close();
                bufferedReader.close();
            } catch (java.io.IOException e18) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e18.getMessage());
            }
            return 0L;
        }
        java.lang.String trim = readLine.trim();
        r2 = trim.length() > 0 ? java.lang.Long.parseLong(trim) : 0L;
        inputStreamReader.close();
        bufferedReader.close();
        sMaxCpuFreq = r2;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "MaxCpuFreq " + sMaxCpuFreq);
        return r2;
    }

    public static int getNumCores() {
        int i17 = sNumOfCores;
        if (-1 != i17) {
            return i17;
        }
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(new java.io.FileFilter() { // from class: com.tencent.thumbplayer.core.common.TPSystemInfo.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file) {
                    return java.util.regex.Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            if (listFiles == null) {
                sNumOfCores = 1;
                return 1;
            }
            sNumOfCores = listFiles.length;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "core num " + sNumOfCores);
            return sNumOfCores;
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
            sNumOfCores = 1;
            return 1;
        }
    }

    public static int getOpenGLSupportVersion(android.content.Context context) {
        if (sOpenGLVersion == 0) {
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getApplicationContext().getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                if (activityManager == null) {
                    return sOpenGLVersion;
                }
                sOpenGLVersion = activityManager.getDeviceConfigurationInfo().reqGlEsVersion;
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            }
        }
        return sOpenGLVersion;
    }

    public static java.lang.String getOsVersion() {
        return DEVICE_OS_VERSION;
    }

    public static java.lang.String getProductBoard() {
        return PRODUCT_BOARD;
    }

    public static java.lang.String getProductDevice() {
        return PRODUCT_DEVICE;
    }

    public static int getScreenHeight(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int i17 = sScreenHeight;
        if (i17 != 0) {
            return i17;
        }
        try {
            sScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
        } catch (java.lang.Throwable unused) {
            sScreenHeight = 0;
        }
        return sScreenHeight;
    }

    public static int getScreenWidth(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int i17 = sScreenWidth;
        if (i17 != 0) {
            return i17;
        }
        try {
            sScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        } catch (java.lang.Throwable unused) {
            sScreenWidth = 0;
        }
        return sScreenWidth;
    }

    public static int getSystemCpuUsage(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return -1;
        }
        float f17 = -1.0f;
        try {
            java.lang.String[] split = str.trim().split("\\s+");
            long systemIdleTime = getSystemIdleTime(split);
            long systemUptime = getSystemUptime(split);
            java.lang.String[] split2 = str2.trim().split("\\s+");
            long systemIdleTime2 = getSystemIdleTime(split2);
            long systemUptime2 = getSystemUptime(split2);
            if (systemIdleTime >= 0 && systemUptime >= 0 && systemIdleTime2 >= 0 && systemUptime2 >= 0) {
                long j17 = systemIdleTime2 + systemUptime2;
                long j18 = systemIdleTime + systemUptime;
                if (j17 > j18 && systemUptime2 >= systemUptime) {
                    f17 = (((float) (systemUptime2 - systemUptime)) / ((float) (j17 - j18))) * 100.0f;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
        return (int) f17;
    }

    public static long getSystemIdleTime(java.lang.String[] strArr) {
        try {
            return java.lang.Long.parseLong(strArr[4]);
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }

    public static long getSystemUptime(java.lang.String[] strArr) {
        long j17 = 0;
        for (int i17 = 1; i17 < strArr.length; i17++) {
            if (4 != i17) {
                try {
                    j17 += java.lang.Long.parseLong(strArr[i17]);
                } catch (java.lang.Throwable unused) {
                    return -1L;
                }
            }
        }
        return j17;
    }

    private static boolean hasMarshmallow() {
        return true;
    }

    public static synchronized void initAudioBestSettings(android.content.Context context) {
        synchronized (com.tencent.thumbplayer.core.common.TPSystemInfo.class) {
            if (context != null) {
                if (sAudioBestSampleRate <= 0) {
                    android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
                    java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                    java.lang.String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
                    try {
                        sAudioBestSampleRate = java.lang.Integer.parseInt(property);
                        sAudioBestFramesPerBust = java.lang.Integer.parseInt(property2);
                    } catch (java.lang.NumberFormatException e17) {
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
                    }
                }
            }
        }
    }

    public static boolean isARMV5Whitelist() {
        return getDeviceName().equals("XT882") || getDeviceName().equals("ME860") || getDeviceName().equals("MB860") || getDeviceName().equals("Lenovo P70") || getDeviceName().equals("Lenovo A60") || getDeviceName().equals("Lenovo A366t");
    }

    private static void parseCpuInfoLine(java.lang.String str) {
        int indexOf;
        int indexOf2;
        if (str.contains("aarch64") || str.contains("AArch64")) {
            sCpuArchitecture = 64;
        }
        if (str.startsWith("Processor")) {
            int indexOf3 = str.indexOf(58);
            if (indexOf3 > 1) {
                java.lang.String substring = str.substring(indexOf3 + 1, str.length());
                sProcessorName = substring;
                sProcessorName = substring.trim();
                return;
            }
            return;
        }
        if (str.startsWith("CPU architecture")) {
            if (sCpuArchitecture != 0 || (indexOf2 = str.indexOf(58)) <= 1) {
                return;
            }
            java.lang.String trim = str.substring(indexOf2 + 1, str.length()).trim();
            if (trim.length() > 0 && trim.length() < 2) {
                sCpuArchitecture = (int) java.lang.Long.parseLong(trim);
                return;
            } else {
                if (trim.length() > 1) {
                    sCpuArchitecture = (int) java.lang.Long.parseLong(trim.substring(0, 1));
                    return;
                }
                return;
            }
        }
        if (str.startsWith("Features")) {
            int indexOf4 = str.indexOf(58);
            if (indexOf4 > 1) {
                sFeature = str.substring(indexOf4 + 1, str.length()).trim();
                return;
            }
            return;
        }
        if (!str.startsWith("Hardware") || (indexOf = str.indexOf(58)) <= 1) {
            return;
        }
        sCpuHardware = str.substring(indexOf + 1, str.length()).trim().replace(" ", "");
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "hardware " + sCpuHardware);
        getCpuHWProductIndex(sCpuHardware);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String readStringFromFile(java.io.File r6) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            long r2 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto L30
        L17:
            long r2 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            int r2 = (int) r2     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            char[] r2 = new char[r2]     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            long r3 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            int r6 = (int) r3     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r3 = 0
            int r6 = r1.read(r2, r3, r6)     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            if (r6 <= 0) goto L30
            java.lang.String r6 = new java.lang.String     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r6.<init>(r2)     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r0 = r6
        L30:
            r1.close()     // Catch: java.lang.Throwable -> L3b
            goto L3b
        L34:
            r6 = move-exception
            r0 = r1
            goto L3d
        L37:
            r1 = r0
        L38:
            if (r1 == 0) goto L3b
            goto L30
        L3b:
            return r0
        L3c:
            r6 = move-exception
        L3d:
            throw r6     // Catch: java.lang.Throwable -> L3e
        L3e:
            r6 = move-exception
            if (r0 == 0) goto L44
            r0.close()     // Catch: java.lang.Throwable -> L44
        L44:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.readStringFromFile(java.io.File):java.lang.String");
    }

    public static java.lang.String readSystemStat() {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.String str = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile("/proc/stat", "r");
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            }
        } catch (java.lang.Throwable unused) {
            randomAccessFile = null;
        }
        try {
            str = randomAccessFile.readLine();
            randomAccessFile.close();
        } catch (java.lang.Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return str;
        }
        return str;
    }

    public static synchronized void setDeviceName(java.lang.String str) {
        synchronized (com.tencent.thumbplayer.core.common.TPSystemInfo.class) {
            sDeviceName = str;
        }
    }

    public static boolean supportInDeviceDolbyAudioEffect() {
        boolean z17;
        java.lang.Exception e17;
        try {
            z17 = false;
            for (android.media.audiofx.AudioEffect.Descriptor descriptor : android.media.audiofx.AudioEffect.queryEffects()) {
                try {
                    if (descriptor.implementor.contains("Dolby Laboratories")) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
                    return z17;
                }
            }
        } catch (java.lang.Exception e19) {
            z17 = false;
            e17 = e19;
        }
        return z17;
    }

    private static void writeStringToFile(java.lang.String str, java.lang.String str2) {
        java.io.FileWriter fileWriter = null;
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() || !file.createNewFile()) {
                java.io.FileWriter fileWriter2 = new java.io.FileWriter(file, false);
                try {
                    fileWriter2.write(str2);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (java.lang.Throwable unused) {
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    public static int getCpuHWProductIndex(int i17, java.lang.String str) {
        if (i17 >= 0) {
            java.lang.String[][] strArr = sCpuPerfList;
            if (i17 >= strArr.length || android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            java.lang.String[] strArr2 = strArr[i17];
            for (int i18 = 0; i18 < strArr2.length; i18++) {
                if (android.text.TextUtils.equals(str, strArr2[i18])) {
                    return i18;
                }
            }
        }
        return -1;
    }
}
