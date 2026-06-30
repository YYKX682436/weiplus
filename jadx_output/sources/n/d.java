package n;

/* loaded from: classes13.dex */
public class d extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f333363a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.res.Resources.Theme f333364b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.LayoutInflater f333365c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Resources f333366d;

    public d(android.content.Context context, int i17) {
        super(context);
        this.f333363a = i17;
    }

    public final void a() {
        if (this.f333364b == null) {
            this.f333364b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f333364b.setTo(theme);
            }
        }
        this.f333364b.applyStyle(this.f333363a, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (this.f333366d == null) {
            this.f333366d = super.getResources();
        }
        return this.f333366d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f333365c == null) {
            this.f333365c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f333365c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f333364b;
        if (theme != null) {
            return theme;
        }
        if (this.f333363a == 0) {
            this.f333363a = com.tencent.mm.R.style.ra;
        }
        a();
        return this.f333364b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        if (this.f333363a != i17) {
            this.f333363a = i17;
            a();
        }
    }

    public d(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.f333364b = theme;
    }
}
