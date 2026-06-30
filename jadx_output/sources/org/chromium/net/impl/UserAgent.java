package org.chromium.net.impl;

/* loaded from: classes13.dex */
public final class UserAgent {
    private static final int VERSION_CODE_UNINITIALIZED = 0;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static int sVersionCode;

    private UserAgent() {
    }

    private static void appendCronetVersion(java.lang.StringBuilder sb6) {
        sb6.append(" Cronet/");
        sb6.append(org.chromium.net.impl.ImplVersion.getCronetVersion());
    }

    public static java.lang.String from(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getPackageName());
        sb6.append('/');
        sb6.append(versionFromContext(context));
        sb6.append(" (Linux; U; Android ");
        sb6.append(android.os.Build.VERSION.RELEASE);
        sb6.append("; ");
        sb6.append(java.util.Locale.getDefault().toString());
        java.lang.String str = android.os.Build.MODEL;
        if (str.length() > 0) {
            sb6.append("; ");
            sb6.append(str);
        }
        java.lang.String str2 = android.os.Build.ID;
        if (str2.length() > 0) {
            sb6.append("; Build/");
            sb6.append(str2);
        }
        sb6.append(";");
        appendCronetVersion(sb6);
        sb6.append(')');
        return sb6.toString();
    }

    public static java.lang.String getQuicUserAgentIdFrom(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getPackageName());
        appendCronetVersion(sb6);
        return sb6.toString();
    }

    private static int versionFromContext(android.content.Context context) {
        int i17;
        synchronized (sLock) {
            if (sVersionCode == 0) {
                try {
                    sVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Cannot determine package version");
                }
            }
            i17 = sVersionCode;
        }
        return i17;
    }
}
