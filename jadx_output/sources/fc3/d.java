package fc3;

/* loaded from: classes9.dex */
public final class d implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.e f261018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f261019e;

    public d(fc3.e eVar, kotlin.jvm.internal.f0 f0Var) {
        this.f261018d = eVar;
        this.f261019e = f0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.util.List list;
        kotlin.jvm.internal.f0 f0Var = this.f261019e;
        fc3.e eVar = this.f261018d;
        try {
            if (eVar.f261030g == f0Var.f310116d && (list = eVar.f261029f) != null) {
                kotlin.jvm.internal.o.d(list);
                if (list.size() > eVar.f261030g) {
                    java.util.List list2 = eVar.f261029f;
                    kotlin.jvm.internal.o.d(list2);
                    z21.c cVar = (z21.c) list2.get(eVar.f261030g);
                    fc3.f fVar = fc3.f.f261040a;
                    java.lang.String str = eVar.f261035l;
                    java.lang.String str2 = eVar.f261036m;
                    int i17 = eVar.f261037n;
                    int i18 = eVar.f261038o;
                    java.lang.String timeMs = cVar.f469560b;
                    java.lang.String keyword = cVar.f469559a;
                    kotlin.jvm.internal.o.f(timeMs, "timeMs");
                    long parseLong = java.lang.Long.parseLong(timeMs);
                    int i19 = f0Var.f310116d;
                    kotlin.jvm.internal.o.f(keyword, "keyword");
                    fVar.a(str, str2, i17, i18, parseLong, i19, keyword, eVar.f261033j);
                    kotlin.jvm.internal.o.f(keyword, "keyword");
                    eVar.d(keyword);
                    eVar.f261030g++;
                    f0Var.f310116d++;
                    eVar.e();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
        return false;
    }
}
