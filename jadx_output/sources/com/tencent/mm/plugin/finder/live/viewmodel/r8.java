package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s8 f117366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(1);
        this.f117366d = s8Var;
        this.f117367e = appCompatActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.f8.d(pk2.f8.f355747a, 2, 0, 1, booleanValue ? 2 : 3, null, 16, null);
        com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var = this.f117366d;
        android.widget.ProgressBar progressBar = s8Var.f117400e;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        r45.hx0 e17 = ek2.r1.f253524u.e(booleanValue);
        new ek2.r1(s8Var.f117402g, s8Var.f117403h, this.f117367e instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI ? 1 : 2, e17).l().K(new com.tencent.mm.plugin.finder.live.viewmodel.q8(booleanValue, s8Var));
        return jz5.f0.f302826a;
    }
}
