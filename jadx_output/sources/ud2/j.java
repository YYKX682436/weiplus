package ud2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ud2.o oVar) {
        super(1);
        this.f426627d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isAudioMode", java.lang.Boolean.valueOf(booleanValue));
        this.f426627d.e("audioModeChange", hashMap);
        return jz5.f0.f302826a;
    }
}
