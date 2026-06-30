package t21;

/* loaded from: classes12.dex */
public class w1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.u1 f415055a;

    public w1(t21.u1 u1Var) {
        this.f415055a = u1Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "onUploadFailure, uploadId:%s", str);
        t21.u1 u1Var = this.f415055a;
        t21.d3.G(u1Var.f414961f);
        u1Var.f414959d.onSceneEnd(3, i17, "", u1Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        t21.u1 u1Var = this.f415055a;
        u1Var.f414966n = t21.d3.h(u1Var.f414961f);
        t21.v2 v2Var = u1Var.f414966n;
        if (v2Var == null || v2Var.f415011i == 105) {
            int i17 = v2Var == null ? -1 : v2Var.f415011i;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s info is null or has paused, status:%d", u1Var.K(), java.lang.Integer.valueOf(i17));
            p25.e eVar = u1Var.f414970r;
            if (eVar != null) {
                ((z25.d) eVar).f();
            }
            u1Var.f414959d.onSceneEnd(3, 0, "info is null or has paused, status" + i17, u1Var);
            u1Var.f414965m.a(3, 0, 0L, "");
            return;
        }
        t21.v2 v2Var2 = u1Var.f414968p;
        if (v2Var2 != null) {
            if (v2Var2.f415006d > j17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra originFileInfo cdnEndProc error oldpos:%d newpos:%d", u1Var.K(), java.lang.Integer.valueOf(u1Var.f414968p.f415006d), java.lang.Long.valueOf(j17));
                return;
            }
            v2Var2.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            t21.v2 v2Var3 = u1Var.f414968p;
            v2Var3.f415006d = (int) j17;
            v2Var3.U = 1032;
            t21.d3.Q(v2Var3);
            return;
        }
        if (v2Var.f415006d > j17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", u1Var.K(), java.lang.Integer.valueOf(u1Var.f414966n.f415006d), java.lang.Long.valueOf(j17));
            return;
        }
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        t21.v2 v2Var4 = u1Var.f414966n;
        v2Var4.f415006d = (int) j17;
        v2Var4.U = 1032;
        t21.d3.Q(v2Var4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ed  */
    @Override // z25.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(z25.j r23) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w1.c(z25.j):void");
    }
}
