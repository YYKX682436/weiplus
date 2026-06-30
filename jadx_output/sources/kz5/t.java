package kz5;

/* loaded from: classes12.dex */
public final class t extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f314013e;

    public t(int[] iArr) {
        this.f314013e = iArr;
    }

    @Override // kz5.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return false;
        }
        return kz5.z.F(this.f314013e, ((java.lang.Number) obj).intValue());
    }

    @Override // kz5.b
    public int d() {
        return this.f314013e.length;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return java.lang.Integer.valueOf(this.f314013e[i17]);
    }

    @Override // kz5.h, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        return kz5.z.V(this.f314013e, ((java.lang.Number) obj).intValue());
    }

    @Override // kz5.b, java.util.Collection
    public boolean isEmpty() {
        return this.f314013e.length == 0;
    }

    @Override // kz5.h, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Number) obj).intValue();
        int[] iArr = this.f314013e;
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i17 = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i17 < 0) {
                return -1;
            }
            length = i17;
        }
    }
}
