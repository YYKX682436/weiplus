package ni0;

/* loaded from: classes12.dex */
public class c implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337199a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.c f337200b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337201c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337202d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337203e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337199a = binding;
        ni0.c cVar = new ni0.c();
        f337200b = cVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("tid", cVar, 1, false, true);
        f337201c = field;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Text);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("finderObj", cVar, 2, false, false);
        f337202d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.BLOB));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("cacheTime", cVar, 3, false, false);
        f337203e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, com.tencent.wcdb.winq.ColumnType.Integer));
        binding.addIndex("_cacheTime_index", false, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337201c, f337202d, f337203e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337199a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        ni0.i iVar = (ni0.i) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            java.lang.String str = iVar.f337231a;
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
            preparedStatement.bindInteger(iVar.f337233c, i17);
        } else {
            byte[] bArr = iVar.f337232b;
            if (bArr != null) {
                preparedStatement.bindBLOB(bArr, i17);
            } else {
                preparedStatement.bindNull(i17);
            }
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return ni0.i.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        ni0.i iVar = (ni0.i) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId == 3) {
                        iVar.f337233c = preparedStatement.getInt(i17);
                    }
                } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                    iVar.f337232b = preparedStatement.getBLOB(i17);
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                iVar.f337231a = preparedStatement.getText(i17);
            }
            i17++;
        }
        return iVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
