package up5;

/* loaded from: classes12.dex */
public class m implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f430013a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.m f430014b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430015c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430016d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430017e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f430013a = binding;
        up5.m mVar = new up5.m();
        f430014b = mVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("payId", mVar, 1, false, true);
        f430015c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("msgId", mVar, 2, false, false);
        f430016d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Integer));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("talker", mVar, 3, false, false);
        f430017e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f430015c, f430016d, f430017e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f430013a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.a0 a0Var = (up5.a0) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            java.lang.String str = a0Var.f429888a;
            if (str != null) {
                preparedStatement.bindText(str, i17);
                return;
            } else {
                preparedStatement.bindNull(i17);
                return;
            }
        }
        if (fieldId == 2) {
            java.lang.Long l17 = a0Var.f429889b;
            if (l17 != null) {
                preparedStatement.bindInteger(l17, i17);
                return;
            } else {
                preparedStatement.bindNull(i17);
                return;
            }
        }
        if (fieldId != 3) {
            return;
        }
        java.lang.String str2 = a0Var.f429890c;
        if (str2 != null) {
            preparedStatement.bindText(str2, i17);
        } else {
            preparedStatement.bindNull(i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.a0.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.a0 a0Var = (up5.a0) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId == 3 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        a0Var.f429890c = preparedStatement.getText(i17);
                    }
                } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                    a0Var.f429889b = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                a0Var.f429888a = preparedStatement.getText(i17);
            }
            i17++;
        }
        return a0Var;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
