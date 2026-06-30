package mi5;

/* loaded from: classes9.dex */
public final class t implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f326917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l15.c f326918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326919c;

    public t(q80.d0 d0Var, l15.c cVar, android.content.Context context) {
        this.f326917a = d0Var;
        this.f326918b = cVar;
        this.f326919c = context;
    }

    @Override // q80.f0
    public void fail() {
        y05.c cVar;
        y05.d j17;
        y05.c cVar2;
        y05.d j18;
        com.tencent.mars.xlog.Log.i("ChattingGameCardView", "openLiteApp fail %s. fallback to H5", this.f326917a.f360649a);
        l15.c cVar3 = this.f326918b;
        v05.b k17 = cVar3.k();
        java.lang.String k18 = (k17 == null || (cVar2 = (y05.c) k17.getCustom(k17.f432315e + 40)) == null || (j18 = cVar2.j()) == null) ? null : j18.k();
        if (k18 == null || k18.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        v05.b k19 = cVar3.k();
        intent.putExtra("rawUrl", (k19 == null || (cVar = (y05.c) k19.getCustom(k19.f432315e + 40)) == null || (j17 = cVar.j()) == null) ? null : j17.k());
        j45.l.j(this.f326919c, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("ChattingGameCardView", "openLiteApp success %s.", this.f326917a.f360649a);
    }
}
