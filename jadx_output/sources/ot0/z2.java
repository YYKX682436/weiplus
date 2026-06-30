package ot0;

/* loaded from: classes12.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.z2 f348822a = new ot0.z2();

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 A(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker).and(up5.i.f429989u.eq(j17)));
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 A0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String filterSql) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(filterSql, "filterSql");
        try {
            com.tencent.wcdb.orm.Field field = up5.i.f429978j;
            com.tencent.wcdb.winq.Expression s17 = s1(filterSql, field != null ? field.eq(talker) : null);
            com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
            com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
            com.tencent.wcdb.orm.Field field2 = up5.i.f429977i;
            up5.w wVar = (up5.w) r17.getFirstObject(a17, s17, field2 != null ? field2.order(com.tencent.wcdb.winq.Order.Desc) : null, 0L);
            if (wVar == null) {
                return new com.tencent.mm.storage.f9();
            }
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
            return f9Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getLastMsgWithFilterSql failed: " + th6.getMessage());
            return new com.tencent.mm.storage.f9();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 B(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429972d.eq(j17);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.getFirstObject(ot0.d3.b(eq6, str != null, new ot0.r1(str)));
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final java.util.List B0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.Collection<up5.w> allObjects = r1(db6, TableNameByTalker).getAllObjects(up5.i.a(), up5.i.f429978j.eq(talker).and(up5.i.f429974f.eq(4)).and(up5.i.f429973e.notEq(10000)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor C(l75.k0 db6, java.lang.String TableNameByTalker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        kotlin.jvm.internal.o.f(select, "select(...)");
        return tp5.a.f(ot0.d3.a(db6), select.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 C0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker).and(up5.i.f429975g.eq(0)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor D(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.winq.StatementSelect statementSelect = new com.tencent.wcdb.winq.StatementSelect();
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect from = statementSelect.select(field, up5.i.f429971c).from(TableNameByTalker);
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.winq.StatementSelect orderBy = from.where(ot0.d3.b(eq6, j17 > 0, new ot0.s1(j17))).groupBy(field).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy, null, null);
    }

    public final java.util.List D0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(types, "types");
        java.util.Collection<up5.w> allObjects = r1(db6, tableName).getAllObjects(up5.i.a(), up5.i.f429974f.eq(1).and(up5.i.f429975g.eq(1)).and(up5.i.f429973e.in(types)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final long E(l75.k0 db6, java.lang.String tableName, java.lang.String str, java.util.List systemTypes) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(systemTypes, "systemTypes");
        com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429978j.eq(str).and(up5.i.f429973e.notIn(systemTypes))));
        if (valueFromStatement != null) {
            return valueFromStatement.getLong();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 E0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker), up5.i.f429972d.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final int F(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.winq.Expression b17 = ot0.d3.b(eq6, z17, new ot0.t1(j17));
            com.tencent.wcdb.orm.Field field = up5.i.f429977i;
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(b17.and(field.ge(j18)).and(field.le(j19))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getCount failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor F0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select limit = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(types))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final int G(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            com.tencent.wcdb.orm.Field field = up5.i.f429977i;
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(eq6.and(field.gt(j17)).and(field.le(j18))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getCountAfterCreateTimeBeforeEndTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor G0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, long j17, long j18, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429975g.eq(0);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select limit = select.where(eq6.and(field.le(j17)).and(field.ge(j18)).and(up5.i.f429973e.notIn(types)).and(up5.i.f429978j.eq(talker))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final int H(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            com.tencent.wcdb.winq.Expression b17 = ot0.d3.b(eq6, j17 > 0, new ot0.u1(j17));
            if (j18 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(b17, z17, new ot0.v1(j18))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getCountAfterStratTimeBeforeEndTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor H0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, long j17, long j18, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select limit = select.where(field.le(j17).and(field.gt(j18)).and(up5.i.f429973e.in(types)).and(up5.i.f429978j.eq(talker))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final int I(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName);
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.winq.Expression eq7 = up5.i.f429973e.eq(i17);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(eq6.and(eq7.and(field.ge(j17).and(field.le(j18))))).limit(j19));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    public final android.database.Cursor I0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select limit = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429975g.eq(0).and(up5.i.f429973e.in(types)).and(up5.i.f429978j.eq(talker))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long J(l75.k0 db6, java.lang.String TableNameByTalker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        try {
            up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429971c.eq(j17));
            if (wVar != null) {
                return wVar.f430097g;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getCreateTimeByLocalId failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final long J0(l75.k0 db6, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(up5.i.f429971c.max()).from(tableName));
            if (valueFromStatement != null) {
                return valueFromStatement.getLong();
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMaxMsgId failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final android.database.Cursor K(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select orderBy = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(str)).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final long K0(l75.k0 db6, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(up5.i.f429971c.max()).from(tableName));
            if (valueFromStatement != null) {
                return valueFromStatement.getLong();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMaxMsgIdFromTable failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor L(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(eq6.and(field.gt(j17))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 L0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.gt(j17)).and(up5.i.f429973e.notEq(10000).or(up5.i.f429975g.eq(2))), field.order(com.tencent.wcdb.winq.Order.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor M(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select offset = select.where(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.w1(j17, j18)), j18 == 0, new ot0.x1(j17))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17).offset(i18);
        kotlin.jvm.internal.o.f(offset, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), offset.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 M0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.lt(j17)).and(up5.i.f429973e.notEq(10000).or(up5.i.f429975g.eq(2))), field.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor N(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select offset = select.where(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.y1(j17, j18)), j18 == 0, new ot0.z1(j17))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17).offset(i18);
        kotlin.jvm.internal.o.f(offset, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), offset.getStatement(), null, null);
    }

    public final android.database.Cursor N0(l75.k0 db6, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.winq.Expression case_ = com.tencent.wcdb.winq.Expression.case_("contentSize");
        kotlin.jvm.internal.o.f(case_, "case_(...)");
        com.tencent.wcdb.winq.OrderingTerm orderingTerm = new com.tencent.wcdb.winq.OrderingTerm(case_);
        com.tencent.wcdb.winq.StatementSelect statementSelect = new com.tencent.wcdb.winq.StatementSelect();
        com.tencent.wcdb.orm.Field field = up5.i.f429973e;
        com.tencent.wcdb.winq.StatementSelect orderBy = statementSelect.select(field, com.tencent.wcdb.winq.Column.all().count(), up5.i.f429979k.length().sum().as("contentSize"), up5.i.f429982n.hex().length().divide(2).sum(), up5.i.f429981m.hex().length().divide(2).sum()).from(tableName).groupBy(field).orderBy(orderingTerm.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy, null, null);
    }

    public final android.database.Cursor O(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(eq6.and(field.gt(j17))).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor O0(l75.k0 db6, java.lang.String tableName, java.lang.String pattern) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(pattern, "pattern");
        try {
            com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
            com.tencent.wcdb.orm.Field field = up5.i.f429979k;
            com.tencent.wcdb.chaincall.Select where = select.where(field != null ? field.like(pattern) : null);
            kotlin.jvm.internal.o.f(where, "where(...)");
            return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMessagesByContentPattern failed: " + th6.getMessage());
            throw th6;
        }
    }

    public final android.database.Cursor P(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select where = select.where(ot0.d3.b(ot0.d3.b(eq6, j17 > 0, new ot0.a2(j17)), j18 > 0, new ot0.b2(j18)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor P0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select where = select.where(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.q2(j18)), j19 > 0, new ot0.r2(j19)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.Order order = com.tencent.wcdb.winq.Order.Asc;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(order)).limit(j17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(order));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor Q(l75.k0 db6, java.lang.String tableName, java.lang.String str, java.lang.String str2, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str).and(up5.i.f429973e).eq(j17);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        boolean z17 = false;
        if (str2 != null) {
            if (!(str2.length() == 0)) {
                z17 = true;
            }
        }
        com.tencent.wcdb.chaincall.Select orderBy = select.where(ot0.d3.b(eq6, z17, new ot0.c2(str2))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor Q0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select where = select.where(ot0.d3.b(ot0.d3.b(eq6, j18 > 0, new ot0.s2(j18)), j19 > 0, new ot0.t2(j19)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(j17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor R(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        com.tencent.wcdb.orm.Field field = up5.i.f429971c;
        com.tencent.wcdb.chaincall.Select limit = select.where(eq6.and(field.le(j17))).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(j18);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 R0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.getFirstObject(a17, ot0.d3.b(eq6, j17 > 0, new ot0.u2(j17)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i17);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor S(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select where = select.where(eq6.and(field.ge(j17)).and(field.le(j18)));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final android.database.Cursor S0(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int i17, java.lang.String prefix) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(cols, "cols");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        com.tencent.wcdb.orm.Field[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.tencent.wcdb.chaincall.Select where = r1(db6, table).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(c17, c17.length)).where(up5.i.f429973e.eq(i17).or(up5.i.f429980l.like(prefix.concat("%"))));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final android.database.Cursor T(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select limit = select.where(eq6.and(field.le(j18))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc)).limit(j17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final android.database.Cursor T0(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(cols, "cols");
        com.tencent.wcdb.orm.Field[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.tencent.wcdb.chaincall.Select where = r1(db6, table).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(c17, c17.length)).where(up5.i.f429973e.eq(i17));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final android.database.Cursor U(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select where = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(str).and(up5.i.f429975g.eq(0)).and(up5.i.f429974f.notEq(4)));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final int U0(l75.k0 db6, java.lang.String tableName, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429978j.eq(str).and(up5.i.f429973e.eq(i17))));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    public final int V(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName);
        com.tencent.wcdb.winq.Expression and = up5.i.f429978j.eq(str).and(up5.i.f429975g.eq(0)).and(up5.i.f429974f.notEq(4));
        kotlin.jvm.internal.o.f(and, "and(...)");
        com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(and, j17 > 0, new ot0.d2(j17))));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    public final int V0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, z17, new ot0.v2(j17))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgCountByMember failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor W(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select limit = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(str).and(up5.i.f429975g.eq(0)).and(up5.i.f429974f.notEq(4))).orderBy(up5.i.f429971c.order(com.tencent.wcdb.winq.Order.Desc)).limit(j17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final int W0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, j17 > 0, new ot0.w2(j17)).and(up5.i.f429975g.eq(1))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgCountBySelf failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor X(l75.k0 db6, java.lang.String tableName, java.lang.String unReadColumn) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(unReadColumn, "unReadColumn");
        com.tencent.wcdb.winq.StatementSelect statementSelect = new com.tencent.wcdb.winq.StatementSelect();
        com.tencent.wcdb.orm.Field field = up5.i.f429978j;
        com.tencent.wcdb.winq.StatementSelect groupBy = statementSelect.select(field, com.tencent.wcdb.winq.Column.all().count().as(unReadColumn)).from(tableName).where(up5.i.f429975g.eq(0).and(up5.i.f429974f.notEq(4))).groupBy(field);
        kotlin.jvm.internal.o.f(groupBy, "groupBy(...)");
        return tp5.a.f(ot0.d3.a(db6), groupBy, null, null);
    }

    public final long X0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, mmsgTable).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(mmsgTable).where(up5.i.f429978j.eq(talker).and(up5.i.f429973e.eq(i17))));
            if (valueFromStatement != null) {
                return valueFromStatement.getLong();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgCountByTalkerAndType failed: " + th6.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long Y(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
            com.tencent.wcdb.orm.Field field = up5.i.f429977i;
            up5.w wVar = (up5.w) r17.getFirstObject(a17, field.gt(j17).and(up5.i.f429978j.eq(talker)), field.order(com.tencent.wcdb.winq.Order.Asc), i17 - 1);
            return wVar != null ? wVar.f430097g : j17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getDownIncMsgCreateTime failed: " + th6.getMessage());
            return j17;
        }
    }

    public final int Y0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName);
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, j17 > 0, new ot0.x2(j17))));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long Z(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            up5.w wVar = (up5.w) r1(db6, mmsgTable).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc), 0L);
            if (wVar != null) {
                return wVar.f430097g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getFirstMessageCreateTime failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final int Z0(l75.k0 db6, java.lang.String tableName, java.lang.String str) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429978j.eq(str)));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    public final com.tencent.wcdb.winq.Expression a(java.lang.String str, java.lang.String str2, int i17, java.lang.Integer num) {
        switch (str.hashCode()) {
            case -1180128302:
                if (str.equals("isSend")) {
                    int hashCode = str2.hashCode();
                    if (hashCode == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429975g.notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429975g.le(i17);
                        }
                        return null;
                    }
                    if (hashCode == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429975g.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429975g.lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429975g.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429975g.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case -1065033442:
                if (str.equals("msgSeq")) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429989u.notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode2 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429989u.le(i17);
                        }
                        return null;
                    }
                    if (hashCode2 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429989u.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode2) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429989u.lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429989u.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429989u.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case -892481550:
                if (str.equals("status")) {
                    int hashCode3 = str2.hashCode();
                    if (hashCode3 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429974f.notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode3 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429974f.le(i17);
                        }
                        return null;
                    }
                    if (hashCode3 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429974f.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode3) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429974f.lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429974f.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429974f.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 3145580:
                if (str.equals("flag")) {
                    int intValue = num != null ? num.intValue() : 2;
                    int hashCode4 = str2.hashCode();
                    if (hashCode4 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429990v.bitAnd(intValue).notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode4 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429990v.bitAnd(intValue).le(i17);
                        }
                        return null;
                    }
                    if (hashCode4 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429990v.bitAnd(intValue).ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode4) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429990v.bitAnd(intValue).lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429990v.bitAnd(intValue).eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429990v.bitAnd(intValue).gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 3575610:
                if (str.equals("type")) {
                    int hashCode5 = str2.hashCode();
                    if (hashCode5 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429973e.notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode5 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429973e.le(i17);
                        }
                        return null;
                    }
                    if (hashCode5 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429973e.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode5) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429973e.lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429973e.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429973e.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            case 104191100:
                if (str.equals("msgId")) {
                    int hashCode6 = str2.hashCode();
                    if (hashCode6 == 1084) {
                        if (str2.equals("!=")) {
                            return up5.i.f429971c.notEq(i17);
                        }
                        return null;
                    }
                    if (hashCode6 == 1921) {
                        if (str2.equals("<=")) {
                            return up5.i.f429971c.le(i17);
                        }
                        return null;
                    }
                    if (hashCode6 == 1983) {
                        if (str2.equals(">=")) {
                            return up5.i.f429971c.ge(i17);
                        }
                        return null;
                    }
                    switch (hashCode6) {
                        case 60:
                            if (str2.equals("<")) {
                                return up5.i.f429971c.lt(i17);
                            }
                            return null;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            if (str2.equals("=")) {
                                return up5.i.f429971c.eq(i17);
                            }
                            return null;
                        case 62:
                            if (str2.equals(">")) {
                                return up5.i.f429971c.gt(i17);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
            default:
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown filter field: ".concat(str));
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 a0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r17.getFirstObject(a17, ot0.d3.b(eq6, j17 > 0, new ot0.e2(j17)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final int[] a1(l75.k0 db6, java.lang.String mmsgTable, int[] types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(types, "types");
        try {
            int[] iArr = new int[types.length + 1];
            int length = types.length;
            for (int i17 = 0; i17 < length; i17++) {
                com.tencent.wcdb.base.Value valueFromStatement = r1(db6, mmsgTable).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(mmsgTable).where(up5.i.f429973e.eq(types[i17])));
                iArr[i17] = valueFromStatement != null ? valueFromStatement.getInt() : 0;
            }
            com.tencent.wcdb.base.Value valueFromStatement2 = r1(db6, mmsgTable).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(mmsgTable));
            iArr[types.length] = valueFromStatement2 != null ? valueFromStatement2.getInt() : 0;
            return iArr;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgCountWithTypes failed: " + th6.getMessage());
            return new int[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            return ((up5.w) r1(db6, tableName).getFirstObject(up5.i.a(), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc), (long) i17)) != null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "checkMessageCountAtLeast failed: " + th6.getMessage());
            return false;
        }
    }

    public final android.database.Cursor b0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(field.gt(j17).and(up5.i.f429978j.eq(talker)).and(up5.i.f429973e.in(types))).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final android.database.Cursor b1(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List msgIdList, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msgIdList, "msgIdList");
        if (msgIdList.isEmpty()) {
            com.tencent.wcdb.chaincall.Select where = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429971c.eq(-1));
            kotlin.jvm.internal.o.f(where, "where(...)");
            return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
        }
        com.tencent.wcdb.chaincall.Select limit = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(talker).and(up5.i.f429971c.in(msgIdList))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final com.tencent.wcdb.orm.Field[] c(java.lang.String[] strArr) {
        com.tencent.wcdb.orm.Field field;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.lang.String lowerCase = str.toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.lang.String lowerCase2 = "msgId".toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase2)) {
                field = up5.i.f429971c;
            } else {
                java.lang.String lowerCase3 = "msgSvrId".toLowerCase();
                kotlin.jvm.internal.o.f(lowerCase3, "toLowerCase(...)");
                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase3)) {
                    field = up5.i.f429972d;
                } else {
                    java.lang.String lowerCase4 = "type".toLowerCase();
                    kotlin.jvm.internal.o.f(lowerCase4, "toLowerCase(...)");
                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase4)) {
                        field = up5.i.f429973e;
                    } else {
                        java.lang.String lowerCase5 = "status".toLowerCase();
                        kotlin.jvm.internal.o.f(lowerCase5, "toLowerCase(...)");
                        if (kotlin.jvm.internal.o.b(lowerCase, lowerCase5)) {
                            field = up5.i.f429974f;
                        } else {
                            java.lang.String lowerCase6 = "isSend".toLowerCase();
                            kotlin.jvm.internal.o.f(lowerCase6, "toLowerCase(...)");
                            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase6)) {
                                field = up5.i.f429975g;
                            } else {
                                java.lang.String lowerCase7 = "isShowTimer".toLowerCase();
                                kotlin.jvm.internal.o.f(lowerCase7, "toLowerCase(...)");
                                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase7)) {
                                    field = up5.i.f429976h;
                                } else {
                                    java.lang.String lowerCase8 = "createTime".toLowerCase();
                                    kotlin.jvm.internal.o.f(lowerCase8, "toLowerCase(...)");
                                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase8)) {
                                        field = up5.i.f429977i;
                                    } else {
                                        java.lang.String lowerCase9 = "talker".toLowerCase();
                                        kotlin.jvm.internal.o.f(lowerCase9, "toLowerCase(...)");
                                        if (kotlin.jvm.internal.o.b(lowerCase, lowerCase9)) {
                                            field = up5.i.f429978j;
                                        } else {
                                            java.lang.String lowerCase10 = "content".toLowerCase();
                                            kotlin.jvm.internal.o.f(lowerCase10, "toLowerCase(...)");
                                            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase10)) {
                                                field = up5.i.f429979k;
                                            } else {
                                                java.lang.String lowerCase11 = "imgPath".toLowerCase();
                                                kotlin.jvm.internal.o.f(lowerCase11, "toLowerCase(...)");
                                                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase11)) {
                                                    field = up5.i.f429980l;
                                                } else {
                                                    java.lang.String lowerCase12 = "reserved".toLowerCase();
                                                    kotlin.jvm.internal.o.f(lowerCase12, "toLowerCase(...)");
                                                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase12)) {
                                                        field = up5.i.f429981m;
                                                    } else {
                                                        java.lang.String lowerCase13 = "lvbuffer".toLowerCase();
                                                        kotlin.jvm.internal.o.f(lowerCase13, "toLowerCase(...)");
                                                        if (kotlin.jvm.internal.o.b(lowerCase, lowerCase13)) {
                                                            field = up5.i.f429982n;
                                                        } else {
                                                            java.lang.String lowerCase14 = "talkerId".toLowerCase();
                                                            kotlin.jvm.internal.o.f(lowerCase14, "toLowerCase(...)");
                                                            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase14)) {
                                                                field = up5.i.f429985q;
                                                            } else {
                                                                java.lang.String lowerCase15 = "transContent".toLowerCase();
                                                                kotlin.jvm.internal.o.f(lowerCase15, "toLowerCase(...)");
                                                                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase15)) {
                                                                    field = up5.i.f429983o;
                                                                } else {
                                                                    java.lang.String lowerCase16 = "transBrandWording".toLowerCase();
                                                                    kotlin.jvm.internal.o.f(lowerCase16, "toLowerCase(...)");
                                                                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase16)) {
                                                                        field = up5.i.f429984p;
                                                                    } else {
                                                                        java.lang.String lowerCase17 = "bizClientMsgId".toLowerCase();
                                                                        kotlin.jvm.internal.o.f(lowerCase17, "toLowerCase(...)");
                                                                        if (kotlin.jvm.internal.o.b(lowerCase, lowerCase17)) {
                                                                            field = up5.i.f429986r;
                                                                        } else {
                                                                            java.lang.String lowerCase18 = "bizChatId".toLowerCase();
                                                                            kotlin.jvm.internal.o.f(lowerCase18, "toLowerCase(...)");
                                                                            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase18)) {
                                                                                field = up5.i.f429987s;
                                                                            } else {
                                                                                java.lang.String lowerCase19 = "bizChatUserId".toLowerCase();
                                                                                kotlin.jvm.internal.o.f(lowerCase19, "toLowerCase(...)");
                                                                                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase19)) {
                                                                                    field = up5.i.f429988t;
                                                                                } else {
                                                                                    java.lang.String lowerCase20 = "msgSeq".toLowerCase();
                                                                                    kotlin.jvm.internal.o.f(lowerCase20, "toLowerCase(...)");
                                                                                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase20)) {
                                                                                        field = up5.i.f429989u;
                                                                                    } else {
                                                                                        java.lang.String lowerCase21 = "flag".toLowerCase();
                                                                                        kotlin.jvm.internal.o.f(lowerCase21, "toLowerCase(...)");
                                                                                        if (kotlin.jvm.internal.o.b(lowerCase, lowerCase21)) {
                                                                                            field = up5.i.f429990v;
                                                                                        } else {
                                                                                            java.lang.String lowerCase22 = "solitaireFoldInfo".toLowerCase();
                                                                                            kotlin.jvm.internal.o.f(lowerCase22, "toLowerCase(...)");
                                                                                            if (kotlin.jvm.internal.o.b(lowerCase, lowerCase22)) {
                                                                                                field = up5.i.f429991w;
                                                                                            } else {
                                                                                                java.lang.String lowerCase23 = "fromUsername".toLowerCase();
                                                                                                kotlin.jvm.internal.o.f(lowerCase23, "toLowerCase(...)");
                                                                                                if (kotlin.jvm.internal.o.b(lowerCase, lowerCase23)) {
                                                                                                    field = up5.i.f429993y;
                                                                                                } else {
                                                                                                    java.lang.String lowerCase24 = "toUsername".toLowerCase();
                                                                                                    kotlin.jvm.internal.o.f(lowerCase24, "toLowerCase(...)");
                                                                                                    if (kotlin.jvm.internal.o.b(lowerCase, lowerCase24)) {
                                                                                                        field = up5.i.f429994z;
                                                                                                    } else {
                                                                                                        java.lang.String lowerCase25 = "historyId".toLowerCase();
                                                                                                        kotlin.jvm.internal.o.f(lowerCase25, "toLowerCase(...)");
                                                                                                        if (!kotlin.jvm.internal.o.b(lowerCase, lowerCase25)) {
                                                                                                            com.tencent.mars.xlog.Log.w("MicroMsg.MessageDBProvider", "Unknown column name: " + str + ", using all fields instead");
                                                                                                            return null;
                                                                                                        }
                                                                                                        field = up5.i.f429992x;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            kotlin.jvm.internal.o.d(field);
            arrayList.add(field);
        }
        return (com.tencent.wcdb.orm.Field[]) arrayList.toArray(new com.tencent.wcdb.orm.Field[0]);
    }

    public final android.database.Cursor c0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select limit = select.where(field.lt(j17).and(up5.i.f429978j.eq(talker)).and(up5.i.f429973e.in(types))).orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final android.database.Cursor c1(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select limit = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429975g.eq(0).and(up5.i.f429978j.eq(talker)).and(up5.i.f429974f.notEq(6)).and(up5.i.f429973e.eq(i17))).orderBy(up5.i.f429971c.order(com.tencent.wcdb.winq.Order.Desc)).limit(i18);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:61:0x003c, B:7:0x004b, B:16:0x0059, B:17:0x0070, B:19:0x0076, B:22:0x00a5, B:26:0x00c1, B:28:0x00db, B:29:0x00f9, B:31:0x0113, B:32:0x0141, B:36:0x015e, B:38:0x0161, B:40:0x0178, B:42:0x0192, B:44:0x01b0, B:47:0x01cc, B:50:0x01d4, B:52:0x01e2), top: B:60:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor d(l75.k0 r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.z2.d(l75.k0, java.lang.String, java.lang.String, java.lang.String[]):android.database.Cursor");
    }

    public final int d0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String imgTypeStr) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(imgTypeStr, "imgTypeStr");
        com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(r26.n0.f0(imgTypeStr, new java.lang.String[]{","}, false, 0, 6, null)))));
        if (valueFromStatement != null) {
            return valueFromStatement.getInt();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d1(l75.k0 db6, java.lang.String table, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        try {
            up5.w wVar = (up5.w) r1(db6, table).getFirstObject(up5.i.a(), up5.i.f429972d.eq(j17));
            if (wVar != null) {
                return wVar.f430091a;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgLocalIdByMsgSvrId failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor e(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select offset = select.where(ot0.d3.b(eq6, j17 > 0, new ot0.o1(j17)).and(up5.i.f429973e.bitAnd(65535).in(types))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)).limit(i18).offset(i17);
        kotlin.jvm.internal.o.f(offset, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), offset.getStatement(), null, null);
    }

    public final android.database.Cursor e0(l75.k0 db6, java.lang.String tableName, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select where = r1(db6, tableName).prepareSelect().select(up5.i.f429980l).where(up5.i.f429973e.eq(i17));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String e1(l75.k0 db6, java.lang.String tableName, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            up5.w wVar = (up5.w) r1(db6, tableName).getFirstObject(up5.i.a(), up5.i.f429971c.eq(j17));
            if (wVar != null) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                g95.e0.k(f9Var, wVar);
                str = f9Var.G;
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getMsgSourceById failed: " + th6.getMessage());
            return "";
        }
    }

    public final android.database.Cursor f(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17, int i18, long j17, int i19) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression and = up5.i.f429978j.eq(talker).and(up5.i.f429973e.eq(i19));
        kotlin.jvm.internal.o.f(and, "and(...)");
        com.tencent.wcdb.chaincall.Select offset = select.where(ot0.d3.b(and, j17 > 0, new ot0.p1(j17))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)).limit(i18).offset(i17);
        kotlin.jvm.internal.o.f(offset, "offset(...)");
        return tp5.a.f(ot0.d3.a(db6), offset.getStatement(), null, null);
    }

    public final android.database.Cursor f0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select where = r1(db6, tableName).prepareSelect().select(up5.i.f429980l).where(up5.i.f429973e.in(types));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final int f1(l75.k0 db6, java.lang.String tableName, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        if (f9Var == null) {
            return 0;
        }
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429978j.eq(f9Var.Q0()).and(up5.i.f429975g.eq(0)).and(up5.i.f429971c.ge(f9Var.getMsgId()))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "deleteByMsgId failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor g(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, int i18, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select where = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429973e.in(types).and(up5.i.f429978j.eq(talker)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(i18).offset(i17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final int g0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.winq.StatementSelect statementSelect = new com.tencent.wcdb.winq.StatementSelect();
            boolean z17 = true;
            com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr = new com.tencent.wcdb.winq.ResultColumnConvertible[1];
            com.tencent.wcdb.orm.Field field = up5.i.f429971c;
            resultColumnConvertibleArr[0] = field != null ? field.count() : null;
            com.tencent.wcdb.winq.StatementSelect from = statementSelect.select(resultColumnConvertibleArr).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, z17, new ot0.f2(j17)).and(up5.i.f429973e.in(types))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getImgVideoAlbumMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 g1(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, mmsgTable);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429989u;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.lt(j17)), field.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final android.database.Cursor h(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select orderBy = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(types))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final int h0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, z17, new ot0.g2(j17)).and(up5.i.f429973e.in(types)).and(up5.i.f429977i.lt(j18))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getImgVideoCountEarlyThan failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor h1(l75.k0 db6, java.lang.String talker, java.lang.String tableName, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select where = r1(db6, tableName).prepareSelect().select(up5.i.f429979k).where(up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(types)));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final android.database.Cursor i(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select where = select.where(ot0.d3.b(eq6, j17 > 0, new ot0.q1(j17)).and(up5.i.f429973e.in(types)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(i18).offset(i17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final java.util.List i0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, boolean z17, long j17, long j18, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        if (j18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getImgVideoMessage: message not found");
            return new java.util.ArrayList();
        }
        com.tencent.wcdb.winq.Order order = z17 ? com.tencent.wcdb.winq.Order.Asc : com.tencent.wcdb.winq.Order.Desc;
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.Expression gt6 = z17 ? field.gt(j18) : field.lt(j18);
        kotlin.jvm.internal.o.d(gt6);
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression and = up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(types)).and(gt6);
        kotlin.jvm.internal.o.f(and, "and(...)");
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, ot0.d3.b(and, j17 > 0, new ot0.h2(j17)), up5.i.f429977i.order(order), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        return !z17 ? kz5.n0.V0(kz5.n0.x0(V0)) : V0;
    }

    public final int i1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            com.tencent.wcdb.orm.Field field = up5.i.f429977i;
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(eq6.and(field.lt(j17))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc)).offset(i17));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getPositionByCreateTime failed: " + th6.getMessage());
            return 0;
        }
    }

    public final android.database.Cursor j(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression and = up5.i.f429978j.eq(talker).and(up5.i.f429973e.in(types));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(and.and(field.ge(j17)).and(field.lt(j18))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final int j0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, java.util.List types, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            boolean z17 = true;
            com.tencent.wcdb.winq.StatementSelect from = new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(TableNameByTalker);
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            if (j17 <= 0) {
                z17 = false;
            }
            com.tencent.wcdb.base.Value valueFromStatement = r17.getValueFromStatement(from.where(ot0.d3.b(eq6, z17, new ot0.i2(j17)).and(up5.i.f429973e.in(types))));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getImgVideoMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    public final long j1(l75.k0 db6, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName));
            if (valueFromStatement != null) {
                return valueFromStatement.getLong();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getTotalMsgCount failed: " + th6.getMessage());
            return 0L;
        }
    }

    public final android.database.Cursor k(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17, long j18, java.util.List mediaTypes) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(mediaTypes, "mediaTypes");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select where = select.where(eq6.and(field.ge(j17)).and(field.le(j18)).and(up5.i.f429973e.bitAnd(65535).in(mediaTypes)));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final android.database.Cursor k0(l75.k0 db6, java.lang.String tableName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(str);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select where = select.where(ot0.d3.b(eq6, j18 > 0, new ot0.j2(j18)));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.StatementSelect statement = where.orderBy(field.order(com.tencent.wcdb.winq.Order.Desc)).limit(j17).getStatement();
        kotlin.jvm.internal.o.f(statement, "getStatement(...)");
        com.tencent.wcdb.chaincall.Select orderBy = ot0.d3.a(db6).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).from(new com.tencent.wcdb.winq.Expression(statement).getDescription()).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            com.tencent.wcdb.winq.Expression b17 = ot0.d3.b(eq6, j17 > 0, new ot0.y2(j17));
            com.tencent.wcdb.orm.Field field = up5.i.f429977i;
            up5.w wVar = (up5.w) r17.getFirstObject(a17, b17.and(field.lt(j18)), field.order(com.tencent.wcdb.winq.Order.Desc), i17 - 1);
            return wVar != null ? wVar.f430097g : j18;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getUpIncMsgCreateTime failed: " + th6.getMessage());
            return j18;
        }
    }

    public final java.util.List l(l75.k0 db6, java.lang.String tableName) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        java.util.List<up5.w> allObjects = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).allObjects();
        kotlin.jvm.internal.o.f(allObjects, "allObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return arrayList;
    }

    public final android.database.Cursor l0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, java.lang.String member, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(member, "member");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select limit = select.where(ot0.d3.b(eq6, j17 > 0, new ot0.k2(j17)).and(up5.i.f429979k.like(member.concat("%")))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 l1(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, field.lt(j17).and(up5.i.f429975g.eq(0)).and(up5.i.f429978j.eq(talker)), field.order(com.tencent.wcdb.winq.Order.Desc), i17 - 1);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final java.util.List m(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, eq6.and(field.gt(j17)).and(up5.i.f429973e.notEq(10000).or(up5.i.f429975g.eq(2))), field.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor m0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        com.tencent.wcdb.chaincall.Select limit = select.where(ot0.d3.b(eq6, j17 > 0, new ot0.l2(j17)).and(up5.i.f429975g.eq(1))).orderBy(up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc)).limit(i17);
        kotlin.jvm.internal.o.f(limit, "limit(...)");
        return tp5.a.f(ot0.d3.a(db6), limit.getStatement(), null, null);
    }

    public final boolean m1(l75.k0 db6, java.lang.String tableName, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429972d.eq(j17)));
            return (valueFromStatement != null ? valueFromStatement.getInt() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "hasSvrId failed: " + th6.getMessage());
            return false;
        }
    }

    public final java.util.List n(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, eq6.and(field.gt(j17)), field.order(com.tencent.wcdb.winq.Order.Asc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List n0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, eq6.and(field.gt(j17).and(up5.i.f429973e.in(types))), field.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n1(l75.k0 db6, java.lang.String tableName, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            return ((up5.w) r1(db6, tableName).getFirstObject(up5.i.f429972d.eq(j17))) != null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "hasSvrIdFast failed: " + th6.getMessage());
            return false;
        }
    }

    public final java.util.List o(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, eq6.and(field.lt(j17)).and(up5.i.f429973e.notEq(10000).or(up5.i.f429975g.eq(2))), field.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final android.database.Cursor o0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
        com.tencent.wcdb.chaincall.Select select = r1(db6, tableName).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(eq6.and(field.ge(currentTimeMillis).and(up5.i.f429973e.in(types)))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }

    public final long o1(l75.k0 db6, java.lang.String tableName, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(msg, "msg");
        up5.w wVar = new up5.w();
        try {
            com.tencent.wcdb.orm.Field[] l17 = g95.e0.l(wVar, msg.convertTo());
            com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
            if (l17 == null) {
                l17 = up5.i.a();
            }
            r17.insertOrReplaceObject(wVar, l17);
            return wVar.f430091a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "insert failed: " + th6.getMessage());
            return -2L;
        }
    }

    public final android.database.Cursor p(l75.k0 db6, java.lang.String table, java.lang.String[] cols, int[] types, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        kotlin.jvm.internal.o.g(cols, "cols");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.orm.Field[] c17 = c(cols);
        if (c17 == null) {
            c17 = up5.i.a();
        }
        com.tencent.wcdb.chaincall.Select select = r1(db6, table).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(c17, c17.length));
        com.tencent.wcdb.winq.Expression in6 = up5.i.f429973e.in(kz5.z.x0(types));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select where = select.where(in6.and(field.gt(j17)).and(field.lt(j18)));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    public final java.util.List p0(l75.k0 db6, java.lang.String tableName, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(types, "types");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, field.gt(currentTimeMillis).and(up5.i.f429973e.in(types)), field.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final boolean p1(l75.k0 db6, java.lang.String tableName, java.lang.String msgId, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(msgId, "msgId");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, tableName).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(tableName).where(up5.i.f429973e.eq(i17).and(up5.i.f429971c.eq(msgId))));
            return (valueFromStatement != null ? valueFromStatement.getInt() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "isMsgExistByIdAndType failed: " + th6.getMessage());
            return false;
        }
    }

    public final android.database.Cursor q(l75.k0 db6, java.lang.String table, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        com.tencent.wcdb.chaincall.Select where = r1(db6, table).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24)).where(up5.i.f429977i.lt(j17));
        kotlin.jvm.internal.o.f(where, "where(...)");
        return tp5.a.f(ot0.d3.a(db6), where.getStatement(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 q0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker).and(up5.i.f429990v.bitAnd(2).eq(1)), up5.i.f429989u.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final boolean q1(l75.k0 db6, java.lang.String table, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, table).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(table).where(up5.i.f429971c.eq(j17)));
            return (valueFromStatement != null ? valueFromStatement.getInt() : 0) > 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "isMsgLocalIdExist failed: " + th6.getMessage());
            return false;
        }
    }

    public final int r(l75.k0 db6, java.lang.String mmsgTable) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        try {
            com.tencent.wcdb.base.Value valueFromStatement = r1(db6, mmsgTable).getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(com.tencent.wcdb.winq.Column.all().count()).from(mmsgTable));
            if (valueFromStatement != null) {
                return valueFromStatement.getInt();
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getAllMsgCount failed: " + th6.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, mmsgTable);
            com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            up5.w wVar = (up5.w) r17.getFirstObject(a17, ot0.d3.b(eq6, j17 > 0, new ot0.m2(j17)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), 0L);
            if (wVar != null) {
                return wVar.f430097g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getLastMessageCreateTime failed: " + th6.getMessage());
            return -1L;
        }
    }

    public final com.tencent.wcdb.core.Table r1(l75.k0 k0Var, java.lang.String str) {
        com.tencent.wcdb.core.Table table = ot0.d3.a(k0Var).getTable(str, up5.i.f429970b);
        kotlin.jvm.internal.o.f(table, "getTable(...)");
        return table;
    }

    public final java.util.ArrayList s(l75.k0 db6, java.lang.String mmsgTable) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 172800000;
        com.tencent.wcdb.core.Table r17 = r1(db6, mmsgTable);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, field.ge(currentTimeMillis).and(up5.i.f429974f.eq(5)).and(up5.i.f429975g.eq(1)), field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return new java.util.ArrayList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
            com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
            com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
            kotlin.jvm.internal.o.f(eq6, "eq(...)");
            up5.w wVar = (up5.w) r17.getFirstObject(a17, ot0.d3.b(eq6, j17 > 0, new ot0.n2(j17)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), 0L);
            if (wVar != null) {
                return wVar.f430097g;
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getLastMessageCreateTimeFixTableName failed: " + th6.getMessage());
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:6:0x000b, B:8:0x003d, B:9:0x0041, B:11:0x005f, B:13:0x0091, B:14:0x0098, B:16:0x009e, B:22:0x00c2, B:24:0x00fb, B:28:0x0109, B:37:0x00c6, B:41:0x00cf, B:45:0x00d8, B:49:0x00e1, B:53:0x00ea, B:57:0x00f3, B:64:0x0115, B:68:0x011f, B:70:0x0126, B:74:0x012b, B:75:0x0136, B:77:0x013c, B:81:0x0152), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.wcdb.winq.Expression s1(java.lang.String r17, com.tencent.wcdb.winq.Expression r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.z2.s1(java.lang.String, com.tencent.wcdb.winq.Expression):com.tencent.wcdb.winq.Expression");
    }

    public final java.util.List t(l75.k0 db6, java.lang.String TableNameByTalker, java.util.List msgIdList) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(msgIdList, "msgIdList");
        if (msgIdList.isEmpty()) {
            return new java.util.ArrayList();
        }
        try {
            java.util.Collection<up5.w> allObjects = r1(db6, TableNameByTalker).getAllObjects(up5.i.a(), up5.i.f429971c.in(msgIdList), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc));
            kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
            for (up5.w wVar : allObjects) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                kotlin.jvm.internal.o.d(wVar);
                g95.e0.k(f9Var, wVar);
                arrayList.add(f9Var);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((com.tencent.mm.storage.f9) obj).k2()) {
                    arrayList2.add(obj);
                }
            }
            return kz5.n0.V0(arrayList2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getAppMsgFileList failed: " + th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    public final java.util.List t0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.Collection<up5.w> allObjects = r1(db6, TableNameByTalker).getAllObjects(up5.i.a(), up5.i.f429978j.eq(talker), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List t1(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : new r26.t("\\s+and\\s+|\\s+AND\\s+").g(str, 0)) {
            if (!r26.n0.N(str2)) {
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*&\\s*(\\d+)\\s*(!=|>=|<=|=|<|>)\\s*(-?\\d+)\\s*$");
                kotlin.jvm.internal.o.f(compile, "compile(...)");
                java.lang.String input = r26.n0.u0(str2).toString();
                kotlin.jvm.internal.o.g(input, "input");
                java.util.regex.Matcher matcher = compile.matcher(input);
                kotlin.jvm.internal.o.f(matcher, "matcher(...)");
                r26.m a17 = r26.u.a(matcher, 0, input);
                if (a17 != null) {
                    r26.q qVar = (r26.q) a17;
                    java.lang.String str3 = (java.lang.String) qVar.a().get(1);
                    java.lang.Integer h17 = r26.h0.h((java.lang.String) qVar.a().get(2));
                    java.lang.String str4 = (java.lang.String) qVar.a().get(3);
                    java.lang.Integer h18 = r26.h0.h((java.lang.String) qVar.a().get(4));
                    if (h17 != null && h18 != null) {
                        arrayList.add(new ot0.n1(str3, str4, h18.intValue(), false, h17, 8, null));
                    }
                }
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*(!=|>=|<=|=|<|>)\\s*(-?\\d+)\\s*$");
                kotlin.jvm.internal.o.f(compile2, "compile(...)");
                java.lang.String input2 = r26.n0.u0(str2).toString();
                kotlin.jvm.internal.o.g(input2, "input");
                java.util.regex.Matcher matcher2 = compile2.matcher(input2);
                kotlin.jvm.internal.o.f(matcher2, "matcher(...)");
                r26.m a18 = r26.u.a(matcher2, 0, input2);
                if (a18 != null) {
                    r26.q qVar2 = (r26.q) a18;
                    java.lang.String str5 = (java.lang.String) qVar2.a().get(1);
                    java.lang.String str6 = (java.lang.String) qVar2.a().get(2);
                    java.lang.Integer h19 = r26.h0.h((java.lang.String) qVar2.a().get(3));
                    if (h19 != null) {
                        arrayList.add(new ot0.n1(str5, str6, h19.intValue(), false, null, 24, null));
                    }
                }
            }
        }
        return arrayList;
    }

    public final java.util.List u(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17, long j18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        java.util.Collection<up5.w> allObjects = r17.getAllObjects(a17, eq6.and(field.gt(j17)).and(field.le(j18)), field.order(com.tencent.wcdb.winq.Order.Desc));
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final java.util.List u0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, int i17, int i18) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.Collection<up5.w> allObjects = r1(db6, TableNameByTalker).getAllObjects(up5.i.a(), up5.i.f429975g.eq(i17).and(up5.i.f429978j.eq(talker)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i18);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final boolean u1(l75.k0 db6, java.lang.String tableName, up5.w wVar, com.tencent.wcdb.orm.Field[] fieldArr, long j17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        try {
            com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
            if (fieldArr == null) {
                fieldArr = up5.i.a();
            }
            r17.updateObject((com.tencent.wcdb.core.Table) wVar, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.Table>[]) fieldArr, up5.i.f429971c.eq(j17));
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "updateWithMsgId failed: " + th6.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 v(l75.k0 db6, java.lang.String tableName, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, tableName);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.lt(j17)), field.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 v0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        kotlin.jvm.internal.o.f(eq6, "eq(...)");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), ot0.d3.b(ot0.d3.b(eq6, j17 > 0, new ot0.o2(j17)), j18 != com.tencent.wcdb.core.Database.DictDefaultMatchValue, new ot0.p2(j18)), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc));
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 w(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429989u;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.lt(j17)), field.order(com.tencent.wcdb.winq.Order.Desc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 w0(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.wcdb.core.Table r17 = r1(db6, TableNameByTalker);
        com.tencent.wcdb.orm.Field[] a17 = up5.i.a();
        com.tencent.wcdb.winq.Expression eq6 = up5.i.f429978j.eq(talker);
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        up5.w wVar = (up5.w) r17.getFirstObject(a17, eq6.and(field.gt(j17)), field.order(com.tencent.wcdb.winq.Order.Asc), 0L);
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    public final java.util.List x(l75.k0 db6, java.lang.String tableName, long j17, long j18, int i17, boolean z17, java.util.List bizAppMsgTypes) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(bizAppMsgTypes, "bizAppMsgTypes");
        com.tencent.wcdb.winq.Expression and = up5.i.f429973e.in(bizAppMsgTypes).and(up5.i.f429975g.eq(z17 ? 1 : 0));
        kotlin.jvm.internal.o.f(and, "and(...)");
        if (j18 > 0) {
            and = and.and(up5.i.f429977i.lt(j18));
            kotlin.jvm.internal.o.f(and, "and(...)");
        }
        if (j17 > 0) {
            and = and.and(up5.i.f429977i.gt(j17));
            kotlin.jvm.internal.o.f(and, "and(...)");
        }
        java.util.List<T> allObjects = r1(db6, tableName).getAllObjects(up5.i.a(), and, up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (T t17 : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(t17);
            g95.e0.k(f9Var, t17);
            arrayList.add(f9Var);
        }
        return kz5.n0.V0(arrayList);
    }

    public final com.tencent.mm.storage.f9[] x0(l75.k0 db6, java.lang.String tableName, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.Collection<up5.w> allObjects = r1(db6, tableName).getAllObjects(up5.i.a(), up5.i.f429978j.eq(talker), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), i17);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
        for (up5.w wVar : allObjects) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            kotlin.jvm.internal.o.d(wVar);
            g95.e0.k(f9Var, wVar);
            arrayList.add(f9Var);
        }
        return (com.tencent.mm.storage.f9[]) kz5.n0.x0(arrayList).toArray(new com.tencent.mm.storage.f9[0]);
    }

    public final java.util.LinkedList y(l75.k0 db6, java.lang.String tableName, java.lang.String talker, java.lang.String bizClientMsgId) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(bizClientMsgId, "bizClientMsgId");
        try {
            java.util.Collection<up5.w> allObjects = r1(db6, tableName).getAllObjects(up5.i.f429978j.eq(talker).and(up5.i.f429986r.eq(bizClientMsgId)));
            kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
            for (up5.w wVar : allObjects) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                kotlin.jvm.internal.o.d(wVar);
                g95.e0.k(f9Var, wVar);
                arrayList.add(f9Var);
            }
            return new java.util.LinkedList(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MessageDBProvider", e17, "getByBizClientMsgId error: %s", e17.getMessage());
            return new java.util.LinkedList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long y0(l75.k0 db6, java.lang.String mmsgTable, java.lang.String talker) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(mmsgTable, "mmsgTable");
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            up5.w wVar = (up5.w) r1(db6, mmsgTable).getFirstObject(up5.i.a(), up5.i.f429978j.eq(talker), up5.i.f429989u.order(com.tencent.wcdb.winq.Order.Desc), 0L);
            if (wVar != null) {
                return wVar.f430109s;
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getLastMsgSeq failed: " + th6.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 z(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        up5.w wVar = (up5.w) r1(db6, TableNameByTalker).getFirstObject(up5.i.a(), up5.i.f429977i.eq(j17).and(up5.i.f429978j.eq(talker)));
        if (wVar != null) {
            f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
        } else {
            f9Var = new com.tencent.mm.storage.f9();
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.storage.f9 z0(l75.k0 db6, java.lang.String tableName, java.lang.String filterSql) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(filterSql, "filterSql");
        try {
            up5.w wVar = (up5.w) r1(db6, tableName).getFirstObject(up5.i.a(), s1(filterSql, null), up5.i.f429977i.order(com.tencent.wcdb.winq.Order.Desc), 0L);
            if (wVar == null) {
                return new com.tencent.mm.storage.f9();
            }
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            g95.e0.k(f9Var, wVar);
            return f9Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "getLastMsgWithFilterSql failed: " + th6.getMessage());
            return new com.tencent.mm.storage.f9();
        }
    }

    public final android.database.Cursor g(l75.k0 db6, java.lang.String TableNameByTalker, java.lang.String talker, long j17, long j18, java.util.List types) {
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(TableNameByTalker, "TableNameByTalker");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(types, "types");
        com.tencent.wcdb.chaincall.Select select = r1(db6, TableNameByTalker).prepareSelect().select((com.tencent.wcdb.orm.Field[]) java.util.Arrays.copyOf(up5.i.a(), 24));
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.chaincall.Select orderBy = select.where(field.ge(j17).and(field.lt(j18)).and(up5.i.f429973e.in(types)).and(up5.i.f429978j.eq(talker))).orderBy(field.order(com.tencent.wcdb.winq.Order.Asc));
        kotlin.jvm.internal.o.f(orderBy, "orderBy(...)");
        return tp5.a.f(ot0.d3.a(db6), orderBy.getStatement(), null, null);
    }
}
