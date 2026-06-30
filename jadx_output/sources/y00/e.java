package y00;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f458520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y00.s f458521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f458522c;

    public e(long j17, y00.s sVar, int i17) {
        this.f458520a = j17;
        this.f458521b = sVar;
        this.f458522c = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.Iterable iterable;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f458520a;
        boolean z17 = i17 == 0 && i18 == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardFetcher", "sendCgi done: msgSvrId=" + this.f458521b.f458546b + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", cost=" + currentTimeMillis + "ms, success=" + z17);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        y00.a aVar = null;
        bw5.me0 me0Var = fVar instanceof bw5.me0 ? (bw5.me0) fVar : null;
        java.lang.String str2 = me0Var != null ? me0Var.f30217e[2] ? me0Var.f30216d : "" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if (z17) {
            if (str3.length() > 0) {
                aVar = new y00.a(this.f458521b.f458546b, str3, java.lang.System.currentTimeMillis());
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f458523a;
        y00.s sVar = this.f458521b;
        synchronized (concurrentHashMap) {
            iterable = (java.util.List) concurrentHashMap.remove(java.lang.Long.valueOf(sVar.f458546b));
            if (iterable == null) {
                iterable = kz5.p0.f313996d;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((kotlin.coroutines.Continuation) it.next()).resumeWith(kotlin.Result.m521constructorimpl(aVar));
        }
        if (aVar != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new y00.d(aVar, this.f458521b, this.f458522c));
        }
    }
}
