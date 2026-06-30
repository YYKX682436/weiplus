package td4;

/* loaded from: classes4.dex */
public final class d implements xd4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td4.g f417642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f417643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417644d;

    public d(java.lang.String str, td4.g gVar, r45.jj4 jj4Var, java.lang.String str2) {
        this.f417641a = str;
        this.f417642b = gVar;
        this.f417643c = jj4Var;
        this.f417644d = str2;
    }

    @Override // xd4.p0
    public void a(com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    public void onCompleted() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        java.lang.String mediaPath = this.f417641a;
        boolean j17 = com.tencent.mm.vfs.w6.j(mediaPath);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onCompleted, cdn video fileExist:" + j17 + ", path:" + mediaPath);
        td4.g gVar = this.f417642b;
        if (j17) {
            kotlin.jvm.internal.o.f(mediaPath, "$mediaPath");
            gVar.a(mediaPath, this.f417643c);
        } else {
            td4.g.c(gVar, null, 1, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    public void onError(java.lang.Exception exception) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        kotlin.jvm.internal.o.g(exception, "exception");
        java.lang.String str = this.f417641a;
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onError, thread name:" + java.lang.Thread.currentThread().getName() + ", localId:" + this.f417644d + ", fileExist:" + com.tencent.mm.vfs.w6.j(str) + ", path:" + str);
        td4.g.c(this.f417642b, null, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    public void onProgress(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }
}
