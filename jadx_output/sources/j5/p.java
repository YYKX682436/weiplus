package j5;

/* loaded from: classes13.dex */
public class p extends l4.b {
    public p(j5.q qVar, l4.q qVar2) {
        super(qVar2);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public void d(p4.i iVar, java.lang.Object obj) {
        j5.n nVar = (j5.n) obj;
        java.lang.String str = nVar.f297754a;
        if (str == null) {
            ((q4.h) iVar).bindNull(1);
        } else {
            ((q4.h) iVar).bindString(1, str);
        }
        java.lang.String str2 = nVar.f297755b;
        if (str2 == null) {
            ((q4.h) iVar).bindNull(2);
        } else {
            ((q4.h) iVar).bindString(2, str2);
        }
    }
}
