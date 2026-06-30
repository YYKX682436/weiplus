package ga3;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f269863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269864e;

    public q(ga3.v vVar, com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        this.f269864e = vVar;
        this.f269863d = recordParam;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f269864e.f269877c) {
            ga3.v vVar = this.f269864e;
            vVar.f269878d = this.f269863d;
            ga3.v.c(vVar);
        }
    }
}
