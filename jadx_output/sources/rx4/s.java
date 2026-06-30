package rx4;

/* loaded from: classes8.dex */
public final class s extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401259d;

    /* renamed from: e, reason: collision with root package name */
    public int f401260e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f401261f;

    /* renamed from: g, reason: collision with root package name */
    public rx4.d f401262g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f401263h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f401264i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f401265m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401266n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401259d = "FTSNativeTeachDramaBoxUIC";
        this.f401263h = new java.util.ArrayList();
        this.f401264i = new java.util.LinkedHashMap();
    }

    public final void T6(android.view.ViewGroup viewGroup, rx4.c cVar) {
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.efx, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t59)).setText(cVar.f401110b);
        viewGroup.addView(inflate);
        this.f401265m = inflate;
        inflate.findViewById(com.tencent.mm.R.id.t58).setOnClickListener(new rx4.n(this, cVar));
    }

    public final void U6(rx4.c cVar) {
        boolean z17 = cVar.f401113e.length() == 0;
        java.lang.String str = this.f401259d;
        if (z17) {
            com.tencent.mars.xlog.Log.e(str, "jumpToLiteApp: appId is empty");
            return;
        }
        q80.d0 d0Var = new q80.d0();
        java.lang.String str2 = cVar.f401113e;
        d0Var.f360649a = str2;
        java.lang.String str3 = cVar.f401114f;
        d0Var.f360650b = str3;
        d0Var.f360651c = cVar.f401110b;
        d0Var.f360652d = java.lang.Boolean.FALSE;
        d0Var.f360671w = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        d0Var.f360655g = new android.os.Bundle();
        com.tencent.mars.xlog.Log.i(str, "jumpToLiteApp: appId=" + str2 + ", page=" + str3);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(getActivity(), d0Var, new rx4.p(this));
    }

    public final void a(rx4.d dVar, boolean z17) {
        java.util.List list;
        this.f401261f = z17;
        this.f401262g = dVar;
        if (dVar != null && (list = dVar.f401126d) != null) {
            jz5.g gVar = n0.o5.f333664a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((rx4.b) it.next()).f401098e);
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (str.length() > 0) {
                    wo0.c a17 = vo0.e.f438468b.a(str);
                    jz5.g gVar2 = n0.o5.f333664a;
                    a17.g((yo0.i) n0.o5.f333664a.getValue());
                    a17.d();
                }
            }
        }
        pm0.v.X(new rx4.r(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        pm0.v.X(new rx4.r(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }
}
