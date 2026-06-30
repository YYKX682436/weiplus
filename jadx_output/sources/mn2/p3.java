package mn2;

/* loaded from: classes4.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q3 f330089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(mn2.q3 q3Var) {
        super(0);
        this.f330089d = q3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f330089d.f330096e;
        if (str == null) {
            str = "";
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
