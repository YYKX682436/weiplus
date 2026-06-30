package qj3;

/* loaded from: classes10.dex */
public final class a implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj3.g f363870a;

    public a(qj3.g gVar) {
        this.f363870a = gVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap != null) {
            this.f363870a.getClass();
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkEditPhotoContainerPlugin", "photoEditor onError: %s", exc);
        this.f363870a.f363885p = false;
    }
}
