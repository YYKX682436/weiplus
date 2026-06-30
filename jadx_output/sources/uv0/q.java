package uv0;

/* loaded from: classes5.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f431345e;

    public q(uv0.u uVar, java.util.ArrayList arrayList) {
        this.f431344d = uVar;
        this.f431345e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv0.f adapter;
        uv0.u uVar = this.f431344d;
        adapter = uVar.getAdapter();
        adapter.y(this.f431345e);
        java.util.ArrayList arrayList = uVar.W;
        int i17 = uVar.f431351J.f440388d;
        com.google.android.material.tabs.TabLayout tabLayout = uVar.Q;
        if (tabLayout != null) {
            tabLayout.n();
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                vv0.j jVar = (vv0.j) obj;
                android.view.View inflate = com.tencent.mm.ui.id.b(uVar.getContext()).inflate(com.tencent.mm.R.layout.dg8, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.View");
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.q8e)).setText(jVar.f440381a);
                oa.i l17 = tabLayout.l();
                l17.d(inflate);
                tabLayout.d(l17, jVar.f440382b == i17);
                i18 = i19;
            }
        }
        uVar.S(uVar.f431351J, true);
    }
}
