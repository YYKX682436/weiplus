package fm3;

/* loaded from: classes10.dex */
public final class l implements fm3.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f264085a;

    /* renamed from: b, reason: collision with root package name */
    public long f264086b;

    /* renamed from: c, reason: collision with root package name */
    public long f264087c;

    public l(com.tencent.mm.protocal.protobuf.FinderObject finderObj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f264085a = finderObj;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObj.getObjectDesc();
        this.f264086b = ((objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? 0 : finderMedia.getVideoDuration()) * 1000;
    }

    @Override // fm3.o
    public void a(long j17) {
        this.f264087c = j17;
    }

    @Override // fm3.o
    public boolean b() {
        return false;
    }

    @Override // fm3.o
    public void c(long j17) {
        this.f264086b = j17;
    }

    @Override // fm3.o
    public long d() {
        return this.f264087c;
    }

    @Override // fm3.o
    public dk4.a e() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f264085a;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            return null;
        }
        java.lang.String str = "video_" + finderObject.getId();
        ll3.i1 i1Var = ll3.i1.f319182a;
        java.lang.String c17 = i1Var.c(str);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int width = (int) finderMedia.getWidth();
        int height = (int) finderMedia.getHeight();
        ((cf0.q) qVar).getClass();
        android.os.Bundle a17 = ck4.c.f42548a.a(context, width, height);
        a17.getInt("width", 0);
        a17.getInt("height", 0);
        java.lang.String url = finderMedia.getUrl();
        dk4.a aVar = new dk4.a(str, c17, url == null ? "" : url, (int) finderMedia.getWidth(), (int) finderMedia.getHeight());
        aVar.f234464a = 2;
        aVar.f234465b = "xV2";
        java.lang.String url_token = finderMedia.getUrl_token();
        aVar.f234466c = url_token != null ? url_token : "";
        aVar.f234467d = finderMedia.getDecodeKey();
        aVar.f234470g = finderMedia.getVideoDuration() * 1000;
        aVar.f234471h = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
        sb6.append(finderObject.getId());
        aVar.f234473j = i1Var.b(sb6.toString());
        return aVar;
    }

    @Override // fm3.o
    public com.tencent.mm.protocal.protobuf.FinderObject f() {
        return this.f264085a;
    }

    @Override // fm3.o
    public long getDurationMs() {
        return this.f264086b;
    }
}
