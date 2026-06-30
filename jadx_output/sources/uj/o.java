package uj;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj.p f428168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uj.p pVar) {
        super(0);
        this.f428168d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = this.f428168d.f428170e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return jz5.f0.f302826a;
    }
}
