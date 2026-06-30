package db2;

/* loaded from: classes10.dex */
public final class m0 extends az2.j {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f228066v = 0;

    /* renamed from: t, reason: collision with root package name */
    public final nv2.a0 f228067t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228068u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(nv2.a0 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m0.<init>(nv2.a0, boolean):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t31 resp = (r45.t31) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = this.f228068u;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        int i19 = 0;
        nv2.a0 a0Var = this.f228067t;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) resp.getCustom(1);
            if (finderContact != null) {
                com.tencent.mars.xlog.Log.i(str2, "newContact.followFlag: " + java.lang.Integer.valueOf(finderContact.getFollowFlag()));
                ya2.h.f460484a.i(a0Var.f340432d, finderContact.getFollowFlag());
                return;
            }
            ya2.g gVar = ya2.h.f460484a;
            java.lang.String str3 = a0Var.f340432d;
            if (a0Var.f340433e == 1) {
                i19 = ya2.b2.Q2;
            } else {
                l75.e0 e0Var = ya2.b2.O2;
            }
            gVar.i(str3, i19);
            return;
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hz2.d.f286313a.h(i17, i18, str);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long j17 = a0Var.f340434f;
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = j17;
        iaVar.f6919b = 1;
        feedUpdateEvent.e();
        ya2.g gVar2 = ya2.h.f460484a;
        if (a0Var.f340433e == 1) {
            l75.e0 e0Var2 = ya2.b2.O2;
        } else {
            i19 = ya2.b2.Q2;
        }
        gVar2.i(a0Var.f340432d, i19);
    }
}
