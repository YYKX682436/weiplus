package vm1;

/* loaded from: classes8.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438042d;

    public q(yz5.l lVar) {
        this.f438042d = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        yz5.l lVar = this.f438042d;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "black list succ");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(0L, "", new byte[0]))));
        } else {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "black list failed");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(1L, "", new byte[0]))));
        }
    }
}
