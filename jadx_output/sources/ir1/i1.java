package ir1;

/* loaded from: classes11.dex */
public final class i1 extends android.widget.RelativeLayout {
    public static final ir1.m0 R = new ir1.m0(null);
    public final com.tencent.mm.ui.widget.imageview.WeImageView A;
    public final android.widget.TextView B;
    public final com.tencent.mm.ui.widget.imageview.WeImageView C;
    public final android.widget.TextView D;
    public final com.tencent.mm.ui.widget.imageview.WeImageView E;
    public final android.widget.LinearLayout F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f293983J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final android.widget.LinearLayout M;
    public final com.tencent.mm.ui.widget.button.WeButton N;
    public hr1.a P;
    public java.lang.Boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f293984d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f293985e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293986f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f293987g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.RelativeLayout f293988h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f293989i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerFrameLayout f293990m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerImageView f293991n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f293992o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f293993p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f293994q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f293995r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f293996s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f293997t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f293998u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f293999v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f294000w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f294001x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f294002y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f294003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, com.tencent.mm.ui.widget.dialog.z2 sheet, java.lang.String currentBiz, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(currentBiz, "currentBiz");
        this.f293984d = sheet;
        this.f293985e = currentBiz;
        this.f293986f = i17;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dzn, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f293987g = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cgi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f293988h = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.u6v);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f293989i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f293990m = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.u6w);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f293991n = (com.tencent.mm.ui.widget.RoundCornerImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.vhz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f293992o = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.u6x);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f293993p = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.vhy);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f293994q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.vhx);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f293995r = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.vhw);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f293996s = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.vhv);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f293997t = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.ulu);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f293998u = (android.widget.LinearLayout) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.f487421vi1);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f293999v = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.u1i);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f294000w = (android.widget.LinearLayout) findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.f487420vi0);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f294001x = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.u5f);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f294002y = (android.widget.LinearLayout) findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.tencent.mm.R.id.u5i);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f294003z = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = inflate.findViewById(com.tencent.mm.R.id.u5j);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.A = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById17;
        android.view.View findViewById18 = inflate.findViewById(com.tencent.mm.R.id.u5k);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById18;
        android.view.View findViewById19 = inflate.findViewById(com.tencent.mm.R.id.u5l);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.C = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById19;
        android.view.View findViewById20 = inflate.findViewById(com.tencent.mm.R.id.u5o);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById20;
        android.view.View findViewById21 = inflate.findViewById(com.tencent.mm.R.id.u5p);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.E = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById21;
        android.view.View findViewById22 = inflate.findViewById(com.tencent.mm.R.id.f483269sf4);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.F = (android.widget.LinearLayout) findViewById22;
        android.view.View findViewById23 = inflate.findViewById(com.tencent.mm.R.id.u5g);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.G = (android.widget.TextView) findViewById23;
        android.view.View findViewById24 = inflate.findViewById(com.tencent.mm.R.id.u5h);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.H = (android.widget.TextView) findViewById24;
        android.view.View findViewById25 = inflate.findViewById(com.tencent.mm.R.id.kqj);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.I = (android.widget.LinearLayout) findViewById25;
        android.view.View findViewById26 = inflate.findViewById(com.tencent.mm.R.id.u5m);
        kotlin.jvm.internal.o.f(findViewById26, "findViewById(...)");
        this.f293983J = (android.widget.TextView) findViewById26;
        android.view.View findViewById27 = inflate.findViewById(com.tencent.mm.R.id.u5n);
        kotlin.jvm.internal.o.f(findViewById27, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById27;
        android.view.View findViewById28 = inflate.findViewById(com.tencent.mm.R.id.szp);
        kotlin.jvm.internal.o.f(findViewById28, "findViewById(...)");
        this.L = findViewById28;
        android.view.View findViewById29 = inflate.findViewById(com.tencent.mm.R.id.u5q);
        kotlin.jvm.internal.o.f(findViewById29, "findViewById(...)");
        this.M = (android.widget.LinearLayout) findViewById29;
        android.view.View findViewById30 = inflate.findViewById(com.tencent.mm.R.id.smp);
        kotlin.jvm.internal.o.f(findViewById30, "findViewById(...)");
        this.N = (com.tencent.mm.ui.widget.button.WeButton) findViewById30;
    }

    private final java.lang.String getFriendNameStr() {
        hr1.a aVar = this.P;
        if (aVar == null) {
            return "";
        }
        kotlin.jvm.internal.o.d(aVar);
        if (aVar.u0() == null) {
            return "";
        }
        hr1.a aVar2 = this.P;
        kotlin.jvm.internal.o.d(aVar2);
        if (aVar2.field_identityType != 1) {
            return "";
        }
        hr1.a aVar3 = this.P;
        kotlin.jvm.internal.o.d(aVar3);
        if (aVar3.field_serviceType == 5) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ngm);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hr1.a aVar4 = this.P;
            kotlin.jvm.internal.o.d(aVar4);
            com.tencent.wechat.mm.biz.p5 u07 = aVar4.u0();
            kotlin.jvm.internal.o.d(u07);
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{u07.f218475e}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.nf8);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        hr1.a aVar5 = this.P;
        kotlin.jvm.internal.o.d(aVar5);
        com.tencent.wechat.mm.biz.p5 u08 = aVar5.u0();
        kotlin.jvm.internal.o.d(u08);
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{u08.f218475e}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        return format2;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x15ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x16c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0596  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 6070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.i1.a():void");
    }

    public final java.lang.String b() {
        android.content.res.Resources resources;
        int i17;
        hr1.a aVar = this.P;
        kotlin.jvm.internal.o.d(aVar);
        java.lang.String str = aVar.field_country;
        java.lang.String str2 = "";
        if (!(str == null || str.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            hr1.a aVar2 = this.P;
            kotlin.jvm.internal.o.d(aVar2);
            sb6.append(aVar2.field_country);
            sb6.append(' ');
            str2 = sb6.toString();
        }
        hr1.a aVar3 = this.P;
        kotlin.jvm.internal.o.d(aVar3);
        java.lang.String str3 = aVar3.field_province;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str2);
            hr1.a aVar4 = this.P;
            kotlin.jvm.internal.o.d(aVar4);
            sb7.append(aVar4.field_province);
            sb7.append(' ');
            str2 = sb7.toString();
        }
        hr1.a aVar5 = this.P;
        kotlin.jvm.internal.o.d(aVar5);
        java.lang.String str4 = aVar5.field_city;
        if (!(str4 == null || str4.length() == 0)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str2);
            hr1.a aVar6 = this.P;
            kotlin.jvm.internal.o.d(aVar6);
            sb8.append(aVar6.field_city);
            sb8.append(' ');
            str2 = sb8.toString();
        }
        hr1.a aVar7 = this.P;
        kotlin.jvm.internal.o.d(aVar7);
        if (aVar7.field_sex != 0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str2);
            hr1.a aVar8 = this.P;
            kotlin.jvm.internal.o.d(aVar8);
            if (aVar8.field_sex == 1) {
                resources = getResources();
                i17 = com.tencent.mm.R.string.j1n;
            } else {
                resources = getResources();
                i17 = com.tencent.mm.R.string.j1m;
            }
            sb9.append(resources.getString(i17));
            str2 = sb9.toString();
        }
        hr1.a aVar9 = this.P;
        kotlin.jvm.internal.o.d(aVar9);
        com.tencent.wechat.mm.biz.p5 u07 = aVar9.u0();
        if (u07 == null || !u07.f218474d) {
            return str2;
        }
        if (str2.length() > 0) {
            str2 = str2 + ' ';
        }
        java.lang.String str5 = str2 + getFriendNameStr();
        if (!(this.f293994q.getPaint().measureText(str5) > ((float) (wl5.y.n(getContext()) - es.h.a(getContext(), 148))))) {
            return str5;
        }
        this.Q = java.lang.Boolean.TRUE;
        return str2;
    }

    public final void c() {
        com.tencent.mm.storage.u2 u2Var = com.tencent.mm.storage.u2.f195353a;
        com.tencent.mm.sdk.platformtools.o4 a17 = u2Var.a();
        boolean z17 = false;
        if (a17 != null && a17.getBoolean("biz_fans_private_msg_education_shown", false)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 a18 = u2Var.a();
        if (a18 != null) {
            a18.putBoolean("biz_fans_private_msg_education_shown", true);
        }
        this.N.post(new ir1.g1(this));
    }

    public final void d(int i17) {
        android.view.View findViewById = this.f293987g.findViewById(com.tencent.mm.R.id.ont);
        if (findViewById == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.addRule(0, i17);
        findViewById.setLayoutParams(layoutParams2);
    }
}
