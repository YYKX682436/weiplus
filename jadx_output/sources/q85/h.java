package q85;

/* loaded from: classes3.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.m implements yz5.l {
    public h(java.lang.Object obj) {
        super(1, obj, q85.g.class, "getPlayer", "getPlayer(Landroid/content/Context;)Landroid/view/View;", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context p07 = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        q85.g gVar = (q85.g) this.receiver;
        gVar.getClass();
        if (gVar.f360807i == null) {
            java.util.List list = q85.g.f360801o;
            if (list.size() > 0) {
                gVar.f360807i = (pk4.d) fp.l.a(list);
            }
            if (gVar.f360807i == null) {
                i95.m c17 = i95.n0.c(df0.t.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                gVar.f360807i = df0.t.P5((df0.t) c17, p07, null, 0, 6, null);
                list.size();
            }
        }
        v65.i.b(gVar.f360806h, null, new q85.e(gVar, null), 1, null);
        java.lang.Object obj2 = gVar.f360807i;
        kotlin.jvm.internal.o.d(obj2);
        return (android.view.View) obj2;
    }
}
