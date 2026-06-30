package td4;

/* loaded from: classes4.dex */
public final class c implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.g f417637d;

    public c(td4.g gVar) {
        this.f417637d = gVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String mediaId, int i17, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "onImageFinish ".concat(mediaId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMediaIdPathMap$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        td4.g gVar = this.f417637d;
        java.util.Map map = gVar.f417661e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMediaIdPathMap$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        if (map == null || (str = (java.lang.String) ((java.util.LinkedHashMap) map).get(mediaId)) == null) {
            str = "";
        }
        if (!z17 || kotlin.jvm.internal.o.b(str, "")) {
            td4.g.c(gVar, null, 1, null);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            gVar.b(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String mediaId, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String mediaId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "IOnDownloadListener onThumbFinish mediaId = " + mediaId + " } ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
    }
}
