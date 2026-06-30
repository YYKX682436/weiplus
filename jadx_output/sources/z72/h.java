package z72;

/* loaded from: classes12.dex */
public class h extends l75.s0 implements o72.v4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f470565d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f470566e;

    public h(com.tencent.wcdb.core.Database database) {
        this.f470565d = database;
        this.f470566e = database.getTable("FavSearchInfo", up5.g.f429958b);
    }

    public static up5.u m0(dm.p3 p3Var) {
        if (p3Var == null) {
            return null;
        }
        up5.u uVar = new up5.u();
        uVar.f430083a = p3Var.field_localId;
        uVar.f430084b = p3Var.field_content;
        uVar.f430085c = p3Var.field_tagContent;
        uVar.f430086d = p3Var.field_time;
        uVar.f430087e = p3Var.field_type;
        uVar.f430088f = p3Var.field_subtype;
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.v4
    public dm.p3 F(long j17) {
        try {
            up5.u uVar = (up5.u) this.f470566e.getFirstObject(up5.g.f429959c.eq(j17));
            if (uVar == null) {
                return null;
            }
            o72.a3 a3Var = new o72.a3();
            a3Var.field_localId = uVar.f430083a;
            a3Var.field_content = uVar.f430084b;
            a3Var.field_tagContent = uVar.f430085c;
            a3Var.field_time = uVar.f430086d;
            a3Var.field_type = uVar.f430087e;
            a3Var.field_subtype = uVar.f430088f;
            return a3Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x01f1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0371 A[Catch: Exception -> 0x0381, TryCatch #0 {Exception -> 0x0381, blocks: (B:59:0x0356, B:61:0x0366, B:66:0x0379, B:68:0x0371, B:70:0x0375, B:71:0x037c, B:63:0x036b), top: B:58:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037c A[Catch: Exception -> 0x0381, TRY_LEAVE, TryCatch #0 {Exception -> 0x0381, blocks: (B:59:0x0356, B:61:0x0366, B:66:0x0379, B:68:0x0371, B:70:0x0375, B:71:0x037c, B:63:0x036b), top: B:58:0x0356 }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0373 -> B:51:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0375 -> B:51:0x0379). Please report as a decompilation issue!!! */
    @Override // o72.v4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List I7(java.util.List r27, java.util.List r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z72.h.I7(java.util.List, java.util.List, java.util.List):java.util.List");
    }

    @Override // o72.v4
    public boolean J5(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        try {
            com.tencent.wcdb.core.Table table = this.f470566e;
            com.tencent.wcdb.winq.Expression count = com.tencent.wcdb.winq.Column.all().count();
            com.tencent.wcdb.orm.Field field = up5.g.f429961e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("%");
            sb6.append(str);
            sb6.append("%");
            return table.getValue(count, field.like(sb6.toString())).getInt() > 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.v4
    public boolean Md(dm.p3 p3Var) {
        try {
            this.f470566e.insertObject(m0(p3Var));
            doNotify(java.lang.Long.toString(p3Var.field_localId), 2, p3Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.v4
    public java.util.List V7() {
        try {
            return this.f470566e.getOneColumnLong(up5.g.f429959c, up5.g.f429961e.notEq(""));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.v4
    public void m3(long j17) {
        try {
            this.f470566e.deleteObjects(up5.g.f429959c.eq(j17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.v4
    public boolean q7(dm.p3 p3Var, java.lang.String... strArr) {
        try {
            tp5.a.i(m0(p3Var), this.f470566e, strArr);
            doNotify(java.lang.Long.toString(p3Var.field_localId), 3, p3Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }
}
