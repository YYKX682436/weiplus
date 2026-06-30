package lx3;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx3.h f322094d;

    public j(lx3.h hVar) {
        this.f322094d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnReportResp(3, -1, null, this.f322094d.f322087h);
    }
}
