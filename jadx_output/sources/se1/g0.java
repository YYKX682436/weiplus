package se1;

/* loaded from: classes13.dex */
public class g0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Comparator f406759h = new se1.d0();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f406760i = new se1.e0();

    /* renamed from: a, reason: collision with root package name */
    public final int f406761a;

    /* renamed from: e, reason: collision with root package name */
    public int f406765e;

    /* renamed from: f, reason: collision with root package name */
    public int f406766f;

    /* renamed from: g, reason: collision with root package name */
    public int f406767g;

    /* renamed from: c, reason: collision with root package name */
    public final se1.f0[] f406763c = new se1.f0[5];

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f406762b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f406764d = -1;

    public g0(int i17) {
        this.f406761a = i17;
    }

    public void a(int i17, float f17) {
        se1.f0 f0Var;
        int i18 = this.f406764d;
        java.util.ArrayList arrayList = this.f406762b;
        if (i18 != 1) {
            java.util.Collections.sort(arrayList, f406759h);
            this.f406764d = 1;
        }
        int i19 = this.f406767g;
        se1.f0[] f0VarArr = this.f406763c;
        if (i19 > 0) {
            int i27 = i19 - 1;
            this.f406767g = i27;
            f0Var = f0VarArr[i27];
        } else {
            f0Var = new se1.f0(null);
        }
        int i28 = this.f406765e;
        this.f406765e = i28 + 1;
        f0Var.f406756a = i28;
        f0Var.f406757b = i17;
        f0Var.f406758c = f17;
        arrayList.add(f0Var);
        this.f406766f += i17;
        while (true) {
            int i29 = this.f406766f;
            int i37 = this.f406761a;
            if (i29 <= i37) {
                return;
            }
            int i38 = i29 - i37;
            se1.f0 f0Var2 = (se1.f0) arrayList.get(0);
            int i39 = f0Var2.f406757b;
            if (i39 <= i38) {
                this.f406766f -= i39;
                arrayList.remove(0);
                int i47 = this.f406767g;
                if (i47 < 5) {
                    this.f406767g = i47 + 1;
                    f0VarArr[i47] = f0Var2;
                }
            } else {
                f0Var2.f406757b = i39 - i38;
                this.f406766f -= i38;
            }
        }
    }

    public float b(float f17) {
        int i17 = this.f406764d;
        java.util.ArrayList arrayList = this.f406762b;
        if (i17 != 0) {
            java.util.Collections.sort(arrayList, f406760i);
            this.f406764d = 0;
        }
        float f18 = f17 * this.f406766f;
        int i18 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            se1.f0 f0Var = (se1.f0) arrayList.get(i19);
            i18 += f0Var.f406757b;
            if (i18 >= f18) {
                return f0Var.f406758c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((se1.f0) arrayList.get(arrayList.size() - 1)).f406758c;
    }
}
