package db5;

/* loaded from: classes.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLimitedClearEditText f228445d;

    public n3(com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        this.f228445d = mMLimitedClearEditText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLimitedClearEditText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f228445d.getEditText().setText("");
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLimitedClearEditText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
