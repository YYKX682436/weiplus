package pk2;

/* loaded from: classes3.dex */
public final class o4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356059h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356059h = helper.f356089i0;
        this.f356060i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView finderLiveLocationView;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        D(2);
        mf2.b0 b0Var = (if2.b) o9Var.e(yf2.z0.class);
        if (b0Var == null || !(b0Var instanceof jm2.c) || (finderLiveLocationView = (com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView) ((yf2.z0) ((jm2.c) b0Var)).S6(com.tencent.mm.R.id.l0q)) == null) {
            return;
        }
        finderLiveLocationView.h();
    }

    public final void D(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 64L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356060i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356059h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ozf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.location_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f356059h;
    }
}
