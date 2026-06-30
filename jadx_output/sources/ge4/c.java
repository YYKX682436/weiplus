package ge4;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f270980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe4.d f270981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge4.e f270982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ge4.a f270983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlinx.coroutines.y0 y0Var, fe4.d dVar, ge4.e eVar, ge4.a aVar) {
        super(0);
        this.f270980d = y0Var;
        this.f270981e = dVar;
        this.f270982f = eVar;
        this.f270983g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f270980d.hashCode());
        sb6.append(" deal result in main: ");
        fe4.d dVar = this.f270981e;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f261568a);
        sb6.append(" res: ");
        sb6.append(dVar.a());
        sb6.append(" isRelease: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        ge4.e eVar = this.f270982f;
        boolean z17 = eVar.f270996i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", sb6.toString());
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem b17 = this.f270983g.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        java.util.HashMap hashMap = eVar.f270994g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        ge4.a aVar = (ge4.a) hashMap.get(dVar.f261568a);
        java.util.LinkedList linkedList = eVar.f270992e;
        java.util.LinkedList linkedList2 = eVar.f270993f;
        java.util.LinkedList linkedList3 = eVar.f270989b;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("SnsPublish.SnsPublishLivePhotoWorkMgr", "dealResult >> get job error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            str = "invoke";
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOk", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            int i17 = dVar.f261569b;
            boolean z18 = i17 == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOk", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            if (z18) {
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is ok removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                eVar.f270990c.addLast(aVar);
                str = "invoke";
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOriginDataErr", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                str = "invoke";
                boolean z19 = i17 == 2 || i17 == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOriginDataErr", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                if (z19) {
                    com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is originDataErr removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                    linkedList2.addLast(aVar);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                    boolean z27 = i17 == 4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                    if (z27) {
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is isCancel removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                        eVar.f270991d.addLast(aVar);
                        yz5.l lVar = eVar.f270997j;
                        if (lVar != null) {
                            lVar.invoke(b17);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is deal error removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                        linkedList.addLast(aVar);
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        boolean z28 = eVar.f270996i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        if (!z28) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            java.util.LinkedList linkedList4 = eVar.f270988a;
            int size = linkedList4.size();
            com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", eVar.hashCode() + " findWaitJob >> waitJobSize: " + size);
            if (size > 0) {
                ge4.a aVar2 = (ge4.a) linkedList4.removeFirst();
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", eVar.hashCode() + " find first wait job mediaId: " + aVar2.b().g());
                linkedList3.addLast(aVar2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                kotlinx.coroutines.l.d(eVar.f270995h, null, null, new ge4.d(aVar2, eVar, null), 3, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            } else {
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "is no had wait job");
                int size2 = linkedList3.size();
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "findWaitJob >> running job size: " + size2);
                if (size2 == 0) {
                    int size3 = linkedList2.size();
                    int size4 = linkedList.size();
                    com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "all job is finish originErrJobSize: " + size3 + " dealErrJobSize: " + size4);
                    if (size4 > 0) {
                        java.util.ArrayList<java.lang.String> b18 = eVar.b();
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "WORK_ERR_DEAL >> errorIdList " + b18.size());
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("key_err_code", 2);
                        bundle.putStringArrayList("key_work_err_media_ids", b18);
                        eVar.a(new jz5.l(2, bundle));
                    } else if (size3 > 0) {
                        java.util.ArrayList<java.lang.String> b19 = eVar.b();
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "WORK_ERR_ORIGIN_DADA_ERROR >> errorIdList " + b19.size());
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("key_err_code", 1);
                        bundle2.putStringArrayList("key_work_err_media_ids", b19);
                        eVar.a(new jz5.l(2, bundle2));
                    } else {
                        eVar.a(new jz5.l(1, new android.os.Bundle()));
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        }
        java.lang.String str2 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        return f0Var;
    }
}
