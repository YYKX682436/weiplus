package o;

/* loaded from: classes15.dex */
public class j0 extends o.e implements android.view.Menu {
    public j0(android.content.Context context, g3.a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return c(((o.r) ((g3.a) this.f341714d)).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i17, int i18, int i19, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i27, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((o.r) ((g3.a) this.f341714d)).addIntentOptions(i17, i18, i19, componentName, intentArr, intent, i27, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i28 = 0; i28 < length; i28++) {
                menuItemArr[i28] = c(menuItemArr2[i28]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return ((o.r) ((g3.a) this.f341714d)).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        java.lang.Object obj = this.f341701f;
        if (obj != null) {
            ((x.n) obj).clear();
        }
        ((o.r) ((g3.a) this.f341714d)).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((o.r) ((g3.a) this.f341714d)).c(true);
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i17) {
        return c(((o.r) ((g3.a) this.f341714d)).findItem(i17));
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i17) {
        return c(((o.r) ((g3.a) this.f341714d)).getItem(i17));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((o.r) ((g3.a) this.f341714d)).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i17, android.view.KeyEvent keyEvent) {
        return ((o.r) ((g3.a) this.f341714d)).isShortcutKey(i17, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i17, int i18) {
        return ((o.r) ((g3.a) this.f341714d)).performIdentifierAction(i17, i18);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i17, android.view.KeyEvent keyEvent, int i18) {
        return ((o.r) ((g3.a) this.f341714d)).performShortcut(i17, keyEvent, i18);
    }

    @Override // android.view.Menu
    public void removeGroup(int i17) {
        java.util.Map map = this.f341701f;
        if (map != null) {
            java.util.Iterator it = ((x.j) ((x.b) map).keySet()).iterator();
            while (true) {
                x.h hVar = (x.h) it;
                if (!hVar.hasNext()) {
                    break;
                } else if (i17 == ((android.view.MenuItem) hVar.next()).getGroupId()) {
                    hVar.remove();
                }
            }
        }
        ((o.r) ((g3.a) this.f341714d)).removeGroup(i17);
    }

    @Override // android.view.Menu
    public void removeItem(int i17) {
        java.util.Map map = this.f341701f;
        if (map != null) {
            java.util.Iterator it = ((x.j) ((x.b) map).keySet()).iterator();
            while (true) {
                x.h hVar = (x.h) it;
                if (!hVar.hasNext()) {
                    break;
                } else if (i17 == ((android.view.MenuItem) hVar.next()).getItemId()) {
                    hVar.remove();
                    break;
                }
            }
        }
        ((o.r) ((g3.a) this.f341714d)).removeItem(i17);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i17, boolean z17, boolean z18) {
        ((o.r) ((g3.a) this.f341714d)).setGroupCheckable(i17, z17, z18);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i17, boolean z17) {
        ((o.r) ((g3.a) this.f341714d)).setGroupEnabled(i17, z17);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i17, boolean z17) {
        ((o.r) ((g3.a) this.f341714d)).setGroupVisible(i17, z17);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z17) {
        ((g3.a) this.f341714d).setQwertyMode(z17);
    }

    @Override // android.view.Menu
    public int size() {
        return ((o.r) ((g3.a) this.f341714d)).size();
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17) {
        return ((o.r) ((g3.a) this.f341714d)).addSubMenu(i17);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17) {
        return c(((o.r) ((g3.a) this.f341714d)).add(i17));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        return ((g3.a) this.f341714d).addSubMenu(i17, i18, i19, charSequence);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        return c(((o.r) ((g3.a) this.f341714d)).a(i17, i18, i19, charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, int i27) {
        return ((o.r) ((g3.a) this.f341714d)).addSubMenu(i17, i18, i19, i27);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, int i27) {
        return c(((o.r) ((g3.a) this.f341714d)).add(i17, i18, i19, i27));
    }
}
