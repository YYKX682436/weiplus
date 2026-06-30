package ij1;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f291673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij1.h f291674e;

    public g(ij1.h hVar, android.os.Bundle bundle) {
        this.f291674e = hVar;
        this.f291673d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string = this.f291673d.getString("delay_load_img_path");
        ij1.h hVar = this.f291674e;
        hVar.f291675a.setImageUrl(string);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaShareMessageService", "onLoadImageFinishedAction(%s)", string);
        hVar.f291677c.Ai(hVar.f291676b, 0);
    }
}
