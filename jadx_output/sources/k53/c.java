package k53;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f304343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.f f304345g;

    public c(k53.f fVar, java.lang.String str, long j17, long j18) {
        this.f304345g = fVar;
        this.f304342d = str;
        this.f304343e = j17;
        this.f304344f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideo.MMVideoView mMVideoView = this.f304345g.f304357d.f304358d;
        if (mMVideoView != null) {
            mMVideoView.onDataAvailable(this.f304342d, this.f304343e, this.f304344f);
        }
    }
}
