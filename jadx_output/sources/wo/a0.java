package wo;

/* loaded from: classes12.dex */
public class a0 extends wo.u0 {
    @Override // wo.q0
    public java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String a17 = super.a(str);
            java.lang.String k96 = fo3.s.INSTANCE.k9();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (k96 == null) {
                k96 = "";
            }
            if (!k96.equals(a17)) {
                synchronized (this.f447789c) {
                    this.f447787a = false;
                    this.f447788b = null;
                    c(null);
                }
            }
        }
        return super.a(str);
    }
}
