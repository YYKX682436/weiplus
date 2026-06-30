package p43;

/* loaded from: classes8.dex */
public final class c extends j43.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p43.d f351761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p43.d dVar, l75.k0 k0Var) {
        super(k0Var);
        this.f351761d = dVar;
    }

    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `GameLocalVideoInfo` (`fileId`,`userId`,`appId`,`appName`,`filePath`,`orgFilePath`,`coverPath`,`extJsonData`,`createTime`,`durationSec`,`title`,`desc`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        p43.a entity = (p43.a) obj;
        kotlin.jvm.internal.o.g(stmt, "stmt");
        kotlin.jvm.internal.o.g(entity, "entity");
        java.lang.String str = entity.field_fileId;
        p43.d dVar = this.f351761d;
        p43.d.y0(dVar, stmt, 1, str);
        p43.d.y0(dVar, stmt, 2, entity.field_userId);
        p43.d.y0(dVar, stmt, 3, entity.field_appId);
        p43.d.y0(dVar, stmt, 4, entity.field_appName);
        p43.d.y0(dVar, stmt, 5, entity.field_filePath);
        p43.d.y0(dVar, stmt, 6, entity.field_orgFilePath);
        p43.d.y0(dVar, stmt, 7, entity.field_coverPath);
        p43.d.y0(dVar, stmt, 8, entity.field_extJsonData);
        p75.e0 e0Var = (p75.e0) stmt;
        e0Var.bindLong(9, entity.field_createTime);
        e0Var.bindLong(10, entity.field_durationSec);
        p43.d.y0(dVar, stmt, 11, entity.field_title);
        p43.d.y0(dVar, stmt, 12, entity.field_desc);
    }
}
