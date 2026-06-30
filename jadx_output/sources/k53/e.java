package k53;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k53.f f304355f;

    public e(k53.f fVar, java.lang.String str, int i17) {
        this.f304355f = fVar;
        this.f304353d = str;
        this.f304354e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideo.MMVideoView mMVideoView = this.f304355f.f304357d.f304358d;
        if (mMVideoView != null) {
            mMVideoView.o(this.f304353d, this.f304354e);
        }
    }
}
