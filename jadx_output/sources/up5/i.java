package up5;

/* loaded from: classes12.dex */
public class i implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429969a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.i f429970b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429971c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429972d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429973e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429974f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429975g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429976h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429977i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429978j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429979k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429980l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429981m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429982n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429983o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429984p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429985q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429986r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429987s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429988t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429989u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429990v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429991w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429992x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429993y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429994z;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429969a = binding;
        up5.i iVar = new up5.i();
        f429970b = iVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("msgId", iVar, 1, true, true);
        f429971c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey().autoIncrement());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("msgSvrId", iVar, 2, false, false);
        f429972d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("type", iVar, 3, false, false);
        f429973e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("status", iVar, 4, false, false);
        f429974f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("isSend", iVar, 5, false, false);
        f429975g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("isShowTimer", iVar, 6, false, false);
        f429976h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("createTime", iVar, 7, false, false);
        f429977i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType));
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("talker", iVar, 8, false, false);
        f429978j = field8;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field8, columnType2));
        com.tencent.wcdb.orm.Field field9 = new com.tencent.wcdb.orm.Field("content", iVar, 9, false, false);
        f429979k = field9;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field9, columnType2);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef2);
        com.tencent.wcdb.orm.Field field10 = new com.tencent.wcdb.orm.Field("imgPath", iVar, 10, false, false);
        f429980l = field10;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field10, columnType2));
        com.tencent.wcdb.orm.Field field11 = new com.tencent.wcdb.orm.Field("reserved", iVar, 11, false, false);
        f429981m = field11;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field11, columnType2));
        com.tencent.wcdb.orm.Field field12 = new com.tencent.wcdb.orm.Field("lvbuffer", iVar, 12, false, false);
        f429982n = field12;
        com.tencent.wcdb.winq.ColumnType columnType3 = com.tencent.wcdb.winq.ColumnType.BLOB;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field12, columnType3));
        com.tencent.wcdb.orm.Field field13 = new com.tencent.wcdb.orm.Field("transContent", iVar, 13, false, false);
        f429983o = field13;
        com.tencent.wcdb.winq.ColumnDef columnDef3 = new com.tencent.wcdb.winq.ColumnDef(field13, columnType2);
        columnDef3.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef3);
        com.tencent.wcdb.orm.Field field14 = new com.tencent.wcdb.orm.Field("transBrandWording", iVar, 14, false, false);
        f429984p = field14;
        com.tencent.wcdb.winq.ColumnDef columnDef4 = new com.tencent.wcdb.winq.ColumnDef(field14, columnType2);
        columnDef4.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef4);
        com.tencent.wcdb.orm.Field field15 = new com.tencent.wcdb.orm.Field("talkerId", iVar, 15, false, false);
        f429985q = field15;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field15, columnType));
        com.tencent.wcdb.orm.Field field16 = new com.tencent.wcdb.orm.Field("bizClientMsgId", iVar, 16, false, false);
        f429986r = field16;
        com.tencent.wcdb.winq.ColumnDef columnDef5 = new com.tencent.wcdb.winq.ColumnDef(field16, columnType2);
        columnDef5.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef5);
        com.tencent.wcdb.orm.Field field17 = new com.tencent.wcdb.orm.Field("bizChatId", iVar, 17, false, false);
        f429987s = field17;
        com.tencent.wcdb.winq.ColumnDef columnDef6 = new com.tencent.wcdb.winq.ColumnDef(field17, columnType);
        columnDef6.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(-1));
        binding.addColumnDef(columnDef6);
        com.tencent.wcdb.orm.Field field18 = new com.tencent.wcdb.orm.Field("bizChatUserId", iVar, 18, false, false);
        f429988t = field18;
        com.tencent.wcdb.winq.ColumnDef columnDef7 = new com.tencent.wcdb.winq.ColumnDef(field18, columnType2);
        columnDef7.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(""));
        binding.addColumnDef(columnDef7);
        com.tencent.wcdb.orm.Field field19 = new com.tencent.wcdb.orm.Field("msgSeq", iVar, 19, false, false);
        f429989u = field19;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field19, columnType));
        com.tencent.wcdb.orm.Field field20 = new com.tencent.wcdb.orm.Field("flag", iVar, 20, false, false);
        f429990v = field20;
        com.tencent.wcdb.winq.ColumnDef columnDef8 = new com.tencent.wcdb.winq.ColumnDef(field20, columnType);
        columnDef8.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef8);
        com.tencent.wcdb.orm.Field field21 = new com.tencent.wcdb.orm.Field("solitaireFoldInfo", iVar, 21, false, false);
        f429991w = field21;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field21, columnType3));
        com.tencent.wcdb.orm.Field field22 = new com.tencent.wcdb.orm.Field("historyId", iVar, 22, false, false);
        f429992x = field22;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field22, columnType2));
        com.tencent.wcdb.orm.Field field23 = new com.tencent.wcdb.orm.Field("fromUsername", iVar, 23, false, false);
        f429993y = field23;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field23, columnType2));
        com.tencent.wcdb.orm.Field field24 = new com.tencent.wcdb.orm.Field("toUsername", iVar, 24, false, false);
        f429994z = field24;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field24, columnType2));
    }

    public static com.tencent.wcdb.orm.Field[] a() {
        return new com.tencent.wcdb.orm.Field[]{f429971c, f429972d, f429973e, f429974f, f429975g, f429976h, f429977i, f429978j, f429979k, f429980l, f429981m, f429982n, f429983o, f429984p, f429985q, f429986r, f429987s, f429988t, f429989u, f429990v, f429991w, f429992x, f429993y, f429994z};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429971c, f429972d, f429973e, f429974f, f429975g, f429976h, f429977i, f429978j, f429979k, f429980l, f429981m, f429982n, f429983o, f429984p, f429985q, f429986r, f429987s, f429988t, f429989u, f429990v, f429991w, f429992x, f429993y, f429994z};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429969a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.w wVar = (up5.w) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(wVar.f430091a, i17);
                return;
            case 2:
                preparedStatement.bindInteger(wVar.f430092b, i17);
                return;
            case 3:
                preparedStatement.bindInteger(wVar.f430093c, i17);
                return;
            case 4:
                preparedStatement.bindInteger(wVar.f430094d, i17);
                return;
            case 5:
                preparedStatement.bindInteger(wVar.f430095e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(wVar.f430096f, i17);
                return;
            case 7:
                preparedStatement.bindInteger(wVar.f430097g, i17);
                return;
            case 8:
                java.lang.String str = wVar.f430098h;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 9:
                java.lang.String str2 = wVar.f430099i;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 10:
                java.lang.String str3 = wVar.f430100j;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 11:
                java.lang.String str4 = wVar.f430101k;
                if (str4 != null) {
                    preparedStatement.bindText(str4, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 12:
                byte[] bArr = wVar.f430102l;
                if (bArr != null) {
                    preparedStatement.bindBLOB(bArr, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 13:
                java.lang.String str5 = wVar.f430103m;
                if (str5 != null) {
                    preparedStatement.bindText(str5, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 14:
                java.lang.String str6 = wVar.f430104n;
                if (str6 != null) {
                    preparedStatement.bindText(str6, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 15:
                preparedStatement.bindInteger(wVar.f430105o, i17);
                return;
            case 16:
                java.lang.String str7 = wVar.f430106p;
                if (str7 != null) {
                    preparedStatement.bindText(str7, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 17:
                preparedStatement.bindInteger(wVar.f430107q, i17);
                return;
            case 18:
                java.lang.String str8 = wVar.f430108r;
                if (str8 != null) {
                    preparedStatement.bindText(str8, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 19:
                preparedStatement.bindInteger(wVar.f430109s, i17);
                return;
            case 20:
                preparedStatement.bindInteger(wVar.f430110t, i17);
                return;
            case 21:
                byte[] bArr2 = wVar.f430111u;
                if (bArr2 != null) {
                    preparedStatement.bindBLOB(bArr2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 22:
                java.lang.String str9 = wVar.f430112v;
                if (str9 != null) {
                    preparedStatement.bindText(str9, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 23:
                java.lang.String str10 = wVar.f430113w;
                if (str10 != null) {
                    preparedStatement.bindText(str10, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 24:
                java.lang.String str11 = wVar.f430114x;
                if (str11 != null) {
                    preparedStatement.bindText(str11, i17);
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
        return up5.w.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.w wVar = (up5.w) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    wVar.f430091a = preparedStatement.getLong(i17);
                    break;
                case 2:
                    wVar.f430092b = preparedStatement.getLong(i17);
                    break;
                case 3:
                    wVar.f430093c = preparedStatement.getInt(i17);
                    break;
                case 4:
                    wVar.f430094d = preparedStatement.getInt(i17);
                    break;
                case 5:
                    wVar.f430095e = preparedStatement.getInt(i17);
                    break;
                case 6:
                    wVar.f430096f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    wVar.f430097g = preparedStatement.getLong(i17);
                    break;
                case 8:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430098h = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430099i = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430100j = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430101k = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430102l = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430103m = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430104n = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    wVar.f430105o = preparedStatement.getInt(i17);
                    break;
                case 16:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430106p = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    wVar.f430107q = preparedStatement.getLong(i17);
                    break;
                case 18:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430108r = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    wVar.f430109s = preparedStatement.getLong(i17);
                    break;
                case 20:
                    wVar.f430110t = preparedStatement.getInt(i17);
                    break;
                case 21:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430111u = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 22:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430112v = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 23:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430113w = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 24:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        wVar.f430114x = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
            }
            i17++;
        }
        return wVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public boolean isAutoIncrement(java.lang.Object obj) {
        return ((up5.w) obj).f430091a == 0;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void setLastInsertRowId(java.lang.Object obj, long j17) {
        ((up5.w) obj).f430091a = j17;
    }
}
