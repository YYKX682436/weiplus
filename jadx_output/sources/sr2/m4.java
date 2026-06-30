package sr2;

/* loaded from: classes10.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f411637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f411638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f411636d = postMainUIC;
        this.f411637e = finderJumpInfo;
        this.f411638f = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411636d;
        ry2.o k76 = postMainUIC.k7();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f411637e;
        k76.I = finderJumpInfo;
        postMainUIC.getIntent().putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
        androidx.appcompat.app.AppCompatActivity activity = this.f411638f;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((sr2.q1) pf5.z.f353948a.a(activity).a(sr2.q1.class)).R6(finderJumpInfo, true);
        return jz5.f0.f302826a;
    }
}
