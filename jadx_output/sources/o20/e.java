package o20;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o20.i f342378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o20.i iVar) {
        super(3);
        this.f342378d = iVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        o20.k kVar = new o20.k(new o20.d0(intValue, intValue2, "播放错误: 类型=" + intValue + ", 代码=" + intValue2, null, 8, null));
        o20.i iVar = this.f342378d;
        iVar.f(kVar);
        ((q20.j) iVar.f342383b).a();
        return jz5.f0.f302826a;
    }
}
