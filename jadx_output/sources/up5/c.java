package up5;

/* loaded from: classes12.dex */
public class c implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429909a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.c f429910b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429911c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429912d;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429909a = binding;
        up5.c cVar = new up5.c();
        f429910b = cVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("configId", cVar, 1, false, true);
        f429911c = field;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Integer);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("value", cVar, 2, false, false);
        f429912d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Text));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429911c, f429912d};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429909a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.q qVar = (up5.q) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(qVar.f430043a, i17);
            return;
        }
        if (fieldId != 2) {
            return;
        }
        java.lang.String str = qVar.f430044b;
        if (str != null) {
            preparedStatement.bindText(str, i17);
        } else {
            preparedStatement.bindNull(i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.q.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.q qVar = (up5.q) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                qVar.f430043a = preparedStatement.getInt(i17);
            } else if (fieldId == 2 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                qVar.f430044b = preparedStatement.getText(i17);
            }
            i17++;
        }
        return qVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
