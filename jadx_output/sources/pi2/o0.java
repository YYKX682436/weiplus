package pi2;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(pi2.q0 q0Var) {
        super(2);
        this.f354799d = q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String text = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(text, "text");
        this.f354799d.h0(intValue, text);
        com.tencent.mm.plugin.finder.live.widget.e0.W(this.f354799d, null, false, 0, 7, null);
        return jz5.f0.f302826a;
    }
}
