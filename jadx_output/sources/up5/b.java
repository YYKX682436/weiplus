package up5;

/* loaded from: classes12.dex */
public class b implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429891a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.b f429892b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429893c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429894d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429895e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429896f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429897g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429898h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429899i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429900j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429901k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429902l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429903m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429904n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429905o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429906p;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429891a = binding;
        up5.b bVar = new up5.b();
        f429892b = bVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("dataId", bVar, 1, false, true);
        f429893c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("favLocalId", bVar, 2, false, false);
        f429894d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType2));
        binding.addIndex("FavCdnTransferInfo_LocalId", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("type", bVar, 3, false, false);
        f429895e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType2));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("cdnUrl", bVar, 4, false, false);
        f429896f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("cdnKey", bVar, 5, false, false);
        f429897g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("totalLen", bVar, 6, false, false);
        f429898h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType2));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("offset", bVar, 7, false, false);
        f429899i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType2));
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("status", bVar, 8, false, false);
        f429900j = field8;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field8, columnType2));
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, bVar, 9, false, false);
        f429901k = field9;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field9, columnType));
        com.tencent.wcdb.orm.Field field10 = new com.tencent.wcdb.orm.Field("dataType", bVar, 10, false, false);
        f429902l = field10;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field10, columnType2));
        com.tencent.wcdb.orm.Field field11 = new com.tencent.wcdb.orm.Field("modifyTime", bVar, 11, false, false);
        f429903m = field11;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field11, columnType2);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef2);
        binding.addIndex("FavCDNInfo_modifyTime_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field11));
        com.tencent.wcdb.orm.Field field12 = new com.tencent.wcdb.orm.Field("extFlag", bVar, 12, false, false);
        f429904n = field12;
        com.tencent.wcdb.winq.ColumnDef columnDef3 = new com.tencent.wcdb.winq.ColumnDef(field12, columnType2);
        columnDef3.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef3);
        com.tencent.wcdb.orm.Field field13 = new com.tencent.wcdb.orm.Field("attrFlag", bVar, 13, false, false);
        f429905o = field13;
        com.tencent.wcdb.winq.ColumnDef columnDef4 = new com.tencent.wcdb.winq.ColumnDef(field13, columnType2);
        columnDef4.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef4);
        com.tencent.wcdb.orm.Field field14 = new com.tencent.wcdb.orm.Field("retryTime", bVar, 14, false, false);
        f429906p = field14;
        com.tencent.wcdb.winq.ColumnDef columnDef5 = new com.tencent.wcdb.winq.ColumnDef(field14, columnType2);
        columnDef5.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef5);
    }

    public static com.tencent.wcdb.orm.Field[] a() {
        return new com.tencent.wcdb.orm.Field[]{f429893c, f429894d, f429895e, f429896f, f429897g, f429898h, f429899i, f429900j, f429901k, f429902l, f429903m, f429904n, f429905o, f429906p};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429893c, f429894d, f429895e, f429896f, f429897g, f429898h, f429899i, f429900j, f429901k, f429902l, f429903m, f429904n, f429905o, f429906p};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429891a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.p pVar = (up5.p) obj;
        switch (field.getFieldId()) {
            case 1:
                java.lang.String str = pVar.f430029a;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 2:
                preparedStatement.bindInteger(pVar.f430030b, i17);
                return;
            case 3:
                preparedStatement.bindInteger(pVar.f430031c, i17);
                return;
            case 4:
                java.lang.String str2 = pVar.f430032d;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                java.lang.String str3 = pVar.f430033e;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                preparedStatement.bindInteger(pVar.f430034f, i17);
                return;
            case 7:
                preparedStatement.bindInteger(pVar.f430035g, i17);
                return;
            case 8:
                preparedStatement.bindInteger(pVar.f430036h, i17);
                return;
            case 9:
                java.lang.String str4 = pVar.f430037i;
                if (str4 != null) {
                    preparedStatement.bindText(str4, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 10:
                preparedStatement.bindInteger(pVar.f430038j, i17);
                return;
            case 11:
                preparedStatement.bindInteger(pVar.f430039k, i17);
                return;
            case 12:
                preparedStatement.bindInteger(pVar.f430040l, i17);
                return;
            case 13:
                preparedStatement.bindInteger(pVar.f430041m, i17);
                return;
            case 14:
                preparedStatement.bindInteger(pVar.f430042n, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.p.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.p pVar = (up5.p) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        pVar.f430029a = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    pVar.f430030b = preparedStatement.getLong(i17);
                    break;
                case 3:
                    pVar.f430031c = preparedStatement.getInt(i17);
                    break;
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        pVar.f430032d = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        pVar.f430033e = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    pVar.f430034f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    pVar.f430035g = preparedStatement.getInt(i17);
                    break;
                case 8:
                    pVar.f430036h = preparedStatement.getInt(i17);
                    break;
                case 9:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        pVar.f430037i = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    pVar.f430038j = preparedStatement.getInt(i17);
                    break;
                case 11:
                    pVar.f430039k = preparedStatement.getLong(i17);
                    break;
                case 12:
                    pVar.f430040l = preparedStatement.getInt(i17);
                    break;
                case 13:
                    pVar.f430041m = preparedStatement.getLong(i17);
                    break;
                case 14:
                    pVar.f430042n = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return pVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
