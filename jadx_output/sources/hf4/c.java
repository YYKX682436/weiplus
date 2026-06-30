package hf4;

/* loaded from: classes10.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf4.e f281221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.b f281222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281223f;

    public c(hf4.e eVar, zo0.b bVar, java.lang.String str) {
        this.f281221d = eVar;
        this.f281222e = bVar;
        this.f281223f = str;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Loader.StoryDownloader", "mediaId " + mediaId + " startRet " + i17 + " sceneResult " + hVar + " onlyCheckExist " + z17);
        if (hVar == null || this.f281221d == null) {
            return 0;
        }
        java.lang.String str = this.f281223f;
        this.f281222e.b(new hp0.b(str, "", new hp0.a(str)));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
