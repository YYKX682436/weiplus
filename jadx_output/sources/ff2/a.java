package ff2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ff2.a f261636d = new ff2.a();

    public a() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.List i17 = kz5.c0.i("#161619", "#313136", "#1D1D1F", "#111112", "#18181A");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it.next())));
        }
        return new android.graphics.LinearGradient(0.0f, 0.0f, intValue2, intValue / 1.0381f, kz5.n0.R0(arrayList), new float[]{-0.072f, 0.229f, 0.473f, 0.59f, 1.018f}, android.graphics.Shader.TileMode.CLAMP);
    }
}
