package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f211940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f211941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f211942f;

    public p(com.tencent.mm.ui.widget.dialog.j0 j0Var, android.content.DialogInterface.OnClickListener onClickListener, boolean z17) {
        this.f211942f = j0Var;
        this.f211940d = onClickListener;
        this.f211941e = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211942f;
        android.content.DialogInterface.OnClickListener onClickListener = this.f211940d;
        if (onClickListener != null) {
            onClickListener.onClick(j0Var, -2);
        }
        if (this.f211941e) {
            j0Var.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
