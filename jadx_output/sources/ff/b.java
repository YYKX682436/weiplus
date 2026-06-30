package ff;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f261573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff.e f261574b;

    public b(ff.e eVar, android.view.View view) {
        this.f261574b = eVar;
        this.f261573a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(final int i17) {
        this.f261573a.post(new java.lang.Runnable() { // from class: ff.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = i17 & 4;
                ff.e eVar = ff.b.this.f261574b;
                if (i18 == 0) {
                    eVar.f261580b.systemChromeChanged(true);
                } else {
                    eVar.f261580b.systemChromeChanged(false);
                }
            }
        });
    }
}
