package db5;

/* loaded from: classes8.dex */
public class g4 implements android.view.ContextMenu {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f228344d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f228345e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f228346f;

    public g4(android.content.Context context) {
        this.f228346f = context;
    }

    public android.view.MenuItem a(int i17, int i18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228376t = i18;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, int i27) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i18, i17);
        h4Var.f228376t = i27;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i17, int i18, int i19, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i27, android.view.MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17) {
        return null;
    }

    public android.view.MenuItem b(int i17, int i18, int i19) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228376t = i18;
        h4Var.setIcon(i19);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem c(int i17, int i18, int i19, java.lang.CharSequence charSequence, int i27) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i18, i17);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(i27);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public void clear() {
        java.util.List list = this.f228344d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        ((java.util.ArrayList) list).clear();
        this.f228345e = null;
    }

    @Override // android.view.ContextMenu
    public void clearHeader() {
    }

    @Override // android.view.Menu
    public void close() {
    }

    public android.view.MenuItem d(int i17, int i18, java.lang.CharSequence charSequence) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i18), 0, spannableString.length(), 0);
        h4Var.f228368i = spannableString;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem e(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.d(i19, i27);
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(i18, h4Var);
        return h4Var;
    }

    public android.view.MenuItem f(int i17, java.lang.CharSequence charSequence) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f228344d).iterator();
        while (it.hasNext()) {
            android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
            if (menuItem.getItemId() == i17) {
                return menuItem;
            }
        }
        return null;
    }

    public android.view.MenuItem g(int i17, java.lang.CharSequence charSequence, int i18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(i18);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i17) {
        return (android.view.MenuItem) ((java.util.ArrayList) this.f228344d).get(i17);
    }

    public android.view.MenuItem h(int i17, java.lang.CharSequence charSequence, int i18, int i19) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.d(i18, i19);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return false;
    }

    public android.view.MenuItem i(int i17, java.lang.CharSequence charSequence, int i18, int i19, int i27) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228370n = i18;
        h4Var.d(i19, i27);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    public android.view.MenuItem j(int i17, java.lang.CharSequence charSequence, int i18, int i19, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.d(i18, i19);
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem k(int i17, java.lang.CharSequence charSequence, int i18, int i19, boolean z17, boolean z18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.d(i18, i19);
        h4Var.f228363d = z17;
        h4Var.f228364e = z18;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem l(int i17, java.lang.CharSequence charSequence, int i18, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(i18);
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem m(int i17, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(drawable);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem n(int i17, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(drawable);
        h4Var.e(drawable, i18);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem o(int i17, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228373q = charSequence2;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem p(int i17, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228373q = charSequence2;
        h4Var.setIcon(i18);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i17, int i18) {
        return false;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i17, android.view.KeyEvent keyEvent, int i18) {
        return false;
    }

    public android.view.MenuItem q(int i17, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i18, int i19) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228373q = charSequence2;
        h4Var.d(i18, i19);
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem r(int i17, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable, int i18, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228373q = charSequence2;
        h4Var.e(drawable, i18);
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public void removeGroup(int i17) {
    }

    @Override // android.view.Menu
    public void removeItem(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f228344d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
            if (menuItem.getItemId() == i17) {
                arrayList.add(menuItem);
            }
        }
        ((java.util.ArrayList) list).removeAll(arrayList);
    }

    public android.view.MenuItem s(int i17, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228373q = charSequence2;
        h4Var.setIcon(drawable);
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i17, boolean z17, boolean z18) {
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i17, boolean z17) {
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i17, boolean z17) {
    }

    @Override // android.view.ContextMenu
    public android.view.ContextMenu setHeaderIcon(int i17) {
        return this;
    }

    @Override // android.view.ContextMenu
    public android.view.ContextMenu setHeaderTitle(int i17) {
        java.lang.String string;
        if (i17 > 0 && (string = this.f228346f.getString(i17)) != null) {
            this.f228345e = string;
        }
        return this;
    }

    @Override // android.view.ContextMenu
    public android.view.ContextMenu setHeaderView(android.view.View view) {
        return this;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z17) {
    }

    @Override // android.view.Menu
    public int size() {
        java.util.List list = this.f228344d;
        if (list == null) {
            return 0;
        }
        return ((java.util.ArrayList) list).size();
    }

    public android.view.MenuItem t(int i17, java.lang.CharSequence charSequence, boolean z17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.f228375s = z17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem u(int i17, java.lang.CharSequence charSequence, boolean z17, boolean z18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228363d = z17;
        h4Var.f228364e = z18;
        h4Var.f228368i = charSequence;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem v(android.view.MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        ((java.util.ArrayList) this.f228344d).add(menuItem);
        return null;
    }

    public android.view.MenuItem w(int i17, java.lang.CharSequence charSequence, int i18) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228368i = charSequence;
        h4Var.setIcon(i18);
        h4Var.F = java.lang.Boolean.TRUE;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public android.view.MenuItem x(int i17, int i18, int i19) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i17, 0);
        h4Var.f228376t = i18;
        h4Var.f228370n = i19;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    public int y(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f228344d).iterator();
        int i18 = -1;
        while (it.hasNext()) {
            i18++;
            if (((android.view.MenuItem) it.next()).getItemId() == i17) {
                return i18;
            }
        }
        return -1;
    }

    public boolean z() {
        return ((java.util.ArrayList) this.f228344d).size() == 0;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, int i27) {
        return null;
    }

    @Override // android.view.ContextMenu
    public android.view.ContextMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        return this;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        return null;
    }

    @Override // android.view.ContextMenu
    public android.view.ContextMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        this.f228345e = charSequence;
        return this;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        db5.h4 h4Var = new db5.h4(this.f228346f, i18, i17);
        h4Var.f228368i = charSequence;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17) {
        db5.h4 h4Var = new db5.h4(this.f228346f, 0, 0);
        h4Var.f228376t = i17;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        db5.h4 h4Var = new db5.h4(this.f228346f, 0, 0);
        h4Var.f228368i = charSequence;
        ((java.util.ArrayList) this.f228344d).add(h4Var);
        return h4Var;
    }
}
