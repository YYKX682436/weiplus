package wh5;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wh5.s sVar, java.lang.String str) {
        super(1);
        this.f446082d = sVar;
        this.f446083e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = this.f446083e;
        wh5.s sVar = this.f446082d;
        if (intValue == 0) {
            sVar.C.add(str);
        } else {
            sVar.C.remove(str);
        }
        return jz5.f0.f302826a;
    }
}
