package t9;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Comparator f416551h = new t9.u();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f416552i = new t9.v();

    /* renamed from: a, reason: collision with root package name */
    public final int f416553a;

    /* renamed from: e, reason: collision with root package name */
    public int f416557e;

    /* renamed from: f, reason: collision with root package name */
    public int f416558f;

    /* renamed from: g, reason: collision with root package name */
    public int f416559g;

    /* renamed from: c, reason: collision with root package name */
    public final t9.w[] f416555c = new t9.w[5];

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f416554b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f416556d = -1;

    public x(int i17) {
        this.f416553a = i17;
    }

    public void a(int i17, float f17) {
        t9.w wVar;
        int i18 = this.f416556d;
        java.util.ArrayList arrayList = this.f416554b;
        if (i18 != 1) {
            java.util.Collections.sort(arrayList, f416551h);
            this.f416556d = 1;
        }
        int i19 = this.f416559g;
        t9.w[] wVarArr = this.f416555c;
        if (i19 > 0) {
            int i27 = i19 - 1;
            this.f416559g = i27;
            wVar = wVarArr[i27];
        } else {
            wVar = new t9.w(null);
        }
        int i28 = this.f416557e;
        this.f416557e = i28 + 1;
        wVar.f416548a = i28;
        wVar.f416549b = i17;
        wVar.f416550c = f17;
        arrayList.add(wVar);
        this.f416558f += i17;
        while (true) {
            int i29 = this.f416558f;
            int i37 = this.f416553a;
            if (i29 <= i37) {
                return;
            }
            int i38 = i29 - i37;
            t9.w wVar2 = (t9.w) arrayList.get(0);
            int i39 = wVar2.f416549b;
            if (i39 <= i38) {
                this.f416558f -= i39;
                arrayList.remove(0);
                int i47 = this.f416559g;
                if (i47 < 5) {
                    this.f416559g = i47 + 1;
                    wVarArr[i47] = wVar2;
                }
            } else {
                wVar2.f416549b = i39 - i38;
                this.f416558f -= i38;
            }
        }
    }

    public float b(float f17) {
        int i17 = this.f416556d;
        java.util.ArrayList arrayList = this.f416554b;
        if (i17 != 0) {
            java.util.Collections.sort(arrayList, f416552i);
            this.f416556d = 0;
        }
        float f18 = f17 * this.f416558f;
        int i18 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            t9.w wVar = (t9.w) arrayList.get(i19);
            i18 += wVar.f416549b;
            if (i18 >= f18) {
                return wVar.f416550c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t9.w) arrayList.get(arrayList.size() - 1)).f416550c;
    }
}
