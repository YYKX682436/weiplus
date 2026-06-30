package com.tencent.wcdb.orm;

/* loaded from: classes12.dex */
public class Field<T> extends com.tencent.wcdb.winq.Column {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected com.tencent.wcdb.orm.TableBinding<T> binding;
    private int fieldId;
    private boolean isAutoIncrement;
    private boolean isPrimaryKey;
    private java.lang.String name;

    public Field(java.lang.String str, com.tencent.wcdb.orm.TableBinding<T> tableBinding, int i17, boolean z17, boolean z18) {
        super(str, tableBinding.baseBinding().getBaseBinding());
        this.name = str;
        this.binding = tableBinding;
        this.fieldId = i17;
        this.isAutoIncrement = z17;
        this.isPrimaryKey = z18;
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Class<T> getBindClass(com.tencent.wcdb.orm.Field<T>... fieldArr) {
        return fieldArr[0].binding.bindingType();
    }

    public static <T> com.tencent.wcdb.orm.TableBinding<T> getBinding(com.tencent.wcdb.orm.Field<T> field) {
        return field.getTableBinding();
    }

    public com.tencent.wcdb.orm.Field<T> copySelf() {
        com.tencent.wcdb.orm.Field<T> field = new com.tencent.wcdb.orm.Field<>();
        field.cppObj = copy(this.cppObj);
        field.name = this.name;
        field.fieldId = this.fieldId;
        field.isAutoIncrement = this.isAutoIncrement;
        field.isPrimaryKey = this.isPrimaryKey;
        field.binding = this.binding;
        return field;
    }

    public int getFieldId() {
        return this.fieldId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.tencent.wcdb.orm.TableBinding<T> getTableBinding() {
        return this.binding;
    }

    public boolean isAutoIncrement() {
        return this.isAutoIncrement;
    }

    public boolean isPrimaryKey() {
        return this.isPrimaryKey;
    }

    @java.lang.SafeVarargs
    public static <T> com.tencent.wcdb.orm.TableBinding<T> getBinding(com.tencent.wcdb.orm.Field<T>... fieldArr) {
        return getBinding(fieldArr[0]);
    }

    @Override // com.tencent.wcdb.winq.Column
    public com.tencent.wcdb.orm.Field<T> table(java.lang.String str) {
        com.tencent.wcdb.orm.Field<T> copySelf = copySelf();
        copySelf.inTable(copySelf.cppObj, str);
        return copySelf;
    }

    @Override // com.tencent.wcdb.winq.Column
    public com.tencent.wcdb.orm.Field<T> of(java.lang.String str) {
        com.tencent.wcdb.orm.Field<T> copySelf = copySelf();
        copySelf.ofSchema(str);
        return copySelf;
    }

    @Override // com.tencent.wcdb.winq.Column
    public com.tencent.wcdb.orm.Field<T> of(com.tencent.wcdb.winq.Schema schema) {
        com.tencent.wcdb.orm.Field<T> copySelf = copySelf();
        copySelf.ofSchema(schema);
        return copySelf;
    }

    public Field() {
        this.binding = null;
        this.fieldId = 0;
        this.isAutoIncrement = false;
        this.isPrimaryKey = false;
    }
}
