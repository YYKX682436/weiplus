package n0;

/* loaded from: classes14.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f333526a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f333527b;

    public final int a() {
        int[] iArr = this.f333526a;
        int i17 = this.f333527b - 1;
        this.f333527b = i17;
        return iArr[i17];
    }

    public final void b(int i17) {
        int i18 = this.f333527b;
        int[] iArr = this.f333526a;
        if (i18 >= iArr.length) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            this.f333526a = copyOf;
        }
        int[] iArr2 = this.f333526a;
        int i19 = this.f333527b;
        this.f333527b = i19 + 1;
        iArr2[i19] = i17;
    }
}
