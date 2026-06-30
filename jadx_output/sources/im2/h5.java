package im2;

/* loaded from: classes3.dex */
public final class h5 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292359b;

    public h5(im2.h6 h6Var, java.lang.String str) {
        this.f292358a = h6Var;
        this.f292359b = str;
    }

    @Override // r35.n3
    public final void a(int i17) {
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
        am.zd zdVar = followUserEvent.f54346g;
        zdVar.f8551a = this.f292359b;
        zdVar.f8552b = 1;
        zdVar.f8553c = true;
        followUserEvent.e();
        if (i17 == 1) {
            im2.h6 h6Var = this.f292358a;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.plugin.oo0.Z(h6Var, kotlinx.coroutines.internal.b0.f310484a, null, new im2.g5(h6Var, null), 2, null);
        }
    }
}
