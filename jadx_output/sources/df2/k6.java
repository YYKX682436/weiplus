package df2;

/* loaded from: classes3.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(df2.t6 t6Var) {
        super(10);
        this.f230555d = t6Var;
    }

    @Override // yz5.b
    public java.lang.Object V(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        boolean z17;
        java.lang.String sdkUserId = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        java.lang.String gestureId = (java.lang.String) obj3;
        java.lang.String randomId = (java.lang.String) obj4;
        float floatValue2 = ((java.lang.Number) obj5).floatValue();
        float floatValue3 = ((java.lang.Number) obj6).floatValue();
        float floatValue4 = ((java.lang.Number) obj7).floatValue();
        float floatValue5 = ((java.lang.Number) obj8).floatValue();
        java.lang.String giftComboId = (java.lang.String) obj9;
        java.lang.String giftSoundId = (java.lang.String) obj10;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        kotlin.jvm.internal.o.g(gestureId, "gestureId");
        kotlin.jvm.internal.o.g(randomId, "randomId");
        kotlin.jvm.internal.o.g(giftComboId, "giftComboId");
        kotlin.jvm.internal.o.g(giftSoundId, "giftSoundId");
        try {
            z17 = df2.t6.Z6(this.f230555d, sdkUserId, floatValue, gestureId, randomId, floatValue2, floatValue3, floatValue4, floatValue5, giftComboId, giftSoundId);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.GestureEffectPagController", e17.toString());
            z17 = false;
        }
        if (z17) {
            pm0.v.X(new df2.j6(this.f230555d, giftComboId, gestureId));
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
