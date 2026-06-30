package qm;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f364652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm.x f364653g;

    public q(qm.x xVar, java.lang.String str, boolean z17, boolean z18) {
        this.f364653g = xVar;
        this.f364650d = str;
        this.f364651e = z17;
        this.f364652f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qm.x.c(this.f364653g, this.f364650d, this.f364651e, this.f364652f);
    }
}
