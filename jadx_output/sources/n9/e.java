package n9;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f335758a;

    /* renamed from: b, reason: collision with root package name */
    public int f335759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f335760c;

    /* renamed from: d, reason: collision with root package name */
    public int f335761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f335762e;

    /* renamed from: f, reason: collision with root package name */
    public int f335763f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f335764g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f335765h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f335766i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f335767j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f335768k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f335769l;

    /* renamed from: m, reason: collision with root package name */
    public android.text.Layout.Alignment f335770m;

    public n9.e a(n9.e eVar) {
        if (eVar != null) {
            if (!this.f335760c && eVar.f335760c) {
                this.f335759b = eVar.f335759b;
                this.f335760c = true;
            }
            if (this.f335765h == -1) {
                this.f335765h = eVar.f335765h;
            }
            if (this.f335766i == -1) {
                this.f335766i = eVar.f335766i;
            }
            if (this.f335758a == null) {
                this.f335758a = eVar.f335758a;
            }
            if (this.f335763f == -1) {
                this.f335763f = eVar.f335763f;
            }
            if (this.f335764g == -1) {
                this.f335764g = eVar.f335764g;
            }
            if (this.f335770m == null) {
                this.f335770m = eVar.f335770m;
            }
            if (this.f335767j == -1) {
                this.f335767j = eVar.f335767j;
                this.f335768k = eVar.f335768k;
            }
            if (!this.f335762e && eVar.f335762e) {
                this.f335761d = eVar.f335761d;
                this.f335762e = true;
            }
        }
        return this;
    }
}
