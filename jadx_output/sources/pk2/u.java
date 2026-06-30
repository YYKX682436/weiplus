package pk2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.v f356274f;

    public u(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var, pk2.v vVar) {
        this.f356272d = o9Var;
        this.f356273e = e3Var;
        this.f356274f = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentManagerOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f356272d;
        r4Var.j1(o9Var.f356078d, o9Var.f356074b);
        this.f356273e.h();
        pk2.v vVar = this.f356274f;
        qk2.f.f(vVar, false, 1, null);
        if (vVar.n()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328354h;
            ml2.d1[] d1VarArr = ml2.d1.f327350d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(5), null, 4, null);
        } else {
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num != null) {
                num.intValue();
                jSONObject.put("type", num.intValue());
            }
            jSONObject.put("sub_element", 3);
            jSONObject.put("sub_type", 4);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar2, 37L, jSONObject.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentManagerOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
