package mh2;

/* loaded from: classes10.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(mh2.f1 f1Var, int i17, java.lang.String str) {
        super(0);
        this.f326314d = f1Var;
        this.f326315e = i17;
        this.f326316f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.f1 f1Var = this.f326314d;
        f1Var.f326333h.setText(f1Var.f326291a.getResources().getString(this.f326315e, this.f326316f));
        return jz5.f0.f302826a;
    }
}
