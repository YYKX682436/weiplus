package vn;

/* loaded from: classes.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f438167d;

    public b(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f438167d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/util/ConvBoxTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f438167d.u();
        yj0.a.h(this, "com/tencent/mm/chatroom/util/ConvBoxTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
