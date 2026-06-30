package yi0;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f462483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f462484e;

    /* renamed from: f, reason: collision with root package name */
    public int f462485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462487h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462488i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f462486g = str;
        this.f462487h = str2;
        this.f462488i = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yi0.d(this.f462486g, this.f462487h, this.f462488i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yi0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String path;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f462485f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xe0.d0 d0Var = (xe0.d0) i95.n0.c(xe0.d0.class);
            java.lang.String statusId = this.f462486g;
            java.lang.String url = this.f462487h;
            ((we0.w0) d0Var).getClass();
            kotlin.jvm.internal.o.g(statusId, "statusId");
            kotlin.jvm.internal.o.g(url, "url");
            java.lang.String g17 = bk4.n.f21513a.g("image", statusId, url);
            kotlin.jvm.internal.o.d(g17);
            if (com.tencent.mm.vfs.w6.j(g17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusDataSource", "getImageFile: file is ready: ".concat(g17));
                return g17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusDataSource", "start downloading image: " + this.f462487h + ", path=" + g17);
            java.lang.String str = this.f462487h;
            this.f462483d = g17;
            this.f462484e = str;
            this.f462485f = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new yi0.c(nVar));
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            path = g17;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            path = (java.lang.String) this.f462483d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatusDataSource", "failed to download bitmap, url=" + this.f462487h + ", path=" + path);
            return null;
        }
        xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
        java.lang.String str2 = this.f462488i;
        ((we0.l1) i0Var).getClass();
        mj4.h b17 = ai4.m0.f5173a.G().b(str2);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatusDataSource", "no text status found for " + this.f462488i);
            return null;
        }
        mj4.k kVar = (mj4.k) b17;
        if (!kotlin.jvm.internal.o.b(this.f462486g, kVar.l())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusDataSource", "status changed, discard this request, expected status id is " + this.f462486g + ", latest one is " + kVar.l());
            return path;
        }
        synchronized (yi0.f.class) {
            if (com.tencent.mm.vfs.w6.j(path)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatusDataSource", "File has been created by another task, so we can reuse it");
                return path;
            }
            kotlin.jvm.internal.o.g(path, "path");
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, path, false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TextStatusDataSource", "save bitmap to image failed: " + e17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusDataSource", "bitmap has been exported to ".concat(path));
            return path;
        }
    }
}
