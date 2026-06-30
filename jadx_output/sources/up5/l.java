package up5;

/* loaded from: classes12.dex */
public class l implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f430008a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.l f430009b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430010c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430011d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430012e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f430008a = binding;
        up5.l lVar = new up5.l();
        f430009b = lVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("msgId", lVar, 1, false, true);
        f430010c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("msgSvrId", lVar, 2, false, false);
        f430011d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("dyeingTemplateRedDotState", lVar, 3, false, false);
        f430012e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        binding.addIndex("PayReceiptMsgRecord_dyeingTemplateRedDotState_index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f430010c, f430011d, f430012e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f430008a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.z zVar = (up5.z) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            java.lang.Long l17 = zVar.f430124a;
            if (l17 != null) {
                preparedStatement.bindInteger(l17, i17);
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
            preparedStatement.bindInteger(zVar.f430126c, i17);
        } else {
            java.lang.Long l18 = zVar.f430125b;
            if (l18 != null) {
                preparedStatement.bindInteger(l18, i17);
            } else {
                preparedStatement.bindNull(i17);
            }
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.z.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.z zVar = (up5.z) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId == 3) {
                        zVar.f430126c = preparedStatement.getInt(i17);
                    }
                } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                    zVar.f430125b = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                zVar.f430124a = java.lang.Long.valueOf(preparedStatement.getLong(i17));
            }
            i17++;
        }
        return zVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
