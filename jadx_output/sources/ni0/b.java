package ni0;

/* loaded from: classes12.dex */
public class b implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337189a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.b f337190b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337191c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337192d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337193e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337194f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337195g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337196h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337197i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337198j;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337189a = binding;
        ni0.b bVar = new ni0.b();
        f337190b = bVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("taskId", bVar, 1, false, false);
        f337191c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, columnType));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("createTimeMs", bVar, 2, false, false);
        f337192d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("draftTitle", bVar, 3, false, false);
        f337193e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("coverPath", bVar, 4, false, false);
        f337194f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("videoTemplateInfo", bVar, 5, false, false);
        f337195g = field5;
        com.tencent.wcdb.winq.ColumnType columnType3 = com.tencent.wcdb.winq.ColumnType.BLOB;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType3));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("hasPost", bVar, 6, false, false);
        f337196h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType2));
        com.tencent.wcdb.orm.Field field7 = new com.tencent.wcdb.orm.Field("sourceInfo", bVar, 7, false, false);
        f337197i = field7;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field7, columnType3));
        com.tencent.wcdb.orm.Field field8 = new com.tencent.wcdb.orm.Field("assetInfo", bVar, 8, false, false);
        f337198j = field8;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field8, columnType3));
        binding.addTableConstraint(new com.tencent.wcdb.winq.TableConstraint().primaryKey().indexedBy(field));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337191c, f337192d, f337193e, f337194f, f337195g, f337196h, f337197i, f337198j};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337189a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        ni0.h hVar = (ni0.h) obj;
        switch (field.getFieldId()) {
            case 1:
                java.lang.String str = hVar.f337223a;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 2:
                java.lang.Long l17 = hVar.f337224b;
                if (l17 != null) {
                    preparedStatement.bindInteger(l17, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                java.lang.String str2 = hVar.f337225c;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                java.lang.String str3 = hVar.f337226d;
                if (str3 != null) {
                    preparedStatement.bindText(str3, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 5:
                byte[] bArr = hVar.f337227e;
                if (bArr != null) {
                    preparedStatement.bindBLOB(bArr, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 6:
                java.lang.Boolean bool = hVar.f337228f;
                if (bool != null) {
                    preparedStatement.bindBool(bool, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 7:
                byte[] bArr2 = hVar.f337229g;
                if (bArr2 != null) {
                    preparedStatement.bindBLOB(bArr2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 8:
                byte[] bArr3 = hVar.f337230h;
                if (bArr3 != null) {
                    preparedStatement.bindBLOB(bArr3, i17);
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
        return ni0.h.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        ni0.h hVar = (ni0.h) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337223a = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337224b = java.lang.Long.valueOf(preparedStatement.getLong(i17));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337225c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337226d = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337227e = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337228f = java.lang.Boolean.valueOf(preparedStatement.getBool(i17));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337229g = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        hVar.f337230h = preparedStatement.getBLOB(i17);
                        break;
                    } else {
                        break;
                    }
            }
            i17++;
        }
        return hVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
