package j5;

/* loaded from: classes13.dex */
public class k extends l4.b {
    public k(j5.m mVar, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public void d(p4.i iVar, java.lang.Object obj) {
        java.lang.String str = ((j5.i) obj).f297747a;
        if (str == null) {
            ((q4.h) iVar).bindNull(1);
        } else {
            ((q4.h) iVar).bindString(1, str);
        }
        ((q4.h) iVar).bindLong(2, r5.f297748b);
    }
}
