package mq4;

/* loaded from: classes14.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.c f330783d;

    public b(mq4.c cVar) {
        this.f330783d = cVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.g gVar;
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.g gVar2;
        com.tencent.mm.protobuf.g gVar3;
        mq4.c cVar = this.f330783d;
        java.lang.String str2 = cVar.f330785h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ack response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        com.tencent.mm.plugin.voip.model.g1 g1Var = cVar.f330796g;
        sb6.append(g1Var.f176508a);
        vq4.d0.c(str2, sb6.toString());
        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.K));
        com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var.f176532x.M1;
        l1Var2.getClass();
        l1Var2.L = java.lang.System.currentTimeMillis();
        int i19 = g1Var.f176508a;
        java.lang.String str3 = cVar.f330785h;
        if (i19 == 1) {
            vq4.d0.c(str3, "reject ok!");
            return;
        }
        if (i19 != 3 && (i19 != 4 || g1Var.f176516h)) {
            vq4.d0.b(str3, "ack response not within WAITCONNECT, ignored.");
            return;
        }
        vq4.d0.c(str3, "current status:" + g1Var.f176508a + " isCanSendData:" + g1Var.f176516h);
        if (i17 == 0 || i17 == 4) {
            r45.a27 a27Var = (r45.a27) cVar.K();
            vq4.d0.c(str3, "ack cur roomid " + g1Var.f176532x.f176877q + " ack resp roomid " + a27Var.f369673d);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            int i27 = v2protocalVar.f176877q;
            if (i27 != 0) {
                long j17 = v2protocalVar.f176883s;
                if (j17 != 0 && (i27 != a27Var.f369673d || j17 != a27Var.f369674e)) {
                    vq4.d0.c(str3, "ack resp ignore invalid roomid, cur roomid " + g1Var.f176532x.f176877q + " ack resp roomid " + a27Var.f369673d);
                    return;
                }
            }
            if (i17 == 4) {
                com.tencent.mm.plugin.voip.model.l1 l1Var3 = v2protocalVar.M1;
                l1Var3.f176713a = 12;
                l1Var3.f176715b = i18;
                g1Var.v(1, i18, "", -1);
                return;
            }
            v2protocalVar.f176876p1 = a27Var.f369685s;
            int i28 = a27Var.f369686t;
            v2protocalVar.f176882r1 = i28;
            if (i28 > 0) {
                v2protocalVar.f176879q1 = true;
            }
            if (a27Var.f369677h != 1) {
                vq4.d0.c(str3, "onVoipAckResp: do not use preconnect");
                return;
            }
            g1Var.f176518j = true;
            v2protocalVar.K0 = 1;
            v2protocalVar.f176877q = a27Var.f369673d;
            v2protocalVar.f176883s = a27Var.f369674e;
            v2protocalVar.f176880r = a27Var.f369675f;
            v2protocalVar.D = a27Var.f369680n;
            v2protocalVar.E = a27Var.f369683q;
            v2protocalVar.I = a27Var.f369681o;
            v2protocalVar.Q0 = a27Var.f369687u;
            v2protocalVar.C = a27Var.f369678i;
            vq4.d0.c(str3, "ack ok, roomid =" + g1Var.f176532x.f176877q + ",memberid = " + g1Var.f176532x.f176880r + " enable data accept " + g1Var.f176532x.f176876p1 + " rudp accept th" + g1Var.f176532x.f176882r1);
            r45.e37 e37Var = a27Var.f369676g;
            int i29 = e37Var.f372990x;
            if (i29 > 0) {
                e37Var.f372990x = i29 - 1;
                vq4.d0.c(str3, "zhengxue[ENCRYPT] got encryptStrategy[" + e37Var.f372990x + "] from ackresp relaydata");
            } else {
                e37Var.f372990x = 1;
                vq4.d0.c(str3, "zhengxue[LOGIC]:got no EncryptStrategy in ackresp mrdata");
            }
            vq4.d0.c(str3, "ack with switchtcpcnt  =" + g1Var.f176532x.C + " RedirectReqThreshold =" + e37Var.E + " BothSideSwitchFlag =" + e37Var.F + " WifiScanInterval =" + a27Var.f369681o);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
            v2protocalVar2.f176855i1 = e37Var.F;
            r45.cu5 cu5Var2 = e37Var.H;
            if (cu5Var2 != null && (gVar3 = cu5Var2.f371841f) != null) {
                v2protocalVar2.F = gVar3.g();
            }
            r45.cu5 cu5Var3 = a27Var.f369684r;
            if (cu5Var3 != null && (gVar2 = cu5Var3.f371841f) != null) {
                g1Var.f176532x.G = gVar2.g();
            }
            int i37 = e37Var.f372975f;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
            v2protocalVar3.M1.f176720g = (byte) 1;
            v2protocalVar3.f176904z = i37;
            g1Var.N(e37Var.f372973d.f378344e.f371841f.g());
            g1Var.B();
            r45.cu5 cu5Var4 = e37Var.f372982p;
            if (cu5Var4 != null && (gVar = cu5Var4.f371841f) != null && (cu5Var = e37Var.C) != null && cu5Var.f371841f != null) {
                byte[] g17 = gVar.g();
                int i38 = e37Var.f372981o;
                int i39 = e37Var.f372990x;
                byte[] g18 = e37Var.C.f371841f.g();
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var.f176532x;
                v2protocalVar4.f176898x = i38;
                v2protocalVar4.f176901y = g17;
                v2protocalVar4.f176846f1 = i39;
                v2protocalVar4.f176849g1 = g18;
            }
            int i47 = e37Var.f372985s;
            int i48 = e37Var.f372986t;
            int i49 = e37Var.f372987u;
            int i57 = e37Var.f372988v;
            int i58 = e37Var.f372989w;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar5 = g1Var.f176532x;
            v2protocalVar5.W0 = i47;
            v2protocalVar5.X0 = i48;
            v2protocalVar5.Y0 = i49;
            v2protocalVar5.Z0 = i57;
            v2protocalVar5.f176831a1 = i58;
            g1Var.M(e37Var.f372974e.f378344e.f371841f.g());
            gm0.j1.e().j(new mq4.a(this, e37Var));
        }
    }
}
