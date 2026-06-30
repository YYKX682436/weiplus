package ya2;

/* loaded from: classes.dex */
public final class q implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f460522b;

    public q(int i17, android.content.Context context, long j17) {
        this.f460521a = context;
        this.f460522b = j17;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 1) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "close_and_clear");
            aVar.ik(view, com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX, 25496);
            android.content.Context context = this.f460521a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            lVarArr[2] = new jz5.l("collection_id", pm0.v.u(this.f460522b));
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }
}
