package vr;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f439397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f439398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vr.g gVar, android.content.Context context, yz5.l lVar) {
        super(1);
        this.f439397d = gVar;
        this.f439398e = context;
        this.f439399f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity;
        int intValue = ((java.lang.Number) obj).intValue();
        vr.g gVar = this.f439397d;
        int ceil = (int) java.lang.Math.ceil(intValue * vr.g.a(gVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.BizEmoticonContext", "h5 input panel height: " + intValue + ", panelHeight:" + ceil + ", webview density: " + vr.g.a(gVar));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, ceil);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = -ceil;
        android.content.Context context = this.f439398e;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = context;
        while (true) {
            if (!(context2 instanceof android.content.ContextWrapper)) {
                activity = null;
                break;
            }
            if (context2 instanceof android.app.Activity) {
                activity = (android.app.Activity) context2;
                break;
            }
            context2 = ((android.content.ContextWrapper) context2).getBaseContext();
            kotlin.jvm.internal.o.f(context2, "getBaseContext(...)");
        }
        yz5.l lVar = this.f439399f;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizEmoticonContext", "context isn't Activity, " + context);
            lVar.invoke(java.lang.Boolean.FALSE);
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gVar.f439405c;
            activity.addContentView(chatFooterPanel, layoutParams);
            chatFooterPanel.animate().translationY(-ceil).withStartAction(new vr.d(gVar)).setDuration(300L).start();
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
