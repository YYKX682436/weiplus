package df2;

/* loaded from: classes2.dex */
public final class ql extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f231169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f231170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(android.view.ViewGroup viewGroup, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        super(0);
        this.f231169d = viewGroup;
        this.f231170e = finderJumpInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f231169d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f231170e;
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453252n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        return jz5.f0.f302826a;
    }
}
