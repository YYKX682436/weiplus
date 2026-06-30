package u81;

/* loaded from: classes7.dex */
public class r extends u81.n0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u81.f0 f0Var, long j17, java.lang.Boolean bool) {
        super(j17, bool);
        this.f425457h = f0Var;
    }

    @Override // u81.n0
    public java.lang.Object b() {
        k75.a e17 = this.f425457h.e();
        return java.lang.Boolean.valueOf((e17 instanceof u81.c0) && !(e17 instanceof u81.d0));
    }
}
