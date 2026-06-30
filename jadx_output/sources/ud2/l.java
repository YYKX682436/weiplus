package ud2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ud2.o oVar) {
        super(2);
        this.f426629d = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("width", java.lang.Integer.valueOf(intValue));
        hashMap.put("height", java.lang.Integer.valueOf(intValue2));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("size", hashMap);
        this.f426629d.e("playChangeSize", hashMap2);
        return jz5.f0.f302826a;
    }
}
