package fi2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.w f262904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fi2.w wVar) {
        super(0);
        this.f262904d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.w wVar = this.f262904d;
        fg2.n0 a17 = fg2.n0.a(com.tencent.mm.ui.id.b(wVar.f262915a.f365323d.getContext()), null, false);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262160a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        ym5.a1.h(constraintLayout, new fi2.s(wVar));
        return a17;
    }
}
