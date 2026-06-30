package ma5;

/* loaded from: classes15.dex */
public class a implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f325229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ma5.b f325230b;

    public a(ma5.b bVar, n.a aVar) {
        this.f325230b = bVar;
        this.f325229a = aVar;
    }

    @Override // n.a
    public boolean a(n.b bVar, android.view.Menu menu) {
        return this.f325229a.a(bVar, menu);
    }

    @Override // n.a
    public boolean b(n.b bVar, android.view.MenuItem menuItem) {
        return this.f325229a.b(bVar, menuItem);
    }

    @Override // n.a
    public boolean c(n.b bVar, android.view.Menu menu) {
        return this.f325229a.c(bVar, menu);
    }

    @Override // n.a
    public void d(n.b bVar) {
        this.f325229a.d(bVar);
        this.f325230b.f325234g = null;
    }
}
