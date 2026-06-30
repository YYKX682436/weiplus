package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136346d;

    public wj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f136346d = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136346d;
        int color = blVar.getResources().getColor(com.tencent.mm.R.color.f479247tz);
        androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.Iterator it = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getFragments().iterator();
        while (it.hasNext()) {
            android.view.View view = ((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next()).getView();
            if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.mcf)) != null) {
                findViewById.setBackgroundColor(color);
            }
        }
    }
}
