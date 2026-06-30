package db5;

/* loaded from: classes8.dex */
public class h4 implements android.view.MenuItem {
    public java.lang.String A;
    public android.content.Intent B;
    public final android.content.Context C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f228363d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f228364e;

    /* renamed from: g, reason: collision with root package name */
    public final int f228366g;

    /* renamed from: h, reason: collision with root package name */
    public final int f228367h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f228368i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f228369m;

    /* renamed from: n, reason: collision with root package name */
    public int f228370n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f228371o;

    /* renamed from: p, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f228372p;

    /* renamed from: r, reason: collision with root package name */
    public int f228374r;

    /* renamed from: t, reason: collision with root package name */
    public int f228376t;

    /* renamed from: u, reason: collision with root package name */
    public int f228377u;

    /* renamed from: v, reason: collision with root package name */
    public int f228378v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f228379w;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ContextMenu.ContextMenuInfo f228381y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.MenuItem.OnMenuItemClickListener f228382z;

    /* renamed from: f, reason: collision with root package name */
    public boolean f228365f = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f228373q = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f228375s = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f228380x = true;
    public boolean D = false;
    public boolean E = false;
    public java.lang.Boolean F = java.lang.Boolean.FALSE;
    public android.graphics.drawable.Drawable G = null;
    public boolean H = false;
    public db5.m4 I = null;

    /* renamed from: J, reason: collision with root package name */
    public db5.v4 f228362J = null;
    public db5.u4 K = null;

    public h4(android.content.Context context, int i17, int i18) {
        this.C = context;
        this.f228366g = i17;
        this.f228367h = i18;
        this.f228378v = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
    }

    public boolean c() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f228382z;
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener.onMenuItemClick(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public android.view.MenuItem d(int i17, int i18) {
        this.f228377u = i17;
        this.f228378v = i18;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.tencent.mm.ui.widget.dialog.j1) m4Var).a(this);
        }
        return this;
    }

    public android.view.MenuItem e(android.graphics.drawable.Drawable drawable, int i17) {
        this.f228379w = drawable;
        this.f228378v = i17;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.tencent.mm.ui.widget.dialog.j1) m4Var).a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return (char) 0;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f228367h;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        android.content.Context context;
        android.graphics.drawable.Drawable drawable = this.f228379w;
        if (drawable != null) {
            return drawable;
        }
        if (this.f228377u == 0 || (context = this.C) == null) {
            return null;
        }
        return context.getResources().getDrawable(this.f228377u);
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f228366g;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f228381y;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return (char) 0;
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
        android.content.Context context;
        java.lang.CharSequence charSequence = this.f228368i;
        if (charSequence != null) {
            return charSequence;
        }
        int i17 = this.f228376t;
        if (i17 == 0 || (context = this.C) == null) {
            return null;
        }
        return context.getString(i17);
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return null;
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
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return true;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f228379w = drawable;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.tencent.mm.ui.widget.dialog.j1) m4Var).a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.B = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f228382z = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f228368i = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        this.f228376t = i17;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        this.f228377u = i17;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.tencent.mm.ui.widget.dialog.j1) m4Var).a(this);
        }
        return this;
    }
}
