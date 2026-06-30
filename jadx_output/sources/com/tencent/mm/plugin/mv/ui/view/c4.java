package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.e4 f151794d;

    public c4(com.tencent.mm.plugin.mv.ui.view.e4 e4Var) {
        this.f151794d = e4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.e4 e4Var = this.f151794d;
        com.tencent.mm.plugin.mv.ui.view.d4 d4Var = e4Var.f151819b;
        if (d4Var != null) {
            e4Var.getClass();
            androidx.appcompat.app.AppCompatActivity activity = ((com.tencent.mm.plugin.mv.ui.uic.d1) d4Var).f151094a;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.q7.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.mv.ui.uic.q7) a17).Q6(null, true, 2);
        }
        e4Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
