package y43;

/* loaded from: classes8.dex */
public final class g extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `LocalLiteAppConf` (`url`,`appid`,`path`,`expire_duration`,`refresh_duration`,`wepkg_id`,`updateTime`,`hasLiteConf`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        y43.e entity = (y43.e) obj;
        kotlin.jvm.internal.o.g(stmt, "stmt");
        kotlin.jvm.internal.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.field_url, entity.field_appid, entity.field_path, java.lang.Integer.valueOf(entity.field_expire_duration), java.lang.Integer.valueOf(entity.field_refresh_duration), entity.field_wepkg_id, java.lang.Long.valueOf(entity.field_updateTime), java.lang.Boolean.valueOf(entity.field_hasLiteConf)});
    }
}
