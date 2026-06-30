package mh2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f326458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.yx1 yx1Var, com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget) {
        super(1);
        this.f326458d = yx1Var;
        this.f326459e = kTVInteractiveWidget;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.yx1 yx1Var = this.f326458d;
            yx1Var.f391465n = !yx1Var.f391465n;
            int i17 = com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.f111662p;
            com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget = this.f326459e;
            kTVInteractiveWidget.b(yx1Var);
            android.content.Context context = kTVInteractiveWidget.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = kTVInteractiveWidget.getContext().getString(com.tencent.mm.R.string.mng);
            e4Var.c();
        } else {
            com.tencent.mars.xlog.Log.e("KTVInteractiveWidget", "Pause sing failed");
        }
        return jz5.f0.f302826a;
    }
}
