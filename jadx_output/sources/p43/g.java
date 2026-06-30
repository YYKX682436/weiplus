package p43;

/* loaded from: classes4.dex */
public final class g extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `LocalGameReport` (`pkgName`,`lastReportTimeStamp`) VALUES (?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        p43.e entity = (p43.e) obj;
        kotlin.jvm.internal.o.g(stmt, "stmt");
        kotlin.jvm.internal.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.field_pkgName, java.lang.Long.valueOf(entity.field_lastReportTimeStamp)});
    }
}
