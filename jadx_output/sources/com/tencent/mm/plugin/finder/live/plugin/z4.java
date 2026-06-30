package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f115280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        super(0);
        this.f115280d = a5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f115280d;
        a5Var.w1();
        android.view.ViewGroup viewGroup = a5Var.f365323d;
        android.content.Context context = viewGroup.getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        ll2.e eVar = ll2.e.f319133a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity2 = appCompatActivity;
        ll2.e.l(eVar, appCompatActivity2, a5Var.D1(), a5Var.I, a5Var.H, null, 16, null);
        ll2.e.l(eVar, appCompatActivity2, a5Var.E1(), a5Var.f111810z, a5Var.A, null, 16, null);
        ll2.e.l(eVar, appCompatActivity2, a5Var.G1(), a5Var.f111802t, a5Var.f111803u, null, 16, null);
        ll2.e.l(eVar, appCompatActivity2, a5Var.F1(), a5Var.R, a5Var.S, null, 16, null);
        com.tencent.mm.plugin.finder.live.plugin.a5.u1(a5Var, true);
        if (((mm2.c1) a5Var.P0(mm2.c1.class)).l7()) {
            a5Var.B1(null);
        } else {
            long E0 = zl2.r4.f473950a.E0(a5Var.S0());
            boolean A = pm0.v.A(E0, 256L);
            boolean A2 = pm0.v.A(E0, 512L);
            int size = je2.g.S6((je2.g) a5Var.P0(je2.g.class), false, 1, null).size();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "checkStickerEntranceVisible liveFunSwitchFlags:" + E0 + ",enableTextSticker:" + A + ",enablePictureSticker:" + A2 + ",textBubbleSize:" + size + '!');
            android.widget.RelativeLayout relativeLayout = a5Var.f111804v;
            if ((!A || size <= 0) && !A2) {
                relativeLayout.setVisibility(8);
            } else {
                relativeLayout.setVisibility(0);
            }
            a5Var.f111807x0 = 1;
            viewGroup.setVisibility(0);
            viewGroup.animate().translationY(0.0f).setDuration(200L).setListener(null).start();
            android.view.ViewGroup viewGroup2 = a5Var.D;
            kotlin.jvm.internal.o.f(viewGroup2, "access$getMenuBeauty$p(...)");
            a5Var.J1(viewGroup2, ml2.u1.V, a5Var.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty");
            android.view.ViewGroup viewGroup3 = a5Var.f111805w;
            kotlin.jvm.internal.o.f(viewGroup3, "access$getMenuMirror$p(...)");
            a5Var.J1(viewGroup3, ml2.u1.W, a5Var.E1());
            android.view.ViewGroup viewGroup4 = a5Var.f111801s;
            kotlin.jvm.internal.o.f(viewGroup4, "access$getMenuSwitchCamera$p(...)");
            a5Var.J1(viewGroup4, ml2.u1.X, a5Var.G1());
            android.view.View view = a5Var.L;
            kotlin.jvm.internal.o.f(view, "access$getChangeModeView$p(...)");
            a5Var.J1(view, ml2.u1.f328072p0, null);
            eVar.j(a5Var.I1() ? "anchorlive.bottom.videosetting.makeup" : "startlive.bottom.videosetting.makeup", false);
            com.tencent.mm.plugin.finder.live.widget.fe.b(a5Var.X, 1, null, null, 0L, 14, null);
            com.tencent.mm.plugin.finder.live.widget.sv.b(a5Var.Y, 1, null, null, 0L, 14, null);
            if (relativeLayout.getVisibility() == 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                if (((mm2.c1) a5Var.P0(mm2.c1.class)).S) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.y6((zy2.zb) c17, ml2.z4.G1, jSONObject2, null, 4, null);
                } else {
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c18;
                    ml2.c1 c1Var = ml2.c1.f327325e;
                    zy2.zb.j5(zbVar, 39L, jSONObject2, null, 4, null);
                }
            }
            if (a5Var.Q.getVisibility() == 0) {
                eVar.j(a5Var.F1(), false);
            }
            if (a5Var.G.isShown()) {
                eVar.j(a5Var.D1(), false);
            }
            a5Var.w1();
        }
        return jz5.f0.f302826a;
    }
}
