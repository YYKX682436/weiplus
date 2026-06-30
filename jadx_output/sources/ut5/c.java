package ut5;

/* loaded from: classes13.dex */
public class c extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f431190a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f431191b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ClassLoader f431192c;

    public c(android.content.Context context, java.lang.String str, java.lang.ClassLoader classLoader) {
        super(context);
        this.f431192c = classLoader;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.pm.ApplicationInfo applicationInfo = packageManager.getPackageArchiveInfo(str, 128).applicationInfo;
        applicationInfo.publicSourceDir = str;
        applicationInfo.sourceDir = str;
        try {
            this.f431190a = packageManager.getResourcesForApplication(applicationInfo);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.f431190a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        return this.f431192c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.f431190a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f431191b == null) {
            this.f431191b = ((android.view.LayoutInflater) super.getSystemService(str)).cloneInContext(this);
        }
        return this.f431191b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        return this.f431190a.newTheme();
    }
}
