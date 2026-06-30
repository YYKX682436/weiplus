package nx0;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.x f341115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.u f341116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(nx0.x xVar, nx0.u uVar, int i17) {
        super(0);
        this.f341115d = xVar;
        this.f341116e = uVar;
        this.f341117f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nx0.w wVar = (nx0.w) this.f341115d;
        if (wVar.f341252e) {
            wVar.f341253f = true;
            nx0.u uVar = this.f341116e;
            java.util.List list = uVar.f341232d;
            int i17 = this.f341117f;
            java.lang.Object obj = list.get(i17);
            nx0.w wVar2 = obj instanceof nx0.w ? (nx0.w) obj : null;
            if (wVar2 != null) {
                wVar2.f341252e = false;
            }
            uVar.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
