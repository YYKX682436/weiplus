package so2;

/* loaded from: classes.dex */
public final class m5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f410483d;

    public m5(kotlinx.coroutines.q qVar) {
        this.f410483d = qVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + ret.getInteger(1) + " retMsg:" + ret.getString(2));
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f410483d).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Integer.valueOf(ret.getInteger(1)), ret.getString(2))));
    }
}
