package f0;

/* loaded from: classes14.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f258258a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.u1[] f258259b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f258260c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f258261d;

    /* renamed from: e, reason: collision with root package name */
    public final int f258262e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.s f258263f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258264g;

    /* renamed from: h, reason: collision with root package name */
    public final int f258265h;

    /* renamed from: i, reason: collision with root package name */
    public final int f258266i;

    /* renamed from: j, reason: collision with root package name */
    public final int f258267j;

    public w1(int i17, f0.u1[] u1VarArr, java.util.List list, boolean z17, int i18, p2.s sVar, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this.f258258a = i17;
        this.f258259b = u1VarArr;
        this.f258260c = list;
        this.f258261d = z17;
        this.f258262e = i18;
        this.f258263f = sVar;
        this.f258264g = i19;
        this.f258265h = i27;
        int i28 = 0;
        for (f0.u1 u1Var : u1VarArr) {
            i28 = java.lang.Math.max(i28, u1Var.f258245m);
        }
        this.f258266i = i28;
        this.f258267j = i28 + this.f258264g;
    }

    public final java.util.List a(int i17, int i18, int i19) {
        f0.u1[] u1VarArr = this.f258259b;
        java.util.ArrayList arrayList = new java.util.ArrayList(u1VarArr.length);
        int length = u1VarArr.length;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (i27 < length) {
            f0.u1 u1Var = u1VarArr[i27];
            int i38 = i28 + 1;
            int i39 = (int) ((f0.d) this.f258260c.get(i28)).f258040a;
            int i47 = this.f258263f == p2.s.Rtl ? (this.f258262e - i29) - i39 : i29;
            int i48 = this.f258258a;
            boolean z17 = this.f258261d;
            f0.q0 a17 = u1Var.a(i17, i37, i18, i19, z17 ? i48 : i47, z17 ? i47 : i48, this.f258266i);
            i37 += u1Var.f258236d + this.f258265h;
            i29 += i39;
            arrayList.add(a17);
            i27++;
            i28 = i38;
            u1VarArr = u1VarArr;
        }
        return arrayList;
    }
}
