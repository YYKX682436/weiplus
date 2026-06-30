package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f121916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3 f121917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f121918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.ic f121920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121921i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121922m;

    public r3(vp2.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3 t3Var, java.util.List list, int i17, dk2.ic icVar, int i18, in5.s0 s0Var) {
        this.f121916d = h0Var;
        this.f121917e = t3Var;
        this.f121918f = list;
        this.f121919g = i17;
        this.f121920h = icVar;
        this.f121921i = i18;
        this.f121922m = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        dk2.hc hcVar;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vp2.h0 h0Var = this.f121916d;
        if (h0Var.f438927g != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3 t3Var = this.f121917e;
        t3Var.getClass();
        java.util.Iterator it = this.f121918f.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            dk2.ic icVar = null;
            boolean z17 = true;
            int i18 = this.f121919g;
            if (!hasNext) {
                dk2.bc bcVar = h0Var.f438925e;
                if (bcVar != null && (hcVar = bcVar.f233256c) != null && (list = hcVar.f233583e) != null) {
                    icVar = (dk2.ic) kz5.n0.a0(list, i18);
                }
                h0Var.f438927g = icVar;
                yz5.q qVar = t3Var.f121950g;
                int i19 = this.f121921i;
                qVar.invoke(this.f121920h, java.lang.Integer.valueOf(i19), h0Var);
                h0Var.getClass();
                in5.s0 holder = this.f121922m;
                kotlin.jvm.internal.o.g(holder, "holder");
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                rq2.w wVar = (rq2.w) zVar.a(appCompatActivity).a(rq2.w.class);
                java.lang.String string = V6.getString(1);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                dk2.ic icVar2 = h0Var.f438927g;
                jSONObject.putOpt("select_options", (icVar2 == null || (str = icVar2.f233623b) == null) ? "" : r26.i0.t(str, ",", ";", false));
                jSONObject.putOpt("card_index", java.lang.Integer.valueOf(i19));
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                wVar.Q6(string, "square_nps_quest_card", r26.i0.t(jSONObject2, ",", ";", false));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.Button button = (android.widget.Button) next;
            if (i17 != i18) {
                z17 = false;
            }
            button.setSelected(z17);
            i17 = i27;
        }
    }
}
