package tq;

/* loaded from: classes12.dex */
public class a implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f421177a;

    /* renamed from: b, reason: collision with root package name */
    public static final tq.a f421178b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421179c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421180d;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f421177a = binding;
        tq.a aVar = new tq.a();
        f421178b = aVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("bizId", aVar, 1, false, true);
        f421179c = field;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Integer);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("shopHistoryNextKey", aVar, 2, false, false);
        f421180d = field2;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Text);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef2);
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f421179c, f421180d};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f421177a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        tq.c cVar = (tq.c) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(cVar.f421194a, i17);
            return;
        }
        if (fieldId != 2) {
            return;
        }
        java.lang.String str = cVar.f421195b;
        if (str != null) {
            preparedStatement.bindText(str, i17);
        } else {
            preparedStatement.bindNull(i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return tq.c.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        tq.c cVar = (tq.c) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                cVar.f421194a = preparedStatement.getInt(i17);
            } else if (fieldId == 2 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                cVar.f421195b = preparedStatement.getText(i17);
            }
            i17++;
        }
        return cVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
