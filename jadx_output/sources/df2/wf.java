package df2;

/* loaded from: classes3.dex */
public final class wf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f231683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f231685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231686g;

    public wf(df2.ug ugVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, lm2.c cVar, android.content.Context context) {
        this.f231683d = ugVar;
        this.f231684e = liveRoomControllerStore;
        this.f231685f = cVar;
        this.f231686g = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f231684e;
        android.content.Context context = this.f231686g;
        df2.ug ugVar = this.f231683d;
        lm2.c cVar = this.f231685f;
        switch (itemId) {
            case 154:
                r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) ugVar.business(mm2.e0.class)).f328970m.getValue();
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
                    ugVar.X6(qo0.b.W, bundle);
                    break;
                } else {
                    db5.t7.makeText(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cyc), 0).show();
                    break;
                }
                break;
            case 155:
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(cVar.j());
                break;
            case 156:
                se2.w wVar = se2.w.f406895a;
                kotlin.jvm.internal.o.f(context, "$context");
                wVar.b(context, liveRoomControllerStore.getLiveRoomData(), cVar);
                break;
            default:
                switch (itemId) {
                    case 165:
                        se2.w.f406895a.h(ugVar.f231522m, liveRoomControllerStore.getLiveRoomData(), cVar);
                        break;
                    case 166:
                        se2.w.f406895a.d(ugVar.f231522m, liveRoomControllerStore.getLiveRoomData(), cVar);
                        break;
                    case com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC /* 167 */:
                        se2.w wVar2 = se2.w.f406895a;
                        kotlin.jvm.internal.o.f(context, "$context");
                        wVar2.g(context, cVar.c());
                        break;
                }
        }
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
