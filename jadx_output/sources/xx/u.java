package xx;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f457823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17) {
        super(1);
        this.f457823d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("send_word_cnt", java.lang.Integer.valueOf(this.f457823d));
        return jz5.f0.f302826a;
    }
}
