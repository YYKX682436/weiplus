package tq;

/* loaded from: classes12.dex */
public class b implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f421181a;

    /* renamed from: b, reason: collision with root package name */
    public static final tq.b f421182b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421183c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421184d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421185e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421186f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421187g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421188h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421189i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421190j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421191k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421192l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f421193m;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f421181a = binding;
        tq.b bVar = new tq.b();
        f421182b = bVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_LOCALID, bVar, 1, true, true);
        f421183c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey().autoIncrement());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("shopAppId", bVar, 2, false, false);
        f421184d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field2, columnType2);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().unique());
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().notNull());
        binding.addColumnDef(columnDef2);
        binding.addIndex("_shopAppId_index", false, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("shopName", bVar, 3, false, false);
        f421185e = field3;
        com.tencent.wcdb.winq.ColumnDef columnDef3 = new com.tencent.wcdb.winq.ColumnDef(field3, columnType2);
        columnDef3.constraint(new com.tencent.wcdb.winq.ColumnConstraint().notNull());
        binding.addColumnDef(columnDef3);
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("shopLogoUrl", bVar, 4, false, false);
        f421186f = field4;
        com.tencent.wcdb.winq.ColumnDef columnDef4 = new com.tencent.wcdb.winq.ColumnDef(field4, columnType2);
        columnDef4.constraint(new com.tencent.wcdb.winq.ColumnConstraint().notNull());
        binding.addColumnDef(columnDef4);
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("shopRIconLightUrl", bVar, 5, false, false);
        f421187g = field5;
        com.tencent.wcdb.winq.ColumnDef columnDef5 = new com.tencent.wcdb.winq.ColumnDef(field5, columnType2);
        columnDef5.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef5);
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("shopRIconDarkUrl", bVar, 6, false, false);
        f421188h = field6;
        com.tencent.wcdb.winq.ColumnDef columnDef6 = new com.tencent.wcdb.winq.ColumnDef(field6, columnType2);
        columnDef6.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef6);
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("shopStatusValue", bVar, 7, false, false);
        f421189i = field7;
        com.tencent.wcdb.winq.ColumnDef columnDef7 = new com.tencent.wcdb.winq.ColumnDef(field7, columnType);
        columnDef7.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef7);
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("shopTagTypeValue", bVar, 8, false, false);
        f421190j = field8;
        com.tencent.wcdb.winq.ColumnDef columnDef8 = new com.tencent.wcdb.winq.ColumnDef(field8, columnType);
        columnDef8.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef8);
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field("shopTagModifyTime", bVar, 9, false, false);
        f421191k = field9;
        com.tencent.wcdb.winq.ColumnDef columnDef9 = new com.tencent.wcdb.winq.ColumnDef(field9, columnType);
        columnDef9.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef9);
        com.tencent.wcdb.orm.Field field10 = new com.tencent.wcdb.orm.Field("jumpInfoData", bVar, 10, false, false);
        f421192l = field10;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field10, com.tencent.wcdb.winq.ColumnType.BLOB));
        com.tencent.wcdb.orm.Field field11 = new com.tencent.wcdb.orm.Field("updateSeq", bVar, 11, false, false);
        f421193m = field11;
        com.tencent.wcdb.winq.ColumnDef columnDef10 = new com.tencent.wcdb.winq.ColumnDef(field11, columnType);
        columnDef10.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef10);
        binding.addIndex("_updateSeq_index", false, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field11));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f421183c, f421184d, f421185e, f421186f, f421187g, f421188h, f421189i, f421190j, f421191k, f421192l, f421193m};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f421181a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        tq.d dVar = (tq.d) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(dVar.f421196a, i17);
                return;
            case 2:
                java.lang.String str = dVar.f421197b;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                java.lang.String str2 = dVar.f421198c;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.String str3 = dVar.f421199d;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                java.lang.String str4 = dVar.f421200e;
                if (str4 != null) {
                    preparedStatement.bindText(str4, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                java.lang.String str5 = dVar.f421201f;
                if (str5 != null) {
                    preparedStatement.bindText(str5, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 7:
                preparedStatement.bindInteger(dVar.f421202g, i17);
                return;
            case 8:
                preparedStatement.bindInteger(dVar.f421203h, i17);
                return;
            case 9:
                preparedStatement.bindInteger(dVar.f421204i, i17);
                return;
            case 10:
                byte[] bArr = dVar.f421205j;
                if (bArr != null) {
                    preparedStatement.bindBLOB(bArr, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 11:
                preparedStatement.bindInteger(dVar.f421206k, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return tq.d.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        tq.d dVar = (tq.d) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    dVar.f421196a = preparedStatement.getLong(i17);
                    break;
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421197b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421198c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421199d = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421200e = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421201f = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    dVar.f421202g = preparedStatement.getInt(i17);
                    break;
                case 8:
                    dVar.f421203h = preparedStatement.getInt(i17);
                    break;
                case 9:
                    dVar.f421204i = preparedStatement.getLong(i17);
                    break;
                case 10:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f421205j = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    dVar.f421206k = preparedStatement.getLong(i17);
                    break;
            }
            i17++;
        }
        return dVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public boolean isAutoIncrement(java.lang.Object obj) {
        return ((tq.d) obj).f421196a == 0;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void setLastInsertRowId(java.lang.Object obj, long j17) {
        ((tq.d) obj).f421196a = j17;
    }
}
