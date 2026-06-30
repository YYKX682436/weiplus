package p05;

/* loaded from: classes14.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(p05.l4 l4Var) {
        super(1);
        this.f350538d = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.xeffect.WeEffectRender.nRemoveFilter(this.f350538d.f350593f, ((java.lang.Number) obj).longValue());
        return jz5.f0.f302826a;
    }
}
