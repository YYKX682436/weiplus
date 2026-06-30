package vf0;

@j95.b
/* loaded from: classes12.dex */
public final class k2 extends i95.w implements c35.o {
    public boolean Ai(vf0.u2 videoSendElement, java.lang.String recvUser) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(videoSendElement, "videoSendElement");
        kotlin.jvm.internal.o.g(recvUser, "recvUser");
        vf0.h3 h3Var = new vf0.h3(recvUser, videoSendElement, false, null, 8, null);
        y15.d dVar = new y15.d();
        vf0.r2 r2Var = videoSendElement.f436283e;
        dVar.p(r2Var.f436257a);
        h3Var.f436179f = dVar;
        h3Var.f436177d = new vf0.i3(vf0.j3.f436206h);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoMsgSendFeatureService", "forwardVideo, videoSendElement:" + videoSendElement);
        if (r2Var.f436257a != null && (map = h3Var.f436187n) != null) {
            map.put("from_fav_quick_forward", 1);
        }
        qi3.b0 bj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).bj(h3Var);
        int i17 = qi3.y.f363762e1;
        kotlinx.coroutines.flow.j d17 = qi3.x.f363761a.d(bj6);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new vf0.b2(d17, null), 1, null);
        }
        return true;
    }

    public boolean Bi(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        t21.v2 v2Var;
        oi3.h hVar;
        java.lang.String g17;
        java.lang.Object obj;
        if (f9Var == null) {
            return false;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        java.util.List h17 = t21.o2.Ui().h(f9Var, f9Var.z0());
        if (h17 != null) {
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                kotlin.jvm.internal.o.f(((t21.v2) obj).d(), "getFileName(...)");
                if (!r26.i0.n(r6, ya.b.ORIGIN, false)) {
                    break;
                }
            }
            v2Var = (t21.v2) obj;
        } else {
            v2Var = null;
        }
        java.lang.String f17 = v2Var != null ? v2Var.f() : null;
        java.lang.String str = f17 == null ? "" : f17;
        int i17 = v2Var != null ? v2Var.f415015m : 0;
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        java.lang.String z07 = f9Var.z0();
        kotlin.jvm.internal.o.d(z07);
        vf0.h3 h3Var = new vf0.h3(Q0, new vf0.u2(z07, str, null, z17, i17, null, null, 100, null), true, null, 8, null);
        int type = f9Var.getType() & 65535;
        if (type != 43) {
            hVar = null;
        } else {
            hVar = new oi3.h();
            int i18 = hVar.f345617d;
            hVar.set(i18 + 4, java.lang.Integer.valueOf(type));
            java.lang.String V1 = f9Var.V1();
            if (V1 == null) {
                V1 = "";
            }
            hVar.set(i18 + 11, V1);
            java.lang.String Q02 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
            hVar.set(i18 + 3, Q02);
            hVar.set(i18 + 2, java.lang.Long.valueOf(f9Var.getCreateTime()));
            hVar.set(i18 + 0, java.lang.Long.valueOf(f9Var.getMsgId()));
            hVar.set(i18 + 1, java.lang.Long.valueOf(f9Var.I0()));
            hVar.set(i18 + 7, java.lang.Integer.valueOf(f9Var.P0()));
            java.lang.String str2 = f9Var.G;
            if (str2 == null) {
                str2 = "";
            }
            hVar.set(i18 + 12, str2);
            java.lang.String S1 = f9Var.S1();
            if (S1 == null) {
                S1 = "";
            }
            hVar.set(i18 + 13, S1);
            hVar.set(i18 + 10, java.lang.Integer.valueOf(f9Var.w0()));
            hVar.set(i18 + 9, java.lang.Integer.valueOf(f9Var.A0()));
            java.lang.String z08 = f9Var.z0();
            kotlin.jvm.internal.o.f(z08, "getImgPath(...)");
            hVar.l(z08);
        }
        h3Var.f436178e = hVar;
        if (com.tencent.mm.sdk.platformtools.aa.b(f9Var.S1(), "msg", null)) {
            g17 = f9Var.S1();
        } else {
            g17 = v2Var != null ? v2Var.g() : null;
            if (g17 == null) {
                g17 = "";
            }
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        y15.d dVar = new y15.d();
        kotlin.jvm.internal.o.d(g17);
        dVar.fromXml(g17);
        h3Var.f436179f = dVar;
        p15.e eVar = new p15.e();
        java.lang.String str4 = f9Var.G;
        eVar.fromXml(str4 != null ? str4 : "");
        qi3.b0 bj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).bj(h3Var);
        int i19 = qi3.y.f363762e1;
        kotlinx.coroutines.flow.j d17 = qi3.x.f363761a.d(bj6);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null) {
            return true;
        }
        v65.i.b(lifecycleScope, null, new vf0.f2(d17, null), 1, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(com.tencent.mm.storage.f9 r19, java.lang.String r20, c01.h7 r21, vf0.r2 r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.k2.wi(com.tencent.mm.storage.f9, java.lang.String, c01.h7, vf0.r2):boolean");
    }
}
