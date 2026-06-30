package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView f116322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f116323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f116324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView, yz5.l lVar, java.lang.CharSequence charSequence) {
        super(0);
        this.f116322d = finderLiveFoldTextView;
        this.f116323e = lVar;
        this.f116324f = charSequence;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var;
        java.lang.CharSequence charSequence = this.f116324f;
        yz5.l lVar = this.f116323e;
        if (lVar != null && (f0Var = (com.tencent.mm.pluginsdk.ui.span.f0) lVar.invoke(charSequence)) != null) {
            charSequence = f0Var;
        }
        this.f116322d.b(charSequence);
        return jz5.f0.f302826a;
    }
}
