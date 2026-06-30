package dk2;

/* loaded from: classes.dex */
public final class i4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f233607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233608b;

    public i4(long j17, yz5.p pVar) {
        this.f233607a = j17;
        this.f233608b = pVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] getWeCoinBalance onFailed,errorType:");
        sb6.append(i17);
        sb6.append(",errorCode:");
        sb6.append(i18);
        sb6.append(",msg:");
        sb6.append(str);
        sb6.append(", requestId:");
        long j17 = this.f233607a;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", sb6.toString());
        yz5.p pVar = this.f233608b;
        if (pVar != null) {
            pVar.invoke(-1L, java.lang.Long.valueOf(j17));
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] getWeCoinBalance onSuccess,data:");
        sb6.append(data.f374585d);
        sb6.append(", requestId:");
        long j17 = this.f233607a;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", sb6.toString());
        yz5.p pVar = this.f233608b;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(data.f374585d), java.lang.Long.valueOf(j17));
        }
    }
}
