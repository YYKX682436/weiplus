package dk2;

/* loaded from: classes3.dex */
public final class wa {

    /* renamed from: b, reason: collision with root package name */
    public static final dk2.va f234283b = new dk2.va(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f234284c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final r45.f82 f234285a;

    public wa(r45.f82 quotaInfo) {
        kotlin.jvm.internal.o.g(quotaInfo, "quotaInfo");
        this.f234285a = quotaInfo;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quotaInfo: ");
        r45.f82 f82Var = this.f234285a;
        kotlin.jvm.internal.o.g(f82Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("can_show:");
        sb7.append(f82Var.getInteger(0));
        sb7.append(" notice_amount: ");
        r45.ql1 ql1Var = (r45.ql1) f82Var.getCustom(2);
        sb7.append(ql1Var != null ? java.lang.Long.valueOf(ql1Var.getLong(1)) : null);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
