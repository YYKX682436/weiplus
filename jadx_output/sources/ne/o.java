package ne;

/* loaded from: classes.dex */
public class o implements ne.q {
    @Override // ne.q
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SessionId@");
        sb6.append(hashCode());
        sb6.append("#");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }
}
