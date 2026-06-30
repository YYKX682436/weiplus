package lf3;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf3.y f318340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lf3.y yVar) {
        super(0);
        this.f318340d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf3.y yVar = this.f318340d;
        yVar.getActivity().finish();
        yVar.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        return jz5.f0.f302826a;
    }
}
