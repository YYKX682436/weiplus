package j65;

/* loaded from: classes13.dex */
public abstract class a extends android.content.res.Resources {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f297917a;

    public a(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f297917a = resources;
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i17) {
        return this.f297917a.getAnimation(i17);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i17) {
        return this.f297917a.getBoolean(i17);
    }

    @Override // android.content.res.Resources
    public int getColor(int i17, android.content.res.Resources.Theme theme) {
        return this.f297917a.getColor(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17, android.content.res.Resources.Theme theme) {
        return this.f297917a.getColorStateList(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.f297917a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i17) {
        return this.f297917a.getDimension(i17);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i17) {
        return this.f297917a.getDimensionPixelOffset(i17);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i17) {
        return this.f297917a.getDimensionPixelSize(i17);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.f297917a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public float getFraction(int i17, int i18, int i19) {
        return this.f297917a.getFraction(i17, i18, i19);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f297917a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i17) {
        return this.f297917a.getIntArray(i17);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i17) {
        return this.f297917a.getInteger(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i17) {
        return this.f297917a.getLayout(i17);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i17) {
        return this.f297917a.getMovie(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18, java.lang.Object... objArr) {
        return this.f297917a.getQuantityString(i17, i18, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i17, int i18) {
        return com.tencent.mm.sdk.platformtools.p9.e(this.f297917a.getQuantityString(i17, i18));
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i17) {
        return this.f297917a.getResourceEntryName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i17) {
        return this.f297917a.getResourceName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i17) {
        return this.f297917a.getResourcePackageName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i17) {
        return this.f297917a.getResourceTypeName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17) {
        return com.tencent.mm.sdk.platformtools.p9.e(this.f297917a.getString(i17));
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i17) {
        return this.f297917a.getStringArray(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17) {
        return com.tencent.mm.sdk.platformtools.p9.e(this.f297917a.getString(i17));
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i17) {
        return this.f297917a.getTextArray(i17);
    }

    @Override // android.content.res.Resources
    public void getValue(int i17, android.util.TypedValue typedValue, boolean z17) {
        this.f297917a.getValue(i17, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i17, int i18, android.util.TypedValue typedValue, boolean z17) {
        this.f297917a.getValueForDensity(i17, i18, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i17) {
        return this.f297917a.getXml(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.f297917a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i17) {
        return this.f297917a.obtainTypedArray(i17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17) {
        return this.f297917a.openRawResource(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i17) {
        return this.f297917a.openRawResourceFd(i17);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f297917a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) {
        this.f297917a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.f297917a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i17) {
        return this.f297917a.getColor(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17) {
        return this.f297917a.getColorStateList(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18) {
        return this.f297917a.getQuantityString(i17, i18);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17, java.lang.Object... objArr) {
        return this.f297917a.getString(i17, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17, java.lang.CharSequence charSequence) {
        return this.f297917a.getText(i17, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z17) {
        this.f297917a.getValue(str, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17, android.util.TypedValue typedValue) {
        return this.f297917a.openRawResource(i17, typedValue);
    }
}
