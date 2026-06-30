package y33;

/* loaded from: classes7.dex */
public final class i extends j43.a {
    public i(d95.b0 b0Var) {
        super(b0Var);
    }

    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `GameSimpleUserInfo` (`compositionKey`,`userName`,`roomName`,`nickName`,`avatarURL`,`role`,`updateTime`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        y33.g entity = (y33.g) obj;
        kotlin.jvm.internal.o.g(stmt, "stmt");
        kotlin.jvm.internal.o.g(entity, "entity");
        java.lang.String field_compositionKey = entity.field_compositionKey;
        kotlin.jvm.internal.o.f(field_compositionKey, "field_compositionKey");
        p75.e0 e0Var = (p75.e0) stmt;
        e0Var.bindString(1, field_compositionKey);
        java.lang.String field_userName = entity.field_userName;
        kotlin.jvm.internal.o.f(field_userName, "field_userName");
        e0Var.bindString(2, field_userName);
        java.lang.String field_roomName = entity.field_roomName;
        kotlin.jvm.internal.o.f(field_roomName, "field_roomName");
        e0Var.bindString(3, field_roomName);
        java.lang.String field_nickName = entity.field_nickName;
        kotlin.jvm.internal.o.f(field_nickName, "field_nickName");
        e0Var.bindString(4, field_nickName);
        java.lang.String str = entity.field_avatarURL;
        if (str == null) {
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = e0Var.f352634d;
            if (sQLiteStatement != null) {
                sQLiteStatement.bindNull(5);
            } else {
                com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = e0Var.f352635e;
                if (sQLiteStatement2 != null) {
                    sQLiteStatement2.bindNull(5);
                }
            }
        } else {
            e0Var.bindString(5, str);
        }
        e0Var.bindLong(6, entity.field_role);
        e0Var.bindLong(7, entity.field_updateTime);
    }
}
