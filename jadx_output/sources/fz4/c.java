package fz4;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz4.g f267298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267300f;

    public c(fz4.g gVar, java.lang.String str, yz5.l lVar) {
        this.f267298d = gVar;
        this.f267299e = str;
        this.f267300f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        gp.a aVar;
        long j17;
        try {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f267298d.f267308a).f257944c;
            android.app.Activity activity2 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
            java.lang.String str = this.f267299e;
            ((be0.e) oVar).getClass();
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync mediaInfo is null, videoPath: " + this.f267299e);
                this.f267300f.invoke(null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setData(android.net.Uri.parse("file://" + this.f267299e));
            try {
                aVar = gp.b.b(activity2, intent, -1);
                activity = activity2;
            } catch (java.lang.Exception e17) {
                activity = activity2;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeNoteAsyncMediaProcessor", e17, "addVideoAsync GetVideoMetadata failed", new java.lang.Object[0]);
                aVar = null;
            }
            if (aVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync GetVideoMetadata failed, videoPath: " + this.f267299e);
                this.f267300f.invoke(null);
                return;
            }
            int a17 = d17.a();
            if (a17 < 0) {
                a17 = com.tencent.mm.sdk.platformtools.t8.V1(aVar.f274161c);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync duration: " + a17);
            iz4.k kVar = new iz4.k();
            java.lang.String str2 = this.f267299e;
            kVar.f296134r = true;
            kVar.f296118u = a17;
            kVar.f296133q = 6;
            kVar.f296119v = com.tencent.mm.vfs.w6.n(str2);
            kVar.f296132p = (int) com.tencent.mm.vfs.w6.k(str2);
            kVar.f296103a = hz4.l.b(kVar.toString(), 18);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync: generated initial dataId=" + kVar.f296103a + " for video: " + this.f267299e + ", fmt: " + kVar.f296119v + ", dataSize: " + kVar.f296132p);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(kVar.f296103a);
            gp0Var.i0(kVar.f296119v);
            java.lang.String e18 = hz4.l.e(gp0Var);
            java.lang.String c17 = hz4.l.c(gp0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync generated paths, dataId: " + kVar.f296103a + ", thumbPath: " + e18 + ", dataPath: " + c17);
            fz4.g gVar = this.f267298d;
            android.graphics.Bitmap bitmap = aVar.f274160b;
            kotlin.jvm.internal.o.d(e18);
            fz4.g.b(gVar, bitmap, e18);
            kVar.f296117t = e18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync created thumbnail, thumbPath: " + e18 + ", exists: " + com.tencent.mm.vfs.w6.j(e18));
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            long k17 = com.tencent.mm.vfs.w6.k(this.f267299e);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync check file size, originalFileSize: " + k17 + ", maxFavFileSize: " + g17);
            if (k17 >= g17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync file too large, originalFileSize: " + k17 + ", maxFavFileSize: " + g17);
                ((ku5.t0) ku5.t0.f312615d).B(new fz4.b(activity, vj6));
                this.f267300f.invoke(null);
                return;
            }
            try {
                j17 = com.tencent.mm.vfs.w6.d(this.f267299e, c17, false);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeNoteAsyncMediaProcessor", e19, "addVideoAsync copy file error", new java.lang.Object[0]);
                j17 = -1;
            }
            if (j17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync copy file failed");
                this.f267300f.invoke(null);
                return;
            }
            kVar.f296135s = c17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync copied file, from: " + this.f267299e + ", to: " + c17 + ", targetExists: " + com.tencent.mm.vfs.w6.j(c17));
            java.lang.String dataId = kVar.f296103a;
            kotlin.jvm.internal.o.f(dataId, "dataId");
            kotlin.jvm.internal.o.d(c17);
            d82.j.b(dataId, c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync started compress task, dataId: " + kVar.f296103a);
            com.tencent.wechat.aff.favorites.j c18 = fz4.g.c(this.f267298d, kVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addVideoAsync success, dataId: " + kVar.f296103a + ", localPath: " + kVar.f296135s + ", thumbPath: " + kVar.f296117t);
            this.f267300f.invoke(c18);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeNoteAsyncMediaProcessor", e27, "addVideoAsync error", new java.lang.Object[0]);
            this.f267300f.invoke(null);
        }
    }
}
