package w22;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f442565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w22.v vVar, boolean z17, java.lang.String str) {
        super(0);
        this.f442564d = vVar;
        this.f442565e = z17;
        this.f442566f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        w22.v vVar = this.f442564d;
        com.tencent.mm.sdk.platformtools.u3.l(vVar.f442595p);
        y22.h hVar = vVar.f442582c;
        ((y22.m) hVar).b();
        if (this.f442565e) {
            ((y22.m) hVar).c(true, this.f442566f);
        } else {
            db5.t7.makeText(vVar.f442580a, com.tencent.mm.R.string.bwb, 0).show();
            vVar.h();
        }
        return jz5.f0.f302826a;
    }
}
