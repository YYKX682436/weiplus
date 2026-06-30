package pc3;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f353373d;

    public d(pc3.m mVar) {
        this.f353373d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.R0(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.w9.f193059g));
        pc3.m mVar = this.f353373d;
        mVar.f353386e = valueOf;
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "update process exist " + mVar.f353386e);
    }
}
