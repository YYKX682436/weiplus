package pk2;

/* loaded from: classes2.dex */
public final class i3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f355835d;

    public i3(v65.n nVar) {
        this.f355835d = nVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.gi2 req = (r45.gi2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("AnchorRecommendOption", "modifyLiveUserRecommendSetting ret:" + ret.getInteger(1) + ", " + ret.getString(2) + ", " + ret.getInteger(0));
        int integer = ret.getInteger(1);
        v65.n nVar = this.f355835d;
        if (integer == 0) {
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            nVar.a(java.lang.Boolean.FALSE);
        }
    }
}
