package u43;

/* loaded from: classes8.dex */
public final class c extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `ApkChannelPatchInfo` (`pkgName`,`isServerPatch`,`patchPath`,`newChannelApkPath`,`taskStatus`) VALUES (?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        u43.b entity = (u43.b) obj;
        kotlin.jvm.internal.o.g(stmt, "stmt");
        kotlin.jvm.internal.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.field_pkgName, java.lang.Boolean.valueOf(entity.field_isServerPatch), entity.field_patchPath, entity.field_newChannelApkPath, java.lang.Integer.valueOf(entity.field_taskStatus)});
    }
}
