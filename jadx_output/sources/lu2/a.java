package lu2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu2.b f321360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu2.c f321361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321362f;

    public a(lu2.b bVar, lu2.c cVar, int i17) {
        this.f321360d = bVar;
        this.f321361e = cVar;
        this.f321362f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lu2.b bVar = this.f321360d;
        android.content.DialogInterface.OnClickListener onClickListener = bVar.f321364e;
        if (onClickListener == null) {
            lu2.c cVar = this.f321361e;
            android.widget.TextView textView = cVar.f321366d;
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = "";
            }
            com.tencent.mm.sdk.platformtools.b0.e(text);
            dp.a.makeText(cVar.itemView.getContext(), "copy done", 0).show();
        } else {
            onClickListener.onClick(bVar.f321365f, this.f321362f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
