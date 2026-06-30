package kh;

/* loaded from: classes12.dex */
public final class h3 extends kh.i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.h3 f307824a = new kh.h3();

    @Override // kh.i3
    public java.lang.String a(kh.o3 rule, java.lang.String input) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(input, "input");
        if (rule instanceof kh.m3) {
            return ((kh.m3) rule).f307868c + '?';
        }
        if (rule instanceof kh.k3) {
            return "?" + ((kh.k3) rule).f307842c;
        }
        if (!(rule instanceof kh.n3)) {
            return null;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("?");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
