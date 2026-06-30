package up5;

/* loaded from: classes12.dex */
public class g implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429957a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.g f429958b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429959c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429960d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429961e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429962f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429963g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429964h;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429957a = binding;
        up5.g gVar = new up5.g();
        f429958b = gVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_LOCALID, gVar, 1, false, true);
        f429959c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Integer;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("content", gVar, 2, false, false);
        f429960d = field2;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Text;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType2));
        binding.addIndex("FavSearchInfo_Content_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("tagContent", gVar, 3, false, false);
        f429961e = field3;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType2));
        binding.addIndex("FavSearchInfo_TagContent_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field3));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("time", gVar, 4, false, false);
        f429962f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("type", gVar, 5, false, false);
        f429963g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("subtype", gVar, 6, false, false);
        f429964h = field6;
        com.tencent.wcdb.winq.ColumnDef columnDef2 = new com.tencent.wcdb.winq.ColumnDef(field6, columnType);
        columnDef2.constraint(new com.tencent.wcdb.winq.ColumnConstraint().defaultTo(0));
        binding.addColumnDef(columnDef2);
        binding.addIndex("FavSearchInfo_TagContent_Index", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field6));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429959c, f429960d, f429961e, f429962f, f429963g, f429964h};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429957a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.u uVar = (up5.u) obj;
        switch (field.getFieldId()) {
            case 1:
                preparedStatement.bindInteger(uVar.f430083a, i17);
                return;
            case 2:
                java.lang.String str = uVar.f430084b;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                java.lang.String str2 = uVar.f430085c;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 4:
                preparedStatement.bindInteger(uVar.f430086d, i17);
                return;
            case 5:
                preparedStatement.bindInteger(uVar.f430087e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(uVar.f430088f, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.u.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.u uVar = (up5.u) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    uVar.f430083a = preparedStatement.getLong(i17);
                    break;
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        uVar.f430084b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        uVar.f430085c = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    uVar.f430086d = preparedStatement.getLong(i17);
                    break;
                case 5:
                    uVar.f430087e = preparedStatement.getInt(i17);
                    break;
                case 6:
                    uVar.f430088f = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return uVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
