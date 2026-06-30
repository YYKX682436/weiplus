package d83;

/* loaded from: classes15.dex */
public final class y implements com.tencent.mm.app.t2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        d83.e0 e0Var = d83.e0.f226958a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "iLink onAppBackground:" + str);
        com.tencent.ilink.IlinkContext.getInstance().foregroundChanged(false);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        d83.e0 e0Var = d83.e0.f226958a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "iLink onAppForeground:" + str);
        com.tencent.ilink.IlinkContext.getInstance().foregroundChanged(true);
    }
}
