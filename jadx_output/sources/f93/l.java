package f93;

/* loaded from: classes11.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n80.e f260375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f260377f;

    public l(n80.e eVar, com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, int i17) {
        this.f260375d = eVar;
        this.f260376e = absLabelUserDialog;
        this.f260377f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pj4.k2 c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/AbsLabelUserDialog$handleDataResult$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        n80.e eVar = this.f260375d;
        boolean z17 = eVar.f335602e;
        com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog = this.f260376e;
        if (z17) {
            absLabelUserDialog.cancel();
        }
        n80.a aVar = eVar.f335603f;
        if (aVar != null) {
            java.util.ArrayList<java.lang.String> arrayList2 = absLabelUserDialog.f143186v;
            java.util.ArrayList arrayList3 = absLabelUserDialog.f143185u;
            bk4.l0 l0Var = (bk4.l0) aVar;
            if (l0Var.f21506a.f335601d) {
                bk4.q0 q0Var = bk4.q0.f21538a;
                android.content.Context context = l0Var.f21507b;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                mj4.h statusItem = l0Var.f21508c;
                kotlin.jvm.internal.o.g(statusItem, "statusItem");
                java.lang.String l17 = ((mj4.k) statusItem).l();
                if (activity == null || com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusGroupVisibilityHelper", "jumpEditGroupVisibility: failed context, ".concat(l17));
                } else {
                    android.content.Intent className = new android.content.Intent().setClassName(activity, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI");
                    kotlin.jvm.internal.o.f(className, "setClassName(...)");
                    className.putExtra("KEY_EDIT_VISIBILITY_FEED_ID", l17);
                    pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity, 9, pj4.p0.class);
                    className.putExtra("KEY_EDIT_VISIBILITY_FROM_SCENE", p0Var != null ? java.lang.Integer.valueOf(p0Var.f355242m) : 0L);
                    if (arrayList2 != null) {
                        if ((arrayList2.isEmpty() ^ true ? arrayList2 : null) != null) {
                            className.putStringArrayListExtra("label_id", arrayList2);
                        }
                    }
                    int i17 = this.f260377f;
                    className.putExtra("KLabel_range_index", i17);
                    className.putExtra("Kother_user_name_list", com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, ","));
                    if (i17 == 0 && (c17 = q0Var.c()) != null) {
                        className.putExtra("k_last_range_visible_state", c17.f355159d);
                        className.putExtra("k_last_range_label_list", c17.f355161f);
                        className.putExtra("k_last_range_user_list", c17.f355160e);
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(className);
                    java.util.Collections.reverse(arrayList4);
                    android.app.Activity activity2 = activity;
                    yj0.a.d(activity2, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "jumpEditGroupVisibility", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper", "jumpEditGroupVisibility", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    qj4.s.m(qj4.s.f363958a, activity, 97L, null, statusItem, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/AbsLabelUserDialog$handleDataResult$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
