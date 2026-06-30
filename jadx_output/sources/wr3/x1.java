package wr3;

/* loaded from: classes11.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.v1 f448914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr3.z1 f448915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l5 f448916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f448917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f448918h;

    public x1(wr3.v1 v1Var, wr3.z1 z1Var, r45.l5 l5Var, int i17, r45.o5 o5Var) {
        this.f448914d = v1Var;
        this.f448915e = z1Var;
        this.f448916f = l5Var;
        this.f448917g = i17;
        this.f448918h = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        android.os.Bundle bundleExtra;
        android.content.Intent intent2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wr3.v1 v1Var = this.f448914d;
        android.content.Context context = v1Var.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.ImageView imageView = v1Var.f448902d;
        r45.o5 o5Var = this.f448918h;
        if (o5Var != null) {
            com.tencent.mars.xlog.Log.i("BizProfileJumpLogic", "onClick jump to url:%s", o5Var.f381917h);
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? 10000 : intent2.getIntExtra("KOpenArticleSceneFromScene", 10000);
            android.content.Intent intent3 = new android.content.Intent();
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = context instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI ? (com.tencent.mm.plugin.profile.ui.ContactInfoUI) context : null;
            java.lang.String b17 = ot0.g0.b(o5Var.f381917h, 126, intExtra, ((int) java.lang.System.currentTimeMillis()) / 1000, null, (contactInfoUI == null || (intent = contactInfoUI.getIntent()) == null || (bundleExtra = intent.getBundleExtra("Contact_Ext_Args")) == null) ? null : bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", ""));
            intent3.putExtra("rawUrl", b17);
            intent3.putExtra("useJs", true);
            intent3.putExtra("vertical_scroll", true);
            intent3.putExtra("geta8key_scene", 3);
            intent3.putExtra("geta8key_username", "");
            java.lang.String stringExtra = intent3.getStringExtra("prePublishId");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                intent3.putExtra("prePublishId", "brand_profile");
                intent3.putExtra("KPublisherId", "brand_profile");
            } else {
                intent3.putExtra("KPublisherId", stringExtra);
                intent3.putExtra("prePublishId", stringExtra);
                intent3.putExtra("preUsername", intent3.getStringExtra("preUsername"));
                intent3.putExtra("preChatName", intent3.getStringExtra("preChatName"));
            }
            intent3.putExtra("preChatTYPE", intent3.getIntExtra("preChatTYPE", 0));
            intent3.putExtra("key_enable_fts_quick", true);
            int intExtra2 = intent3.getIntExtra("KOpenArticleSceneFromScene", 10000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(6)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(context, b17, o5Var.f381923p, false, 126, intExtra2, intent3)) {
                    com.tencent.mars.xlog.Log.i("BizProfileJumpLogic", "jump to TmplWebview");
                }
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        wr3.z1 z1Var = this.f448915e;
        if (z1Var.f448926f) {
            gr3.b.f274847a.b(java.lang.Long.valueOf(this.f448916f.f379138d), java.lang.Long.valueOf(this.f448917g), 703L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : "", z1Var.f448927g, (r29 & 128) != 0 ? 0 : 0, (r29 & 256) != 0 ? 0 : 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
