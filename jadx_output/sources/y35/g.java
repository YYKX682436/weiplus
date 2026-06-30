package y35;

/* loaded from: classes11.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.d f459211d;

    public g(y35.d dVar) {
        this.f459211d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y35.k kVar = this.f459211d.f459201i;
        if (kVar != null) {
            com.tencent.mm.plugin.profile.r0 r0Var = (com.tencent.mm.plugin.profile.r0) kVar;
            java.lang.String d17 = r0Var.f153597b.f153421e.d1();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.profile.f0(r0Var, d17));
        }
        android.view.View inflate = android.view.View.inflate(this.f459211d.f459196d, com.tencent.mm.R.layout.ckf, null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mmq)).setVisibility(8);
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) inflate.findViewById(com.tencent.mm.R.id.mmp);
        android.content.Context context = this.f459211d.f459196d;
        if (context instanceof android.app.Activity) {
            com.tencent.mm.plugin.profile.p2.Bi(((android.app.Activity) context).getIntent(), 28, 1, y35.d.f459195o.f459219a);
        }
        android.content.Context context2 = this.f459211d.f459196d;
        db5.e1.x(context2, context2.getString(com.tencent.mm.R.string.f490541y0), null, inflate, new y35.e(this, mMLimitedClearEditText), null);
        mMLimitedClearEditText.post(new y35.f(this));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/preference/FMessageItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
