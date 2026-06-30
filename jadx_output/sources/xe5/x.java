package xe5;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f454143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xe5.i iVar, long j17) {
        super(0);
        this.f454142d = iVar;
        this.f454143e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xe5.i iVar = this.f454142d;
        android.widget.TextView textView = iVar.f454051l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = iVar.f454052m;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.util.HashMap hashMap = ((vd2.e2) ((en0.e) i95.n0.c(en0.e.class))).f435712h;
        long j17 = this.f454143e;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) hashMap.get(java.lang.Long.valueOf(j17));
        if (f9Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyGetMoreLiveService", "notifyUpdateByFeedId: feedId=".concat(pm0.v.u(j17)));
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
        return jz5.f0.f302826a;
    }
}
