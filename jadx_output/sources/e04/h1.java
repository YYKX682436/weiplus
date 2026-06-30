package e04;

/* loaded from: classes15.dex */
public final class h1 extends e04.f1 {

    /* renamed from: i, reason: collision with root package name */
    public boolean f245949i;

    /* renamed from: j, reason: collision with root package name */
    public qt5.d f245950j;

    public h1() {
        super(null, 0L, 3, null);
    }

    public void a() {
        this.f245917a = null;
        this.f245918b = -1L;
        this.f245919c = false;
        this.f245920d = false;
        this.f245921e = -1L;
        this.f245922f = -1L;
        this.f245923g = -1L;
        this.f245924h = false;
        this.f245949i = false;
    }

    @Override // e04.f1
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewCameraTaskResult{errCode: ");
        qt5.d dVar = this.f245950j;
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f366677a) : null);
        sb6.append(", previewed: ");
        sb6.append(this.f245949i);
        sb6.append(", ");
        sb6.append(super.toString());
        sb6.append('}');
        return sb6.toString();
    }
}
