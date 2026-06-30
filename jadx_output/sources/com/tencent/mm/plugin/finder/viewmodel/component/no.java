package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class no implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.po f135339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135340e;

    public no(com.tencent.mm.plugin.finder.viewmodel.component.po poVar, int i17) {
        this.f135339d = poVar;
        this.f135340e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLongVideoShareUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f135339d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.gg.O6((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17, false, false, false, null, this.f135340e == 2, false, 47, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLongVideoShareUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
