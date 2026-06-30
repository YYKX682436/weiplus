package yq1;

/* loaded from: classes.dex */
public final class y implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yq1.z f464494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f464495b;

    public y(yq1.z zVar, yz5.l lVar) {
        this.f464494a = zVar;
        this.f464495b = lVar;
    }

    @Override // wd0.p1
    public void a() {
        this.f464494a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onCancelBtn.");
        yz5.l lVar = this.f464495b;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // wd0.p1
    public void onSuccess() {
        ((vd0.j2) ((wd0.q1) i95.n0.c(wd0.q1.class))).wi(true, 256L);
        this.f464494a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onAgreeBtn.");
        yz5.l lVar = this.f464495b;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
