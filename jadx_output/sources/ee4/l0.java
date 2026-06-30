package ee4;

/* loaded from: classes4.dex */
public final class l0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f251724n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f251725o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f251724n = je4.c.f299317a.a();
        this.f251725o = new java.util.ArrayList();
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        return "SnsPublish.PicFileManagerPc";
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        super.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markToDeleteDirLivePhotoItemSize: ");
        java.util.ArrayList arrayList = this.f251725o;
        sb6.append(arrayList.size());
        f(sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pm0.v.w(new ee4.j0((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) it.next()));
        }
        arrayList.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
    }

    public final void p(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem item) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String sb6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        kotlin.jvm.internal.o.g(item, "item");
        f("addPublishItem >> picType: " + item.d() + " source: " + item.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveCameraEditorDataForReport", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem snsCameraEditorReportItem = item.f171209g;
        if (snsCameraEditorReportItem.f155867d == 0) {
            snsCameraEditorReportItem.f155868e = 2;
            snsCameraEditorReportItem.f155869f = item.c() == 1 ? 1 : 0;
            snsCameraEditorReportItem.f155870g = nu3.e.f340200c ? 1 : 0;
            snsCameraEditorReportItem.f155871h = item.c() == 1 ? 1 : 2;
            snsCameraEditorReportItem.f155872i = 1;
            snsCameraEditorReportItem.f155873m = 0;
            snsCameraEditorReportItem.f155874n = nu3.f.f340213d;
            snsCameraEditorReportItem.f155875o = nu3.f.f340212c;
            if (nu3.e.f340200c) {
                snsCameraEditorReportItem.f155876p = java.lang.String.valueOf(nu3.i.f340218a.l().b("KEY_EDIT_SESSION_ID", 0L));
            }
            snsCameraEditorReportItem.f155877q = item.b();
        }
        snsCameraEditorReportItem.f155867d++;
        f(java.lang.String.valueOf(snsCameraEditorReportItem));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCameraEditorDataForReport", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        if (item.d() == 1) {
            if (item.c() == 1) {
                ie4.a aVar = ie4.a.f291002a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCaptureImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(ie4.a.f291003b);
                sb7.append("pre_temp_sns_pic");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String b17 = item.b();
                kotlin.jvm.internal.o.d(b17);
                sb8.append(b17);
                sb8.append(java.lang.System.currentTimeMillis());
                byte[] bytes = sb8.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                sb7.append(kk.k.g(bytes));
                sb6 = sb7.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCaptureImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            } else {
                ie4.a aVar2 = ie4.a.f291002a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(ie4.a.f291003b);
                sb9.append("pre_temp_sns_photo");
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                java.lang.String b18 = item.b();
                kotlin.jvm.internal.o.d(b18);
                sb10.append(b18);
                sb10.append(java.lang.System.currentTimeMillis());
                byte[] bytes2 = sb10.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                sb9.append(kk.k.g(bytes2));
                sb6 = sb9.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            }
            ie4.a aVar3 = ie4.a.f291002a;
            java.lang.String b19 = item.b();
            kotlin.jvm.internal.o.d(b19);
            long d17 = aVar3.d(b19, sb6);
            f("copy img path ret: " + d17);
            if (d17 <= 0) {
                str3 = "addPublishItem";
                str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
            }
            fe4.b v17 = m().v();
            java.lang.String b27 = item.b();
            v17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMediaPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            if (com.tencent.mm.sdk.platformtools.t8.K0(b27)) {
                str = "addPublishItem";
            } else {
                java.util.HashMap hashMap = v17.f261566e;
                r45.h96 h96Var = (r45.h96) hashMap.get(b27);
                if (h96Var != null) {
                    str = "addPublishItem";
                    com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "addMedia snsMediaEcsInfo:pathFrom:" + b27 + " pathTo:" + sb6);
                    hashMap.put(sb6, h96Var);
                } else {
                    str = "addPublishItem";
                }
                java.util.HashMap hashMap2 = v17.f261567f;
                r45.vb1 vb1Var = (r45.vb1) hashMap2.get(b27);
                if (vb1Var != null) {
                    com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "addMedia finderInfo:pathFrom:" + b27 + " pathTo:" + sb6);
                    hashMap2.put(sb6, vb1Var);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMediaPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
            item.f171206d = sb6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
        } else {
            str = "addPublishItem";
            if (item.d() == 6) {
                ie4.a aVar4 = ie4.a.f291002a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoImgCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) item;
                java.lang.String b28 = aVar4.b(snsPublishLivePhotoItem);
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append(b28);
                sb11.append("pre_temp_sns_live_photo");
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                java.lang.String b29 = item.b();
                kotlin.jvm.internal.o.d(b29);
                sb12.append(b29);
                sb12.append(java.lang.System.currentTimeMillis());
                java.lang.String sb13 = sb12.toString();
                java.nio.charset.Charset charset = r26.c.f368865a;
                byte[] bytes3 = sb13.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
                sb11.append(kk.k.g(bytes3));
                java.lang.String sb14 = sb11.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoImgCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.String b37 = item.b();
                kotlin.jvm.internal.o.d(b37);
                str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
                long d18 = aVar4.d(b37, sb14);
                f("copy img path ret: " + d18);
                if (d18 > 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                    item.f171206d = sb14;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                }
                boolean m17 = snsPublishLivePhotoItem.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRemuxFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                boolean z17 = snsPublishLivePhotoItem.f171218r == 1 && com.tencent.mm.vfs.w6.j(snsPublishLivePhotoItem.f171215o);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemuxFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                f("mediaId: " + snsPublishLivePhotoItem.g() + " isParseFinish: " + m17 + " isRemuxFinish: " + z17);
                if (m17) {
                    java.lang.String c17 = aVar4.c(snsPublishLivePhotoItem);
                    java.lang.String i17 = snsPublishLivePhotoItem.i();
                    kotlin.jvm.internal.o.d(i17);
                    long d19 = aVar4.d(i17, c17);
                    f("copy parse video path ret: " + d19);
                    if (d19 > 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                        snsPublishLivePhotoItem.f171214n = c17;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    }
                } else {
                    java.lang.String c18 = aVar4.c(snsPublishLivePhotoItem);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    snsPublishLivePhotoItem.f171214n = c18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoTempParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String wi6 = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f364208e, java.lang.String.valueOf(snsPublishLivePhotoItem.g()));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoTempParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    snsPublishLivePhotoItem.f171220t = wi6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                }
                if (!z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String b38 = aVar4.b(snsPublishLivePhotoItem);
                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                    sb15.append(b38);
                    sb15.append("pre_temp_sns_live_photo_remux_");
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    java.lang.String b39 = snsPublishLivePhotoItem.b();
                    kotlin.jvm.internal.o.d(b39);
                    sb16.append(b39);
                    sb16.append(java.lang.System.currentTimeMillis());
                    byte[] bytes4 = sb16.toString().getBytes(charset);
                    kotlin.jvm.internal.o.f(bytes4, "getBytes(...)");
                    sb15.append(kk.k.g(bytes4));
                    java.lang.String sb17 = sb15.toString();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    snsPublishLivePhotoItem.f171215o = sb17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String b47 = aVar4.b(snsPublishLivePhotoItem);
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                    sb18.append(b47);
                    sb18.append("pre_temp_sns_live_photo_remux_thumb_");
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    java.lang.String b48 = snsPublishLivePhotoItem.b();
                    kotlin.jvm.internal.o.d(b48);
                    sb19.append(b48);
                    sb19.append(java.lang.System.currentTimeMillis());
                    byte[] bytes5 = sb19.toString().getBytes(charset);
                    kotlin.jvm.internal.o.f(bytes5, "getBytes(...)");
                    sb18.append(kk.k.g(bytes5));
                    java.lang.String sb20 = sb18.toString();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    snsPublishLivePhotoItem.f171216p = sb20;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                }
                str3 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
            }
        }
        str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
        str3 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
    }

    public final void q(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        kotlin.jvm.internal.o.g(item, "item");
        f("removePublishItem >> " + item.d());
        pm0.v.w(new ee4.k0(item));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
    }
}
