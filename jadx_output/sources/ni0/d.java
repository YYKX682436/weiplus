package ni0;

/* loaded from: classes12.dex */
public class d implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337204a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.d f337205b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337206c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337207d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337208e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337209f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337210g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337211h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337212i;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337204a = binding;
        ni0.d dVar = new ni0.d();
        f337205b = dVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_LOCALID, dVar, 1, false, false);
        f337206c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, columnType));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("tid", dVar, 2, false, false);
        f337207d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Text));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("commentScene", dVar, 3, false, false);
        f337208e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("fromType", dVar, 4, false, false);
        f337209f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("expiredTime", dVar, 5, false, false);
        f337210g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("feedSource", dVar, 6, false, false);
        f337211h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("funcFlag", dVar, 7, false, false);
        f337212i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType));
        binding.addIndex("_localId_expiredTime_index", false, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field, field5));
        binding.addTableConstraint(new com.tencent.wcdb.winq.TableConstraint().primaryKey().indexedBy(field2, field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337206c, f337207d, f337208e, f337209f, f337210g, f337211h, f337212i};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337204a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        ni0.j jVar = (ni0.j) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(jVar.f337234a, i17);
                return;
            case 2:
                java.lang.String str = jVar.f337235b;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                preparedStatement.bindInteger(jVar.f337236c, i17);
                return;
            case 4:
                preparedStatement.bindInteger(jVar.f337237d, i17);
                return;
            case 5:
                preparedStatement.bindInteger(jVar.f337238e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(jVar.f337239f, i17);
                return;
            case 7:
                preparedStatement.bindInteger(jVar.f337240g, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return ni0.j.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        ni0.j jVar = (ni0.j) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    jVar.f337234a = preparedStatement.getLong(i17);
                    break;
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        jVar.f337235b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    jVar.f337236c = preparedStatement.getInt(i17);
                    break;
                case 4:
                    jVar.f337237d = preparedStatement.getInt(i17);
                    break;
                case 5:
                    jVar.f337238e = preparedStatement.getLong(i17);
                    break;
                case 6:
                    jVar.f337239f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    jVar.f337240g = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return jVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
