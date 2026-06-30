package lx;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321946d;

    public t(java.lang.String str) {
        this.f321946d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizConversationPlugin", "unSubscribeContact: " + this.f321946d);
    }
}
