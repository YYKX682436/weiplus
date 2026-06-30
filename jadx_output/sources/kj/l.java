package kj;

/* loaded from: classes12.dex */
public class l implements jj.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f308237a = new android.os.Handler(oj.g.b().getLooper());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f308238b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f308239c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj.m f308240d;

    public l(kj.m mVar, kj.e eVar) {
        this.f308240d = mVar;
    }

    @Override // jj.c
    public void a(java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        this.f308237a.post(new kj.k(this, str, frameMetrics, f17, f18));
    }
}
