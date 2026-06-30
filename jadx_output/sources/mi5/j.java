package mi5;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.k f326860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc5.c f326862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mv2 f326863g;

    public j(mi5.k kVar, android.content.Context context, fc5.c cVar, r45.mv2 mv2Var) {
        this.f326860d = kVar;
        this.f326861e = context;
        this.f326862f = cVar;
        this.f326863g = mv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderActivityView$onUpdateViewModel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f326861e;
        kotlin.jvm.internal.o.f(context, "$context");
        fc5.c cVar = this.f326862f;
        java.lang.String string = cVar.getString(cVar.f43702d + 1);
        this.f326860d.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.mv2 mv2Var = this.f326863g;
        intent.putExtra("key_feed_id", pm0.v.Z(mv2Var.getString(7)));
        intent.putExtra("key_topic_title", mv2Var.getString(0));
        intent.putExtra("key_topic_type", mv2Var.getInteger(1));
        if (((r45.ub4) mv2Var.getCustom(8)) != null) {
            r45.ub4 ub4Var = (r45.ub4) mv2Var.getCustom(8);
            kotlin.jvm.internal.o.d(ub4Var);
            intent.putExtra("key_activity_id", pm0.v.Z(ub4Var.getString(0)));
            intent.putExtra("key_activity_name", mv2Var.getString(0));
        }
        r45.ze2 ze2Var = new r45.ze2();
        if (((r45.hv2) mv2Var.getCustom(4)) != null) {
            r45.hv2 hv2Var = (r45.hv2) mv2Var.getCustom(4);
            kotlin.jvm.internal.o.d(hv2Var);
            ze2Var.set(5, hv2Var.getString(0));
            r45.hv2 hv2Var2 = (r45.hv2) mv2Var.getCustom(4);
            kotlin.jvm.internal.o.d(hv2Var2);
            ze2Var.set(0, java.lang.Float.valueOf(hv2Var2.getFloat(1)));
            r45.hv2 hv2Var3 = (r45.hv2) mv2Var.getCustom(4);
            kotlin.jvm.internal.o.d(hv2Var3);
            ze2Var.set(1, java.lang.Float.valueOf(hv2Var3.getFloat(2)));
            try {
                intent.putExtra("key_topic_poi_location", ze2Var.toByteArray());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("ChattingFinderActivityView", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", string);
        intent.putExtra("key_report_scene", com.tencent.mm.storage.z3.R4(string) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        intent.putExtra("key_entrance_type", 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fl(context, intent);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderActivityView$onUpdateViewModel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
