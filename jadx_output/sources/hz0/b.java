package hz0;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork f286244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz0.d f286245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork, hz0.d dVar) {
        super(1);
        this.f286244d = templateBackgroundWork;
        this.f286245e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dm.ib it = (dm.ib) obj;
        kotlin.jvm.internal.o.g(it, "it");
        hz0.d dVar = this.f286245e;
        java.lang.String str = dVar.f286249a;
        com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork = this.f286244d;
        com.tencent.maas.export.MJExportManager mJExportManager = dVar.f286250b;
        com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.i(templateBackgroundWork, com.google.android.gms.wearable.WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED, -2, str, mJExportManager);
        mJExportManager.f48004a.remove(dVar);
        az0.rc.i("3003", dVar.f286251c, new com.tencent.maas.instamovie.base.MJError(com.google.android.gms.wearable.WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED, ""), false, 300, 8, null);
        return jz5.f0.f302826a;
    }
}
