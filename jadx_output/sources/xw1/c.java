package xw1;

/* loaded from: classes9.dex */
public abstract class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457659f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f457660g;

    /* renamed from: d, reason: collision with root package name */
    public int f457657d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f457658e = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457661h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f457662i = false;

    public boolean H() {
        return !(this instanceof xw1.d);
    }

    public abstract void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr);

    public xw1.c J(xw1.b bVar) {
        if (this.f457662i) {
            bVar.a(this.f457657d, this.f457658e, this.f457659f, this);
        }
        return this;
    }

    public xw1.c K(xw1.b bVar) {
        if (!this.f457661h && !this.f457662i) {
            bVar.a(this.f457657d, this.f457658e, this.f457659f, this);
        }
        return this;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        if (i18 != 0 || i19 != 0) {
            this.f457661h = true;
            if (H() && (weakReference = this.f457660g) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
                db5.e1.G(activity, activity.getString(com.tencent.mm.R.string.l0g), null, false, new xw1.a(this));
            }
        }
        this.f457657d = i19;
        this.f457658e = i18;
        this.f457659f = str;
        I(i17, i18, i19, str, v0Var, bArr);
    }
}
