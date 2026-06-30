package zl2;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.o0 f473907a = new zl2.o0();

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17 && com.tencent.mm.vfs.w6.j(str)) {
            dn.m mVar = new dn.m();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            mVar.field_mediaId = sb6.toString();
            mVar.field_fullpath = str;
            mVar.field_thumbpath = str;
            mVar.field_needStorage = true;
            mVar.field_fileType = 20304;
            mVar.field_appType = 292;
            mVar.field_bzScene = 2;
            mVar.A = 300;
            mVar.B = 300;
            mVar.field_priority = 2;
            mVar.f241787f = new zl2.l0(rVar);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveUploadUtil", "[uploadCryptoImage] upload " + str + " end");
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.lang.Object b(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17 && com.tencent.mm.vfs.w6.j(str)) {
            dn.m mVar = new dn.m();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
            mVar.field_mediaId = sb6.toString();
            mVar.field_fullpath = str;
            mVar.field_thumbpath = str;
            mVar.field_needStorage = true;
            mVar.field_fileType = 20304;
            mVar.field_appType = 251;
            mVar.field_bzScene = 2;
            mVar.A = 300;
            mVar.B = 300;
            mVar.field_priority = 2;
            mVar.f241787f = new zl2.m0(rVar);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveUploadUtil", "[uploadImage] upload " + str + " end");
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
