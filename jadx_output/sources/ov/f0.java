package ov;

@j95.b
/* loaded from: classes7.dex */
public final class f0 extends i95.w implements pv.c0 {
    public void Ai(pv.b0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        f17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "clickFloatMenu scene: %s", scene);
        if (f17.i()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(f17.h()).A(f17.e(scene), 0);
        com.tencent.mm.plugin.ball.service.p4.f93206t = java.lang.Boolean.TRUE;
        com.tencent.mm.sdk.platformtools.o4.M(f17.h()).G("content_menu_clicked", true);
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            f17.l(com.tencent.mm.sdk.platformtools.w9.f193053a);
            return;
        }
        f17.l(com.tencent.mm.sdk.platformtools.w9.f193058f);
        f17.l(com.tencent.mm.sdk.platformtools.w9.f193059g);
        f17.l(com.tencent.mm.sdk.platformtools.w9.f193060h);
        f17.l(com.tencent.mm.sdk.platformtools.w9.f193061i);
        f17.l(com.tencent.mm.sdk.platformtools.w9.f193062j);
    }

    public java.lang.String Bi(pv.a0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        int ordinal = scene.ordinal();
        if (ordinal == 0) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ncj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nck);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nck);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nci);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        return string4;
    }

    public boolean Di(pv.a0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else if (bm5.o1.f22719a.i(new com.tencent.mm.repairer.config.floatball.RepairerConfigContentBallEducation(), 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallEducationService", "hasShownEduView scene: " + scene + ", always show for test");
            return false;
        }
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        f17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.ball.service.p4.f93204r;
        int i17 = scene.f358478d;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean i18 = com.tencent.mm.sdk.platformtools.o4.M(f17.h()).i("content_edu_" + i17, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "isContentBallEducationViewShown scene: %s, shown: %s", scene, java.lang.Boolean.valueOf(i18));
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i18));
        return i18;
    }

    public void Ni(pv.b0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        boolean z17 = false;
        f17.a(false);
        if (!f17.i() && com.tencent.mm.plugin.ball.service.p4.f93206t.booleanValue()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.ball.service.p4.f93205s;
            int i17 = scene.f358486d;
            java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            if (num == null) {
                num = 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "decrementMenuNewCanShowCount scene: %s, canShowCount: %s", scene, num);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.Math.max(java.lang.Integer.valueOf(num.intValue() - 1).intValue(), 0));
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), valueOf);
            com.tencent.mm.sdk.platformtools.o4.M(f17.h()).A(f17.e(scene), valueOf.intValue());
            pv.b0[] values = pv.b0.values();
            int length = values.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = true;
                    break;
                } else if (f17.g(values[i18]) > 0) {
                    break;
                } else {
                    i18++;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "checkBallMenuAllSceneNotShow allNotShow");
                com.tencent.mm.plugin.ball.service.p4.f93207u = java.lang.Boolean.TRUE;
                com.tencent.mm.sdk.platformtools.o4.M(f17.h()).G("content_menu_all_not_show", true);
            }
        }
    }

    public void Ri(pv.a0 scene, boolean z17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        f17.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.ball.service.p4.f93204r;
        int i17 = scene.f358478d;
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "saveContentBallEducationViewShown scene: %s, shown: %s", scene, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.o4.M(f17.h()).G("content_edu_" + i17, z17);
    }

    public boolean wi(pv.b0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        f17.getClass();
        f17.a(com.tencent.mm.sdk.platformtools.x2.j());
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag scene: %s, allNotShow: %s", scene, com.tencent.mm.plugin.ball.service.p4.f93207u);
        if (f17.i()) {
            return false;
        }
        if (com.tencent.mm.plugin.ball.service.p4.f93206t.booleanValue()) {
            int g17 = f17.g(scene);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag scene: %s, canShowCount: %s", scene, java.lang.Integer.valueOf(g17));
            if (g17 <= 0) {
                return false;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "canShowFloatMenuNewFlag not click and always show");
        }
        return true;
    }
}
