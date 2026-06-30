package n;

/* loaded from: classes15.dex */
public class i {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public final /* synthetic */ n.j E;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Menu f333382a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f333389h;

    /* renamed from: i, reason: collision with root package name */
    public int f333390i;

    /* renamed from: j, reason: collision with root package name */
    public int f333391j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f333392k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f333393l;

    /* renamed from: m, reason: collision with root package name */
    public int f333394m;

    /* renamed from: n, reason: collision with root package name */
    public char f333395n;

    /* renamed from: o, reason: collision with root package name */
    public int f333396o;

    /* renamed from: p, reason: collision with root package name */
    public char f333397p;

    /* renamed from: q, reason: collision with root package name */
    public int f333398q;

    /* renamed from: r, reason: collision with root package name */
    public int f333399r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f333400s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f333401t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f333402u;

    /* renamed from: v, reason: collision with root package name */
    public int f333403v;

    /* renamed from: w, reason: collision with root package name */
    public int f333404w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f333405x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f333406y;

    /* renamed from: z, reason: collision with root package name */
    public n3.f f333407z;
    public android.content.res.ColorStateList C = null;
    public android.graphics.PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f333383b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f333384c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f333385d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f333386e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f333387f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f333388g = true;

    public i(n.j jVar, android.view.Menu menu) {
        this.E = jVar;
        this.f333382a = menu;
    }

    public final void a(android.view.MenuItem menuItem) {
        java.lang.Object obj;
        boolean z17 = false;
        menuItem.setChecked(this.f333400s).setVisible(this.f333401t).setEnabled(this.f333402u).setCheckable(this.f333399r >= 1).setTitleCondensed(this.f333393l).setIcon(this.f333394m);
        int i17 = this.f333403v;
        if (i17 >= 0) {
            menuItem.setShowAsAction(i17);
        }
        java.lang.String str = this.f333406y;
        n.j jVar = this.E;
        if (str != null) {
            if (jVar.f333412c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f333413d == null) {
                jVar.f333413d = jVar.a(jVar.f333412c);
            }
            menuItem.setOnMenuItemClickListener(new n.h(jVar.f333413d, this.f333406y));
        }
        boolean z18 = menuItem instanceof o.u;
        if (z18) {
        }
        if (this.f333399r >= 2) {
            if (z18) {
                ((o.u) menuItem).f(true);
            } else if (menuItem instanceof o.z) {
                o.z zVar = (o.z) menuItem;
                try {
                    java.lang.reflect.Method method = zVar.f341829g;
                    java.lang.Object obj2 = zVar.f341714d;
                    if (method == null) {
                        zVar.f341829g = ((g3.b) obj2).getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
                    }
                    zVar.f341829g.invoke(obj2, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        java.lang.String str2 = this.f333405x;
        if (str2 != null) {
            java.lang.Class<?>[] clsArr = n.j.f333408e;
            java.lang.Object[] objArr = jVar.f333410a;
            try {
                java.lang.reflect.Constructor<?> constructor = jVar.f333412c.getClassLoader().loadClass(str2).getConstructor(clsArr);
                constructor.setAccessible(true);
                obj = constructor.newInstance(objArr);
            } catch (java.lang.Exception unused2) {
                obj = null;
            }
            menuItem.setActionView((android.view.View) obj);
            z17 = true;
        }
        int i18 = this.f333404w;
        if (i18 > 0 && !z17) {
            menuItem.setActionView(i18);
        }
        n3.f fVar = this.f333407z;
        if (fVar != null && (menuItem instanceof g3.b)) {
            ((g3.b) menuItem).a(fVar);
        }
        java.lang.CharSequence charSequence = this.A;
        boolean z19 = menuItem instanceof g3.b;
        if (z19) {
            ((g3.b) menuItem).setContentDescription(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.h(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.B;
        if (z19) {
            ((g3.b) menuItem).setTooltipText(charSequence2);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.m(menuItem, charSequence2);
        }
        char c17 = this.f333395n;
        int i19 = this.f333396o;
        if (z19) {
            ((g3.b) menuItem).setAlphabeticShortcut(c17, i19);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.g(menuItem, c17, i19);
        }
        char c18 = this.f333397p;
        int i27 = this.f333398q;
        if (z19) {
            ((g3.b) menuItem).setNumericShortcut(c18, i27);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            n3.z.k(menuItem, c18, i27);
        }
        android.graphics.PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z19) {
                ((g3.b) menuItem).setIconTintMode(mode);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                n3.z.j(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z19) {
                ((g3.b) menuItem).setIconTintList(colorStateList);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                n3.z.i(menuItem, colorStateList);
            }
        }
    }
}
