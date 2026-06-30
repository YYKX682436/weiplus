package gn4;

/* loaded from: classes15.dex */
public class o implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f273643d;

    public o(gn4.z zVar) {
        this.f273643d = zVar;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekTo %d", java.lang.Integer.valueOf(i17));
        gn4.z zVar = this.f273643d;
        zVar.f(i17);
        zVar.G.y();
        uu4.a.a(22);
    }

    @Override // m34.e
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekPre");
        this.f273643d.G.z();
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
