package u20;

/* loaded from: classes9.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u20.y f423937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423938e;

    public t(u20.y yVar, android.content.Context context) {
        this.f423937d = yVar;
        this.f423938e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u20.y yVar = this.f423937d;
        u20.q qVar = yVar.f423953d;
        yVar.getClass();
        nb5.a aVar = new nb5.a();
        java.lang.String str = qVar.f423927i;
        if (str == null) {
            str = "";
        }
        aVar.n(str);
        aVar.l(qVar.a());
        java.util.List list = yVar.f423857a;
        boolean z17 = list == null || list.isEmpty();
        android.content.Context context = this.f423938e;
        if (!z17) {
            ((java.util.ArrayList) yVar.f423955f).addAll(yVar.f423857a);
            n13.x xVar = yVar.f423956g;
            n13.t tVar = new n13.t();
            tVar.f334134b = xVar;
            n13.a0.V0.getClass();
            tVar.f334135c = n13.y.f334141a;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, yVar.f423955f, tVar);
            return;
        }
        n13.r rVar = new n13.r();
        rVar.f334118b = 101;
        rVar.f334121e = false;
        if (yVar.f423953d.f423929k == 1) {
            rVar.f334122f = false;
            rVar.f334123g = false;
            rVar.f334124h = false;
        }
        rVar.f334119c = yVar.f423957h;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }
}
