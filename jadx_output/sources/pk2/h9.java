package pk2;

/* loaded from: classes3.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(pk2.o9 o9Var) {
        super(0);
        this.f355820d = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.o9 o9Var = this.f355820d;
        yf2.m1 m1Var = (yf2.m1) o9Var.e(yf2.m1.class);
        if (m1Var == null) {
            return null;
        }
        return new com.tencent.mm.plugin.finder.live.widget.z60(o9Var.f356078d, new java.lang.ref.WeakReference(m1Var));
    }
}
