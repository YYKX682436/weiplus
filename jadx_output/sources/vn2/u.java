package vn2;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f438385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.app.Activity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f438385d = activity;
        this.f438386e = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.app.Activity activity = this.f438385d;
            activity.finish();
            mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("feed_id", pm0.v.u(this.f438386e.getItemId()));
            ((lf0.h0) g0Var).Vi(activity, 123, bundle);
        }
        return jz5.f0.f302826a;
    }
}
