package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.m f122262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.playlist.l0 l0Var, nr2.m mVar) {
        super(1);
        this.f122261d = l0Var;
        this.f122262e = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        java.lang.String e17 = this.f122262e.e();
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122261d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(l0Var.l(), 0, false, true);
        android.view.View inflate = android.view.LayoutInflater.from(l0Var.l()).inflate(com.tencent.mm.R.layout.dhn, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bys);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qej)).setText(e17);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.playlist.i0(y1Var));
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f302826a;
    }
}
