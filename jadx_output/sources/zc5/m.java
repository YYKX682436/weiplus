package zc5;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final zc5.m f471482a = new zc5.m();

    /* JADX WARN: Removed duplicated region for block: B:15:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.tencent.mm.storage.f9 r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc5.m.a(com.tencent.mm.storage.f9, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.tencent.mm.storage.f9 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc5.m.b(com.tencent.mm.storage.f9, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.mm.storage.f9 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc5.m.c(com.tencent.mm.storage.f9, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final m11.b0 d(com.tencent.mm.storage.f9 f9Var) {
        m11.b0 b27;
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            if (f9Var.A0() == 1) {
                b27 = Di.T1(f9Var.Q0(), f9Var.getMsgId());
                if (b27 == null || b27.f322633a <= 0) {
                    b27 = Di.b2(f9Var.Q0(), f9Var.I0());
                }
            } else {
                b27 = Di.b2(f9Var.Q0(), f9Var.I0());
            }
            return b27;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGalleryMediaHelper", e17, "getImgInfo failed", new java.lang.Object[0]);
            return null;
        }
    }

    public final zc5.h e(com.tencent.mm.storage.f9 f9Var) {
        wh5.f fVar = wh5.f.f446052a;
        if (fVar.a() && f9Var.J2() && !fVar.b(f9Var)) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = f9Var.j();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (j17 == null) {
                j17 = "";
            }
            dVar.fromXml(j17);
            r2 = xs.l1.b(dVar, f9Var.A0() == 1);
        }
        return r2 ? zc5.h.f471449f : f9Var.J2() ? zc5.h.f471447d : (f9Var.isVideo() || f9Var.Y2()) ? zc5.h.f471448e : zc5.h.f471450g;
    }
}
