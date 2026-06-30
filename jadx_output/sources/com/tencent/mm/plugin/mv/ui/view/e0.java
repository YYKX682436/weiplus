package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f151813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f151814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f151815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(1);
        this.f151813d = f0Var;
        this.f151814e = f0Var2;
        this.f151815f = recyclerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int floatValue = (int) (this.f151813d.f310116d * ((java.lang.Number) obj).floatValue());
        kotlin.jvm.internal.f0 f0Var = this.f151814e;
        int i17 = floatValue - f0Var.f310116d;
        f0Var.f310116d = floatValue;
        this.f151815f.scrollBy(0, i17);
        return jz5.f0.f302826a;
    }
}
