package u4;

/* loaded from: classes13.dex */
public class e1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.b f424470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u4.f1 f424471e;

    public e1(u4.f1 f1Var, x.b bVar) {
        this.f424471e = f1Var;
        this.f424470d = bVar;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        ((java.util.ArrayList) this.f424470d.getOrDefault(this.f424471e.f424476e, null)).remove(transition);
    }
}
