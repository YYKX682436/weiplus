package ey0;

/* loaded from: classes5.dex */
public final class i implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey0.j f257306a;

    public i(ey0.j jVar) {
        this.f257306a = jVar;
    }

    @Override // v51.f
    public final void a(java.util.Date date) {
        ey0.j jVar = this.f257306a;
        if (date == null) {
            jVar.getClass();
        } else {
            if (kotlin.jvm.internal.o.b(jVar.f257309c, date)) {
                return;
            }
            jVar.f257309c = date;
            jVar.f257307a.a(date);
        }
    }
}
