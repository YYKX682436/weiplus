package sc2;

/* loaded from: classes2.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.av f405918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f405919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f405920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f405921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(r45.av avVar, android.graphics.Bitmap bitmap, sc2.p8 p8Var, yz5.l lVar) {
        super(0);
        this.f405918d = avVar;
        this.f405919e = bitmap;
        this.f405920f = p8Var;
        this.f405921g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        java.lang.String string = this.f405918d.getString(0);
        if (!(string instanceof java.lang.String)) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        ((dl4.m0) tVar).cj(string, this.f405919e, new sc2.f8(this.f405920f, this.f405921g));
        return jz5.f0.f302826a;
    }
}
