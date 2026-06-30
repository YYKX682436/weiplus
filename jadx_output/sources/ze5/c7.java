package ze5;

/* loaded from: classes3.dex */
public final class c7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.r f471869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(z01.r rVar) {
        super(1);
        this.f471869d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c sourceViewHolder = (a11.c) obj;
        kotlin.jvm.internal.o.g(sourceViewHolder, "sourceViewHolder");
        android.view.View view = sourceViewHolder.f504a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = sourceViewHolder.f506c;
        textView.setVisibility(0);
        textView.setText(this.f471869d.f469150i);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = sourceViewHolder.f505b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weImageView, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(weImageView, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
