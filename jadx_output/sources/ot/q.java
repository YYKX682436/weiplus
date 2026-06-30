package ot;

@j95.b
/* loaded from: classes9.dex */
public final class q extends jm0.o implements pt.k0 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f348328m = jz5.h.b(ot.n.f348323d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f348329n = jz5.h.b(ot.m.f348322d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f348330o = jz5.h.b(ot.p.f348326d);

    public void Zi(java.lang.String mediaId) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        tt.f.f421757f.a();
        kotlinx.coroutines.flow.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId);
        gm0.b bVar = gm0.j1.b().f273245h;
        if (bVar == null || (lifecycleScope = bVar.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new tt.c(Ai, mediaId, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String aj(s15.h r17) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.q.aj(s15.h):java.lang.String");
    }

    public java.lang.String bj(s15.w recordInfoItem) {
        java.lang.String aj6;
        kotlin.jvm.internal.o.g(recordInfoItem, "recordInfoItem");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (s15.h hVar : recordInfoItem.j()) {
            if (arrayList.size() < 5 && (aj6 = aj(hVar)) != null) {
                arrayList.add(hVar.getSourceName() + ": " + r26.i0.t(aj6, "\n", " ", false));
            }
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null);
        return arrayList.size() >= 5 ? g07.concat("...") : g07;
    }

    public java.lang.String cj(oi3.g msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.f345617d;
        if (msgInfo.getInteger(i17 + 4) == 1) {
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490570ys);
            kotlin.jvm.internal.o.f(g17, "getString(...)");
            return g17;
        }
        if (msgInfo.getInteger(i17 + 4) == 3) {
            java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490517xd);
            kotlin.jvm.internal.o.f(g18, "getString(...)");
            return g18;
        }
        if (msgInfo.getInteger(i17 + 4) == 43) {
            java.lang.String g19 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490596zi);
            kotlin.jvm.internal.o.f(g19, "getString(...)");
            return g19;
        }
        if (msgInfo.getInteger(i17 + 4) == 49) {
            int integer = msgInfo.getInteger(i17 + 5);
            if (integer == 1) {
                java.lang.String g27 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490570ys);
                kotlin.jvm.internal.o.f(g27, "getString(...)");
                return g27;
            }
            if (integer == 2) {
                java.lang.String g28 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490517xd);
                kotlin.jvm.internal.o.f(g28, "getString(...)");
                return g28;
            }
            if (integer != 6) {
                if (integer == 16) {
                    java.lang.String g29 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490525xl);
                    kotlin.jvm.internal.o.f(g29, "getString(...)");
                    return g29;
                }
                if (integer == 48) {
                    java.lang.String g37 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490450ve);
                    kotlin.jvm.internal.o.f(g37, "getString(...)");
                    return g37;
                }
                if (integer == 75) {
                    java.lang.String g38 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490589za);
                    kotlin.jvm.internal.o.f(g38, "getString(...)");
                    return g38;
                }
                if (integer == 118) {
                    java.lang.String g39 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.n3s);
                    kotlin.jvm.internal.o.f(g39, "getString(...)");
                    return g39;
                }
                if (integer != 130) {
                    if (integer == 2000 || integer == 2011) {
                        java.lang.String g47 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490512x6);
                        kotlin.jvm.internal.o.f(g47, "getString(...)");
                        return g47;
                    }
                }
            }
            java.lang.String g48 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490430uv);
            kotlin.jvm.internal.o.f(g48, "getString(...)");
            return g48;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490482wb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public void fj(s15.w recordInfoItem, java.util.concurrent.atomic.AtomicLong maxSingleFileSize, java.util.concurrent.atomic.AtomicLong totalFileSize) {
        s15.w j17;
        kotlin.jvm.internal.o.g(recordInfoItem, "recordInfoItem");
        kotlin.jvm.internal.o.g(maxSingleFileSize, "maxSingleFileSize");
        kotlin.jvm.internal.o.g(totalFileSize, "totalFileSize");
        for (s15.h hVar : recordInfoItem.j()) {
            long j18 = hVar.getLong(hVar.f303422d + 7);
            long j19 = maxSingleFileSize.get();
            int i17 = hVar.f303422d;
            if (j18 > j19) {
                maxSingleFileSize.set(hVar.getLong(i17 + 7));
            }
            if (hVar.getLong(i17 + 11) > maxSingleFileSize.get()) {
                maxSingleFileSize.set(hVar.getLong(i17 + 11));
            }
            if (hVar.getInteger(i17 + 2) == 17 || hVar.getInteger(i17 + 2) == 21) {
                s15.i0 H = hVar.H();
                if (H != null && (j17 = H.j()) != null) {
                    fj(j17, maxSingleFileSize, totalFileSize);
                }
            } else {
                totalFileSize.set(totalFileSize.get() + hVar.getLong(i17 + 11) + hVar.getLong(i17 + 7));
            }
        }
    }

    public com.tencent.mm.vfs.r6 hj() {
        return lp0.b.h0(gm0.j1.b().j() + "_BaseRecordSendApi");
    }

    public final java.util.HashMap ij() {
        return (java.util.HashMap) ((jz5.n) this.f348330o).getValue();
    }

    public boolean mj(s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f303422d;
        return (r26.n0.N(recordDataItem.getString(i17 + 4)) ^ true) || (r26.n0.N(recordDataItem.getString(i17 + 8)) ^ true) || (r26.n0.N(recordDataItem.c0()) ^ true) || (r26.n0.N(recordDataItem.a0()) ^ true);
    }

    public boolean nj(java.lang.String fromTalker) {
        kotlin.jvm.internal.o.g(fromTalker, "fromTalker");
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigForwardNewRecordDetail()) == 1) {
            ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
            if (!r01.z.g(fromTalker)) {
                return true;
            }
        }
        return false;
    }

    public boolean oj(java.lang.String fromTalker) {
        kotlin.jvm.internal.o.g(fromTalker, "fromTalker");
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewRecordDetail()) == 1) {
            ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
            if (!r01.z.g(fromTalker)) {
                return true;
            }
        }
        return false;
    }

    @Override // jm0.o, i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        qj(1, ku.i.class);
        qj(34, ku.l.class);
        qj(48, ku.g.class);
        qj(3, ku.f.class);
        qj(43, ku.k.class);
        qj(42, ku.e.class);
        qj(66, ku.e.class);
        qj(67, ku.h.class);
        qj(47, ku.b.class);
        qj(49, lu.f.class);
        rj(8, ku.b.class);
        rj(2000, ku.j.class);
        rj(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, ku.j.class);
        rj(57, lu.d.class);
        rj(1, lu.e.class);
        rj(53, lu.e.class);
        rj(74, lu.i.class);
        rj(131, lu.i.class);
        rj(2, lu.b.class);
        rj(3, ou.a.class);
        rj(76, ou.c.class);
        rj(92, ou.c.class);
        rj(93, ou.b.class);
        rj(133, ou.d.class);
        rj(4, lu.l.class);
        rj(5, lu.l.class);
        rj(129, nu.j.class);
        rj(51, nu.j.class);
        rj(63, nu.f.class);
        rj(88, nu.f.class);
        rj(82, nu.a.class);
        rj(94, nu.b.class);
        rj(111, nu.b.class);
        rj(113, nu.g.class);
        rj(72, nu.k.class);
        rj(59, nu.k.class);
        rj(50, nu.i.class);
        rj(105, nu.h.class);
        rj(73, nu.e.class);
        rj(6, lu.h.class);
        rj(130, lu.h.class);
        rj(7, ku.j.class);
        rj(46, ku.j.class);
        rj(36, lu.a.class);
        rj(33, lu.a.class);
        rj(44, ku.d.class);
        rj(48, ku.j.class);
        rj(68, lu.j.class);
        rj(19, lu.k.class);
        rj(24, lu.k.class);
        rj(16, ku.j.class);
        rj(75, nu.c.class);
        rj(101, lu.g.class);
        rj(119, nu.d.class);
        rj(120, nu.d.class);
        rj(132, mu.a.class);
        sj(2, iu.n.class);
        sj(15, iu.z.class);
        sj(4, iu.z.class);
        sj(8, iu.j.class);
        sj(36, iu.v.class);
        sj(5, iu.v.class);
        sj(19, iu.v.class);
        sj(29, iu.v.class);
        sj(32, iu.v.class);
        sj(33, iu.v.class);
        pj(133, iu.v.class);
        sj(7, iu.v.class);
        sj(17, iu.r.class);
        sj(1, iu.t.class);
        pj(130, iu.j.class);
        pj(44, iu.v.class);
    }

    public final void pj(int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        ij().put(java.lang.Integer.valueOf(i17 + 10000), clazz);
    }

    public void qj(int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        ((java.util.HashMap) ((jz5.n) this.f348328m).getValue()).put(java.lang.Integer.valueOf(i17), clazz);
    }

    public void rj(int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        ((java.util.HashMap) ((jz5.n) this.f348329n).getValue()).put(java.lang.Integer.valueOf(i17), clazz);
    }

    public void sj(int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        ij().put(java.lang.Integer.valueOf(i17), clazz);
    }
}
