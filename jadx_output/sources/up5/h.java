package up5;

/* loaded from: classes12.dex */
public class h implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f429965a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.h f429966b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429967c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f429968d;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f429965a = binding;
        up5.h hVar = new up5.h();
        f429966b = hVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field(dm.i4.COL_ID, hVar, 1, false, false);
        f429967c = field;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Integer));
        binding.addIndex("FavTagInfo_id", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, hVar, 2, false, false);
        f429968d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Text));
        binding.addIndex("FavTagInfo_name", true, new com.tencent.wcdb.winq.StatementCreateIndex().ifNotExist().indexedBy(field2));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f429967c, f429968d};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f429965a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        up5.v vVar = (up5.v) obj;
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            preparedStatement.bindInteger(vVar.f430089a, i17);
            return;
        }
        if (fieldId != 2) {
            return;
        }
        java.lang.String str = vVar.f430090b;
        if (str != null) {
            preparedStatement.bindText(str, i17);
        } else {
            preparedStatement.bindNull(i17);
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return up5.v.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        up5.v vVar = (up5.v) cls.newInstance();
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                vVar.f430089a = preparedStatement.getInt(i17);
            } else if (fieldId == 2 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                vVar.f430090b = preparedStatement.getText(i17);
            }
            i17++;
        }
        return vVar;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
    }
}
