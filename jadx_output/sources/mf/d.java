package mf;

/* loaded from: classes13.dex */
public abstract class d extends android.view.ContextThemeWrapper {

    /* renamed from: d, reason: collision with root package name */
    public static final mf.c f325992d = new mf.a();

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f325993a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f325994b;

    /* renamed from: c, reason: collision with root package name */
    public final mf.c f325995c;

    public d(android.content.Context context, mf.c cVar) {
        super.attachBaseContext(context);
        this.f325995c = cVar == null ? f325992d : cVar;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null) {
            return super.getResources();
        }
        if (this.f325993a == null) {
            android.content.res.Resources resources = super.getResources();
            this.f325993a = new mf.b(this, resources, this.f325995c.a(resources.getDisplayMetrics(), resources.getConfiguration()));
            getTheme().getResources().getDisplayMetrics().setTo(this.f325993a.getDisplayMetrics());
        }
        return this.f325993a;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        android.view.LayoutInflater layoutInflater = this.f325994b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflater2 = (android.view.LayoutInflater) super.getSystemService("layout_inflater");
        this.f325994b = layoutInflater2;
        return layoutInflater2;
    }
}
