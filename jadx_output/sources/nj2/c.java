package nj2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f337829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nj2.h hVar) {
        super(0);
        this.f337829d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nj2.h hVar = this.f337829d;
        android.view.View view = hVar.R;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.r1l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new nj2.j(view, hVar, findViewById, hVar.H, hVar.f337835J);
    }
}
