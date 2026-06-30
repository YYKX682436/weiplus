package na5;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.RepairerSharedElementDemo2 f336016d;

    public p(com.tencent.mm.ui.anim.RepairerSharedElementDemo2 repairerSharedElementDemo2) {
        this.f336016d = repairerSharedElementDemo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo2 repairerSharedElementDemo2 = this.f336016d;
        android.content.Intent intent = new android.content.Intent(repairerSharedElementDemo2, (java.lang.Class<?>) com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2.class);
        android.os.Bundle a17 = wa5.h.a(((wa5.j) repairerSharedElementDemo2.component(wa5.j.class)).f444324e, view, null, null, 6, null);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo2 repairerSharedElementDemo22 = this.f336016d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerSharedElementDemo22, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        repairerSharedElementDemo22.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(repairerSharedElementDemo22, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
