package x3;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final x3.k[] f451577a;

    /* renamed from: b, reason: collision with root package name */
    public int f451578b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.k[][] f451579c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f451580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.gridlayout.widget.a f451581e;

    public m(androidx.gridlayout.widget.a aVar, x3.k[] kVarArr) {
        this.f451581e = aVar;
        int length = kVarArr.length;
        this.f451577a = new x3.k[length];
        this.f451578b = length - 1;
        int f17 = aVar.f() + 1;
        x3.k[][] kVarArr2 = new x3.k[f17];
        int[] iArr = new int[f17];
        for (x3.k kVar : kVarArr) {
            int i17 = kVar.f451572a.f451585a;
            iArr[i17] = iArr[i17] + 1;
        }
        for (int i18 = 0; i18 < f17; i18++) {
            kVarArr2[i18] = new x3.k[iArr[i18]];
        }
        java.util.Arrays.fill(iArr, 0);
        for (x3.k kVar2 : kVarArr) {
            int i19 = kVar2.f451572a.f451585a;
            x3.k[] kVarArr3 = kVarArr2[i19];
            int i27 = iArr[i19];
            iArr[i19] = i27 + 1;
            kVarArr3[i27] = kVar2;
        }
        this.f451579c = kVarArr2;
        this.f451580d = new int[this.f451581e.f() + 1];
    }

    public void a(int i17) {
        int[] iArr = this.f451580d;
        if (iArr[i17] != 0) {
            return;
        }
        iArr[i17] = 1;
        for (x3.k kVar : this.f451579c[i17]) {
            a(kVar.f451572a.f451586b);
            int i18 = this.f451578b;
            this.f451578b = i18 - 1;
            this.f451577a[i18] = kVar;
        }
        iArr[i17] = 2;
    }
}
