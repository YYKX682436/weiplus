package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class c9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f203704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c53.a f203705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203706c;

    public c9(q80.d0 d0Var, c53.a aVar, yb5.d dVar) {
        this.f203704a = d0Var;
        this.f203705b = aVar;
        this.f203706c = dVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("ChattingItemAppMsgGameNameCard", "openLiteApp fail %s. fallback to H5", this.f203704a.f360649a);
        c53.a aVar = this.f203705b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f38648f)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", aVar.f38648f);
        j45.l.j(this.f203706c.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("ChattingItemAppMsgGameNameCard", "openLiteApp success %s.", this.f203704a.f360649a);
    }
}
