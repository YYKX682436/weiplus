package j00;

/* loaded from: classes9.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f296731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f296733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296734i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f296735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.q f296736n;

    public c1(j00.k1 k1Var, android.content.Context context, com.tencent.mm.modelbase.o oVar, java.lang.String str, yz5.a aVar, java.lang.String str2, java.util.Map map, yz5.q qVar) {
        this.f296729d = k1Var;
        this.f296730e = context;
        this.f296731f = oVar;
        this.f296732g = str;
        this.f296733h = aVar;
        this.f296734i = str2;
        this.f296735m = map;
        this.f296736n = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(j00.k1.Ai(this.f296729d, this.f296730e), null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490605zr), true, true, j00.b1.f296717d);
        if (Q != null) {
            Q.show();
        }
        com.tencent.mm.modelbase.z2.d(this.f296731f, new j00.a1(this.f296732g, Q, this.f296733h, this.f296729d, this.f296734i, this.f296735m, this.f296736n), false);
    }
}
