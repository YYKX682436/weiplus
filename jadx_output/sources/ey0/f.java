package ey0;

/* loaded from: classes5.dex */
public final class f implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey0.g f257301a;

    public f(ey0.g gVar) {
        this.f257301a = gVar;
    }

    @Override // v51.f
    public final void a(java.util.Date date) {
        ey0.g gVar = this.f257301a;
        if (date == null) {
            gVar.getClass();
        } else {
            if (kotlin.jvm.internal.o.b(gVar.f257304c, date)) {
                return;
            }
            gVar.f257304c = date;
            gVar.f257302a.a(date);
        }
    }
}
