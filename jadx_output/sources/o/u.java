package o;

/* loaded from: classes15.dex */
public final class u implements g3.b {
    public int E;
    public android.view.View F;
    public n3.f G;
    public android.view.MenuItem.OnActionExpandListener H;

    /* renamed from: d, reason: collision with root package name */
    public final int f341804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341805e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341806f;

    /* renamed from: g, reason: collision with root package name */
    public final int f341807g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f341808h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f341809i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f341810m;

    /* renamed from: n, reason: collision with root package name */
    public char f341811n;

    /* renamed from: p, reason: collision with root package name */
    public char f341813p;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f341815r;

    /* renamed from: t, reason: collision with root package name */
    public final o.r f341817t;

    /* renamed from: u, reason: collision with root package name */
    public o.o0 f341818u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.MenuItem.OnMenuItemClickListener f341819v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f341820w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.CharSequence f341821x;

    /* renamed from: o, reason: collision with root package name */
    public int f341812o = 4096;

    /* renamed from: q, reason: collision with root package name */
    public int f341814q = 4096;

    /* renamed from: s, reason: collision with root package name */
    public int f341816s = 0;

    /* renamed from: y, reason: collision with root package name */
    public android.content.res.ColorStateList f341822y = null;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f341823z = null;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public int D = 16;
    public boolean I = false;

    public u(o.r rVar, int i17, int i18, int i19, int i27, java.lang.CharSequence charSequence, int i28) {
        this.f341817t = rVar;
        this.f341804d = i18;
        this.f341805e = i17;
        this.f341806f = i19;
        this.f341807g = i27;
        this.f341808h = charSequence;
        this.E = i28;
    }

    public static void c(java.lang.StringBuilder sb6, int i17, int i18, java.lang.String str) {
        if ((i17 & i18) == i18) {
            sb6.append(str);
        }
    }

    @Override // g3.b
    public g3.b a(n3.f fVar) {
        n3.f fVar2 = this.G;
        if (fVar2 != null) {
            fVar2.getClass();
            fVar2.f334330a = null;
        }
        this.F = null;
        this.G = fVar;
        this.f341817t.p(true);
        n3.f fVar3 = this.G;
        if (fVar3 != null) {
            fVar3.d(new o.t(this));
        }
        return this;
    }

