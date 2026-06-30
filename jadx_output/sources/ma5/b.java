package ma5;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f325231d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.b f325232e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.MenuInflater f325233f;

    /* renamed from: g, reason: collision with root package name */
    public n.b f325234g = null;

    public b(android.app.Activity activity) {
        this.f325231d = activity;
    }

    public abstract androidx.appcompat.app.b e();

    public android.view.MenuInflater f() {
        if (this.f325233f == null) {
            if (this.f325232e == null) {
                this.f325232e = e();
            }
            androidx.appcompat.app.b bVar = this.f325232e;
            if (bVar != null) {
                this.f325233f = new n.j(bVar.m());
            } else {
                this.f325233f = new n.j(this.f325231d);
            }
        }
        return this.f325233f;
    }

    public android.view.ActionMode g(android.view.ActionMode.Callback callback) {
        n.f fVar = new n.f(this.f325231d, callback);
        n.b bVar = this.f325234g;
        if (bVar != null) {
            bVar.a();
        }
        ma5.a aVar = new ma5.a(this, fVar);
        if (this.f325232e == null) {
            this.f325232e = e();
        }
        androidx.appcompat.app.b bVar2 = this.f325232e;
        if (bVar2 != null) {
            this.f325234g = bVar2.M(aVar);
        }
        n.b bVar3 = this.f325234g;
        if (bVar3 != null) {
            return fVar.e(bVar3);
        }
        return null;
    }
}
