package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class eb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f134248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var) {
        super(0);
        this.f134248d = mb0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f134248d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
