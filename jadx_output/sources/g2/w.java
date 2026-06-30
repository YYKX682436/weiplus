package g2;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f267750a;

    /* renamed from: b, reason: collision with root package name */
    public g2.i f267751b;

    /* renamed from: c, reason: collision with root package name */
    public int f267752c;

    /* renamed from: d, reason: collision with root package name */
    public int f267753d;

    public w(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f267750a = text;
        this.f267752c = -1;
        this.f267753d = -1;
    }

    public final int a() {
        g2.i iVar = this.f267751b;
        return iVar == null ? this.f267750a.length() : (this.f267750a.length() - (this.f267753d - this.f267752c)) + (iVar.f267708a - (iVar.f267711d - iVar.f267710c));
    }

    public final void b(int i17, int i18, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        g2.i iVar = this.f267751b;
        if (iVar == null) {
            int max = java.lang.Math.max(255, text.length() + 128);
            char[] cArr = new char[max];
            int min = java.lang.Math.min(i17, 64);
            int min2 = java.lang.Math.min(this.f267750a.length() - i18, 64);
            int i19 = i17 - min;
            g2.j.a(this.f267750a, cArr, 0, i19, i17);
            int i27 = max - min2;
            int i28 = min2 + i18;
            g2.j.a(this.f267750a, cArr, i27, i18, i28);
            g2.j.a(text, cArr, min, 0, text.length());
            this.f267751b = new g2.i(cArr, min + text.length(), i27);
            this.f267752c = i19;
            this.f267753d = i28;
            return;
        }
        int i29 = this.f267752c;
        int i37 = i17 - i29;
        int i38 = i18 - i29;
        if (i37 < 0 || i38 > iVar.f267708a - (iVar.f267711d - iVar.f267710c)) {
            this.f267750a = toString();
            this.f267751b = null;
            this.f267752c = -1;
            this.f267753d = -1;
            b(i17, i18, text);
            return;
        }
        int length = text.length() - (i38 - i37);
        int i39 = iVar.f267711d - iVar.f267710c;
        if (length > i39) {
            int i47 = length - i39;
            int i48 = iVar.f267708a;
            do {
                i48 *= 2;
            } while (i48 - iVar.f267708a < i47);
            char[] cArr2 = new char[i48];
            kz5.v.i(iVar.f267709b, cArr2, 0, 0, iVar.f267710c);
            int i49 = iVar.f267708a;
            int i57 = iVar.f267711d;
            int i58 = i49 - i57;
            int i59 = i48 - i58;
            kz5.v.i(iVar.f267709b, cArr2, i59, i57, i58 + i57);
            iVar.f267709b = cArr2;
            iVar.f267708a = i48;
            iVar.f267711d = i59;
        }
        int i66 = iVar.f267710c;
        if (i37 < i66 && i38 <= i66) {
            int i67 = i66 - i38;
            char[] cArr3 = iVar.f267709b;
            kz5.v.i(cArr3, cArr3, iVar.f267711d - i67, i38, i66);
            iVar.f267710c = i37;
            iVar.f267711d -= i67;
        } else if (i37 >= i66 || i38 < i66) {
            int i68 = iVar.f267711d;
            int i69 = i68 - i66;
            int i76 = i37 + i69;
            char[] cArr4 = iVar.f267709b;
            kz5.v.i(cArr4, cArr4, i66, i68, i76);
            iVar.f267710c += i76 - i68;
            iVar.f267711d = i38 + i69;
        } else {
            iVar.f267711d = i38 + (iVar.f267711d - i66);
            iVar.f267710c = i37;
        }
        g2.j.a(text, iVar.f267709b, iVar.f267710c, 0, text.length());
        iVar.f267710c += text.length();
    }

    public java.lang.String toString() {
        g2.i iVar = this.f267751b;
        if (iVar == null) {
            return this.f267750a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.CharSequence) this.f267750a, 0, this.f267752c);
        sb6.append(iVar.f267709b, 0, iVar.f267710c);
        char[] cArr = iVar.f267709b;
        int i17 = iVar.f267711d;
        sb6.append(cArr, i17, iVar.f267708a - i17);
        java.lang.String str = this.f267750a;
        sb6.append((java.lang.CharSequence) str, this.f267753d, str.length());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "sb.toString()");
        return sb7;
    }
}
