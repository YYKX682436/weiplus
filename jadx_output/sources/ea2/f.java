package ea2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f250551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.iw2 f250552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, android.content.Context context, r45.iw2 iw2Var) {
        super(1);
        this.f250550d = str;
        this.f250551e = context;
        this.f250552f = iw2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f250550d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + str + " sucess");
        } else {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + str + " failed");
            java.lang.String string = this.f250552f.getString(2);
            if (!(string == null || string.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", string);
                j45.l.j(this.f250551e, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
