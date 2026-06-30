package so2;

/* loaded from: classes4.dex */
public final class x1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f410697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f410698c;

    public x1(java.lang.String str, int i17, r45.qt2 qt2Var) {
        this.f410696a = str;
        this.f410697b = i17;
        this.f410698c = qt2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        r45.qt2 qt2Var = this.f410698c;
        int i18 = this.f410697b;
        java.lang.String str = this.f410696a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
            am.zd zdVar = followUserEvent.f54346g;
            zdVar.f8551a = str;
            zdVar.f8552b = i18;
            zdVar.f8554d = qt2Var.getInteger(7);
            zdVar.f8555e = qt2Var.getInteger(5);
            zdVar.f8553c = true;
            followUserEvent.e();
        } else if (i17 == 4) {
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent2 = new com.tencent.mm.autogen.events.FollowUserEvent();
            am.zd zdVar2 = followUserEvent2.f54346g;
            zdVar2.f8551a = str;
            zdVar2.f8552b = i18;
            zdVar2.f8554d = qt2Var.getInteger(7);
            zdVar2.f8555e = qt2Var.getInteger(5);
            zdVar2.f8553c = false;
            followUserEvent2.e();
        }
        return jz5.f0.f302826a;
    }
}
