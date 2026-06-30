package fh0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fh0.c f262523d = new fh0.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        fh0.b item = (fh0.b) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f262519b ? "思考" : "结果";
        java.lang.String str2 = item.f262520c;
        kotlin.jvm.internal.o.g(str2, "<this>");
        if (7 <= str2.length()) {
            charSequence = str2.subSequence(0, str2.length());
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            sb6.append((java.lang.CharSequence) str2);
            int length = 7 - str2.length();
            if (1 <= length) {
                int i17 = 1;
                while (true) {
                    sb6.append(' ');
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                }
            }
            charSequence = sb6;
        }
        java.lang.String obj2 = charSequence.toString();
        fh0.k kVar = fh0.k.f262530a;
        java.lang.String valueOf = java.lang.String.valueOf(item.f262521d);
        java.lang.String str3 = item.f262522e;
        if (str3.length() == 0) {
            str3 = "-";
        }
        return "[" + str + "] " + item.f262518a + '|' + obj2 + '|' + valueOf + '|' + str3;
    }
}
