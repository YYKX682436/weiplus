package im2;

/* loaded from: classes3.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f292404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(im2.h6 h6Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact, int i17) {
        super(1);
        this.f292403d = h6Var;
        this.f292404e = finderContact;
        this.f292405f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            im2.h6 h6Var = this.f292403d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, kotlinx.coroutines.internal.b0.f310484a, null, new im2.i5(h6Var, null), 2, null);
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
            java.lang.String username = this.f292404e.getUsername();
            am.zd zdVar = followUserEvent.f54346g;
            zdVar.f8551a = username;
            zdVar.f8552b = this.f292405f;
            zdVar.f8553c = true;
            followUserEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
