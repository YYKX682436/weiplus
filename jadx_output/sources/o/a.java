package o;

/* loaded from: classes15.dex */
public class a implements g3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f341671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f341672e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f341673f;

    /* renamed from: g, reason: collision with root package name */
    public char f341674g;

    /* renamed from: i, reason: collision with root package name */
    public char f341676i;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f341678n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f341679o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f341680p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f341681q;

    /* renamed from: h, reason: collision with root package name */
    public int f341675h = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f341677m = 4096;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f341682r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f341683s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f341684t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f341685u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f341686v = 16;

    public a(android.content.Context context, int i17, int i18, int i19, int i27, java.lang.CharSequence charSequence) {
        this.f341679o = context;
        this.f341671d = charSequence;
    }

    @Override // g3.b
    public g3.b a(n3.f fVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // g3.b
    public n3.f b() {
        return null;
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.f341678n;
        if (drawable != null) {
            if (this.f341684t || this.f341685u) {
                this.f341678n = drawable;
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f341678n = mutate;
                if (this.f341684t) {
                    f3.b.h(mutate, this.f341682r);
                }
                if (this.f341685u) {
                    f3.b.i(this.f341678n, this.f341683s);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f341677m;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f341676i;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f341680p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.f341678n;
    }

    @Override // g3.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f341682r;
    }

    @Override // g3.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f341683s;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f341673f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f341675h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f341674g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.f341671d;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f341672e;
        return charSequence != null ? charSequence : this.f341671d;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f341681q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f341686v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f341686v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f341686v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f341686v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        this.f341676i = java.lang.Character.toLowerCase(c17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        this.f341686v = (z17 ? 1 : 0) | (this.f341686v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        this.f341686v = (z17 ? 2 : 0) | (this.f341686v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.f341680p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        this.f341686v = (z17 ? 16 : 0) | (this.f341686v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f341678n = drawable;
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f341682r = colorStateList;
        this.f341684t = true;
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f341683s = mode;
        this.f341685u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f341673f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        this.f341674g = c17;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        this.f341674g = c17;
        this.f341676i = java.lang.Character.toLowerCase(c18);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f341671d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f341672e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.f341681q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        this.f341686v = (this.f341686v & 8) | (z17 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17, int i17) {
        this.f341676i = java.lang.Character.toLowerCase(c17);
        this.f341677m = android.view.KeyEvent.normalizeMetaState(i17);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setContentDescription(java.lang.CharSequence charSequence) {
        this.f341680p = charSequence;
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17, int i17) {
        this.f341674g = c17;
        this.f341675h = android.view.KeyEvent.normalizeMetaState(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        this.f341671d = this.f341679o.getResources().getString(i17);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setTooltipText(java.lang.CharSequence charSequence) {
        this.f341681q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        this.f341678n = b3.l.getDrawable(this.f341679o, i17);
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18, int i17, int i18) {
        this.f341674g = c17;
        this.f341675h = android.view.KeyEvent.normalizeMetaState(i17);
        this.f341676i = java.lang.Character.toLowerCase(c18);
        this.f341677m = android.view.KeyEvent.normalizeMetaState(i18);
        return this;
    }
}
