package nv2;

/* loaded from: classes10.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.a0 f340639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340640b;

    public z(nv2.a0 a0Var, nv2.o1 o1Var) {
        this.f340639a = a0Var;
        this.f340640b = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.FollowActionTask", "FollowAction callback " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        int i17 = fVar.f70615a;
        nv2.o1 o1Var = this.f340640b;
        nv2.a0 a0Var = this.f340639a;
        if (i17 == 0 && fVar.f70616b == 0) {
            nv2.d0.f340470e.e(a0Var);
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
            am.zd zdVar = followUserEvent.f54346g;
            zdVar.f8551a = a0Var.f340432d;
            zdVar.f8552b = a0Var.f340433e;
            r45.qt2 qt2Var = a0Var.f340436h;
            zdVar.f8554d = qt2Var != null ? qt2Var.getInteger(7) : 0;
            zdVar.f8555e = qt2Var != null ? qt2Var.getInteger(5) : 0;
            zdVar.f8553c = true;
            followUserEvent.e();
            o1Var.a(fp0.u.f265290f, false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (i17 == 4) {
                nv2.d0.f340470e.e(a0Var);
                com.tencent.mm.autogen.events.FollowUserEvent followUserEvent2 = new com.tencent.mm.autogen.events.FollowUserEvent();
                am.zd zdVar2 = followUserEvent2.f54346g;
                zdVar2.f8551a = a0Var.f340432d;
                zdVar2.f8552b = a0Var.f340433e;
                r45.qt2 qt2Var2 = a0Var.f340436h;
                zdVar2.f8554d = qt2Var2 != null ? qt2Var2.getInteger(7) : 0;
                zdVar2.f8555e = qt2Var2 != null ? qt2Var2.getInteger(5) : 0;
                zdVar2.f8553c = false;
                followUserEvent2.e();
                if (fVar.f70616b == -4010) {
                    pm0.v.X(nv2.y.f340635d);
                }
                o1Var.a(fp0.u.f265291g, false);
            } else {
                o1Var.a(fp0.u.f265291g, true);
            }
            if (fVar.f70616b == -4048) {
                db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, fVar.f70617c);
            }
        }
        return jz5.f0.f302826a;
    }
}
