package pn4;

/* loaded from: classes4.dex */
public class e2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public pn4.k f357096f;

    /* renamed from: g, reason: collision with root package name */
    public final pn4.j f357097g;

    /* renamed from: h, reason: collision with root package name */
    public final int f357098h;

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f357094d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f357095e = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f357099i = new com.tencent.mm.sdk.platformtools.b4(new pn4.d2(this), false);

    public e2(int i17, pn4.j jVar) {
        this.f357098h = i17;
        this.f357097g = jVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f357096f != m1Var) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkingTranslate", "not my translate work");
            return;
        }
        this.f357099i.d();
        java.lang.System.currentTimeMillis();
        pn4.k kVar = (pn4.k) m1Var;
        java.util.LinkedList linkedList = kVar.f357130f;
        if (linkedList != null) {
            linkedList.size();
        }
        this.f357096f = null;
        this.f357095e = false;
        ((pn4.q1) this.f357097g).b(this.f357098h, i17, i18, str, this.f357094d, kVar.f357130f);
    }
}
