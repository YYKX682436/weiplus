package ky2;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313558g;

    public k(ky2.w wVar, int i17, android.widget.EditText editText, android.view.View view) {
        this.f313555d = wVar;
        this.f313556e = i17;
        this.f313557f = editText;
        this.f313558g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.w wVar = this.f313555d;
        java.util.List list = wVar.f313585e;
        int i17 = this.f313556e;
        if (((ky2.r) list.get(i17)).f313577c == 2) {
            java.util.Map map = wVar.f313596s;
            android.view.View view2 = this.f313558g;
            android.text.TextWatcher textWatcher = (android.text.TextWatcher) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view2.hashCode()));
            android.widget.EditText editText = this.f313557f;
            editText.removeTextChangedListener(textWatcher);
            ((java.util.HashMap) wVar.f313596s).remove(java.lang.Integer.valueOf(view2.hashCode()));
            editText.setText("");
            wVar.notifyItemRemoved(i17);
            wVar.f313585e.remove(i17);
            wVar.notifyItemRangeChanged(i17, wVar.f313585e.size() - i17);
            wVar.x();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
