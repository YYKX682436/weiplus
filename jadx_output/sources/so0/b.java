package so0;

/* loaded from: classes12.dex */
public class b implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f410195a;

    /* renamed from: b, reason: collision with root package name */
    public static final so0.b f410196b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410197c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410198d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410199e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410200f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410201g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410202h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f410203i;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f410195a = binding;
        so0.b bVar = new so0.b();
        f410196b = bVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, bVar, 1, false, true);
        f410197c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("toUserName", bVar, 2, false, false);
        f410198d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        binding.addIndex("FinderLiveShopSession_toUserName_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("selfUserName", bVar, 3, false, false);
        f410199e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        binding.addIndex("FinderLiveShopSession_selfUserName_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("liveId", bVar, 4, false, false);
        f410200f = field4;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType2));
        binding.addIndex("FinderLiveShopSession_liveId_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field4));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("roleType", bVar, 5, false, false);
        f410201g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType2));
        binding.addIndex("FinderLiveShopSession_roleType_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field5));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("insertTime", bVar, 6, false, false);
        f410202h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType2));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("selfEncryptedUserName", bVar, 7, false, false);
        f410203i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType));
        binding.addIndex("FinderLiveShopSession_selfEncryptedUserName_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field7));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f410197c, f410198d, f410199e, f410200f, f410201g, f410202h, f410203i};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f410195a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        so0.d dVar = (so0.d) obj;
        switch (field.getFieldId()) {
            case 1:
                java.lang.String str = dVar.f410215a;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 2:
                java.lang.String str2 = dVar.f410216b;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                java.lang.String str3 = dVar.f410217c;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.Long l17 = dVar.f410218d;
                if (l17 != null) {
                    preparedStatement.bindInteger(l17, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                preparedStatement.bindInteger(dVar.f410219e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(dVar.f410220f, i17);
                return;
            case 7:
                java.lang.String str4 = dVar.f410221g;
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
        return so0.d.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        so0.d dVar = (so0.d) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f410215a = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f410216b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f410217c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f410218d = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f410219e = preparedStatement.getInt(i17);
                    break;
                case 6:
                    dVar.f410220f = preparedStatement.getInt(i17);
                    break;
                case 7:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        dVar.f410221g = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
            }
            i17++;
        }
        return dVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
