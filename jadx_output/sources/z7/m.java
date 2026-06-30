package z7;

/* loaded from: classes16.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f470489b = {'\\', '\"'};

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f470490c = {'\\', '\\'};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f470491d = {'\\', 'n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f470492e = {'\\', 'r'};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f470493f = {'\\', 't'};

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f470494g = {'\\', 'u', '2', '0', '2', '8'};

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f470495h = {'\\', 'u', '2', '0', '2', '9'};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f470496i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Writer f470497a;

    public m(java.io.Writer writer) {
        this.f470497a = writer;
    }

    public void a() {
        this.f470497a.write(93);
    }

    public void b() {
        this.f470497a.write(91);
    }

    public void c() {
        this.f470497a.write(44);
    }

    public void d(java.lang.String str) {
        int length = str.length();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.io.Writer writer = this.f470497a;
            if (i17 >= length) {
                writer.write(str, i18, length - i18);
                return;
            }
            char charAt = str.charAt(i17);
            char[] cArr = null;
            if (charAt > '\\') {
                if (charAt >= 8232 && charAt <= 8233) {
                    cArr = charAt == 8232 ? f470494g : f470495h;
                }
            } else if (charAt == '\\') {
                cArr = f470490c;
            } else if (charAt <= '\"') {
                if (charAt == '\"') {
                    cArr = f470489b;
                } else if (charAt <= 31) {
                    if (charAt == '\n') {
                        cArr = f470491d;
                    } else if (charAt == '\r') {
                        cArr = f470492e;
                    } else if (charAt == '\t') {
                        cArr = f470493f;
                    } else {
                        char[] cArr2 = f470496i;
                        cArr = new char[]{'\\', 'u', '0', '0', cArr2[(charAt >> 4) & 15], cArr2[charAt & 15]};
                    }
                }
            }
            if (cArr != null) {
                writer.write(str, i18, i17 - i18);
                writer.write(cArr);
                i18 = i17 + 1;
            }
            i17++;
        }
    }

    public void e() {
        this.f470497a.write(58);
    }

    public void f() {
        this.f470497a.write(125);
    }

    public void g() {
        this.f470497a.write(123);
    }

    public void h() {
        this.f470497a.write(44);
    }
}
