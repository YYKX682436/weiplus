package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class fh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ih f208591d;

    public fh(com.tencent.mm.ui.ih ihVar) {
        this.f208591d = ihVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.ih ihVar = this.f208591d;
        ihVar.f208926d.setText("");
        ihVar.f208926d.setHint(ihVar.f208928f);
        ihVar.f208927e.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
