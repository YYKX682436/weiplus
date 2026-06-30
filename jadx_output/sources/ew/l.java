package ew;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256987d;

    public l(java.lang.String str) {
        this.f256987d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrsConversationPlugin", "unSubscribeContact: " + this.f256987d);
    }
}
