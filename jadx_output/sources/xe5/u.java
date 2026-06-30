package xe5;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f454119d;

    public u(com.tencent.mm.storage.f9 f9Var) {
        this.f454119d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s40.y0 y0Var = (s40.y0) i95.n0.c(s40.y0.class);
        com.tencent.mm.storage.f9 f9Var = this.f454119d;
        long msgId = f9Var != null ? f9Var.getMsgId() : -1L;
        ((com.tencent.mm.feature.finder.live.f5) y0Var).getClass();
        rl2.l Pj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj();
        if (msgId == -1) {
            Pj.getClass();
            return;
        }
        ce2.l z07 = Pj.z0(msgId);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "onFinderNotifyExpose ,msgId = " + msgId + ",tipsId = " + z07.field_tipsId + ", rowId = " + z07.systemRowid);
        if (z07.systemRowid != -1) {
            z07.field_exposureStatus = 1;
            Pj.updateNotify(z07, false, new java.lang.String[0]);
        }
    }
}
