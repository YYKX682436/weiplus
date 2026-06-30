package jd0;

@j95.b
/* loaded from: classes12.dex */
public final class d2 extends i95.w implements kd0.s2 {
    public void Ai(com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent, int i17, r45.vm4 vm4Var) {
        kotlin.jvm.internal.o.g(dealQBarStrEvent, "dealQBarStrEvent");
        wi(dealQBarStrEvent);
        r45.bx5 bx5Var = dealQBarStrEvent.f54079g.f7795p.f372281d;
        bx5Var.f371132d = i17;
        bx5Var.f371135g = vm4Var;
    }

    public void Bi(android.content.Intent intent, com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (scanCodeInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanExtService", "fillScanCodeInfo scanCodeInfo null and ignore");
        } else {
            intent.putExtra("scanCodeInfo", scanCodeInfo);
        }
    }

    public void Di(android.content.Intent intent, java.lang.String codeContent, int i17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(codeContent, "codeContent");
        if (codeContent.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanExtService", "fillScanCodeInfo codeContent empty and ignore");
        } else {
            Bi(intent, new com.tencent.mm.modelscan.ScanCodeInfo(codeContent, i17));
        }
    }

    public int Ni(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 999;
        }
        if (r26.i0.y(str, "https://mp.weixin.qq.com/a/", false)) {
            return 2;
        }
        return (r26.i0.y(str, "mmec://", false) || r26.i0.y(str, "https://mp.weixin.qq.com/ec/", false)) ? 3 : 999;
    }

    public java.lang.String Ri(java.lang.String fileName) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        sb6.append(lp0.b.h0("scan").o());
        sb6.append('/');
        sb6.append(fileName);
        return sb6.toString();
    }

    public final void wi(com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent) {
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        if (r3Var.f7795p == null) {
            r3Var.f7795p = new r45.db0();
        }
        r45.db0 db0Var = dealQBarStrEvent.f54079g.f7795p;
        if (db0Var.f372281d == null) {
            db0Var.f372281d = new r45.bx5();
        }
    }
}
