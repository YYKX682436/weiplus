package mi0;

/* loaded from: classes12.dex */
public class a implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f326496a;

    /* renamed from: b, reason: collision with root package name */
    public static final mi0.a f326497b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f326498c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f326499d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f326500e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f326496a = binding;
        mi0.a aVar = new mi0.a();
        f326497b = aVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("businessType", aVar, 1, false, true);
        f326498c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field(dm.i4.COL_UPDATETIME, aVar, 2, false, false);
        f326499d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("recordItems", aVar, 3, false, false);
        f326500e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, com.tencent.wcdb.winq.ColumnType.BLOB));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f326498c, f326499d, f326500e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f326496a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        mi0.b bVar = (mi0.b) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(bVar.f326501a, i17);
            return;
        }
        if (fieldId == 2) {
            preparedStatement.bindInteger(bVar.f326502b, i17);
            return;
        }
        if (fieldId != 3) {
            return;
        }
        byte[] bArr = bVar.f326503c;
        if (bArr != null) {
            preparedStatement.bindBLOB(bArr, i17);
        } else {
            preparedStatement.bindNull(i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return mi0.b.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        mi0.b bVar = (mi0.b) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                bVar.f326501a = preparedStatement.getInt(i17);
            } else if (fieldId == 2) {
                bVar.f326502b = preparedStatement.getInt(i17);
            } else if (fieldId == 3 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                bVar.f326503c = preparedStatement.getBLOB(i17);
            }
            i17++;
        }
        return bVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
