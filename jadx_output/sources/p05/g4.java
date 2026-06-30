package p05;

/* loaded from: classes14.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(p05.l4 l4Var) {
        super(1);
        this.f350530d = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Long.valueOf(com.tencent.mm.xeffect.WeEffectRender.nCreateFilterWithConfig(this.f350530d.f350593f, it));
    }
}
