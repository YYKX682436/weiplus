package nf4;

/* loaded from: classes4.dex */
public final class f extends dm.db {
    public static final l75.e0 W = dm.db.initAutoDBInfo(nf4.f.class);
    public static final yz5.p X = nf4.e.f336844d;

    public f() {
        this.field_userName = "";
    }

    @Override // dm.db, l75.f0
    public void convertFrom(android.database.Cursor cu6) {
        kotlin.jvm.internal.o.g(cu6, "cu");
        super.convertFrom(cu6);
    }

    @Override // dm.db, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = W;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final java.lang.String getUserName() {
        java.lang.String field_userName = this.field_userName;
        kotlin.jvm.internal.o.f(field_userName, "field_userName");
        return field_userName;
    }

    public final boolean isValid() {
        if (this.field_syncId != 0) {
            int i17 = this.field_storyPostTime;
            ef4.n.f252460a.a();
            if (i17 + 86400 >= c01.id.e()) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0() {
        if (isValid()) {
            yz5.p pVar = X;
            if (((java.lang.Boolean) ((nf4.e) pVar).invoke(java.lang.Long.valueOf(this.field_readId), java.lang.Long.valueOf(this.field_syncId))).booleanValue()) {
                ef4.v vVar = ef4.w.f252468t;
                if (ef4.w.f252470v == -1) {
                    ef4.w.f252470v = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_STORY_SNS_ALL_READ_TIME_LONG, 0L);
                }
                if (((java.lang.Boolean) ((nf4.e) pVar).invoke(java.lang.Long.valueOf(ef4.w.f252470v), java.lang.Long.valueOf(this.field_updateTime))).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
