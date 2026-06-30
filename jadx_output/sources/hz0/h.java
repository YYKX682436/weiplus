package hz0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.export.MJExportManager f286263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, com.tencent.maas.export.MJExportManager mJExportManager) {
        super(0);
        this.f286262d = str;
        this.f286263e = mJExportManager;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWork: start ");
        java.lang.String workTagId = this.f286262d;
        sb6.append(workTagId);
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWork", sb6.toString());
        az0.i5 i5Var = az0.i5.f15557a;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.maas.export.MJExportManager mJExportManager = this.f286263e;
        if (mJExportManager == null) {
            return null;
        }
        i5Var.v();
        return mJExportManager.c(new com.tencent.maas.export.c(workTagId));
    }
}
