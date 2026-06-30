package df5;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.b0 f232246d;

    public w(df5.b0 b0Var) {
        this.f232246d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/NativeMarkdownCodeBlockView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[2];
        df5.b0 b0Var = this.f232246d;
        objArr[0] = b0Var.f232051n;
        objArr[1] = java.lang.Boolean.valueOf(b0Var.getOnInteractionConsumed() != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownPreviewDebug", "copyButton clicked, language=%s, hasCallback=%b", objArr);
        yz5.a onInteractionConsumed = b0Var.getOnInteractionConsumed();
        if (onInteractionConsumed != null) {
            onInteractionConsumed.invoke();
        }
        android.view.ViewParent parent = b0Var.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout) {
                com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = (com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout) parent;
                jf5.r0 selectionMenuHost = nativeSelectableLayout.getSelectionMenuHost();
                if (selectionMenuHost != null) {
                    ((jf5.h) selectionMenuHost).b(nativeSelectableLayout, 1, b0Var.f232050m);
                }
            } else {
                parent = parent.getParent();
                if (parent == null) {
                    com.tencent.mars.xlog.Log.e("NativeMarkdownCodeBlockView", "copyCodeToClipboard: parent is null");
                    break;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/NativeMarkdownCodeBlockView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
