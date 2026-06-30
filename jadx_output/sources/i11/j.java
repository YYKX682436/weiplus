package i11;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.c f287119d;

    public j(i11.h hVar, i11.c cVar) {
        this.f287119d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f287119d.onGetLocation(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
    }
}
