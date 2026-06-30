package ks5;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f311849a;

    /* renamed from: b, reason: collision with root package name */
    public int f311850b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f311851c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f311852d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f311853e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f311854f;

    public e(java.lang.Class cls) {
        this.f311849a = cls;
    }

    public java.lang.Object a(int i17, int i18) {
        for (int i19 = 0; i19 < this.f311850b; i19++) {
            if (this.f311852d[i19] < i18 && this.f311853e[i19] > i17) {
                return this.f311851c[i19];
            }
        }
        return null;
    }

    public void b(android.text.Spanned spanned, int i17, int i18) {
        java.lang.Object[] objArr;
        java.lang.Class cls = this.f311849a;
        java.lang.Object[] spans = spanned.getSpans(i17, i18, cls);
        int length = spans.length;
        if (length > 0 && ((objArr = this.f311851c) == null || objArr.length < length)) {
            this.f311851c = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, length);
            this.f311852d = new int[length];
            this.f311853e = new int[length];
            this.f311854f = new int[length];
        }
        this.f311850b = 0;
        for (java.lang.Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart != spanEnd) {
                int spanFlags = spanned.getSpanFlags(obj);
                java.lang.Object[] objArr2 = this.f311851c;
                int i19 = this.f311850b;
                objArr2[i19] = obj;
                this.f311852d[i19] = spanStart;
                this.f311853e[i19] = spanEnd;
                this.f311854f[i19] = spanFlags;
                this.f311850b = i19 + 1;
            }
        }
    }
}
