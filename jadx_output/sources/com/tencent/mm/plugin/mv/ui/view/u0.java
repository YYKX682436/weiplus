package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f151955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f151956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f151957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z17, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        super(1);
        this.f151955d = z17;
        this.f151956e = f0Var;
        this.f151957f = f0Var2;
        this.f151958g = musicMVCardChooseView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (!this.f151955d) {
            int i17 = (int) (this.f151956e.f310116d * floatValue);
            kotlin.jvm.internal.f0 f0Var = this.f151957f;
            int i18 = i17 - f0Var.f310116d;
            f0Var.f310116d = i17;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f151958g.f151620e;
            if (recyclerView != null) {
                recyclerView.scrollBy(0, i18);
            }
        }
        return jz5.f0.f302826a;
    }
}
