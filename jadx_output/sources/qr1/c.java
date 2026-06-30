package qr1;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f366060d;

    public c(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f366060d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f366060d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
