package sf2;

/* loaded from: classes10.dex */
public final class j1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.m1 f407176d;

    public j1(sf2.m1 m1Var) {
        this.f407176d = m1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams;
        sf2.m1 m1Var = this.f407176d;
        mm2.m6 m6Var = m1Var.f407203b;
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) m6Var.f329251s).getValue();
        if (j6Var instanceof mm2.i6) {
            ah2.b bVar = m1Var.f407204c;
            if (bVar != null) {
                ((dh2.x) bVar).f();
            }
            r45.z22 z22Var = ((mm2.i6) j6Var).f329141a;
            r45.g94 g94Var = new r45.g94();
            long j17 = m1Var.f407207f + 1;
            m1Var.f407207f = j17;
            g94Var.f375016d = j17;
            java.lang.String str = z22Var.f391632i;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            g94Var.f375017e = str;
            java.lang.String str3 = z22Var.f391629f;
            if (str3 == null) {
                str3 = "";
            }
            g94Var.f375021i = str3;
            g94Var.f375018f = m6Var.F;
            r45.e94 e94Var = new r45.e94();
            e94Var.f373162d = m6Var.A;
            e94Var.f373163e = m6Var.B;
            g94Var.f375019g = e94Var;
            r45.f94 f94Var = new r45.f94();
            f94Var.f374112d = m6Var.C;
            f94Var.f374113e = m6Var.D;
            g94Var.f375020h = f94Var;
            g94Var.f375023n = 1;
            g94Var.f375022m = m6Var.E;
            mm2.e1 e1Var = m1Var.f407206e;
            java.lang.String str4 = e1Var.f328987q.f380301n;
            java.lang.String str5 = null;
            if (java.lang.Boolean.valueOf(str4 == null || str4.length() == 0).booleanValue()) {
                str4 = null;
            }
            if (str4 == null) {
                kn0.i iVar = e1Var.f328990t;
                if (iVar != null && (tRTCParams = iVar.f309557a) != null) {
                    str5 = tRTCParams.userId;
                }
                if (str5 != null) {
                    str2 = str5;
                }
            } else {
                str2 = str4;
            }
            g94Var.f375024o = str2;
            r45.fa4 fa4Var = new r45.fa4();
            hn0.u uVar = hn0.u.f282437e;
            fa4Var.f374143d = 1024;
            fa4Var.f374144e = com.tencent.mm.protobuf.g.b(g94Var.toByteArray());
            com.tencent.trtc.TRTCCloud tRTCCloud = m1Var.f407202a;
            if (tRTCCloud != null) {
                tRTCCloud.sendSEIMsg(fa4Var.toByteArray(), 1);
            }
            int i17 = m1Var.f407208g + 1;
            m1Var.f407208g = i17;
            if (i17 >= 50) {
                m1Var.f407208g = 0;
            }
        }
        return true;
    }
}
