package df2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.y f231569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f231570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f231571f;

    public v(df2.y yVar, com.tencent.mm.ui.widget.dialog.y1 y1Var, android.widget.TextView textView) {
        this.f231569d = yVar;
        this.f231570e = y1Var;
        this.f231571f = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/AnchorRemindController$onLiveCloseClick$remindDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.Q1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        jSONObject.put("words", this.f231571f.getText());
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = (com.tencent.mm.plugin.finder.live.plugin.k5) this.f231569d.R6(com.tencent.mm.plugin.finder.live.plugin.k5.class);
        if (k5Var != null) {
            k5Var.t1();
        }
        this.f231570e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/AnchorRemindController$onLiveCloseClick$remindDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