    @Override // g3.b
    public n3.f b() {
        return this.G;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.E & 8) == 0) {
            return false;
        }
        if (this.F == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.H;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f341817t.d(this);
        }
        return false;
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.C && (this.A || this.B)) {
            drawable = drawable.mutate();
            if (this.A) {
                f3.b.h(drawable, this.f341822y);
            }
            if (this.B) {
                f3.b.i(drawable, this.f341823z);
            }
            this.C = false;
        }
        return drawable;
    }

    public boolean e() {
        n3.f fVar;
        if ((this.E & 8) == 0) {
            return false;
        }
        if (this.F == null && (fVar = this.G) != null) {
            this.F = fVar.b(this);
        }
        return this.F != null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!e()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.H;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f341817t.f(this);
        }
        return false;
    }

    public void f(boolean z17) {
        this.D = (z17 ? 4 : 0) | (this.D & (-5));
    }

    public void g(boolean z17) {
        if (z17) {
            this.D |= 32;
        } else {
            this.D &= -33;
        }
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View view = this.F;
        if (view != null) {
            return view;
        }
        n3.f fVar = this.G;
        if (fVar == null) {
            return null;
        }
        android.view.View b17 = fVar.b(this);
        this.F = b17;
        return b17;
    }

    @Override // g3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f341814q;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f341813p;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f341820w;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f341805e;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.f341815r;
        if (drawable != null) {
            return d(drawable);
        }
        int i17 = this.f341816s;
        if (i17 == 0) {
            return null;
        }
        android.graphics.drawable.Drawable a17 = k.a.a(this.f341817t.f341780d, i17);
        this.f341816s = 0;
        this.f341815r = a17;
        return d(a17);
    }

    @Override // g3.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f341822y;
    }

    @Override // g3.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f341823z;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f341810m;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f341804d;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f341812o;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f341811n;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f341806f;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return this.f341818u;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.f341808h;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f341809i;
        return charSequence != null ? charSequence : this.f341808h;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f341821x;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f341818u != null;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.I;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.D & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.D & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.D & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        n3.f fVar = this.G;
        return (fVar == null || !fVar.c()) ? (this.D & 8) == 0 : (this.D & 8) == 0 && this.G.a();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        int i17;
        this.F = view;
        this.G = null;
        if (view != null && view.getId() == -1 && (i17 = this.f341804d) > 0) {
            view.setId(i17);
        }
        o.r rVar = this.f341817t;
        rVar.f341790q = true;
        rVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        if (this.f341813p == c17) {
            return this;
        }
        this.f341813p = java.lang.Character.toLowerCase(c17);
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        int i17 = this.D;
        int i18 = (z17 ? 1 : 0) | (i17 & (-2));
        this.D = i18;
        if (i17 != i18) {
            this.f341817t.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        int i17 = this.D;
        int i18 = i17 & 4;
        o.r rVar = this.f341817t;
        if (i18 != 0) {
            rVar.getClass();
            java.util.ArrayList arrayList = rVar.f341785i;
            int size = arrayList.size();
            rVar.z();
            for (int i19 = 0; i19 < size; i19++) {
                o.u uVar = (o.u) arrayList.get(i19);
                if (uVar.f341805e == this.f341805e) {
                    if (((uVar.D & 4) != 0) && uVar.isCheckable()) {
                        boolean z18 = uVar == this;
                        int i27 = uVar.D;
                        int i28 = (z18 ? 2 : 0) | (i27 & (-3));
                        uVar.D = i28;
                        if (i27 != i28) {
                            uVar.f341817t.p(false);
                        }
                    }
                }
            }
            rVar.y();
        } else {
            int i29 = (z17 ? 2 : 0) | (i17 & (-3));
            this.D = i29;
            if (i17 != i29) {
                rVar.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        if (z17) {
            this.D |= 16;
        } else {
            this.D &= -17;
        }
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f341816s = 0;
        this.f341815r = drawable;
        this.C = true;
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f341822y = colorStateList;
        this.A = true;
        this.C = true;
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f341823z = mode;
        this.B = true;
        this.C = true;
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f341810m = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        if (this.f341811n == c17) {
            return this;
        }
        this.f341811n = c17;
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.H = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f341819v = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        this.f341811n = c17;
        this.f341813p = java.lang.Character.toLowerCase(c18);
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
        int i18 = i17 & 3;
        if (i18 != 0 && i18 != 1 && i18 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.E = i17;
        o.r rVar = this.f341817t;
        rVar.f341790q = true;
        rVar.p(true);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        setShowAsAction(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f341808h = charSequence;
        this.f341817t.p(false);
        o.o0 o0Var = this.f341818u;
        if (o0Var != null) {
            o0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f341809i = charSequence;
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        int i17 = this.D;
        int i18 = (z17 ? 0 : 8) | (i17 & (-9));
        this.D = i18;
        if (i17 != i18) {
            o.r rVar = this.f341817t;
            rVar.f341787n = true;
            rVar.p(true);
        }
        return this;
    }

    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f341808h;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setContentDescription(java.lang.CharSequence charSequence) {
        this.f341820w = charSequence;
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setTooltipText(java.lang.CharSequence charSequence) {
        this.f341821x = charSequence;
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17, int i17) {
        if (this.f341813p == c17 && this.f341814q == i17) {
            return this;
        }
        this.f341813p = java.lang.Character.toLowerCase(c17);
        this.f341814q = android.view.KeyEvent.normalizeMetaState(i17);
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17, int i17) {
        if (this.f341811n == c17 && this.f341812o == i17) {
            return this;
        }
        this.f341811n = c17;
        this.f341812o = android.view.KeyEvent.normalizeMetaState(i17);
        this.f341817t.p(false);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18, int i17, int i18) {
        this.f341811n = c17;
        this.f341812o = android.view.KeyEvent.normalizeMetaState(i17);
        this.f341813p = java.lang.Character.toLowerCase(c18);
        this.f341814q = android.view.KeyEvent.normalizeMetaState(i18);
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        this.f341815r = null;
        this.f341816s = i17;
        this.C = true;
        this.f341817t.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        setTitle(this.f341817t.f341780d.getString(i17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        int i18;
        o.r rVar = this.f341817t;
        android.content.Context context = rVar.f341780d;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i17, (android.view.ViewGroup) new android.widget.LinearLayout(context), false);
        this.F = inflate;
        this.G = null;
        if (inflate != null && inflate.getId() == -1 && (i18 = this.f341804d) > 0) {
            inflate.setId(i18);
        }
        rVar.f341790q = true;
        rVar.p(true);
        return this;
    }
}
