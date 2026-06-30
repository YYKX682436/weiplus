package wu;

/* loaded from: classes9.dex */
public final class h1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f449583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f449584e;

    public h1(android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f449583d = spannableString;
        this.f449584e = j1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = view.getContext();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.FG_3)), 0, textView.getText().length(), 33);
        textView.setText(spannableString);
        rl5.r rVar = new rl5.r(context, textView);
        rVar.C = true;
        android.text.SpannableString spannableString2 = this.f449583d;
        wu.j1 j1Var = this.f449584e;
        rVar.f397355y = new wu.e1(context, rVar, spannableString2, j1Var);
        rVar.f397354x = new wu.f1(textView, context, spannableString2, j1Var);
        rVar.L = new wu.g1(textView, spannableString2);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ohu);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        if (iArr == null) {
            yj0.a.i(false, this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        rVar.n(iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
