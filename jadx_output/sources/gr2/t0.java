package gr2;

/* loaded from: classes2.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f274828a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeTagListWidget$themeTagChangEvent$1 f274829b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f274830c;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeTagListWidget$themeTagChangEvent$1] */
    public t0(final com.tencent.mm.ui.MMActivity context, float f17, int i17, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f274828a = context;
        this.f274829b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiveThemeTagChangeEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeTagListWidget$themeTagChangEvent$1
            {
                this.__eventId = 1093141053;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiveThemeTagChangeEvent liveThemeTagChangeEvent) {
                com.tencent.mm.autogen.events.LiveThemeTagChangeEvent event = liveThemeTagChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive themeTagChangEvent: ");
                am.bj bjVar = event.f54478g;
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f6257a) : null);
                sb6.append(" pos: ");
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f6258b) : null);
                com.tencent.mars.xlog.Log.i("Finder.ThemeTagListWidget", sb6.toString());
                if (bjVar.f6257a != 2) {
                    return false;
                }
                int i18 = bjVar.f6258b;
                gr2.t0 t0Var = gr2.t0.this;
                t0Var.getClass();
                pm0.v.X(new gr2.s0(i18, t0Var));
                return true;
            }
        };
    }

    public final void a(android.app.Activity context, java.util.ArrayList data) {
        oa.i k17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.nva);
        this.f274830c = (com.google.android.material.tabs.TabLayout) context.findViewById(com.tencent.mm.R.id.nv8);
        if (data.size() <= 0) {
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f274830c;
        if (tabLayout != null) {
            int i17 = 0;
            for (java.lang.Object obj : data) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                gr2.q0 q0Var = new gr2.q0(this.f274828a, tabLayout.l());
                java.lang.String string = ((zq2.e) obj).f475032d.getString(0);
                if (string == null) {
                    string = "";
                }
                android.widget.TextView textView = q0Var.f274818c;
                if (textView != null) {
                    textView.setText(string);
                }
                q0Var.f274820e = i17;
                int size = data.size();
                android.content.Context context2 = q0Var.f274816a;
                int b17 = i65.a.b(context2, 4);
                int b18 = i65.a.b(context2, 8);
                int b19 = i65.a.b(context2, 4);
                int b27 = i65.a.b(context2, 8);
                int i19 = q0Var.f274820e;
                if (i19 == 0) {
                    b17 = i65.a.b(context2, 24);
                } else if (i19 == size - 1) {
                    b19 = i65.a.b(context2, 24);
                }
                oa.i iVar = q0Var.f274817b;
                oa.k kVar = iVar.f343785h;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                tabLayout.d(iVar, false);
                i17 = i18;
            }
            tabLayout.a(new gr2.r0());
            com.google.android.material.tabs.TabLayout tabLayout2 = this.f274830c;
            if (tabLayout2 != null && (k17 = tabLayout2.k(0)) != null && !k17.a()) {
                k17.b();
            }
        }
        alive();
    }
}
