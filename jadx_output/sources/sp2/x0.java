package sp2;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i17) {
        super(1);
        this.f411263d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        return java.lang.Boolean.valueOf(lVar != null && ((java.lang.Number) lVar.f302833d).intValue() == this.f411263d);
    }
}
