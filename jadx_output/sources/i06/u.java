package i06;

/* loaded from: classes15.dex */
public final class u extends i06.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f286754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.reflect.Field field) {
        super(null);
        kotlin.jvm.internal.o.g(field, "field");
        this.f286754a = field;
    }

    @Override // i06.y
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.reflect.Field field = this.f286754a;
        java.lang.String name = field.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        sb6.append(x06.o0.a(name));
        sb6.append("()");
        java.lang.Class<?> type = field.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        sb6.append(u06.i.b(type));
        return sb6.toString();
    }
}
