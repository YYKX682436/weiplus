package p05;

/* loaded from: classes14.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(p05.l4 l4Var) {
        super(2);
        this.f350552d = l4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.xeffect.WeEffectRender.nSetFilterColorWeight(this.f350552d.f350593f, ((java.lang.Number) obj).longValue(), ((java.lang.Number) obj2).floatValue());
        return jz5.f0.f302826a;
    }
}
