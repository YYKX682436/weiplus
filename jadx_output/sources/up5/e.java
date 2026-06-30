package up5;

/* loaded from: classes12.dex */
public class e implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429924a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.e f429925b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429926c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429927d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429928e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429929f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429930g;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429924a = binding;
        up5.e eVar = new up5.e();
        f429925b = eVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_LOCALID, eVar, 1, false, false);
        f429926c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, columnType));
        binding.addIndex("FavModInfo_LocalId_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("modItem", eVar, 2, false, false);
        f429927d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.BLOB));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("time", eVar, 3, false, false);
        f429928e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("type", eVar, 4, false, false);
        f429929f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, eVar, 5, false, false);
        f429930g = field5;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field5, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(1));
        binding.addColumnDef(columnDef);
        binding.addIndex("IndexLocalId_Type", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field, field4));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429926c, f429927d, f429928e, f429929f, f429930g};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429924a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.s sVar = (up5.s) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(sVar.f430054a, i17);
            return;
        }
        if (fieldId == 2) {
            byte[] bArr = sVar.f430055b;
            if (bArr != null) {
                preparedStatement.bindBLOB(bArr, i17);
                return;
            } else {
                preparedStatement.bindNull(i17);
                return;
            }
        }
        if (fieldId == 3) {
            preparedStatement.bindInteger(sVar.f430056c, i17);
        } else if (fieldId == 4) {
            preparedStatement.bindInteger(sVar.f430057d, i17);
        } else {
            if (fieldId != 5) {
                return;
            }
            preparedStatement.bindInteger(sVar.f430058e, i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.s.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.s sVar = (up5.s) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                sVar.f430054a = preparedStatement.getLong(i17);
            } else if (fieldId != 2) {
                if (fieldId == 3) {
                    sVar.f430056c = preparedStatement.getLong(i17);
                } else if (fieldId == 4) {
                    sVar.f430057d = preparedStatement.getInt(i17);
                } else if (fieldId == 5) {
                    sVar.f430058e = preparedStatement.getInt(i17);
                }
            } else if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                sVar.f430055b = preparedStatement.getBLOB(i17);
            }
            i17++;
        }
        return sVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
