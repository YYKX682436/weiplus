package mu5;

/* loaded from: classes15.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f331465a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f331466b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f331467c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f331468d;

    static {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y(kotlin.jvm.internal.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_java_lang_reflect_Field_modifiers", "getField_java_lang_reflect_Field_modifiers()Ljava/lang/reflect/Field;");
        kotlin.jvm.internal.j0 j0Var = kotlin.jvm.internal.i0.f310124a;
        f331465a = new f06.v[]{j0Var.f(yVar), j0Var.f(new kotlin.jvm.internal.y(kotlin.jvm.internal.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_Default", "getField_kotlinx_coroutines_Dispatchers_Default()Ljava/lang/reflect/Field;")), j0Var.f(new kotlin.jvm.internal.y(kotlin.jvm.internal.i0.b(mu5.d.class, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_IO", "getField_kotlinx_coroutines_Dispatchers_IO()Ljava/lang/reflect/Field;"))};
        f331466b = jz5.h.b(mu5.a.f331462d);
        f331467c = jz5.h.b(mu5.b.f331463d);
        f331468d = jz5.h.b(mu5.c.f331464d);
    }

    public static final boolean a(java.lang.reflect.Field field) {
        try {
            jz5.g gVar = f331466b;
            f06.v vVar = f331465a[0];
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) ((jz5.n) gVar).getValue();
            if (field2 != null) {
                field2.set(field, java.lang.Integer.valueOf(field.getModifiers() & (-17)));
            }
            return true;
        } catch (java.lang.Throwable th6) {
            b(th6);
            return false;
        }
    }

    public static final java.lang.String b(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.o.c(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
