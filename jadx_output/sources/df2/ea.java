package df2;

/* loaded from: classes5.dex */
public final class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f230048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f230049f;

    public ea(df2.zb zbVar, java.util.List list, java.lang.Float f17) {
        this.f230047d = zbVar;
        this.f230048e = list;
        this.f230049f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.zb zbVar = this.f230047d;
        ((java.util.ArrayList) zbVar.f231942p).clear();
        ((java.util.ArrayList) zbVar.f231942p).addAll(this.f230048e);
        java.lang.Float f17 = this.f230049f;
        if (f17 == null) {
            f17 = java.lang.Float.valueOf(0.0f);
        }
        zbVar.f231943q = f17;
        com.tencent.mars.xlog.Log.i(zbVar.f231939m, "[aiAssistant] fetchWelcomeConfig: cached " + ((java.util.ArrayList) zbVar.f231942p).size() + " welcomes, confidenceThreshold=" + zbVar.f231943q);
    }
}
