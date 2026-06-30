package pk2;

/* loaded from: classes3.dex */
public final class m2 extends qk2.h implements qk2.c {

    /* renamed from: h, reason: collision with root package name */
    public final int f355986h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f355987i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f355988j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355986h = helper.V;
        this.f355987i = true;
        this.f355988j = "startlive.more.newmusic";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) this.f364427a.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        if (r5Var != null) {
            r5Var.f7();
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f355987i;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355988j;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        boolean b76 = ((mm2.e1) o9Var.f356074b.a(mm2.e1.class)).b7();
        boolean z17 = zl2.r4.f473950a.L(o9Var.f356074b) || ((mm2.m6) o9Var.f356074b.a(mm2.m6.class)).f329248p;
        if (this.f364428b != 1 || b76 || !z17) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        return !(r5Var != null ? r5Var.b7(6) : false);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        pk2.o9 o9Var2 = this.f364427a;
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var2.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        jz5.l g76 = r5Var != null ? r5Var.g7(o9Var.f356078d, false) : null;
        if (g76 != null) {
            s(menu, this.f355986h, (java.lang.CharSequence) g76.f302833d, ((java.lang.Number) g76.f302834e).intValue());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var2.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        if (r5Var2 != null) {
            r5Var2.m7();
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f355986h;
    }
}
