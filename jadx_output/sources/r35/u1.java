package r35;

/* loaded from: classes11.dex */
public class u1 implements lz.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f369269a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f369270b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f369271c;

    /* renamed from: f, reason: collision with root package name */
    public r35.v1 f369274f;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f369278j;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f369272d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f369273e = false;

    /* renamed from: g, reason: collision with root package name */
    public lz.i f369275g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnClickListener f369276h = null;

    /* renamed from: i, reason: collision with root package name */
    public r35.d2 f369277i = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f369279k = false;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View.OnClickListener f369280l = new r35.q1(this);

    /* renamed from: m, reason: collision with root package name */
    public final lz.i f369281m = new r35.r1(this);

    /* renamed from: n, reason: collision with root package name */
    public final lz.h f369282n = new r35.s1(this);

    public u1(android.content.Context context) {
        r35.t1 t1Var = new r35.t1(this);
        this.f369269a = context;
        r35.v1 v1Var = new r35.v1(context);
        this.f369274f = v1Var;
        v1Var.f369288d = t1Var;
    }

    public final void a(java.lang.String str) {
        android.content.res.Resources resources;
        int i17;
        r35.v1 v1Var = this.f369274f;
        v1Var.C = str;
        boolean R4 = com.tencent.mm.storage.z3.R4(str);
        v1Var.f369294m = R4;
        if (!R4 && i95.n0.c(r35.p3.class) != null) {
            ((r35.t) ((r35.p3) i95.n0.c(r35.p3.class))).getClass();
            v1Var.f369295n = r01.z.g(str);
        }
        if (!v1Var.f369295n) {
            v1Var.f369298q = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
        if (v1Var.f369295n && i95.n0.c(r35.p3.class) != null) {
            r35.p3 p3Var = (r35.p3) i95.n0.c(r35.p3.class);
            java.lang.String str2 = v1Var.C;
            boolean z17 = v1Var.I;
            android.content.Context context = v1Var.f369292h;
            if (z17) {
                resources = context.getResources();
                i17 = com.tencent.mm.R.dimen.f479892i5;
            } else {
                resources = context.getResources();
                i17 = com.tencent.mm.R.dimen.f479890i3;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i17);
            ((r35.t) p3Var).getClass();
            o11.f fVar = new o11.f();
            fVar.f342083g = s01.r.k(str2);
            fVar.f342078b = true;
            fVar.f342095s = true;
            fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
            if (dimensionPixelSize > 0) {
                fVar.f342097u = dimensionPixelSize * 0.1f;
                fVar.f342096t = true;
            }
            v1Var.E = fVar.a();
        }
        r35.v1 v1Var2 = this.f369274f;
        v1Var2.A = this.f369273e;
        v1Var2.h();
        b();
    }

    public void b() {
        java.lang.String concat;
        if (this.f369270b == null || this.f369271c == null) {
            return;
        }
        java.util.HashMap hashMap = this.f369272d;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f369270b).w((java.lang.String) it.next());
        }
        hashMap.clear();
        if (this.f369279k) {
            return;
        }
        int n17 = ((com.tencent.mm.ui.base.preference.h0) this.f369270b).n(this.f369271c);
        lz.i iVar = this.f369275g;
        if (iVar == null) {
            iVar = this.f369281m;
        }
        android.view.View.OnClickListener onClickListener = this.f369276h;
        if (onClickListener == null) {
            onClickListener = this.f369280l;
        }
        com.tencent.mm.storage.a3 a3Var = this.f369274f.f369298q;
        boolean z17 = a3Var != null && a3Var.P0();
        r35.v1 v1Var = this.f369274f;
        boolean R4 = v1Var.f369295n ? v1Var.f369297p : com.tencent.mm.storage.z3.R4(v1Var.C);
        r35.v1 v1Var2 = this.f369274f;
        if (v1Var2.f369295n) {
            z17 = v1Var2.f369296o;
        }
        int i17 = v1Var2.f369302u + ((!R4 || z17) ? 2 : 1);
        android.content.Context context = this.f369269a;
        int f17 = v1Var2.f(context);
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f369274f.getCount() && i18 < i17) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = new com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference(context, 1);
            if (i19 >= 0) {
                concat = "pref_contact_list_row_" + i19;
            } else {
                concat = "pref_contact_list_row_".concat(i19 == -1 ? "header" : i19 == -2 ? "footer" : "unkown");
            }
            contactListExpandPreference.C(concat);
            lz.j jVar = contactListExpandPreference.N;
            r35.v1 v1Var3 = this.f369274f;
            r35.k2 k2Var = (r35.k2) jVar;
            k2Var.getClass();
            k2Var.f369162a = v1Var3;
            k2Var.f369163b = i19;
            r35.k2 k2Var2 = (r35.k2) contactListExpandPreference.N;
            k2Var2.f369164c = f17;
            k2Var2.f369165d = z17;
            k2Var2.f369169h = onClickListener;
            k2Var2.f369167f = this.f369282n;
            k2Var2.f369168g = iVar;
            ((com.tencent.mm.ui.base.preference.h0) this.f369270b).d(contactListExpandPreference, n17 + i19);
            hashMap.put(contactListExpandPreference.f197780q, contactListExpandPreference);
            i18 += f17;
            i19++;
        }
        c(false);
    }

    public void c(boolean z17) {
        for (com.tencent.mm.ui.base.preference.Preference preference : this.f369272d.values()) {
            if (preference instanceof com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) {
                ((com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) preference).W(z17);
            }
        }
    }
}
