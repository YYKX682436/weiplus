package sz1;

/* loaded from: classes5.dex */
public class b extends sz1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f413937a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f413938b;

    public b(java.lang.Object[] objArr) {
        this.f413938b = objArr;
    }

    @Override // sz1.d
    public boolean a(java.util.Map map) {
        if (map == null) {
            return false;
        }
        for (java.lang.Object obj : map.values()) {
            try {
                java.lang.String valueOf = obj instanceof java.lang.String ? (java.lang.String) obj : obj instanceof java.lang.Number ? java.lang.String.valueOf(obj) : null;
                if (valueOf != null && valueOf.length() > this.f413937a) {
                    this.f413937a = valueOf.length();
                    this.f413938b[0] = obj;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.ParamsUtils", "[getMaxLengthParam] throw Exception : " + e17.getMessage());
            }
        }
        return false;
    }
}
