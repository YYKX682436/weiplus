package na5;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.RepairerSharedElementDemo4 f335996d;

    public d0(com.tencent.mm.ui.anim.RepairerSharedElementDemo4 repairerSharedElementDemo4) {
        this.f335996d = repairerSharedElementDemo4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo4 repairerSharedElementDemo4 = this.f335996d;
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) repairerSharedElementDemo4.f197164o).getValue();
        kotlin.jvm.internal.o.f(imageView, "<get-iv1>(...)");
        wa5.k.a(imageView, "soontest0", 0);
        jz5.g gVar = repairerSharedElementDemo4.f197165p;
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(imageView2, "<get-iv2>(...)");
        wa5.k.a(imageView2, "soontest1", 1);
        jz5.g gVar2 = repairerSharedElementDemo4.f197166q;
        android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(imageView3, "<get-iv3>(...)");
        wa5.k.a(imageView3, "soontest2", 2);
        jz5.g gVar3 = repairerSharedElementDemo4.f197167r;
        android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(imageView4, "<get-iv4>(...)");
        wa5.k.a(imageView4, "soontest3", 3);
        java.util.LinkedList linkedList = repairerSharedElementDemo4.f197159i;
        jz5.g gVar4 = repairerSharedElementDemo4.f197164o;
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar4).getValue(), ((android.widget.ImageView) ((jz5.n) gVar4).getValue()).getTransitionName()));
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar).getValue(), ((android.widget.ImageView) ((jz5.n) gVar).getValue()).getTransitionName()));
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar2).getValue(), ((android.widget.ImageView) ((jz5.n) gVar2).getValue()).getTransitionName()));
        linkedList.add(android.util.Pair.create((android.widget.ImageView) ((jz5.n) gVar3).getValue(), ((android.widget.ImageView) ((jz5.n) gVar3).getValue()).getTransitionName()));
        android.content.Intent intent = new android.content.Intent(repairerSharedElementDemo4, (java.lang.Class<?>) com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2.class);
        android.os.Bundle a17 = wa5.h.a(((wa5.j) repairerSharedElementDemo4.component(wa5.j.class)).f444324e, view, null, null, 6, null);
        com.tencent.mm.ui.anim.RepairerSharedElementDemo4 repairerSharedElementDemo42 = this.f335996d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(a17);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerSharedElementDemo42, arrayList2.toArray(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        repairerSharedElementDemo42.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(repairerSharedElementDemo42, "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
