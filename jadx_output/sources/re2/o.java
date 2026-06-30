package re2;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394458f;

    public o(java.lang.String str, yz5.l lVar, yz5.p pVar) {
        this.f394456d = str;
        this.f394457e = lVar;
        this.f394458f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f394456d;
        if (str == null || str.length() == 0) {
            this.f394458f.invoke(-1, "cdn upload failed");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveAvatarMerger", "doUpload: ok, remoteUrl=".concat(r26.p0.E0(str, 80)));
            this.f394457e.invoke(str);
        }
    }
}
