package pk2;

/* loaded from: classes3.dex */
public final class r4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356213h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356213h = helper.I0;
        this.f356214i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "onItemClicked: 触发重度违规mock");
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.g0 g0Var = dk2.ef.f233394l;
        if (g0Var != null) {
            g0Var.g();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356214i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        s(menu, this.f356213h, "重度违规-整改遮罩(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
    }

    @Override // qk2.h
    public int y() {
        return this.f356213h;
    }
}
