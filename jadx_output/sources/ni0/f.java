package ni0;

/* loaded from: classes12.dex */
public class f implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337218a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.f f337219b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337220c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337221d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337222e;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337218a = binding;
        ni0.f fVar = new ni0.f();
        f337219b = fVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_ID, fVar, 1, true, true);
        f337220c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey().autoIncrement());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("actionType", fVar, 2, false, false);
        f337221d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, fVar, 3, false, false);
        f337222e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        binding.addIndex("_actionType_timestamp_index", false, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2, field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337220c, f337221d, f337222e};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337218a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        ni0.l lVar = (ni0.l) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(lVar.f337244a, i17);
        } else if (fieldId == 2) {
            preparedStatement.bindInteger(lVar.f337245b, i17);
        } else {
            if (fieldId != 3) {
                return;
            }
            preparedStatement.bindInteger(lVar.f337246c, i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return ni0.l.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        ni0.l lVar = (ni0.l) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                lVar.f337244a = preparedStatement.getInt(i17);
            } else if (fieldId == 2) {
                lVar.f337245b = preparedStatement.getInt(i17);
            } else if (fieldId == 3) {
                lVar.f337246c = preparedStatement.getInt(i17);
            }
            i17++;
        }
        return lVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public boolean isAutoIncrement(java.lang.Object obj) {
        return ((ni0.l) obj).f337244a == 0;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void setLastInsertRowId(java.lang.Object obj, long j17) {
        ((ni0.l) obj).f337244a = (int) j17;
    }
}
