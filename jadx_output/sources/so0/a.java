package so0;

/* loaded from: classes12.dex */
public class a implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f410182a;

    /* renamed from: b, reason: collision with root package name */
    public static final so0.a f410183b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410184c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410185d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410186e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410187f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410188g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410189h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410190i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410191j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410192k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410193l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410194m;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f410182a = binding;
        so0.a aVar = new so0.a();
        f410183b = aVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("msgId", aVar, 1, true, true);
        f410184c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey().autoIncrement());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, aVar, 2, false, false);
        f410185d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("toUserName", aVar, 3, false, false);
        f410186e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType2));
        binding.addIndex("FinderLiveShopMsg_toUserName_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("fromUserName", aVar, 4, false, false);
        f410187f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType2));
        binding.addIndex("FinderLiveShopMsg_fromUserName_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field4));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("liveId", aVar, 5, false, false);
        f410188g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        binding.addIndex("FinderLiveShopMsg_liveId_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field5));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("appMsg", aVar, 6, false, false);
        f410189h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, com.tencent.wcdb.winq.ColumnType.BLOB));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("business_seq", aVar, 7, false, false);
        f410190i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType));
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("read", aVar, 8, false, false);
        f410191j = field8;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field8, columnType));
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field("insertTime", aVar, 9, false, false);
        f410192k = field9;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field9, columnType));
        com.tencent.wcdb.orm.Field field10 = new com.tencent.wcdb.orm.Field("sendStatus", aVar, 10, false, false);
        f410193l = field10;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field10, columnType));
        com.tencent.wcdb.orm.Field field11 = new com.tencent.wcdb.orm.Field("clientMsgId", aVar, 11, false, false);
        f410194m = field11;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field11, columnType2));
        binding.addIndex("FinderLiveShopMsg_clientMsgId_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field11));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f410184c, f410185d, f410186e, f410187f, f410188g, f410189h, f410190i, f410191j, f410192k, f410193l, f410194m};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f410182a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        so0.c cVar = (so0.c) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(cVar.f410204a, i17);
                return;
            case 2:
                java.lang.String str = cVar.f410205b;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                java.lang.String str2 = cVar.f410206c;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.String str3 = cVar.f410207d;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                java.lang.Long l17 = cVar.f410208e;
                if (l17 != null) {
                    preparedStatement.bindInteger(l17, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                byte[] bArr = cVar.f410209f;
                if (bArr != null) {
                    preparedStatement.bindBLOB(bArr, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 7:
                preparedStatement.bindInteger(cVar.f410210g, i17);
                return;
            case 8:
                java.lang.Boolean bool = cVar.f410211h;
                if (bool != null) {
                    preparedStatement.bindBool(bool, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 9:
                preparedStatement.bindInteger(cVar.f410212i, i17);
                return;
            case 10:
                preparedStatement.bindInteger(cVar.f410213j, i17);
                return;
            case 11:
                java.lang.String str4 = cVar.f410214k;
                if (str4 != null) {
                    preparedStatement.bindText(str4, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return so0.c.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        so0.c cVar = (so0.c) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    cVar.f410204a = preparedStatement.getInt(i17);
                    break;
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410205b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410206c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410207d = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410208e = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410209f = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    cVar.f410210g = preparedStatement.getLong(i17);
                    break;
                case 8:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410211h = java.lang.Boolean.valueOf(preparedStatement.getBool(i17));
                        break;
                    } else {
                        break;
                    }
                case 9:
                    cVar.f410212i = preparedStatement.getInt(i17);
                    break;
                case 10:
                    cVar.f410213j = preparedStatement.getInt(i17);
                    break;
                case 11:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        cVar.f410214k = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
            }
            i17++;
        }
        return cVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public boolean isAutoIncrement(java.lang.Object obj) {
        return ((so0.c) obj).f410204a == 0;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void setLastInsertRowId(java.lang.Object obj, long j17) {
        ((so0.c) obj).f410204a = (int) j17;
    }
}
