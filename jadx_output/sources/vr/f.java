package vr;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f439400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f439402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vr.g gVar, yz5.l lVar, android.content.Context context) {
        super(0);
        this.f439400d = gVar;
        this.f439401e = lVar;
        this.f439402f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f439401e;
        vr.g gVar = this.f439400d;
        try {
            com.tencent.mm.pluginsdk.ui.chat.j6 j6Var = gVar.f439406d;
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gVar.f439405c;
            if (j6Var != null) {
                chatFooterPanel.setCallback(j6Var);
            }
            com.tencent.mm.pluginsdk.ui.k0 k0Var = gVar.f439407e;
            if (k0Var != null) {
                chatFooterPanel.setOnTextOperationListener(k0Var);
            }
            pm0.v.X(new vr.a(gVar, new vr.e(gVar, this.f439402f, lVar)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizEmoticonContext", "showEmoticonPanel error: " + e17.getMessage());
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
