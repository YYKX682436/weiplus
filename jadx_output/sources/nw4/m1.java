package nw4;

/* loaded from: classes.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340883f;

    public m1(nw4.n nVar, java.lang.String str, java.lang.String str2) {
        this.f340883f = nVar;
        this.f340881d = str;
        this.f340882e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340883f.f340887a.evaluateJavascript("javascript:typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge._handleMessageFromWeixin(" + this.f340881d + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f340882e, e17.getMessage());
        }
    }
}
