package gq2;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f274550a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f274551b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f274552c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.tabs.TabLayout f274553d;

    /* renamed from: e, reason: collision with root package name */
    public final gq2.c f274554e;

    public d(com.tencent.mm.ui.MMActivity context, android.view.View rootView, java.util.ArrayList data, gq2.j parent, yz5.l onClickTabBlock) {
        oa.i k17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(onClickTabBlock, "onClickTabBlock");
        this.f274550a = context;
        this.f274551b = rootView;
        this.f274552c = onClickTabBlock;
        this.f274554e = new gq2.c(this);
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) rootView.findViewById(com.tencent.mm.R.id.nv8);
        this.f274553d = tabLayout;
        if (data.size() <= 0) {
            if (tabLayout == null) {
                return;
            }
            tabLayout.setVisibility(8);
            return;
        }
        if (tabLayout != null) {
            tabLayout.setVisibility(0);
        }
        if (tabLayout != null) {
            tabLayout.n();
            int i17 = 0;
            for (java.lang.Object obj : data) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                hq2.a aVar = (hq2.a) obj;
                gq2.a aVar2 = new gq2.a(this, this.f274550a, tabLayout.l(), true);
                java.lang.String string = aVar.f283205d.getString(1);
                string = string == null ? "" : string;
                android.widget.TextView textView = aVar2.f274546d;
                if (textView != null) {
                    textView.setText(string);
                }
                aVar2.f274545c = i17;
                aVar.f283205d.getInteger(0);
                int size = data.size();
                android.content.Context context2 = aVar2.f274543a;
                int b17 = i65.a.b(context2, 12);
                int b18 = i65.a.b(context2, 8);
                int b19 = i65.a.b(context2, 12);
                int b27 = i65.a.b(context2, 8);
                int i19 = aVar2.f274545c;
                if (i19 == 0) {
                    b17 = i65.a.b(context2, 16);
                } else if (i19 == size - 1) {
                    b19 = i65.a.b(context2, 16);
                }
                oa.i iVar = aVar2.f274544b;
                oa.k kVar = iVar.f343785h;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                tabLayout.d(iVar, false);
                i17 = i18;
            }
            tabLayout.K.clear();
            tabLayout.a(this.f274554e);
            com.google.android.material.tabs.TabLayout tabLayout2 = this.f274553d;
            if (tabLayout2 == null || (k17 = tabLayout2.k(0)) == null || k17.a()) {
                return;
            }
            k17.b();
        }
    }
}
