package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class vb {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.StringBuffer f211148d;

    /* renamed from: e, reason: collision with root package name */
    public static long f211149e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f211150a;

    /* renamed from: b, reason: collision with root package name */
    public long f211151b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.MMAppMgr$Receiver f211152c;

    public static void a(com.tencent.mm.ui.vb vbVar, android.content.Intent intent, boolean z17) {
        vbVar.getClass();
        java.lang.String stringExtra = intent.getStringExtra("classname");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "dealWithClickStream className is null, broadcast should set this intent flag");
            return;
        }
        java.lang.String substring = stringExtra.substring(stringExtra.lastIndexOf(".") + 1);
        z65.c.f470456b = substring;
        if (f211148d == null) {
            f211148d = new java.lang.StringBuffer(800);
            f211149e = com.tencent.mm.sdk.platformtools.t8.i1();
            f211148d.append("start:");
            f211148d.append(com.tencent.mm.sdk.platformtools.t8.i1());
            f211148d.append("|");
        }
        if (z17) {
            if ("desktop".equals(vbVar.f211150a)) {
                f211148d.append("desktop:");
                f211148d.append((android.os.SystemClock.elapsedRealtime() - vbVar.f211151b) + 800);
                f211148d.append("|");
            }
            vbVar.f211151b = android.os.SystemClock.elapsedRealtime();
            vbVar.f211150a = substring;
        } else {
            f211148d.append(vbVar.f211150a + ":");
            f211148d.append(android.os.SystemClock.elapsedRealtime() - vbVar.f211151b);
            f211148d.append("|");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "dkact classname %s, isAcitvity %b", substring, java.lang.Boolean.valueOf(z17));
    }

    public static void b(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        if (sharedPreferences.getBoolean("Main_ShortCut", false)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.tencent.mm.R.string.f492389gb3));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(new android.content.ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.tencent.mm.R.drawable.icon));
        intent.putExtra("shortcut_icon_resource_id", com.tencent.mm.R.drawable.icon);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("is_main_shortcut", true);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.c.a(context, intent, null, null, false);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("Main_ShortCut", true);
        edit.commit();
    }

    public static void c(android.content.Context context) {
        d(context, true, 2);
    }

    public static void d(android.content.Context context, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplication, pid=" + android.os.Process.myPid());
        mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMAppMgr", "exitApplication", new java.lang.Object[0]);
        gm0.j1.i().f273208a.f273302g.e(z17);
        com.tencent.mars.WeChatMars.onSingalCrash(0);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onSingalCrash(0);
        }
        com.tencent.mm.sdk.platformtools.MMNativeJpeg.Destroy();
        com.tencent.mm.booter.q2.c();
        if (c01.d9.e() != null && c01.d9.e().f70764d != null) {
            c01.d9.e().f70764d.r1(z17);
        }
        if (i17 == 1) {
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI != null) {
                launcherUI.finish();
            }
            f(z17);
            return;
        }
        if (i17 == 2) {
            android.content.Intent intent = new android.content.Intent().setClass(context, com.tencent.mm.ui.LauncherUI.class);
            intent.addFlags(67108864);
            intent.putExtra("absolutely_exit_pid", android.os.Process.myPid());
            intent.putExtra("kill_service", z17);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAppMgr", th6, "[-] Fail to start launcherUI in suicide.", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 != 3) {
            throw new java.lang.IllegalArgumentException("Unknown exit by type " + i17);
        }
        android.content.Intent intent2 = new android.content.Intent().setClass(context, com.tencent.mm.ui.LauncherUI.class);
        intent2.addFlags(32768);
        intent2.putExtra("absolutely_exit_pid", android.os.Process.myPid());
        intent2.putExtra("kill_service", z17);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        } else {
            intent2.addFlags(268435456);
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAppMgr", th7, "[-] Fail to start launcherUI in suicide.", new java.lang.Object[0]);
        }
    }

    public static void e() {
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).e();
    }

    public static void f(boolean z17) {
        com.tencent.mm.plugin.report.service.f0.e(8);
        h(z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "killApplication", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "killApplication", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    public static void g() {
        h(true);
    }

    public static void h(boolean z17) {
        java.lang.String name = java.lang.Thread.currentThread().getName();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.os.Process.myPid());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAppMgr", "killProcess thread:%s proc:%d stack:%s, killService:%b", name, valueOf, new com.tencent.mm.sdk.platformtools.z3(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            i();
        }
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 2;
        logoutEvent.e();
        k();
        if (z17) {
            gm0.m.f273234w = com.tencent.mm.sdk.platformtools.z3.b(true);
            gm0.j1.i().r();
        }
        com.tencent.mars.xlog.Log.appenderClose();
        com.tencent.mars.WeChatMars.onSingalCrash(0);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onSingalCrash(0);
        }
        m45.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193072b + ":recovery", com.tencent.mm.sdk.platformtools.x2.f193072b + ":support", com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand0", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand1", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand2", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand3", com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand4");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "clearAllWebViewCache");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "clear cookie failed : %s", e17);
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static void i() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context != null) {
            if (com.tencent.mm.booter.o.d()) {
                com.tencent.mm.app.d0.e();
            } else {
                try {
                    context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.CoreService.class));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMAppMgr", "killService() Exception:%s", e17.getMessage());
                }
            }
            j45.l.D(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.NotifyReceiver.NotifyService.class));
            l85.h1.f(new android.content.Intent().setClassName(context, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"), "exdevice", true, j45.l.e("exdevice"));
        }
    }

    public static boolean j(android.app.Activity activity, android.content.DialogInterface.OnClickListener onClickListener) {
        android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        boolean z17 = sharedPreferences.getBoolean("gprs_alert", true);
        com.tencent.mm.sdk.platformtools.a0.f192446i &= z17;
        if (z17) {
            android.content.Context baseContext = activity.getBaseContext();
            if (!com.tencent.mm.app.m7.f53523a) {
                synchronized (com.tencent.mm.app.m7.class) {
                    if (!com.tencent.mm.app.m7.f53523a) {
                        c01.je.h();
                        of5.b.f345110a = new com.tencent.mm.app.e7();
                        com.tencent.mm.app.m7.a(baseContext);
                        c01.je.f37271a.add(new com.tencent.mm.app.f7(baseContext));
                        com.tencent.mm.app.m7.f53523a = true;
                    }
                }
            }
            android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.bih, null);
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.p9.e(activity.getString(com.tencent.mm.R.string.hln));
            java.lang.String e18 = com.tencent.mm.sdk.platformtools.p9.e(activity.getString(com.tencent.mm.R.string.gqu));
            java.lang.String e19 = com.tencent.mm.sdk.platformtools.p9.e(activity.getString(com.tencent.mm.R.string.gqt, e17, e18));
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(e19);
            newSpannable.setSpan(new com.tencent.mm.ui.rb(activity), e19.indexOf(e17), e19.indexOf(e17) + e17.length(), 33);
            newSpannable.setSpan(new android.text.style.StyleSpan(1), e19.indexOf(e18), e19.indexOf(e18) + e18.length(), 33);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j8q);
            textView.setText(newSpannable);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            com.tencent.mm.ui.widget.dialog.j0 I = db5.e1.I(activity, false, null, inflate, activity.getString(com.tencent.mm.R.string.f490939bb1), activity.getString(com.tencent.mm.R.string.gqq), new com.tencent.mm.ui.sb(sharedPreferences, activity, onClickListener), new com.tencent.mm.ui.gb(activity));
            if (I == null) {
                return false;
            }
            I.setOnCancelListener(new com.tencent.mm.ui.hb(activity));
        }
        return z17;
    }

    public static void k() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(800);
        java.lang.StringBuffer stringBuffer2 = f211148d;
        if (stringBuffer2 == null) {
            f211148d = stringBuffer;
            f211149e = com.tencent.mm.sdk.platformtools.t8.i1();
            return;
        }
        java.lang.String stringBuffer3 = stringBuffer2.toString();
        int length = stringBuffer3.length() - 1;
        int i17 = 0;
        while (length >= 0) {
            if (stringBuffer3.charAt(length) == '|') {
                i17++;
            }
            if (i17 == 3) {
                break;
            } else {
                length--;
            }
        }
        stringBuffer.append(stringBuffer3.substring(length + 1));
        f211148d = stringBuffer;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "oreh report clickstream %s", stringBuffer3);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10508, "1," + f211149e + "," + stringBuffer3);
        f211149e = com.tencent.mm.sdk.platformtools.t8.i1();
    }
}
