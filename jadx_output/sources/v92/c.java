package v92;

/* loaded from: classes15.dex */
public final class c implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v92.g f434154a;

    public c(v92.g gVar) {
        this.f434154a = gVar;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        v92.g gVar = this.f434154a;
        androidx.appcompat.app.AppCompatActivity context = gVar.f434158a;
        kotlin.jvm.internal.o.d(view);
        kotlin.jvm.internal.o.d(menuItem);
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        int itemId = menuItem.getItemId();
        if (itemId == 20002) {
            gVar.l(context, view, i17, menuItem);
            return;
        }
        if (itemId == 20003) {
            gVar.n(context, view, i17, menuItem);
        } else if (itemId == 20005) {
            gVar.k(context, view, i17, menuItem);
        } else {
            if (itemId != 20010) {
                return;
            }
            gVar.m(context, view, i17, menuItem);
        }
    }
}
