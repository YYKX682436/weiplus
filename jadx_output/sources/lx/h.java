package lx;

/* loaded from: classes10.dex */
public final class h implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321778a;

    public h(yz5.l lVar) {
        this.f321778a = lVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321778a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.finder.FlutterError(java.lang.String.valueOf((java.lang.Integer) obj), "request error", null)))));
    }
}
