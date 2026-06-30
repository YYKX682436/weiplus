package u03;

/* loaded from: classes10.dex */
public final class k implements u03.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f423468a = "MicroMsg.flutter.TingListenVideoCdnTaskFactory." + hashCode();

    @Override // u03.d
    public java.lang.Object a(byte[] bArr, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = this.f423468a;
        try {
            com.tencent.mm.protocal.protobuf.FinderObject create = com.tencent.mm.protocal.protobuf.FinderObject.create();
            create.parseFrom(bArr);
            dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj(create);
            if (sj6 == null) {
                com.tencent.mars.xlog.Log.e(str, "createMediaInfo from FinderObject failed");
                return null;
            }
            ck4.c cVar = ck4.c.f42548a;
            java.lang.String mediaId = sj6.f234482s;
            kotlin.jvm.internal.o.f(mediaId, "mediaId");
            java.lang.String url = sj6.f234484u;
            kotlin.jvm.internal.o.f(url, "url");
            java.lang.String path = sj6.f234483t;
            kotlin.jvm.internal.o.f(path, "path");
            int i17 = sj6.f234464a;
            java.lang.String fileFormat = sj6.f234465b;
            kotlin.jvm.internal.o.f(fileFormat, "fileFormat");
            java.lang.String urlToken = sj6.f234466c;
            kotlin.jvm.internal.o.f(urlToken, "urlToken");
            ck4.b b17 = cVar.b(mediaId, url, path, i17, fileFormat, urlToken, sj6.f234467d, sj6.f234481r, null, this.f423468a);
            com.tencent.mars.xlog.Log.i(str, "cdnTask url:" + b17.f241811z + ',' + b17.M1 + ", format:" + b17.field_requestVideoFormat + ", flag:" + b17.X1);
            return b17;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e(str, "parse proto failed, " + e17.getMessage());
            return null;
        }
    }

    @Override // u03.d
    public u03.a b() {
        return u03.a.f423458g;
    }
}
