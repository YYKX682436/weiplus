package ib0;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f290027d;

    public c(db5.g3 g3Var) {
        this.f290027d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290027d.f212055d.dismiss();
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
