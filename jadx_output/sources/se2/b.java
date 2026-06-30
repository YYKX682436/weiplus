package se2;

/* loaded from: classes3.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se2.d f406835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406837g;

    public b(in5.s0 s0Var, se2.d dVar, lm2.c cVar, android.view.View view) {
        this.f406834d = s0Var;
        this.f406835e = dVar;
        this.f406836f = cVar;
        this.f406837g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.view.View view = this.f406837g;
        se2.d dVar = this.f406835e;
        lm2.c cVar = this.f406836f;
        switch (itemId) {
            case 154:
                r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) dVar.a(mm2.e0.class)).f328970m.getValue();
                if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
                    str = "";
                }
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.storage.z3.R4(str) || c01.v1.x(str, false)) ? false : true;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxUtil", "isNotInChatRoom " + str + ", " + z17);
                if (!z17) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                    r45.xn1 xn1Var = (r45.xn1) cVar.f319372e.getCustom(13);
                    bundle.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", xn1Var != null ? xn1Var.toByteArray() : null);
                    bundle.putLong("PARAM_ENTER_COMMENT_REPLY_MSG_SEQ", cVar.e());
                    bundle.putBoolean("PARAM_ENTER_COMMENT_HIDE_AT_ENTRANCE", true);
                    dVar.f406843b.f114368p.statusChange(qo0.b.W, bundle);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.f327487n : ml2.g5.f327484h, 1, cVar.a(), cVar.j());
                    break;
                } else {
                    db5.t7.makeText(view.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cyc), 0).show();
                    break;
                }
                break;
            case 155:
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(cVar.j());
                ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(ml2.g5.f327485i, 1, cVar.a(), cVar.j());
                break;
            case 156:
                se2.w wVar = se2.w.f406895a;
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                wVar.b(context, dVar.f406843b.S0(), cVar);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.Q : ml2.g5.f327486m, 1, cVar.a(), cVar.j());
                break;
            default:
                switch (itemId) {
                    case 165:
                        se2.w wVar2 = se2.w.f406895a;
                        in5.s0 s0Var = this.f406834d;
                        kotlinx.coroutines.y0 y0Var = s0Var.f293120d;
                        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.c7g);
                        kotlin.jvm.internal.o.f(p17, "getView(...)");
                        wVar2.t(y0Var, p17, new se2.a(dVar, cVar));
                        break;
                    case 166:
                        se2.w.f406895a.d(dVar.f406844c, dVar.f406843b.S0(), cVar);
                        ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.L : ml2.g5.f327495v, 1, cVar.a(), cVar.j());
                        break;
                    case com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC /* 167 */:
                        se2.w.f406895a.g(dVar.f406842a, cVar.c());
                        break;
                }
        }
        view.setBackground(dVar.f406845d);
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
