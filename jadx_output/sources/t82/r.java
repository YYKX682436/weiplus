package t82;

/* loaded from: classes12.dex */
public final class r extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f416403d;

    /* renamed from: e, reason: collision with root package name */
    public w82.k f416404e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f416405f;

    /* renamed from: g, reason: collision with root package name */
    public int f416406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f416405f = t82.o.f416398d;
        this.f416406g = -1;
    }

    public final void O6(boolean z17) {
        w82.k kVar = this.f416404e;
        if (kVar != null) {
            kVar.b(z17);
        } else {
            kotlin.jvm.internal.o.o("mMoreFooter");
            throw null;
        }
    }

    public final void P6() {
        w82.k kVar = this.f416404e;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("mMoreFooter");
            throw null;
        }
        kVar.c();
        this.f416403d = false;
        this.f416405f.invoke(16);
    }

    public final t82.d Q6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(t82.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    public final void R6(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(Q6().S6());
        com.tencent.mm.plugin.fav.ui.ec.f(getContext(), "", arrayList, false);
        if (i17 == 4106) {
            this.f416405f.invoke(5);
        } else {
            this.f416405f.invoke(7);
        }
    }

    public final void S6(android.content.Intent intent, int i17) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("custom_send_text") : null;
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleResultTransmitSuccess] customText = " + stringExtra + ", toUsers = " + stringExtra2);
        if (i17 != 4106) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(Q6().S6());
            com.tencent.mm.plugin.fav.ui.ec.b(getContext(), arrayList, stringExtra, stringExtra2, "MicroMsg.FavFinderFilterUI");
            this.f416405f.invoke(8);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (this.f416406g == -1) {
            this.f416405f.invoke(5);
            return;
        }
        o72.r2 P6 = Q6().P6(this.f416406g);
        if (P6 == null) {
            this.f416405f.invoke(5);
            return;
        }
        arrayList2.add(P6);
        com.tencent.mm.plugin.fav.ui.ec.b(getContext(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavFinderFilterUI");
        this.f416405f.invoke(6);
    }

    public final void T6(android.view.View view, int i17, long j17, int[] touchLoc) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(touchLoc, "touchLoc");
        rl5.r rVar = new rl5.r(getContext(), view);
        rVar.C = true;
        o72.r2 P6 = Q6().P6(i17);
        if (P6 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(P6.field_type));
        hashMap.put("card_clk_type", 1);
        v82.a.f434066a.a("fav_page_card_operation", "view_clk", hashMap);
        rVar.f397355y = new t82.p(P6, this);
        this.f416406g = i17;
        rVar.f397354x = new t82.q(this, hashMap);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 4105) {
                R6(i17);
                return;
            } else {
                if (i17 != 4106) {
                    return;
                }
                R6(i17);
                return;
            }
        }
        if (i17 == 4105) {
            S6(intent, i17);
        } else {
            if (i17 != 4106) {
                return;
            }
            S6(intent, i17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        w82.k kVar = new w82.k();
        this.f416404e = kVar;
        kVar.a(findViewById(com.tencent.mm.R.id.dtg));
        w82.k kVar2 = this.f416404e;
        if (kVar2 != null) {
            kVar2.f443903k = new t82.n(this);
        } else {
            kotlin.jvm.internal.o.o("mMoreFooter");
            throw null;
        }
    }
}
