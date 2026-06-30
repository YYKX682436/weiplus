package n8;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f335526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.m f335527e;

    public i(n8.m mVar, com.google.android.exoplayer2.Format format) {
        this.f335527e = mVar;
        this.f335526d = format;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f335527e.f335537b.B(this.f335526d);
    }
}
