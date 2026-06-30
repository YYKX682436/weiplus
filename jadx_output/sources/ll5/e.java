package ll5;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f319278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f319279e;

    public e(com.tencent.mm.ui.widget.code.CodeItemView codeItemView, ll5.a aVar) {
        this.f319278d = codeItemView;
        this.f319279e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f319278d;
        if (codeItemView.f211633n) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ll5.a aVar = this.f319279e;
        aVar.f319270h = !aVar.f319270h;
        android.view.View.OnClickListener onClickListener = aVar.f319274o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        codeItemView.setViewModel(aVar);
        yz5.l itemClickListener = codeItemView.getItemClickListener();
        if (itemClickListener != null) {
            itemClickListener.invoke(codeItemView);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
