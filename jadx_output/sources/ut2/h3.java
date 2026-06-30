package ut2;

/* loaded from: classes3.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ed5 f430899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430901f;

    public h3(r45.ed5 ed5Var, ut2.s3 s3Var, cm2.m0 m0Var) {
        this.f430899d = ed5Var;
        this.f430900e = s3Var;
        this.f430901f = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.CharSequence, java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$showLittleTailIfNeeded$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ed5 ed5Var = this.f430899d;
        bw5.x7 x7Var = ed5Var != null ? (bw5.x7) ed5Var.getCustom(5) : null;
        boolean z17 = true;
        ut2.s3 s3Var = this.f430900e;
        if (x7Var != null) {
            android.content.Context context = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            android.content.Context context2 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ?? r07 = ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).f116906d;
            if (r07 != 0 && r07.length() != 0) {
                z17 = false;
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = z17 ? null : r07;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("entranceGMsgID", finderJumpInfo);
            aVar.h(jSONObject);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.yb ybVar = (c61.yb) c18;
            android.content.Context context3 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ac4Var.set(5, bool);
            ac4Var.set(7, bool);
            ac4Var.set(1, ed5Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ed5Var.getCustom(3) : null);
            c61.yb.Yi(ybVar, context3, ac4Var, null, null, 8, null);
        }
        s3Var.getClass();
        i95.m c19 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c19;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f327431e;
        gVar.o("commerceAction", 1067);
        cm2.m0 m0Var = this.f430901f;
        r45.ed5 ed5Var2 = (r45.ed5) m0Var.f43368v.getCustom(67);
        if (ed5Var2 == null || (str = ed5Var2.getString(4)) == null) {
            str = "";
        }
        gVar.h("little_tail_report_data", str);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, m0Var.f43368v.getString(17), null, 188, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$showLittleTailIfNeeded$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
