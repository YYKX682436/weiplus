package jv0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv0.g f302182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jv0.g gVar) {
        super(1);
        this.f302182d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        jv0.g gVar = this.f302182d;
        ex0.f fVar = gVar.f302188q;
        if (fVar != null) {
            com.tencent.maas.model.time.MJTime endTime = fVar.l().getEndTime();
            kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
            fVar.z(endTime);
            com.tencent.maas.model.time.MJTime endTime2 = gVar.f302187p.getEndTime();
            kotlin.jvm.internal.o.f(endTime2, "getEndTime(...)");
            fVar.y(endTime2);
            com.tencent.maas.model.time.MJTime duration = gVar.f302187p.getDuration();
            kotlin.jvm.internal.o.f(duration, "getDuration(...)");
            fVar.z(duration);
        }
        gVar.s7();
        return java.lang.Boolean.TRUE;
    }
}
