package org.chromium.base;

/* loaded from: classes13.dex */
public final class StrictModeContext implements java.io.Closeable {
    private final android.os.StrictMode.ThreadPolicy mThreadPolicy;
    private final android.os.StrictMode.VmPolicy mVmPolicy;

    private StrictModeContext(android.os.StrictMode.ThreadPolicy threadPolicy, android.os.StrictMode.VmPolicy vmPolicy) {
        org.chromium.base.TraceEvent.startAsync("StrictModeContext", hashCode());
        this.mThreadPolicy = threadPolicy;
        this.mVmPolicy = vmPolicy;
    }

    public static org.chromium.base.StrictModeContext allowAllThreadPolicies() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowAllThreadPolicies");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(threadPolicy);
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static org.chromium.base.StrictModeContext allowAllVmPolicies() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowAllVmPolicies");
        try {
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(vmPolicy);
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static org.chromium.base.StrictModeContext allowDiskReads() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowDiskReads");
        try {
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(android.os.StrictMode.allowThreadDiskReads());
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static org.chromium.base.StrictModeContext allowDiskWrites() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowDiskWrites");
        try {
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(android.os.StrictMode.allowThreadDiskWrites());
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static org.chromium.base.StrictModeContext allowSlowCalls() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowSlowCalls");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(threadPolicy);
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static org.chromium.base.StrictModeContext allowUnbufferedIo() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("StrictModeContext.allowUnbufferedIo");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
            }
            org.chromium.base.StrictModeContext strictModeContext = new org.chromium.base.StrictModeContext(threadPolicy);
            if (scoped != null) {
                scoped.close();
            }
            return strictModeContext;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.os.StrictMode.ThreadPolicy threadPolicy = this.mThreadPolicy;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        android.os.StrictMode.VmPolicy vmPolicy = this.mVmPolicy;
        if (vmPolicy != null) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
        org.chromium.base.TraceEvent.finishAsync("StrictModeContext", hashCode());
    }

    private StrictModeContext(android.os.StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    private StrictModeContext(android.os.StrictMode.VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }
}
