package v40;

@j95.b
/* loaded from: classes10.dex */
public final class q extends i95.w implements c50.q0 {
    public c50.m0 Ai(androidx.appcompat.app.AppCompatActivity context) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.u uVar = pf5.u.f353936a;
        ((gp2.v0) uVar.e(wo2.k.class).a(gp2.v0.class)).N6(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
            str = "";
        }
        return new gp2.l0(context, null, arrayList, false, 0, true, false, true, null, null, 0, str, 0, false, null, null, 63232, null);
    }

    public mn0.b0 wi(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int X = nn0.c.X(false);
        nn0.c cVar = new nn0.c(context, (X == 5 || X == 6) ? 2 : 0, false);
        cVar.F(com.tencent.mm.plugin.finder.live.util.n2.b(com.tencent.mm.plugin.finder.live.util.n2.f115640a, "FinderLivePlayerFactoryService", true, null, null, 0, 0, 60, null));
        return cVar;
    }
}
