package r83;

/* loaded from: classes14.dex */
public class e extends k83.b implements com.tencent.mm.plugin.ipcall.model.q {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener f393314f = null;

    @Override // k83.b
    public int[] d() {
        return new int[0];
    }

    @Override // k83.b
    public int e() {
        return 8;
    }

    @Override // k83.b
    public void g() {
        this.f393314f.dead();
    }

    @Override // k83.b
    public void h() {
        com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener iPCallSvrNotifyListener = new com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener();
        this.f393314f = iPCallSvrNotifyListener;
        iPCallSvrNotifyListener.f142460d = this;
        iPCallSvrNotifyListener.alive();
    }

    @Override // k83.b
    public void i(k83.g gVar) {
    }

    @Override // k83.b, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
