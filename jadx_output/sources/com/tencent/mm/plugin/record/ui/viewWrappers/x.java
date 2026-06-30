package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes5.dex */
public class x implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.l2 f155576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f155577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt3.f3 f155578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ et3.b f155579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f155580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.y f155581i;

    public x(com.tencent.mm.plugin.record.ui.viewWrappers.y yVar, com.tencent.mm.plugin.record.ui.l2 l2Var, boolean z17, bt3.f3 f3Var, et3.b bVar, int i17) {
        this.f155581i = yVar;
        this.f155576d = l2Var;
        this.f155577e = z17;
        this.f155578f = f3Var;
        this.f155579g = bVar;
        this.f155580h = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        com.tencent.mm.plugin.record.ui.viewWrappers.y yVar = this.f155581i;
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(yVar.f155582a.getResources().getColor(com.tencent.mm.R.color.FG_3)), 0, textView.getText().length(), 33);
        textView.setText(spannableString);
        android.content.res.Resources resources = textView.getResources();
        yVar.f155586e = new rl5.r(yVar.f155582a, textView);
        rl5.r rVar = yVar.f155586e;
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.record.ui.viewWrappers.u(this, resources);
        rVar.f397354x = new com.tencent.mm.plugin.record.ui.viewWrappers.v(this, textView);
        rVar.L = new com.tencent.mm.plugin.record.ui.viewWrappers.w(this, textView);
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            int[] iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
            yVar.f155586e.n(iArr[0], iArr[1]);
        } else {
            yVar.f155586e.n(yVar.f155583b, yVar.f155584c);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
