package hz0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz0.d f286247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork f286248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, hz0.d dVar, com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork) {
        super(1);
        this.f286246d = str;
        this.f286247e = dVar;
        this.f286248f = templateBackgroundWork;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dm.ib dbInfo = (dm.ib) obj;
        kotlin.jvm.internal.o.g(dbInfo, "dbInfo");
        java.lang.String str = dbInfo.field_output_video_path;
        java.lang.String str2 = this.f286246d;
        com.tencent.mm.vfs.w6.c(str2, str);
        com.tencent.mm.vfs.w6.h(str2);
        hz0.d dVar = this.f286247e;
        com.tencent.mars.xlog.Log.i(dVar.f286253e, "successCallback: copy from " + str2 + " to " + str);
        com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork = this.f286248f;
        java.lang.String str3 = dVar.f286249a;
        com.tencent.maas.export.MJExportManager mJExportManager = dVar.f286250b;
        boolean i17 = com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.i(templateBackgroundWork, com.google.android.gms.wearable.WearableStatusCodes.UNKNOWN_CAPABILITY, 0, str3, mJExportManager);
        az0.rc.i("3003", dVar.f286251c, null, false, 300, 12, null);
        boolean z17 = !(z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c);
        if (i17) {
            dw3.c0 c0Var = dw3.c0.f244182a;
            kotlin.jvm.internal.o.d(str);
            c0Var.v(true, "", str, z17, false, true);
        }
        mJExportManager.f48004a.remove(dVar);
        yz5.l lVar = dVar.f286252d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
