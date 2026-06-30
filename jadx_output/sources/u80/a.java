package u80;

/* loaded from: classes4.dex */
public class a implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double[] f425390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double[] f425391e;

    public a(u80.b bVar, double[] dArr, double[] dArr2) {
        this.f425390d = dArr;
        this.f425391e = dArr2;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        this.f425390d[0] = f18;
        this.f425391e[0] = f17;
        return false;
    }
}
