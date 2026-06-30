package up5;

/* loaded from: classes12.dex */
public class j implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429995a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.j f429996b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429997c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429998d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429999e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430000f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430001g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f430002h;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429995a = binding;
        up5.j jVar = new up5.j();
        f429996b = jVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("groupId", jVar, 1, false, true);
        f429997c = field;
        com.tencent.wcdb.winq.ColumnType columnType = com.tencent.wcdb.winq.ColumnType.Text;
        com.tencent.wcdb.winq.ColumnDef columnDef = new com.tencent.wcdb.winq.ColumnDef(field, columnType);
        columnDef.constraint(new com.tencent.wcdb.winq.ColumnConstraint().primaryKey());
        binding.addColumnDef(columnDef);
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("talker", jVar, 2, false, false);
        f429998d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, columnType));
        com.tencent.wcdb.orm.Field field3 = new com.tencent.wcdb.orm.Field("firstMsgId", jVar, 3, false, false);
        f429999e = field3;
        com.tencent.wcdb.winq.ColumnType columnType2 = com.tencent.wcdb.winq.ColumnType.Integer;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field3, columnType2));
        com.tencent.wcdb.orm.Field field4 = new com.tencent.wcdb.orm.Field("firstMsgCreateTime", jVar, 4, false, false);
        f430000f = field4;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field4, columnType2));
        com.tencent.wcdb.orm.Field field5 = new com.tencent.wcdb.orm.Field("unreadCount", jVar, 5, false, false);
        f430001g = field5;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field5, columnType2));
        com.tencent.wcdb.orm.Field field6 = new com.tencent.wcdb.orm.Field("hasShowTongue", jVar, 6, false, false);
        f430002h = field6;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field6, columnType2));
        binding.addIndex("IndexTalker_Type", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2, field, field6, field3));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429997c, f429998d, f429999e, f430000f, f430001g, f430002h};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429995a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.x xVar = (up5.x) obj;
        switch (field.getFieldId()) {
            case 1:
                java.lang.String str = xVar.f430115a;
                if (str != null) {
                    preparedStatement.bindText(str, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 2:
                java.lang.String str2 = xVar.f430116b;
                if (str2 != null) {
                    preparedStatement.bindText(str2, i17);
                    return;
                } else {
                    preparedStatement.bindNull(i17);
                    return;
                }
            case 3:
                preparedStatement.bindInteger(xVar.f430117c, i17);
                return;
            case 4:
                preparedStatement.bindInteger(xVar.f430118d, i17);
                return;
            case 5:
                preparedStatement.bindInteger(xVar.f430119e, i17);
                return;
            case 6:
                preparedStatement.bindInteger(xVar.f430120f, i17);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.x.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.x xVar = (up5.x) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            switch (field.getFieldId()) {
                case 1:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        xVar.f430115a = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                        xVar.f430116b = preparedStatement.getText(i17);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    xVar.f430117c = preparedStatement.getLong(i17);
                    break;
                case 4:
                    xVar.f430118d = preparedStatement.getLong(i17);
                    break;
                case 5:
                    xVar.f430119e = preparedStatement.getInt(i17);
                    break;
                case 6:
                    xVar.f430120f = preparedStatement.getInt(i17);
                    break;
            }
            i17++;
        }
        return xVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
