package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.i f212464d;

    public c(com.tencent.mm.ui.widget.snackbar.i iVar) {
        this.f212464d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/snackbar/SnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.snackbar.i iVar = this.f212464d;
        iVar.getClass();
        iVar.f212475d.postDelayed(new com.tencent.mm.ui.widget.snackbar.b(this), 100L);
        yj0.a.h(this, "com/tencent/mm/ui/widget/snackbar/SnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
