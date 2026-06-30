package jp1;

/* loaded from: classes11.dex */
public final class b implements gp1.n {
    @Override // gp1.n
    public void N9(int i17, np1.a aVar, int i18, android.os.Bundle bundle, gp1.m mVar) {
        java.lang.String str;
        bw5.ar0 ar0Var;
        int i19;
        android.os.Bundle bundle2;
        if (bundle == null || (str = bundle.getString("key_red_dot_buffer")) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        bw5.ar0 ar0Var2 = bw5.ar0.TingScene_MediaControlCenter;
        if (!(bundle != null && bundle.containsKey("key_enter_scene")) || (ar0Var = bw5.ar0.i(bundle.getInt("key_enter_scene"))) == null) {
            ar0Var = ar0Var2;
        }
        il4.e eVar = new il4.e(null, 0, ar0Var.f25422d, false, null, null, 0, 0, false, false, null, java.lang.Integer.valueOf(i18), null, str2, null, null, false, false, null, null, false, null, false, null, false, 33544187, null);
        il4.f fVar = eVar.f292122s;
        fVar.f292130b = true;
        if (bundle != null && (bundle2 = bundle.getBundle("key_active_ext_info")) != null) {
            java.util.Set<java.lang.String> keySet = bundle2.keySet();
            kotlin.jvm.internal.o.f(keySet, "keySet(...)");
            for (java.lang.String str3 : keySet) {
                java.lang.Object obj = bundle2.get(str3);
                if (obj instanceof java.lang.String) {
                    java.util.Map map = fVar.f292133e;
                    kotlin.jvm.internal.o.d(str3);
                    map.put(str3, obj);
                }
            }
        }
        boolean z17 = bundle != null ? bundle.getBoolean("key_enter_my_album") : false;
        if (bundle != null) {
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).L(true);
            i19 = 0;
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).N(false);
        } else {
            i19 = 0;
        }
        if (z17) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qk.f9.e(aj6, context, ar0Var, null, 0, java.lang.Integer.valueOf(i19), null, 36, null);
            return;
        }
        qk.f9 aj7 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((rk4.k8) aj7).y(context2, bundle, ar0Var, eVar, new jp1.a(mVar));
    }

    @Override // gp1.n
    public void T7(np1.a playInfo, int i17, int i18) {
        kotlin.jvm.internal.o.g(playInfo, "playInfo");
        rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
        if (z8Var.ij()) {
            z8Var.wj();
            return;
        }
        bw5.fr0 Ui = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).Ui(playInfo);
        if (Ui != null) {
            boolean[] zArr = Ui.f27499n;
            if (zArr[3] || zArr[1]) {
                z8Var.tj(Ui, new il4.e(null, 0, i17, false, null, null, 0, 0, false, false, null, java.lang.Integer.valueOf(i18), null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingAudioPanelEventListener", "tingTaskSnapshot do not has PlayingItem and TapeItem");
    }

    @Override // gp1.n
    public void X1(np1.a playInfo) {
        kotlin.jvm.internal.o.g(playInfo, "playInfo");
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
    }
}
