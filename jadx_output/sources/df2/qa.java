package df2;

/* loaded from: classes5.dex */
public final class qa extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(df2.zb zbVar) {
        super(2);
        this.f231149d = zbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String keyword = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.o.g(keyword, "keyword");
        df2.zb zbVar = this.f231149d;
        java.lang.Float f17 = zbVar.f231943q;
        float floatValue2 = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.String str = zbVar.f231939m;
        com.tencent.mars.xlog.Log.i(str, "[KWS] keyword detected: " + keyword + ", confidence=" + floatValue + ", threshold=" + floatValue2);
        if (floatValue < floatValue2) {
            com.tencent.mars.xlog.Log.i(str, "[KWS] confidence below threshold, ignored");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new df2.pa(zbVar));
        }
        return jz5.f0.f302826a;
    }
}
