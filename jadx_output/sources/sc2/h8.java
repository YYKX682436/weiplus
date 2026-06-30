package sc2;

/* loaded from: classes2.dex */
public final class h8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f405952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.av f405953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f405954c;

    public h8(sc2.p8 p8Var, r45.av avVar, yz5.l lVar) {
        this.f405952a = p8Var;
        this.f405953b = avVar;
        this.f405954c = lVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        r45.av avVar = this.f405953b;
        sc2.p8 p8Var = this.f405952a;
        if (bitmap != null) {
            pm0.v.X(new sc2.g8(avVar, bitmap, p8Var, this.f405954c));
        }
        com.tencent.mars.xlog.Log.i(p8Var.f406152w, "getImage resource :" + bitmap + ' ' + avVar.getString(0));
    }
}
