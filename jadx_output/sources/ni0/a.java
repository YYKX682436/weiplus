package ni0;

/* loaded from: classes12.dex */
public class a implements com.tencent.wcdb.orm.TableBinding {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Binding f337185a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.a f337186b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337187c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wcdb.orm.Field f337188d;

    static {
        com.tencent.wcdb.orm.Binding binding = new com.tencent.wcdb.orm.Binding();
        f337185a = binding;
        ni0.a aVar = new ni0.a();
        f337186b = aVar;
        com.tencent.wcdb.orm.Field field = new com.tencent.wcdb.orm.Field("authorUserName", aVar, 1, false, false);
        f337187c = field;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field, com.tencent.wcdb.winq.ColumnType.Text));
        com.tencent.wcdb.orm.Field field2 = new com.tencent.wcdb.orm.Field("updateTimeMs", aVar, 2, false, false);
        f337188d = field2;
        binding.addColumnDef(new com.tencent.wcdb.winq.ColumnDef(field2, com.tencent.wcdb.winq.ColumnType.Integer));
        binding.addTableConstraint(new com.tencent.wcdb.winq.TableConstraint().primaryKey().indexedBy(field, field2));
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Field[] allBindingFields() {
        return new com.tencent.wcdb.orm.Field[]{f337187c, f337188d};
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public com.tencent.wcdb.orm.Binding baseBinding() {
        return f337185a;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public void bindField(java.lang.Object obj, com.tencent.wcdb.orm.Field field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement) {
        android.support.v4.media.f.a(obj);
        int fieldId = field.getFieldId();
        if (fieldId == 1) {
            throw null;
        }
        if (fieldId == 2) {
            throw null;
        }
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Class bindingType() {
        return ni0.g.class;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public java.lang.Object extractObject(com.tencent.wcdb.orm.Field[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class cls) {
        android.support.v4.media.f.a(cls.newInstance());
        int i17 = 0;
        for (com.tencent.wcdb.orm.Field field : fieldArr) {
            int fieldId = field.getFieldId();
            if (fieldId == 1) {
                if (preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                    preparedStatement.getText(i17);
                    throw null;
                }
            } else if (fieldId == 2 && preparedStatement.getColumnType(i17) != com.tencent.wcdb.winq.ColumnType.Null) {
                preparedStatement.getLong(i17);
                throw null;
            }
            i17++;
        }
        return null;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ boolean isAutoIncrement(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        return false;
    }

    @Override // com.tencent.wcdb.orm.TableBinding
    public /* bridge */ /* synthetic */ void setLastInsertRowId(java.lang.Object obj, long j17) {
        android.support.v4.media.f.a(obj);
    }
}
