package m11;

/* loaded from: classes12.dex */
public class m0 extends c01.l implements com.tencent.mm.modelbase.i1 {
    /* JADX WARN: Removed duplicated region for block: B:46:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037f  */
    @Override // c01.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.f9 b(com.tencent.mm.modelbase.p0 r31, java.lang.String r32, java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.m0.b(com.tencent.mm.modelbase.p0, java.lang.String, java.lang.String, java.lang.String):com.tencent.mm.storage.f9");
    }

    @Override // c01.l, com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        r15.d j17;
        r15.d j18;
        com.tencent.mm.modelbase.q0 b17 = super.b1(p0Var);
        com.tencent.mm.storage.f9 f9Var = b17.f70743a;
        if (f9Var != null && f9Var.J2() && (f9Var.F & 4) != 4) {
            v70.b0 b0Var = (v70.b0) ((xs.f1) i95.n0.c(xs.f1.class));
            b0Var.getClass();
            com.tencent.mm.storage.f9 f9Var2 = b17.f70743a;
            if (f9Var2 != null) {
                oi3.f fVar = new oi3.f();
                c01.gb.a(fVar, f9Var2);
                v70.a0 a0Var = v70.b0.f433600m;
                java.lang.String a17 = a0Var.a(fVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "loadMsgImgThumb imageKey:" + a17 + " source:ImgMsgExtension");
                java.util.List k17 = kz5.c0.k(y70.f.class, y70.h.class, y70.l.class, y70.m.class, y70.p.class);
                jz5.l Zi = v70.b0.Zi(b0Var, fVar, false, 2, null);
                java.lang.String str = (java.lang.String) Zi.f302833d;
                java.lang.String str2 = (java.lang.String) Zi.f302834e;
                i95.m c17 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String Q8 = tg3.u0.Q8((tg3.u0) c17, fVar, fVar.k(), false, true, 4, null);
                java.lang.String concat = Q8.concat("hd");
                g75.z zVar = new g75.z();
                zVar.l("Common_ImageKey", a17);
                zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                zVar.l("Common_ImageViewRefMap", a0Var.b());
                zVar.l("key_thumb_path", str);
                zVar.l("key_hd_thumb_path", str2);
                zVar.l("key_write_thumb_path", Q8);
                zVar.l("key_write_hd_thumb_path", concat);
                zVar.l("key_msg_info", fVar);
                ((v70.b0) i95.n0.c(v70.b0.class)).getClass();
                java.lang.String bizName = "MsgImgLoader@" + (java.lang.System.currentTimeMillis() % 4);
                kotlin.jvm.internal.o.g(bizName, "bizName");
                g75.r rVar = new g75.r(kz5.n0.X0(k17), zVar, bizName, null, true, 8, null);
                rVar.d();
                new java.lang.ref.WeakReference(rVar);
            }
            j15.d dVar = new j15.d();
            dVar.set__useLruCache(true);
            java.lang.String U1 = f9Var.U1();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (U1 == null) {
                U1 = "";
            }
            dVar.fromXml(U1);
            kc5.x xVar = (kc5.x) ((wg3.j) i95.n0.c(wg3.j.class));
            if (xVar.Di()) {
                r15.b l17 = dVar.l();
                java.lang.String id6 = (l17 == null || (j18 = l17.j()) == null) ? null : j18.getId();
                if (!(id6 == null || r26.n0.N(id6))) {
                    r15.b l18 = dVar.l();
                    xVar.Vi(f9Var, (l18 == null || (j17 = l18.j()) == null) ? null : j17.getId());
                    ((ku5.t0) ku5.t0.f312615d).h(new kc5.u(xVar, f9Var), "MicroMsg.MediaGroupService");
                }
            }
        }
        return b17;
    }

    @Override // com.tencent.mm.modelbase.t0
    public long k(java.lang.String str, r45.j4 j4Var, java.lang.String str2) {
        return !((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() ? c01.w9.m(str, j4Var.f377565o) : ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Bi(str, j4Var, str2);
    }

    @Override // c01.l, com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        m11.l0 Di = m11.b1.Di();
        com.tencent.mm.storage.f9 f9Var = r0Var.f70757a;
        m11.b0 S1 = Di.S1(f9Var);
        if (S1 == null || S1.f322633a == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
            return;
        }
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f22550a.d(S1.l()), S1.f322637e, "", "");
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22563h;
        java.lang.String aj7 = ((k90.b) u0Var).aj(f9Var, f0Var, S1.f322638f, "", "");
        java.lang.String aj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22566n, S1.f322642j, "", "");
        tg3.u0 u0Var2 = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var2 = bm5.f0.f22564i;
        java.lang.String aj9 = ((k90.b) u0Var2).aj(f9Var, f0Var2, S1.f322639g, "", "");
        tg3.u0 u0Var3 = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var3 = bm5.f0.f22565m;
        java.lang.String aj10 = ((k90.b) u0Var3).aj(f9Var, f0Var3, S1.f322639g, "", "");
        com.tencent.mm.vfs.w6.h(aj6);
        com.tencent.mm.vfs.w6.h(aj7);
        com.tencent.mm.vfs.w6.h(aj8);
        com.tencent.mm.vfs.w6.h(aj9);
        com.tencent.mm.vfs.w6.h(aj10);
        com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22568p, S1.f322637e, "", ""));
        java.lang.String b17 = m11.k0.b(f9Var.Q0());
        java.lang.String[] strArr = {"" + S1.f322633a};
        l75.k0 k0Var = Di.f322746p;
        k0Var.delete(b17, "id=?", strArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "msgId:%s svrId:%s bigImgPath:%s midImgPath:%s hevcPath:%s thumbPath:%s hdThumbPath:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()), aj6, aj7, aj8, aj9, aj10);
        if (S1.j()) {
            m11.b0 C1 = Di.C1(java.lang.Long.valueOf(S1.f322649q));
            java.lang.String hj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).hj(C1.f322637e, "", "", false);
            java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f22562g, C1.f322637e, "", "", false, false);
            java.lang.String aj11 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22567o, C1.f322642j, "", "");
            com.tencent.mm.vfs.w6.h(hj6);
            com.tencent.mm.vfs.w6.h(bj6);
            com.tencent.mm.vfs.w6.h(aj11);
            com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, f0Var, C1.f322638f, "", ""));
            com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, f0Var2, C1.f322639g, "", ""));
            com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, f0Var3, C1.f322639g, "", ""));
            com.tencent.mm.vfs.w6.h(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22569q, C1.f322637e, "", ""));
            k0Var.delete(m11.k0.b(f9Var.Q0()), "id=?", new java.lang.String[]{"" + C1.f322633a});
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "deleteHdImg msgId:%s svrId:%s hdBigImgPath:%s hdHevcPath:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()), hj6, aj11);
            lf3.d dVar = lf3.d.f318314a;
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            h90.a[] aVarArr = h90.a.f279671d;
            dVar.a(msgId, Q0, 1);
            dVar.a(f9Var.getMsgId(), f9Var.Q0(), 4);
        }
    }
}
