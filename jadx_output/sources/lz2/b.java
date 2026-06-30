package lz2;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.c f322332d;

    public b(com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView frameAnimatorImageView, lz2.c cVar) {
        this.f322332d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322332d.onStop();
    }
}
