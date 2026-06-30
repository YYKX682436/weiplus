package rc0;

@j95.b
/* loaded from: classes12.dex */
public class l extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mm.app.i4.a(new rc0.k(this));
        boolean z17 = false;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.fundation.RepairerConfigForceDelayFSAsyncPreload()) == 1) {
            y45.r.a(context).f226618b.putBoolean("sk_enable_https_patch_channel", true);
        } else {
            y45.r.a(context).f226618b.putBoolean("sk_enable_https_patch_channel", false);
        }
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            final android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (!d55.r0.d(context2)) {
                new d55.w(context2, "recovery_exercise").e();
                if ((r0.getInt("exercise_flags", 0) & 4) == 4) {
                    d55.w wVar = new d55.w(context2, "recovery_exercise");
                    wVar.e();
                    final int i17 = wVar.getInt("exercise_delay", 5);
                    d55.w wVar2 = new d55.w(context2, "recovery_exercise");
                    wVar2.e();
                    final int i18 = wVar2.getInt("exercise_times", 3);
                    android.os.Bundle bundle = new android.os.Bundle();
                    android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("recovery_exercise", 4);
                    if (sharedPreferences == null) {
                        throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
                    }
                    final java.lang.String string = bundle.containsKey("exercise_crash_type") ? bundle.getString("exercise_crash_type") : sharedPreferences.getString("exercise_crash_type", "");
                    if (i17 > 0 && i17 < 100 && i18 > 0 && y45.b.a(string)) {
                        new android.os.Handler().postDelayed(new java.lang.Runnable(context2, i17, i18, string) { // from class: y45.b$$a

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ android.content.Context f459364d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ int f459365e;

                            /* renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ java.lang.String f459366f;

                            {
                                this.f459365e = i18;
                                this.f459366f = string;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.String[] strArr = {"java", "native", "kill"};
                                java.lang.String str = this.f459366f;
                                if ("random".equals(str)) {
                                    str = strArr[new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(3)];
                                }
                                int i19 = this.f459365e - 1;
                                android.content.Context context3 = this.f459364d;
                                d55.m.a(context3, i19);
                                if (i19 <= 0) {
                                    y45.b.b(context3);
                                }
                                if ("java".equals(str)) {
                                    throw new java.lang.RuntimeException("!!Fake JavaCrash for recovery timer practise!!");
                                }
                                if ("native".equals(str)) {
                                    try {
                                        java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.VMDebug");
                                        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
                                        declaredMethod.setAccessible(true);
                                        java.lang.reflect.Method method = (java.lang.reflect.Method) declaredMethod.invoke(cls, com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, new java.lang.Class[0]);
                                        method.setAccessible(true);
                                        method.invoke(null, new java.lang.Object[0]);
                                        return;
                                    } catch (java.lang.Exception unused) {
                                        android.os.Process.sendSignal(android.os.Process.myPid(), 6);
                                        return;
                                    }
                                }
                                if (!"kill".equals(str)) {
                                    if (com.tencent.mm.app.MMBugReportContents.f53222c.equals(str)) {
                                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new y45.c());
                                        return;
                                    }
                                    return;
                                }
                                int myPid = android.os.Process.myPid();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(java.lang.Integer.valueOf(myPid));
                                java.lang.Object obj = new java.lang.Object();
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/recovery/RecoveryExercise", "mockKillProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(obj, "com/tencent/mm/recovery/RecoveryExercise", "mockKillProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            }
                        }, i17 * 1000);
                        z17 = true;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("RecoveryOnSplashService", "Scheduling recovery exercise = %s", java.lang.Boolean.valueOf(z17));
        }
    }
}
