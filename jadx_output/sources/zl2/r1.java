package zl2;

/* loaded from: classes3.dex */
public final class r1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473944b;

    public r1(yz5.l lVar, java.lang.String str) {
        this.f473943a = lVar;
        this.f473944b = str;
    }

    @Override // r35.n3
    public final void a(int i17) {
        yz5.l lVar = this.f473943a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(i17 == 1));
        }
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
        am.zd zdVar = followUserEvent.f54346g;
        zdVar.f8551a = this.f473944b;
        zdVar.f8552b = 4;
        zdVar.f8553c = true;
        followUserEvent.e();
    }
}
