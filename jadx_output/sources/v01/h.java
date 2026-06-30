package v01;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f432204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f432205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432206f;

    public h(r45.vs2 vs2Var, android.widget.RelativeLayout relativeLayout, com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment) {
        this.f432204d = vs2Var;
        this.f432205e = relativeLayout;
        this.f432206f = bizProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.Html5Info html5_info;
        com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initRedDot$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).Ai(0);
        r45.xs2 xs2Var = new r45.xs2();
        com.tencent.mm.protobuf.g gVar = this.f432204d.f388488f;
        com.tencent.mm.protobuf.f fromProtobuf = xs2Var.fromProtobuf(gVar != null ? gVar.g() : null);
        r45.xs2 xs2Var2 = fromProtobuf instanceof r45.xs2 ? (r45.xs2) fromProtobuf : null;
        if (xs2Var2 != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
            boolean z18 = finderJumpInfo != null && finderJumpInfo.getJumpinfo_type() == 1;
            com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = this.f432206f;
            if (z18) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                if (finderJumpInfo2 != null && (mini_app_info = finderJumpInfo2.getMini_app_info()) != null) {
                    v01.g gVar2 = new v01.g(bizProfileCardFragment);
                    int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
                    bizProfileCardFragment.getClass();
                    java.lang.String app_id = mini_app_info.getApp_id();
                    if (app_id == null) {
                        app_id = "";
                    }
                    java.lang.String appusername = mini_app_info.getAppusername();
                    java.lang.String path = mini_app_info.getPath();
                    if (path == null) {
                        path = "";
                    }
                    int scene = mini_app_info.getScene();
                    java.lang.String scene_note = mini_app_info.getScene_note();
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317014b = app_id;
                    b1Var.f317012a = appusername;
                    b1Var.f317022f = path;
                    b1Var.f317032k = scene;
                    b1Var.f317034l = scene_note;
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    java.lang.String transit_common_ux_info = mini_app_info.getTransit_common_ux_info();
                    persistableBundle.putString("commonUxInfo", transit_common_ux_info != null ? transit_common_ux_info : "");
                    b1Var.f317030j = persistableBundle;
                    b1Var.f317028i = new v01.j(mini_app_info);
                    b1Var.L = new v01.a(bizProfileCardFragment, gVar2);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(bizProfileCardFragment.getContext(), b1Var);
                }
            } else {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                if (finderJumpInfo3 != null && finderJumpInfo3.getJumpinfo_type() == 2) {
                    z17 = true;
                }
                if (z17) {
                    android.content.Context context = this.f432205e.getContext();
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                    java.lang.String url = (finderJumpInfo4 == null || (html5_info = finderJumpInfo4.getHtml5_info()) == null) ? null : html5_info.getUrl();
                    if (context != null && url != null) {
                        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).tj(context, url);
                        int i18 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
                        if (!bizProfileCardFragment.u0()) {
                            bizProfileCardFragment.y0();
                        }
                        r2 = jz5.f0.f302826a;
                    }
                    if (r2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileCardFragment", "jumpInfo url is null");
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parse jumpInfo error, type: ");
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo5 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                    sb6.append(finderJumpInfo5 != null ? java.lang.Integer.valueOf(finderJumpInfo5.getJumpinfo_type()) : null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileCardFragment", sb6.toString());
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment$initRedDot$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
