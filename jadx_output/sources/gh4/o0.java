package gh4;

/* loaded from: classes8.dex */
public final class o0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f271945e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.multitask.model.MultiTaskInfo.A, "TaskBarInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f271946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.multitask.model.MultiTaskInfo.A, "TaskBarInfo", null);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f271946d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean update(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, java.lang.String... keys) {
        byte[] bArr;
        r45.lr4 v07;
        kotlin.jvm.internal.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update:");
        java.lang.String str = null;
        sb6.append(multiTaskInfo != null ? java.lang.Integer.valueOf(multiTaskInfo.field_type) : null);
        sb6.append(' ');
        sb6.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
        sb6.append(' ');
        if (multiTaskInfo != null && (v07 = multiTaskInfo.v0()) != null) {
            str = v07.getString(1);
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarStorage", sb6.toString());
        if (((multiTaskInfo == null || (bArr = multiTaskInfo.field_data) == null) ? 0 : bArr.length) <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskBarStorage", "empty data!");
        }
        if (multiTaskInfo == null) {
            return false;
        }
        boolean updateNotify = updateNotify(multiTaskInfo, false, new java.lang.String[0]);
        doNotify("single", 3, multiTaskInfo);
        return updateNotify;
    }

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo y0(java.lang.String id6) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        kotlin.jvm.internal.o.g(id6, "id");
        android.database.Cursor B = this.f271946d.B("SELECT * FROM TaskBarInfo WHERE id = ?;", new java.lang.String[]{id6});
        if (B.moveToNext()) {
            multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.convertFrom(B);
        } else {
            multiTaskInfo = null;
        }
        B.close();
        return multiTaskInfo;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.plugin.multitask.model.MultiTaskInfo item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarStorage", "insert:" + item.field_type + ' ' + item.field_id + ' ' + item.v0().getString(1));
        byte[] bArr = item.field_data;
        if ((bArr != null ? bArr.length : 0) <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskBarStorage", "empty data!");
        }
        boolean insertNotify = insertNotify(item, false);
        doNotify("single", 2, item);
        return insertNotify;
    }
}
