package td4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final td4.b f417657a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f417658b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f417659c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f417660d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f417661e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.m0 f417662f;

    /* renamed from: g, reason: collision with root package name */
    public fk4.k f417663g;

    /* renamed from: h, reason: collision with root package name */
    public xd4.t0 f417664h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.h0 f417665i;

    public g(td4.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f417657a = callback;
        this.f417658b = true;
        this.f417659c = jz5.h.b(td4.f.f417652d);
        this.f417660d = jz5.h.b(td4.e.f417648d);
        this.f417665i = new td4.c(this);
    }

    public static /* synthetic */ void c(td4.g gVar, java.lang.String str, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        if ((i17 & 1) != 0) {
            str = "";
        }
        gVar.b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    public final void a(java.lang.String cdnSnsVideoLocalPath, r45.jj4 mediaObj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        kotlin.jvm.internal.o.g(cdnSnsVideoLocalPath, "cdnSnsVideoLocalPath");
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.lang.String a17 = com.tencent.mm.plugin.sns.model.f6.a(mediaObj, ".mp4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String str = dw3.h.f244211a.b("snsalbumpicker") + a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        kotlin.jvm.internal.o.f(str, "getTmpVideoSavePath(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        boolean z17 = j17 && kotlin.jvm.internal.o.b(com.tencent.mm.vfs.w6.p(cdnSnsVideoLocalPath), com.tencent.mm.vfs.w6.p(str));
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            long d17 = com.tencent.mm.vfs.w6.d(cdnSnsVideoLocalPath, str, false);
            java.util.Map map = this.f417661e;
            if (map != null) {
                java.lang.String Id = mediaObj.f377855d;
                kotlin.jvm.internal.o.f(Id, "Id");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "copyVideoFileToTempDirWithExtName result:" + d17 + ", from " + cdnSnsVideoLocalPath + " copy to " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "checkSnsCdnVideoLocalFile, tempMp4FileExist:" + j17 + ", tempFileExistWithMd5Check:" + z17 + ", path:" + str);
        b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r10 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: td4.g.b(java.lang.String):void");
    }

    public final java.util.ArrayList d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f417660d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return arrayList;
    }

    public final java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.util.List list = (java.util.List) ((jz5.n) this.f417659c).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return list;
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        com.tencent.mm.plugin.sns.model.m0 m0Var = this.f417662f;
        if (m0Var != null) {
            m0Var.v(this.f417665i);
        }
        com.tencent.mm.plugin.sns.model.m0 m0Var2 = this.f417662f;
        if (m0Var2 != null) {
            m0Var2.p();
        }
        com.tencent.mm.plugin.sns.model.m0 m0Var3 = this.f417662f;
        if (m0Var3 != null) {
            m0Var3.o();
        }
        fk4.k kVar = this.f417663g;
        if (kVar != null) {
            kVar.p();
        }
        this.f417663g = null;
        xd4.t0 t0Var = this.f417664h;
        if (t0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "release");
            kotlinx.coroutines.z0.e(t0Var.f453709c, null, 1, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }
}
