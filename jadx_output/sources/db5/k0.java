package db5;

/* loaded from: classes8.dex */
public class k0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f228416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f228417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228418g;

    public k0(java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2) {
        this.f228415d = str;
        this.f228416e = list;
        this.f228417f = list2;
        this.f228418g = str2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str = this.f228415d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            g4Var.setHeaderTitle(str);
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f228416e;
            if (i17 >= list.size()) {
                break;
            }
            g4Var.f(((java.lang.Integer) this.f228417f.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
            i17++;
        }
        java.lang.String str2 = this.f228418g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        g4Var.f(-1, str2);
    }
}
