package k53;

/* loaded from: classes4.dex */
public class f implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k53.g f304357d;

    public f(k53.g gVar, k53.a aVar) {
        this.f304357d = gVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        this.f304357d.hashCode();
        com.tencent.mm.sdk.platformtools.u3.h(new k53.d(this, str, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        this.f304357d.hashCode();
        com.tencent.mm.sdk.platformtools.u3.h(new k53.e(this, str, i17));
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.sdk.platformtools.u3.h(new k53.c(this, str, j17, j18));
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new k53.b(this, str, j17, j18, videoInfo));
    }
}
