package nj2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.z f337859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nj2.z zVar) {
        super(0);
        this.f337859d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nj2.z zVar = this.f337859d;
        android.view.View view = zVar.f337875r;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.r1l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new nj2.r(view, zVar, findViewById, zVar.f337868h, zVar.f337870m);
    }
}
