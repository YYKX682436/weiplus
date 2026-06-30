package jj0;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f299962a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f299963b;

    public b(int i17, java.lang.String str) {
        this.f299962a = i17;
        this.f299963b = str;
    }

    public static jj0.b a(int i17, java.lang.Object... objArr) {
        jj0.b bVar = new jj0.b();
        bVar.f299962a = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length - 1;
        for (int i18 = 0; i18 < length; i18++) {
            sb6.append(java.lang.String.valueOf(objArr[i18]));
            sb6.append(',');
        }
        sb6.append(java.lang.String.valueOf(objArr[length]));
        bVar.f299963b = sb6.toString();
        return bVar;
    }
}
