package rz0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mm_compose.MMComposeView f401786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.mm_compose.MMComposeView mMComposeView, int i17) {
        super(2);
        this.f401786d = mMComposeView;
        this.f401787e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f401787e | 1;
        this.f401786d.a((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
