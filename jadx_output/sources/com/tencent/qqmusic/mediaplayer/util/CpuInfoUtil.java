package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes13.dex */
public class CpuInfoUtil {
    private static final java.lang.String CUR_CPU_FREQ = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
    private static final java.lang.String TAG = "CpuInfoUtil";
    private static com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.OutputCpuThread mCurrThread;

    /* loaded from: classes13.dex */
    public static class OutputCpuThread extends java.lang.Thread {
        public boolean isStop;

        public OutputCpuThread(java.lang.String str) {
            super(str);
            this.isStop = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.Process process;
            super.run();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.io.BufferedReader bufferedReader = null;
            try {
                try {
                    process = java.lang.Runtime.getRuntime().exec("top -m 10 -s cpu -t");
                    try {
                        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                        bufferedReader = null;
                        loop0: while (true) {
                            int i17 = 0;
                            while (true) {
                                try {
                                    try {
                                        java.lang.String readLine = bufferedReader2.readLine();
                                        if (readLine == null || this.isStop) {
                                            try {
                                                bufferedReader2.close();
                                                break loop0;
                                            } catch (java.io.IOException e17) {
                                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, e17);
                                            }
                                        } else {
                                            i17++;
                                            sb6.append(readLine);
                                            sb6.append("\n");
                                            if (i17 > 15) {
                                                try {
                                                    com.tencent.qqmusic.mediaplayer.util.Logger.d(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, sb6.toString());
                                                    sb6.delete(0, sb6.length() - 1);
                                                    java.lang.Thread.sleep(5000L);
                                                    break;
                                                } catch (java.lang.Exception e18) {
                                                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, e18);
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (java.io.IOException e19) {
                                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, e19);
                                            }
                                        }
                                        if (process == null) {
                                            throw th;
                                        }
                                        process.destroy();
                                        throw th;
                                    }
                                } catch (java.lang.Exception e27) {
                                    e = e27;
                                    bufferedReader = bufferedReader2;
                                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, e);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (java.io.IOException e28) {
                                            com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.TAG, e28);
                                        }
                                    }
                                    if (process == null) {
                                        return;
                                    }
                                    process.destroy();
                                }
                            }
                        }
                    } catch (java.lang.Exception e29) {
                        e = e29;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                process = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                process = null;
            }
            process.destroy();
        }
    }

    public static void outputCpuHZToLog() {
    }

    public static void outputThreadInfoToLog() {
    }

    public static synchronized void startProcessInfoOutput() {
        synchronized (com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.class) {
        }
    }

    public static synchronized void stopProcessInfoOutput() {
        synchronized (com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil.class) {
            mCurrThread = null;
        }
    }
}
