package qj3;

/* loaded from: classes10.dex */
public final class b implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj3.g f363871a;

    public b(qj3.g gVar) {
        this.f363871a = gVar;
    }

    @Override // l45.m
    public boolean a(xk0.p item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", item.E);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", item.A);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", item.B);
        this.f363871a.f363877e.w(ju3.c0.P, bundle);
        return true;
    }

    @Override // l45.m
    public void b() {
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        qj3.g gVar = this.f363871a;
        if (booleanValue) {
            ju3.d0.k(gVar.f363877e, ju3.c0.V, null, 2, null);
        } else {
            ju3.d0.k(gVar.f363877e, ju3.c0.W, null, 2, null);
        }
    }
}
