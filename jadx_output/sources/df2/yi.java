package df2;

/* loaded from: classes3.dex */
public final class yi extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231870m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f231871n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231870m = "LiveGamePromoteBulletDataController";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.ec2 ec2Var = new r45.ec2();
        ec2Var.set(0, this.f231871n);
        tbVar.e(43, ec2Var, new df2.xi(this, r45.fc2.class), true);
    }
}
