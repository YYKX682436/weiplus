package w22;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f442573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w22.v f442574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f442576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f442577h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.ui.widget.dialog.u3 u3Var, w22.v vVar, java.lang.String str, int i17, boolean z17) {
        super(1);
        this.f442573d = u3Var;
        this.f442574e = vVar;
        this.f442575f = str;
        this.f442576g = i17;
        this.f442577h = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f442573d.dismiss();
        w22.v vVar = this.f442574e;
        if (booleanValue) {
            db5.t7.makeText(vVar.f442580a, com.tencent.mm.R.string.c0_, 0).show();
        } else {
            w22.v.a(vVar, this.f442575f, this.f442576g, this.f442577h);
        }
        return jz5.f0.f302826a;
    }
}
