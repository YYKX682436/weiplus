package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3 f121933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3 t3Var, int i17) {
        super(1);
        this.f121933d = t3Var;
        this.f121934e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f121933d.f121948e;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = it.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f121934e;
        }
        return jz5.f0.f302826a;
    }
}
