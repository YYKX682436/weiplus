package up5;

/* loaded from: classes12.dex */
public class d implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429913a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.d f429914b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429915c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429916d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429917e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429918f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429919g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429920h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429921i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429922j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429923k;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429913a = binding;
        up5.d dVar = new up5.d();
        f429914b = dVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("favId", dVar, 1, false, true);
        f429915c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("delTime", dVar, 2, false, false);
        f429916d = field2;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field2, columnType);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef2);
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("delSource", dVar, 3, false, false);
        f429917e = field3;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef3 = new com.tencent.wcdb.winq.ColumnDef(field3, columnType2);
        columnDef3.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef3);
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("oriXml", dVar, 4, false, false);
        f429918f = field4;
        com.tencent.wcdb.winq.ColumnDef columnDef4 = new com.tencent.wcdb.winq.ColumnDef(field4, columnType2);
        columnDef4.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef4);
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("clientVersion", dVar, 5, false, false);
        f429919g = field5;
        com.tencent.wcdb.winq.ColumnDef columnDef5 = new com.tencent.wcdb.winq.ColumnDef(field5, columnType2);
        columnDef5.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef5);
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("delType", dVar, 6, false, false);
        f429920h = field6;
        com.tencent.wcdb.winq.ColumnDef columnDef6 = new com.tencent.wcdb.winq.ColumnDef(field6, columnType);
        columnDef6.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef6);
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("itemType", dVar, 7, false, false);
        f429921i = field7;
        com.tencent.wcdb.winq.ColumnDef columnDef7 = new com.tencent.wcdb.winq.ColumnDef(field7, columnType);
        columnDef7.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef7);
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field(dm.i4.COL_UPDATETIME, dVar, 8, false, false);
        f429922j = field8;
        com.tencent.wcdb.winq.ColumnDef columnDef8 = new com.tencent.wcdb.winq.ColumnDef(field8, columnType);
        columnDef8.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef8);
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field("delFlag", dVar, 9, false, false);
        f429923k = field9;
        com.tencent.wcdb.winq.ColumnDef columnDef9 = new com.tencent.wcdb.winq.ColumnDef(field9, columnType);
        columnDef9.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef9);
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429915c, f429916d, f429917e, f429918f, f429919g, f429920h, f429921i, f429922j, f429923k};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429913a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.r rVar = (up5.r) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(rVar.f430045a, i17);
                return;
            case 2:
                preparedStatement.bindInteger(rVar.f430046b, i17);
                return;
            case 3:
                java.lang.String str = rVar.f430047c;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.String str2 = rVar.f430048d;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                java.lang.String str3 = rVar.f430049e;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                preparedStatement.bindInteger(rVar.f430050f, i17);
                return;
            case 7:
                preparedStatement.bindInteger(rVar.f430051g, i17);
                return;
            case 8:
                preparedStatement.bindInteger(rVar.f430052h, i17);
                return;
            case 9:
                preparedStatement.bindInteger(rVar.f430053i, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.r.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.r rVar = (up5.r) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    rVar.f430045a = preparedStatement.getInt(i17);
                    break;
                case 2:
                    rVar.f430046b = preparedStatement.getLong(i17);
                    break;
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        rVar.f430047c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        rVar.f430048d = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        rVar.f430049e = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    rVar.f430050f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    rVar.f430051g = preparedStatement.getInt(i17);
                    break;
                case 8:
                    rVar.f430052h = preparedStatement.getLong(i17);
                    break;
                case 9:
                    rVar.f430053i = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return rVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
