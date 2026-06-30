package kh;

/* loaded from: classes12.dex */
public class l3 extends kh.o3 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f307857c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.i3 f307858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(java.lang.String pattern, kh.i3 mapping) {
        super(mapping);
        kotlin.jvm.internal.o.g(pattern, "pattern");
        kotlin.jvm.internal.o.g(mapping, "mapping");
        this.f307857c = pattern;
        this.f307858d = mapping;
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String pattern = this.f307857c;
        kotlin.jvm.internal.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        if (compile.matcher(name).find()) {
            return this.f307858d.a(this, name);
        }
        return null;
    }
}
