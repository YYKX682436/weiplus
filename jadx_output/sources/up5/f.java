package up5;

/* loaded from: classes12.dex */
public class f implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429931a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.f f429932b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429933c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429934d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429935e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429936f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429937g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429938h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429939i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429940j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429941k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429942l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429943m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429944n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429945o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429946p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429947q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429948r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429949s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429950t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429951u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429952v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429953w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429954x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429955y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429956z;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429931a = binding;
        up5.f fVar = new up5.f();
        f429932b = fVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_LOCALID, fVar, 1, false, true);
        f429933c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field(dm.i4.COL_ID, fVar, 2, false, false);
        f429934d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        binding.addIndex("FavItemInfo_id_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("type", fVar, 3, false, false);
        f429935e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        binding.addIndex("FavItemInfo_type_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("localSeq", fVar, 4, false, false);
        f429936f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("updateSeq", fVar, 5, false, false);
        f429937g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        binding.addIndex("FavItemInfo_updateSeq_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field5));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("flag", fVar, 6, false, false);
        f429938h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType));
        binding.addIndex("FavItemInfo_flag_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field6));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("sourceId", fVar, 7, false, false);
        f429939i = field7;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType2));
        binding.addIndex("FavItemInfo_sourceId_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field7));
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("itemStatus", fVar, 8, false, false);
        f429940j = field8;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field8, columnType));
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field("sourceType", fVar, 9, false, false);
        f429941k = field9;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field9, columnType));
        com.tencent.wcdb.orm.Field field10 = new com.tencent.wcdb.orm.Field("sourceCreateTime", fVar, 10, false, false);
        f429942l = field10;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field10, columnType));
        com.tencent.wcdb.orm.Field field11 = new com.tencent.wcdb.orm.Field(dm.i4.COL_UPDATETIME, fVar, 11, false, false);
        f429943m = field11;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field11, columnType));
        com.tencent.wcdb.orm.Field field12 = new com.tencent.wcdb.orm.Field("fromUser", fVar, 12, false, false);
        f429944n = field12;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field12, columnType2));
        com.tencent.wcdb.orm.Field field13 = new com.tencent.wcdb.orm.Field("toUser", fVar, 13, false, false);
        f429945o = field13;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field13, columnType2));
        com.tencent.wcdb.orm.Field field14 = new com.tencent.wcdb.orm.Field("realChatName", fVar, 14, false, false);
        f429946p = field14;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field14, columnType2));
        com.tencent.wcdb.orm.Field field15 = new com.tencent.wcdb.orm.Field("favProto", fVar, 15, false, false);
        f429947q = field15;
        com.tencent.wcdb.winq.ColumnType columnType3 = com.tencent.wcdb.winq.ColumnType.BLOB;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field15, columnType3));
        com.tencent.wcdb.orm.Field field16 = new com.tencent.wcdb.orm.Field("xml", fVar, 16, false, false);
        f429948r = field16;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field16, columnType2));
        com.tencent.wcdb.orm.Field field17 = new com.tencent.wcdb.orm.Field("ext", fVar, 17, false, false);
        f429949s = field17;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field17, columnType2));
        com.tencent.wcdb.orm.Field field18 = new com.tencent.wcdb.orm.Field("edittime", fVar, 18, false, false);
        f429950t = field18;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field18, columnType));
        com.tencent.wcdb.orm.Field field19 = new com.tencent.wcdb.orm.Field("tagProto", fVar, 19, false, false);
        f429951u = field19;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field19, columnType3));
        com.tencent.wcdb.orm.Field field20 = new com.tencent.wcdb.orm.Field(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, fVar, 20, false, false);
        f429952v = field20;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field20, columnType2));
        com.tencent.wcdb.orm.Field field21 = new com.tencent.wcdb.orm.Field("datatotalsize", fVar, 21, false, false);
        f429953w = field21;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field21, columnType));
        binding.addIndex("FavItemInfo_datatotalsize_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field21));
        com.tencent.wcdb.orm.Field field22 = new com.tencent.wcdb.orm.Field("transferCtx", fVar, 22, false, false);
        f429954x = field22;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field22, columnType2));
        com.tencent.wcdb.orm.Field field23 = new com.tencent.wcdb.orm.Field("targetID", fVar, 23, false, false);
        f429955y = field23;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field23, columnType));
        com.tencent.wcdb.orm.Field field24 = new com.tencent.wcdb.orm.Field("subType", fVar, 24, false, false);
        f429956z = field24;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field24, columnType));
    }

    public static com.tencent.wcdb.orm.Field[] a() {
        return new com.tencent.wcdb.orm.Field[]{f429933c, f429934d, f429935e, f429936f, f429937g, f429938h, f429939i, f429940j, f429941k, f429942l, f429943m, f429944n, f429945o, f429946p, f429947q, f429948r, f429949s, f429950t, f429951u, f429952v, f429953w, f429954x, f429955y, f429956z};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429933c, f429934d, f429935e, f429936f, f429937g, f429938h, f429939i, f429940j, f429941k, f429942l, f429943m, f429944n, f429945o, f429946p, f429947q, f429948r, f429949s, f429950t, f429951u, f429952v, f429953w, f429954x, f429955y, f429956z};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public up5.t extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.t tVar = (up5.t) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    tVar.f430059a = preparedStatement.getLong(i17);
                    break;
                case 2:
                    tVar.f430060b = preparedStatement.getInt(i17);
                    break;
                case 3:
                    tVar.f430061c = preparedStatement.getInt(i17);
                    break;
                case 4:
                    tVar.f430062d = preparedStatement.getInt(i17);
                    break;
                case 5:
                    tVar.f430063e = preparedStatement.getInt(i17);
                    break;
                case 6:
                    tVar.f430064f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430065g = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    tVar.f430066h = preparedStatement.getInt(i17);
                    break;
                case 9:
                    tVar.f430067i = preparedStatement.getInt(i17);
                    break;
                case 10:
                    tVar.f430068j = preparedStatement.getLong(i17);
                    break;
                case 11:
                    tVar.f430069k = preparedStatement.getLong(i17);
                    break;
                case 12:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430070l = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430071m = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430072n = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430073o = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430074p = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430075q = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    tVar.f430076r = preparedStatement.getLong(i17);
                    break;
                case 19:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430077s = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430078t = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    tVar.f430079u = preparedStatement.getLong(i17);
                    break;
                case 22:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        tVar.f430080v = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 23:
                    tVar.f430081w = preparedStatement.getInt(i17);
                    break;
                case 24:
                    tVar.f430082x = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return tVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429931a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.t tVar = (up5.t) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(tVar.f430059a, i17);
                return;
            case 2:
                preparedStatement.bindInteger(tVar.f430060b, i17);
                return;
            case 3:
                preparedStatement.bindInteger(tVar.f430061c, i17);
                return;
            case 4:
                preparedStatement.bindInteger(tVar.f430062d, i17);
                return;
            case 5:
                preparedStatement.bindInteger(tVar.f430063e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(tVar.f430064f, i17);
                return;
            case 7:
                java.lang.String str = tVar.f430065g;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 8:
                preparedStatement.bindInteger(tVar.f430066h, i17);
                return;
            case 9:
                preparedStatement.bindInteger(tVar.f430067i, i17);
                return;
            case 10:
                preparedStatement.bindInteger(tVar.f430068j, i17);
                return;
            case 11:
                preparedStatement.bindInteger(tVar.f430069k, i17);
                return;
            case 12:
                java.lang.String str2 = tVar.f430070l;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 13:
                java.lang.String str3 = tVar.f430071m;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 14:
                java.lang.String str4 = tVar.f430072n;
                if (str4 != null) {
                    preparedStatement.bindText(str4, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 15:
                byte[] bArr = tVar.f430073o;
                if (bArr != null) {
                    preparedStatement.bindBLOB(bArr, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 16:
                java.lang.String str5 = tVar.f430074p;
                if (str5 != null) {
                    preparedStatement.bindText(str5, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 17:
                java.lang.String str6 = tVar.f430075q;
                if (str6 != null) {
                    preparedStatement.bindText(str6, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 18:
                preparedStatement.bindInteger(tVar.f430076r, i17);
                return;
            case 19:
                byte[] bArr2 = tVar.f430077s;
                if (bArr2 != null) {
                    preparedStatement.bindBLOB(bArr2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 20:
                java.lang.String str7 = tVar.f430078t;
                if (str7 != null) {
                    preparedStatement.bindText(str7, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 21:
                preparedStatement.bindInteger(tVar.f430079u, i17);
                return;
            case 22:
                java.lang.String str8 = tVar.f430080v;
                if (str8 != null) {
                    preparedStatement.bindText(str8, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 23:
                preparedStatement.bindInteger(tVar.f430081w, i17);
                return;
            case 24:
                preparedStatement.bindInteger(tVar.f430082x, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.t.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
