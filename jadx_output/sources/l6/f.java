package l6;

/* loaded from: classes16.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f316723a;

    /* renamed from: b, reason: collision with root package name */
    public l6.e[] f316724b;

    public f(l6.i iVar) {
    }

    public int a() {
        int i17 = 0;
        for (l6.e eVar : this.f316724b) {
            int i18 = eVar.f316716a;
            if (i18 == 4096) {
                i17 += (((l6.d) eVar).f316714h * 3) + 8;
            } else if (i18 == 4097) {
                i17 += 7;
            }
        }
        return i17 + 3;
    }
}
