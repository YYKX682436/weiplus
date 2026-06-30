package sp2;

/* loaded from: classes2.dex */
public final class o0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f411118a;

    public o0(so2.h1 h1Var) {
        this.f411118a = h1Var;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        r45.nw1 liveInfo;
        so2.h1 h1Var = this.f411118a;
        r45.nw1 liveInfo2 = h1Var.getFeedObject().getLiveInfo();
        if ((liveInfo2 != null ? liveInfo2.getLong(0) : 0L) != j17 || !(obj instanceof r45.l71)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#refreshLiveStatus, local liveId:");
            r45.nw1 liveInfo3 = h1Var.getFeedObject().getLiveInfo();
            sb6.append(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null);
            sb6.append(" resp live id ");
            sb6.append(j17);
            sb6.append(",liveInfoResp:");
            sb6.append(obj);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("change liveStatus,cur feed:");
        sb7.append(h1Var.getFeedObject().getNickName());
        sb7.append(" status:");
        r45.nw1 liveInfo4 = h1Var.getFeedObject().getLiveInfo();
        sb7.append(liveInfo4 != null ? java.lang.Integer.valueOf(liveInfo4.getInteger(2)) : null);
        sb7.append(", liveStatus:");
        sb7.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb7.toString());
        if (i17 <= 0 || (liveInfo = h1Var.getFeedObject().getLiveInfo()) == null) {
            return;
        }
        liveInfo.set(2, java.lang.Integer.valueOf(i17));
    }
}
