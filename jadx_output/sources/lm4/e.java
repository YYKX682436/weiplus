package lm4;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog f319557d;

    public e(com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog tingAddToListenEducationDialog) {
        this.f319557d = tingAddToListenEducationDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f319557d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
