package na5;

/* loaded from: classes11.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.RepairerSharedElementDemo1 f336011d;

    public k(com.tencent.mm.ui.anim.RepairerSharedElementDemo1 repairerSharedElementDemo1) {
        this.f336011d = repairerSharedElementDemo1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo1 repairerSharedElementDemo1 = this.f336011d;
        android.widget.ImageView U6 = repairerSharedElementDemo1.U6();
        kotlin.jvm.internal.o.f(U6, "<get-iv1>(...)");
        wa5.k.a(U6, "soontest", null);
        new java.util.LinkedList().add(android.util.Pair.create(repairerSharedElementDemo1.U6(), repairerSharedElementDemo1.U6().getTransitionName()));
        android.os.Bundle a17 = wa5.h.a(((wa5.j) repairerSharedElementDemo1.component(wa5.j.class)).f444324e, view, null, null, 6, null);
        android.content.Intent intent = new android.content.Intent(repairerSharedElementDemo1, (java.lang.Class<?>) com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity.class);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo1 repairerSharedElementDemo12 = this.f336011d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerSharedElementDemo12, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        repairerSharedElementDemo12.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(repairerSharedElementDemo12, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
