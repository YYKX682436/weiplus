package p75;

/* loaded from: classes4.dex */
public final class j extends p75.d {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f352666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String name, java.lang.String dataType, java.lang.String tableName, java.lang.String referTo, java.lang.String function) {
        super(name, dataType, tableName, referTo);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dataType, "dataType");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(referTo, "referTo");
        kotlin.jvm.internal.o.g(function, "function");
        this.f352666e = function;
    }

    @Override // p75.d
    public java.lang.String z() {
        return this.f352666e + '(' + super.z() + ')';
    }
}
