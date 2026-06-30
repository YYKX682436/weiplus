package y80;

/* loaded from: classes8.dex */
public final class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.y0 f459954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f459956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ za3.d f459957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z80.p0 f459958h;

    public x0(y80.y0 y0Var, android.content.Context context, java.util.Map map, za3.d dVar, z80.p0 p0Var) {
        this.f459954d = y0Var;
        this.f459955e = context;
        this.f459956f = map;
        this.f459957g = dVar;
        this.f459958h = p0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.d(menuItem);
        za3.d dVar = this.f459957g;
        y80.y0 y0Var = this.f459954d;
        y0Var.getClass();
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f459955e;
        java.util.Map map = this.f459956f;
        z80.p0 p0Var = this.f459958h;
        if (itemId == y0Var.f459959d) {
            boolean Ni = y0Var.Ni(map);
            if (Ni) {
                dVar.g(p0Var.f470655a, p0Var.f470656b, "com.tencent.map", false, true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, "com.tencent.map");
            } else {
                gw4.f fVar = new gw4.f(context);
                fVar.f276157b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
                ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 5);
            }
            y0Var.Ri("com.tencent.map", Ni, map);
            return;
        }
        if (kotlin.jvm.internal.o.b(menuItem.getTitle(), context.getString(com.tencent.mm.R.string.bry))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(p0Var.f470655a));
            intent.putExtra("Retr_Msg_Id", p0Var.f470657c);
            intent.putExtra("Retr_Msg_Type", 48);
            intent.putExtra("Retr_MsgTalker", p0Var.f470658d);
            j45.l.u(context, ".ui.chatting.ChattingSendDataToDeviceUI", intent, null);
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (kotlin.jvm.internal.o.b((java.lang.String) entry.getValue(), menuItem.getTitle())) {
                dVar.g(p0Var.f470655a, p0Var.f470656b, str, false, true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, str);
                y0Var.Ri(str, true, map);
                return;
            }
        }
    }
}
