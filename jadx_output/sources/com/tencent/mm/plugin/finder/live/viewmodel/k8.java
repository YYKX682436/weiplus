package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l8 f117202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.tencent.mm.plugin.finder.live.viewmodel.l8 l8Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(2);
        this.f117202d = l8Var;
        this.f117203e = appCompatActivity;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.viewmodel.h8 item = (com.tencent.mm.plugin.finder.live.viewmodel.h8) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.live.viewmodel.l8 l8Var = this.f117202d;
        android.widget.ProgressBar progressBar = l8Var.f117223e;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(booleanValue ? 1 : 0);
        r45.z63 z63Var = item.f117132d;
        z63Var.set(2, valueOf);
        ek2.q1 q1Var = ek2.r1.f253524u;
        java.lang.String string = z63Var.getString(0);
        if (string == null) {
            string = "";
        }
        r45.hx0 b17 = q1Var.b(string, booleanValue);
        new ek2.r1(l8Var.f117226h, l8Var.f117227i, this.f117203e instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI ? 1 : 2, b17).l().K(new com.tencent.mm.plugin.finder.live.viewmodel.j8(l8Var, booleanValue, item));
        return jz5.f0.f302826a;
    }
}
