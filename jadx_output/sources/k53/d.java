package k53;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f304349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.f f304351g;

    public d(k53.f fVar, java.lang.String str, long j17, long j18) {
        this.f304351g = fVar;
        this.f304348d = str;
        this.f304349e = j17;
        this.f304350f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideo.MMVideoView mMVideoView = this.f304351g.f304357d.f304358d;
        if (mMVideoView != null) {
            mMVideoView.f(this.f304348d, this.f304349e, this.f304350f);
        }
    }
}
