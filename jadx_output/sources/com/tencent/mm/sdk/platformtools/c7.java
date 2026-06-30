package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class c7 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicBoolean f192504a;

    public static java.lang.String a(android.content.Context context) {
        java.util.List<android.content.ComponentName> activeAdmins;
        try {
            android.app.admin.DevicePolicyManager devicePolicyManager = (android.app.admin.DevicePolicyManager) context.getSystemService("device_policy");
            if (devicePolicyManager == null || (activeAdmins = devicePolicyManager.getActiveAdmins()) == null) {
                return "host";
            }
            java.util.Iterator<android.content.ComponentName> it = activeAdmins.iterator();
            while (it.hasNext()) {
                if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                    return "work";
                }
            }
            return "host";
        } catch (java.lang.Exception unused) {
            return "host";
        }
    }

    public static int b() {
        return android.os.Process.myUserHandle().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static java.lang.String c(android.content.Context context) {
        int b17 = b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(b17));
        int i17 = -1;
        i17 = -1;
        try {
            android.os.UserManager userManager = (android.os.UserManager) context.getSystemService("user");
            if (userManager != null) {
                for (android.os.UserHandle userHandle : userManager.getUserProfiles()) {
                    if (!arrayList.contains(java.lang.Integer.valueOf(userHandle.hashCode()))) {
                        arrayList.add(java.lang.Integer.valueOf(userHandle.hashCode()));
                    }
                }
                i17 = userManager.isSystemUser();
            }
        } catch (java.lang.Throwable unused) {
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                str = str + "|";
            }
            str = str + num;
        }
        return str + " sys(" + i17 + ")";
    }

    public static boolean d(android.content.Context context) {
        boolean z17;
        if (f192504a == null) {
            if (b() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    android.os.UserManager userManager = (android.os.UserManager) context.getSystemService("user");
                    if (userManager != null) {
                        java.util.Iterator<android.os.UserHandle> it = userManager.getUserProfiles().iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(it.next().hashCode()));
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
                if (arrayList.size() > 1) {
                    z17 = "host".equals(a(context));
                    f192504a = new java.util.concurrent.atomic.AtomicBoolean(z17);
                }
            }
            z17 = false;
            f192504a = new java.util.concurrent.atomic.AtomicBoolean(z17);
        }
        return f192504a.get();
    }
}
