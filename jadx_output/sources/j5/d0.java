package j5;

/* loaded from: classes13.dex */
public class d0 extends l4.w {
    public d0(j5.g0 g0Var, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
