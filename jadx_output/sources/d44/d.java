package d44;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f226428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f226429b;

    /* renamed from: c, reason: collision with root package name */
    public final d44.b f226430c;

    public d(java.lang.String str, int i17, d44.b bVar) {
        this.f226428a = str;
        this.f226429b = i17;
        this.f226430c = bVar;
    }

    public void b(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
        d44.b bVar = this.f226430c;
        if (bVar != null) {
            try {
                ((ku5.t0) ku5.t0.f312615d).B(new d44.c(this, i17, bVar, obj));
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
    }
}
