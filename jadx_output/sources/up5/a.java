package up5;

/* loaded from: classes12.dex */
public class a implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429879a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.a f429880b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429881c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429882d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429883e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429884f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429885g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429886h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429887i;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429879a = binding;
        up5.a aVar = new up5.a();
        f429880b = aVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("fileId", aVar, 1, false, true);
        f429881c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("fileType", aVar, 2, false, false);
        f429882d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, aVar, 3, false, false);
        f429883e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("deleted", aVar, 4, false, false);
        f429884f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType2));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("sha1", aVar, 5, false, false);
        f429885g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("saved", aVar, 6, false, false);
        f429886h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType2));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("uriId", aVar, 7, false, false);
        f429887i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType2));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429881c, f429882d, f429883e, f429884f, f429885g, f429886h, f429887i};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429879a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.o oVar = (up5.o) obj;
        switch (field.getFieldId()) {
            case 1:
                java.lang.String str = oVar.f430022a;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 2:
                preparedStatement.bindInteger(oVar.f430023b, i17);
                return;
            case 3:
                java.lang.String str2 = oVar.f430024c;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.Boolean bool = oVar.f430025d;
                if (bool != null) {
                    preparedStatement.bindBool(bool, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                java.lang.String str3 = oVar.f430026e;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                java.lang.Boolean bool2 = oVar.f430027f;
                if (bool2 != null) {
                    preparedStatement.bindBool(bool2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 7:
                java.lang.Long l17 = oVar.f430028g;
                if (l17 != null) {
                    preparedStatement.bindInteger(l17, i17);
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
        return up5.o.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.o oVar = (up5.o) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430022a = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    oVar.f430023b = preparedStatement.getInt(i17);
                    break;
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430024c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430025d = java.lang.Boolean.valueOf(preparedStatement.getBool(i17));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430026e = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430027f = java.lang.Boolean.valueOf(preparedStatement.getBool(i17));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        oVar.f430028g = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                        break;
                    } else {
                        break;
                    }
            }
            i17++;
        }
        return oVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
