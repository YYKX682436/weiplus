package dk2;

/* loaded from: classes3.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public final r45.lq1 f234250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f234251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234252c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mq1 f234253d;

    public vf(r45.lq1 lq1Var) {
        com.tencent.mm.protobuf.g byteString;
        this.f234250a = lq1Var;
        this.f234251b = lq1Var != null ? lq1Var.getInteger(1) : 0;
        this.f234252c = lq1Var != null ? lq1Var.getInteger(0) : 0;
        r45.mq1 mq1Var = new r45.mq1();
        byte[] g17 = (lq1Var == null || (byteString = lq1Var.getByteString(2)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                mq1Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            this.f234253d = mq1Var;
        }
        mq1Var = null;
        this.f234253d = mq1Var;
    }
}
