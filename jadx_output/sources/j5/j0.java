package j5;

/* loaded from: classes13.dex */
public class j0 extends l4.b {
    public j0(j5.k0 k0Var, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public void d(p4.i iVar, java.lang.Object obj) {
        j5.h0 h0Var = (j5.h0) obj;
        java.lang.String str = h0Var.f297745a;
        if (str == null) {
            ((q4.h) iVar).bindNull(1);
        } else {
            ((q4.h) iVar).bindString(1, str);
        }
        java.lang.String str2 = h0Var.f297746b;
        if (str2 == null) {
            ((q4.h) iVar).bindNull(2);
        } else {
            ((q4.h) iVar).bindString(2, str2);
        }
    }
}
