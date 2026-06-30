package lo2;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f320170d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f320171e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320172f;

    public u(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI) {
        this.f320172f = finderMemberQAVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f320171e = android.os.SystemClock.uptimeMillis();
        zy2.g5 g5Var = this.f320172f.f121408z;
        if (g5Var != null) {
            g5Var.a(this.f320170d, false);
        }
    }
}
