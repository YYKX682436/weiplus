package kv4;

/* loaded from: classes12.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv4.j f312702d;

    public h0(mv4.j jVar) {
        this.f312702d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachVerticalEntryViewItem$bindData$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv4.c0 c0Var = (rv4.c0) this.f312702d;
        rv4.w wVar = c0Var.f400448b;
        wVar.f331675b.c(c0Var.a(ov4.d.f349209h));
        java.lang.Integer num = c0Var.f400451e;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = c0Var.f400452f;
        wVar.f331675b.c(new ov4.a(intValue, 0, num2 != null ? num2.intValue() : 14, null, 0, wVar.f331674a, 0, 90, null));
        c0Var.getClass();
        su4.j2 j2Var = new su4.j2();
        java.lang.Integer num3 = c0Var.f400452f;
        j2Var.f412939b = num3 != null ? num3.intValue() : 14;
        j2Var.f412943f = true;
        j2Var.A = !c0Var.f400455i;
        java.lang.Integer num4 = c0Var.f400451e;
        j2Var.f412940c = num4 != null ? num4.intValue() : 0;
        j2Var.f412942e = c0Var.f400448b.f331674a;
        j2Var.f412956s = "57:::" + ((rv4.b0) c0Var.f400447a).f400443f;
        j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j2Var.f412945h = true;
        j2Var.f412946i = false;
        j2Var.f412958u = false;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachVerticalEntryViewItem$bindData$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
