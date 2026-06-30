package xc5;

/* loaded from: classes12.dex */
public final class t2 extends xc5.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.storage.f9 msgInfo) {
        super(msgInfo, null);
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String k17 = k();
        java.lang.String j17 = j();
        if (getLevel() == mf3.w.f326129e) {
            j17 = i();
        } else if (l()) {
            j17 = i();
        }
        java.lang.String str = j17;
        if (r26.n0.N(str) || r26.n0.N(k17)) {
            return null;
        }
        java.lang.String id6 = getId();
        long j18 = 0;
        try {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = this.f453399a.z0();
            ((vf0.y1) x1Var).getClass();
            if (t21.d3.h(z07) != null) {
                j18 = r0.f415015m * 1000;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getVideoDurationMs failed: " + e17.getMessage());
        }
        return new gg3.c(id6, k17, str, null, j18, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // xc5.b
    public co.a d() {
        java.lang.String k17 = k();
        java.lang.String j17 = j();
        boolean l17 = l();
        if (l17) {
            j17 = i();
        }
        if (r26.n0.N(j17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "createForwardViewModel: empty videoPath, msgId=" + this.f453399a.getMsgId());
            return null;
        }
        jd5.c cVar = new jd5.c();
        h(cVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (k17 == null) {
            k17 = "";
        }
        cVar.o(k17);
        if (j17 == null) {
            j17 = "";
        }
        cVar.r(j17);
        cVar.l(!l17);
        cVar.q(0);
        return cVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path = k();
        if (path.length() == 0) {
            return null;
        }
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407406h;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public java.lang.String g() {
        return j();
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }

    public final java.lang.String i() {
        try {
            return ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(this.f453399a, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getOriginVideoPath failed: " + e17.getMessage());
            return "";
        }
    }

    public final java.lang.String j() {
        try {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.tencent.mm.storage.f9 f9Var = this.f453399a;
            return ((k90.b) u0Var).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getVideoFilePath failed: " + e17.getMessage());
            return "";
        }
    }

    public final java.lang.String k() {
        try {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.tencent.mm.storage.f9 f9Var = this.f453399a;
            return ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final boolean l() {
        try {
            int intValue = ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(this.f453399a).f302833d).intValue();
            if (intValue != 2 && intValue != 3) {
                if (intValue != 1 && intValue != 4) {
                    return false;
                }
                java.lang.String i17 = i();
                if (!(!r26.n0.N(i17))) {
                    return false;
                }
                if (!com.tencent.mm.vfs.w6.j(i17)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "isOriginVideoReady failed: " + e17.getMessage());
            return false;
        }
    }
}
