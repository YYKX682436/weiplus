package oe3;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe3.c f344792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oe3.c cVar) {
        super(0);
        this.f344792d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oe3.c cVar = this.f344792d;
        android.widget.FrameLayout frameLayout = cVar.f344795y;
        if (frameLayout != null) {
            bf3.p pVar = cVar.f344794x;
            if (pVar != null) {
                pVar.c(frameLayout);
            }
            cVar.f344795y = null;
        }
        bf3.p pVar2 = cVar.f344794x;
        if (pVar2 != null) {
            pVar2.b();
        }
        return jz5.f0.f302826a;
    }
}
