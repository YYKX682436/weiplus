package g3;

/* loaded from: classes15.dex */
public interface b extends android.view.MenuItem {
    g3.b a(n3.f fVar);

    n3.f b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char c17, int i17);

    @Override // android.view.MenuItem
    g3.b setContentDescription(java.lang.CharSequence charSequence);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char c17, int i17);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char c17, char c18, int i17, int i18);

    @Override // android.view.MenuItem
    g3.b setTooltipText(java.lang.CharSequence charSequence);
}
