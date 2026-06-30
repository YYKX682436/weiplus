package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC f134598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC) {
        super(0);
        this.f134598d = finderDescPanelUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f134598d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.finder.viewmodel.component.qc) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.qc.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
