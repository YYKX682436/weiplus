package up5;

/* loaded from: classes12.dex */
public class k implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f430003a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.k f430004b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430005c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430006d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430007e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f430003a = binding;
        up5.k kVar = new up5.k();
        f430004b = kVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("groupId", kVar, 1, false, true);
        f430005c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("talker", kVar, 2, false, false);
        f430006d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("createTime", kVar, 3, false, false);
        f430007e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, com.tencent.wcdb.winq.ColumnType.Integer));
        binding.addIndex("IndexTalker_Type", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2, field));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f430005c, f430006d, f430007e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f430003a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.y yVar = (up5.y) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            java.lang.String str = yVar.f430121a;
            if (str != null) {
                preparedStatement.bindText(str, i17);
                return;
            } else {
                preparedStatement.bindNull(i17);
                return;
            }
        }
        if (fieldId != 2) {
            if (fieldId != 3) {
                return;
            }
            preparedStatement.bindInteger(yVar.f430123c, i17);
        } else {
            java.lang.String str2 = yVar.f430122b;
            if (str2 != null) {
                preparedStatement.bindText(str2, i17);
            } else {
                preparedStatement.bindNull(i17);
            }
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.y.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.y yVar = (up5.y) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId == 3) {
                        yVar.f430123c = preparedStatement.getLong(i17);
                    }
                } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                    yVar.f430122b = preparedStatement.getText(i17);
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                yVar.f430121a = preparedStatement.getText(i17);
            }
            i17++;
        }
        return yVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
