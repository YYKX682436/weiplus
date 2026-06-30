package mn2;

/* loaded from: classes4.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f330149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f330151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f330152g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(mn2.x3 x3Var, java.lang.String str, long j17, long j18) {
        super(0);
        this.f330149d = x3Var;
        this.f330150e = str;
        this.f330151f = j17;
        this.f330152g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mn2.x3 x3Var = this.f330149d;
        t21.h0 h0Var = x3Var.f330160e;
        if (h0Var != null) {
            h0Var.f(this.f330150e, this.f330151f, this.f330152g);
        }
        cw2.eb ebVar = x3Var.f330159d;
        if (ebVar != null) {
            ebVar.c((int) this.f330151f, (int) this.f330152g, x3Var.f330161f);
        }
        return jz5.f0.f302826a;
    }
}
