package ni0;

/* loaded from: classes12.dex */
public class e implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337213a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.e f337214b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337215c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337216d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337217e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337213a = binding;
        ni0.e eVar = new ni0.e();
        f337214b = eVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("musicPath", eVar, 1, false, false);
        f337215c = field;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Text));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("status", eVar, 2, false, false);
        f337216d = field2;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("totalLen", eVar, 3, false, false);
        f337217e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        binding.addTableConstraint(new com.tencent.wcdb.winq.TableConstraint().primaryKey().indexedBy(field, field2, field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337215c, f337216d, f337217e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337213a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        ni0.k kVar = (ni0.k) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            java.lang.String str = kVar.f337241a;
            if (str != null) {
                preparedStatement.bindText(str, i17);
                return;
            } else {
                preparedStatement.bindNull(i17);
                return;
            }
        }
        if (fieldId == 2) {
            preparedStatement.bindInteger(kVar.f337242b, i17);
        } else {
            if (fieldId != 3) {
                return;
            }
            preparedStatement.bindInteger(kVar.f337243c, i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return ni0.k.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        ni0.k kVar = (ni0.k) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId != 1) {
                if (fieldId == 2) {
                    kVar.f337242b = preparedStatement.getInt(i17);
                } else if (fieldId == 3) {
                    kVar.f337243c = preparedStatement.getLong(i17);
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                kVar.f337241a = preparedStatement.getText(i17);
            }
            i17++;
        }
        return kVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
