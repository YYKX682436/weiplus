package o23;

/* loaded from: classes10.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f342425a = {0, 0, 0, 0};

    public void a(int i17) {
        if (i17 < 1 || i17 > 4) {
            return;
        }
        int i18 = i17 - 1;
        int[] iArr = this.f342425a;
        iArr[i18] = iArr[i18] + 1;
    }

    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int[] iArr = this.f342425a;
        sb6.append(iArr[0]);
        sb6.append("#");
        sb6.append(iArr[1]);
        sb6.append("#");
        sb6.append(iArr[2]);
        sb6.append("#");
        sb6.append(iArr[3]);
        return sb6.toString();
    }
}
