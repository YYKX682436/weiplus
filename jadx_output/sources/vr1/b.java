package vr1;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vr1.o oVar) {
        super(0);
        this.f439546d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vr1.o oVar = this.f439546d;
        return java.lang.Integer.valueOf(com.tencent.mm.ui.bl.a(oVar.getContext()) + com.tencent.mm.ui.bl.h(oVar.getContext()));
    }
}
