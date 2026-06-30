package pk2;

/* loaded from: classes3.dex */
public final class d3 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355650h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355650h = helper.f356077c0;
        this.f355651i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        df2.gq gqVar = (df2.gq) this.f364427a.e(df2.gq.class);
        if (gqVar != null) {
            gqVar.b7();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355651i;
    }

    @Override // qk2.f
    public boolean o() {
        return (((mm2.e1) this.f364427a.f356074b.a(mm2.e1.class)).b7() || (((mm2.n0) this.f364427a.f356074b.a(mm2.n0.class)).f329273r)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355650h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nsb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_regular_prize, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355650h;
    }
}
