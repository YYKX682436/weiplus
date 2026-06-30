package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f208625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f208626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.i9 f208627f;

    public g9(com.tencent.mm.ui.i9 i9Var, android.content.DialogInterface.OnClickListener onClickListener, boolean z17) {
        this.f208627f = i9Var;
        this.f208625d = onClickListener;
        this.f208626e = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.i9 i9Var = this.f208627f;
        android.content.DialogInterface.OnClickListener onClickListener = this.f208625d;
        if (onClickListener != null) {
            onClickListener.onClick(i9Var, -1);
        }
        if (this.f208626e) {
            i9Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
