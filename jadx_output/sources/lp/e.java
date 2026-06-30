package lp;

/* loaded from: classes12.dex */
public final class e implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320226a = 0;

    static {
        q25.b.b(new lp.e(), "//testdeviceinfo");
    }

    public static boolean b(android.content.Context context, java.lang.String str) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            int myUid = android.os.Process.myUid();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.uid == myUid && str.equals(runningAppProcessInfo.processName)) {
                    int i17 = runningAppProcessInfo.pid;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/console/command/DeviceInfoTest", "killProcessByName", "(Landroid/content/Context;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/console/command/DeviceInfoTest", "killProcessByName", "(Landroid/content/Context;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        char c17;
        boolean z17 = false;
        if (strArr == null || strArr.length < 2) {
            return false;
        }
        java.lang.String lowerCase = strArr[1].toLowerCase(java.util.Locale.ENGLISH);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1131353730) {
            if (lowerCase.equals("killmm")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -604107912) {
            if (hashCode == 1349183545 && lowerCase.equals("emu_migrate")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (lowerCase.equals("killpush")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        if (c17 == 0) {
            if (!b(context, context.getPackageName())) {
                android.widget.Toast.makeText(context.getApplicationContext(), "Failure", 1).show();
            }
            return true;
        }
        if (c17 == 1) {
            if (!b(context, context.getPackageName() + ":push")) {
                android.widget.Toast.makeText(context.getApplicationContext(), "Failure", 1).show();
            }
            return true;
        }
        if (c17 != 2) {
            return false;
        }
        boolean z18 = wo.w0.f447839a;
        if (z65.c.a()) {
            wo.r0 r0Var = wo.w0.f447850l;
            wo.v0 v0Var = r0Var.f447795b;
            try {
                v0Var.a();
                wo.q0 q0Var = r0Var.f447794a;
                v0Var.c();
                q0Var.d("device_model_for_test_" + java.lang.System.currentTimeMillis());
                wo.r0 r0Var2 = wo.w0.f447845g;
                v0Var = r0Var2.f447795b;
                try {
                    v0Var.a();
                    wo.q0 q0Var2 = r0Var2.f447794a;
                    v0Var.c();
                    q0Var2.d("android_id_for_test_" + java.lang.System.currentTimeMillis());
                    z17 = true;
                } finally {
                }
            } finally {
            }
        }
        if (!z17) {
            android.widget.Toast.makeText(context.getApplicationContext(), "Failure", 1).show();
        }
        return true;
    }
}
