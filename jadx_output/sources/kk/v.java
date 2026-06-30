package kk;

/* loaded from: classes7.dex */
public class v extends java.lang.Number {

    /* renamed from: d, reason: collision with root package name */
    public final int f308478d;

    public v(int i17) {
        this.f308478d = 0;
        this.f308478d = i17;
    }

    public static java.lang.String a(int i17) {
        return new kk.v(i17).toString();
    }

    public static int b(java.lang.String str) {
        try {
            return new kk.v(java.lang.Long.valueOf(str).longValue()).f308478d;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return (this.f308478d | 0) + 0.0d;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) ((this.f308478d | 0) + 0.0d);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f308478d;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f308478d & io.flutter.embedding.android.KeyboardMap.kValueMask;
    }

    public java.lang.String toString() {
        return "" + (this.f308478d & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    public v(long j17) {
        this.f308478d = 0;
        this.f308478d = (int) (j17 & (-1));
    }
}
