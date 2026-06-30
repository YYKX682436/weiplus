package xs2;

/* loaded from: classes.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456376a;

    public s0(android.content.Context context) {
        this.f456376a = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (xg2.g.e(fVar)) {
            com.tencent.mars.xlog.Log.i("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest success!");
            pm0.v.X(new xs2.r0(this.f456376a));
        } else {
            com.tencent.mars.xlog.Log.e("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest fail:" + fVar.f70616b + ',' + fVar.f70615a + ',' + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
