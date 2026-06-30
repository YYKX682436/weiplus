package mh2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.n f326401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ia4 f326402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mh2.n nVar, r45.ia4 ia4Var) {
        super(0);
        this.f326401d = nVar;
        this.f326402e = ia4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.n nVar = this.f326401d;
        android.widget.TextView textView = nVar.f326413h;
        r45.ia4 ia4Var = this.f326402e;
        textView.setText(java.lang.String.valueOf(ia4Var.f376875m));
        nVar.f326415j.setText(ia4Var.f376876n);
        return jz5.f0.f302826a;
    }
}
