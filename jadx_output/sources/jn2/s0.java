package jn2;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f300694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(jn2.c1 c1Var) {
        super(2);
        this.f300694d = c1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String songMid = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(songMid, "songMid");
        java.util.Iterator it = ((java.util.ArrayList) this.f300694d.f300574n).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            jn2.w0 w0Var = (jn2.w0) it.next();
            if (kotlin.jvm.internal.o.b(w0Var.f300740a.f370350d, songMid) && w0Var.f300740a.f370360q == booleanValue) {
                break;
            }
            i17++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }
}
