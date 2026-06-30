package im2;

/* loaded from: classes2.dex */
public final class s6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292531d;

    /* renamed from: e, reason: collision with root package name */
    public r45.u62 f292532e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f292533f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f292534g;

    /* renamed from: h, reason: collision with root package name */
    public vd2.v2 f292535h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f292536i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f292537m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292531d = "FinderLiveVisitorLoadDataUIC@" + hashCode() + '}';
        this.f292536i = jz5.h.b(im2.p6.f292501d);
        this.f292537m = jz5.h.b(im2.r6.f292520d);
    }

    public final void O6(db2.q5 netScene) {
        kotlin.jvm.internal.o.g(netScene, "netScene");
        r45.u62 u62Var = this.f292532e;
        com.tencent.mm.protobuf.g gVar = this.f292533f;
        if (u62Var == null || gVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f292531d, "fillRelatedCgi pullType:" + u62Var.getInteger(1) + ", liveCookies:" + android.util.Base64.encodeToString(gVar.g(), 0));
        netScene.N().set(25, gVar);
        this.f292532e = null;
        this.f292533f = null;
    }

    public final int P6() {
        return ((java.lang.Number) ((jz5.n) this.f292536i).getValue()).intValue();
    }
}
