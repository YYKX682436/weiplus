package j5;

/* loaded from: classes13.dex */
public class g extends l4.b {
    public g(j5.h hVar, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public void d(p4.i iVar, java.lang.Object obj) {
        j5.e eVar = (j5.e) obj;
        java.lang.String str = eVar.f297732a;
        if (str == null) {
            ((q4.h) iVar).bindNull(1);
        } else {
            ((q4.h) iVar).bindString(1, str);
        }
        java.lang.Long l17 = eVar.f297733b;
        if (l17 == null) {
            ((q4.h) iVar).bindNull(2);
        } else {
            ((q4.h) iVar).bindLong(2, l17.longValue());
        }
    }
}
