package hz0;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork f286270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f286271e;

    public j(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork, yz5.l lVar) {
        this.f286270d = templateBackgroundWork;
        this.f286271e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork = this.f286270d;
        java.lang.String c17 = templateBackgroundWork.f12459e.f12466b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        if (c17 == null) {
            c17 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWork", "onFinish: workTagId=".concat(c17));
        jz5.l j17 = templateBackgroundWork.j(c17);
        boolean booleanValue = ((java.lang.Boolean) j17.f302833d).booleanValue();
        dm.ib ibVar = (dm.ib) j17.f302834e;
        if (!booleanValue || ibVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateBackgroundWork", "checkDataBeforeRemux is false");
            hz0.m.f286283a.a(c17);
            return;
        }
        templateBackgroundWork.getClass();
        int i17 = ibVar.field_work_type;
        if (i17 == 4002 || i17 == 4004) {
            java.lang.String str = ibVar.field_output_video_path;
            java.lang.String str2 = ibVar.field_output_thumb_path;
            com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWork", "dealFileByLastWorkType >> " + i17 + "videoPath:  " + str + " thumbPath: " + str2 + " realVideoPath: " + com.tencent.mm.vfs.w6.i(str, false) + "realThumbPath: " + com.tencent.mm.vfs.w6.i(str2, false));
            com.tencent.mm.vfs.w6.h(str);
            com.tencent.mm.vfs.w6.h(str2);
        }
        yz5.l lVar = this.f286271e;
        if (lVar != null) {
            lVar.invoke(ibVar);
        }
    }
}
