package xe5;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f454105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f454106h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f454107i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454109n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f454110o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454111p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454112q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f454113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f454115t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f454116u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f454117v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454118w;

    public t(xe5.g0 g0Var, java.lang.String str, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.util.Map map, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, long j17, java.lang.String str7, long j18, boolean z18, int i18, xe5.i iVar) {
        this.f454102d = g0Var;
        this.f454103e = str;
        this.f454104f = dVar;
        this.f454105g = f9Var;
        this.f454106h = map;
        this.f454107i = i17;
        this.f454108m = str2;
        this.f454109n = str3;
        this.f454110o = z17;
        this.f454111p = str5;
        this.f454112q = str6;
        this.f454113r = j17;
        this.f454114s = str7;
        this.f454115t = j18;
        this.f454116u = z18;
        this.f454117v = i18;
        this.f454118w = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe5.g0 g0Var = this.f454102d;
        j31.e.b(4, g0Var.f454031e, g0Var.f454032f, this.f454103e);
        yb5.d dVar = this.f454104f;
        com.tencent.mm.storage.f9 f9Var = this.f454105g;
        java.util.Map map = this.f454106h;
        tb5.o0.c(dVar, f9Var, map, 4);
        g0Var.f454027a = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) dVar.g(), 1, false);
        com.tencent.mm.sdk.platformtools.o4 o4Var = xe5.g0.f454026g;
        boolean z17 = this.f454107i < 9 ? o4Var.getBoolean(this.f454108m, false) : o4Var.getBoolean(this.f454109n, false);
        android.view.View inflate = com.tencent.mm.ui.id.b(view.getContext()).inflate(com.tencent.mm.R.layout.awb, (android.view.ViewGroup) null);
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a6j);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.title.avatar");
        if (str2 == null) {
            str2 = "";
        }
        mn2.h3 Ai = ((c61.i8) i5Var).Ai(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        a17.c(Ai, imageView, g1Var.h(mn2.f1.f329962p));
        com.tencent.mm.ui.widget.dialog.k0 k0Var = g0Var.f454027a;
        if (k0Var != null) {
            k0Var.s(inflate, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = g0Var.f454027a;
        kotlin.jvm.internal.o.d(k0Var2);
        boolean z18 = this.f454110o;
        xe5.g0 g0Var2 = this.f454102d;
        k0Var2.f211872n = new xe5.k(z18, z17, g0Var2, this.f454111p, this.f454112q);
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = g0Var2.f454027a;
        kotlin.jvm.internal.o.d(k0Var3);
        xe5.g0 g0Var3 = this.f454102d;
        java.lang.String str3 = this.f454108m;
        yb5.d dVar2 = this.f454104f;
        com.tencent.mm.storage.f9 f9Var2 = this.f454105g;
        java.util.Map map2 = this.f454106h;
        java.lang.String str4 = this.f454103e;
        k0Var3.f211881s = new xe5.r(g0Var3, str3, dVar2, f9Var2, map2, str4, this.f454113r, this.f454114s, this.f454115t, this.f454116u, this.f454117v, this.f454118w, this.f454109n);
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = g0Var3.f454027a;
        if (k0Var4 != null) {
            k0Var4.C = new xe5.s(g0Var3, str4, dVar2, f9Var2, map2);
        }
        if (k0Var4 != null) {
            k0Var4.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
