package xc5;

/* loaded from: classes12.dex */
public final class i0 extends xc5.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.storage.f9 msgInfo) {
        super(msgInfo, null);
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return new eg3.i(i(), "", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // xc5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co.a d() {
        /*
            r4 = this;
            sf3.g r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L27
            sf3.m r2 = sf3.m.f407403e
            sf3.m r3 = sf3.m.f407404f
            sf3.m[] r2 = new sf3.m[]{r2, r3}
            sf3.g r0 = r0.b(r2)
            sf3.m r2 = r0.f407391e
            sf3.m r3 = sf3.m.f407402d
            if (r2 == r3) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.c()
            goto L28
        L27:
            r0 = r1
        L28:
            java.lang.String r2 = ""
            if (r0 != 0) goto L2d
            r0 = r2
        L2d:
            boolean r3 = r26.n0.N(r0)
            if (r3 == 0) goto L37
            java.lang.String r0 = r4.i()
        L37:
            boolean r3 = r26.n0.N(r0)
            if (r3 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "createForwardViewModel: empty imgPath, msgId="
            r0.<init>(r2)
            com.tencent.mm.storage.f9 r2 = r4.f453399a
            long r2 = r2.getMsgId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ImageMsgHistoryGalleryMediaInfo"
            com.tencent.mars.xlog.Log.w(r2, r0)
            return r1
        L57:
            jd5.a r1 = new jd5.a
            r1.<init>()
            r4.h(r1)
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != 0) goto L64
            goto L65
        L64:
            r2 = r0
        L65:
            r1.p(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.i0.d():co.a");
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path;
        com.tencent.mm.storage.f9 f9Var = this.f453399a;
        java.lang.String path2 = "";
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            path = m11.b1.Di().D2(f9Var, f9Var.z0(), false);
            if (path == null) {
                path = "";
            }
            if ((path.length() > 0) && !r26.i0.n(path, "hd", false) && com.tencent.mm.vfs.w6.j(path.concat("hd"))) {
                path = path.concat("hd");
            }
        } catch (java.lang.Exception unused) {
            path = "";
        }
        java.lang.String path3 = i();
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            m11.b0 S1 = Di.S1(f9Var);
            if (S1 != null && S1.j()) {
                long j17 = S1.f322649q;
                if (j17 > 0) {
                    m11.b0 C1 = Di.C1(java.lang.Long.valueOf(j17));
                    if (C1.f322633a == S1.f322649q) {
                        path2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f453399a, bm5.f0.f22562g, C1.f322637e, "", "");
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageMsgHistoryGalleryMediaInfo", "getOriginImagePath failed: " + e17.getMessage());
        }
        if (path3.length() == 0) {
            path3 = path;
        }
        if (path3.length() == 0) {
            return null;
        }
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407406h;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        sf3.m mVar2 = sf3.m.f407404f;
        kotlin.jvm.internal.o.g(path3, "path");
        linkedHashMap.put(mVar2, path3);
        if (path2.length() > 0) {
            sf3.m mVar3 = sf3.m.f407403e;
            kotlin.jvm.internal.o.g(path2, "path");
            linkedHashMap.put(mVar3, path2);
        }
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar2);
        a17.f407392f = new sf3.a();
        return a17;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return i();
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }

    public final java.lang.String i() {
        boolean z17;
        com.tencent.mm.storage.f9 f9Var = this.f453399a;
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(f9Var);
            if (S1 == null || S1.f322633a <= 0) {
                return "";
            }
            if (f9Var.o2()) {
                com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(f9Var.getMsgId(), f9Var.Q0());
                java.lang.String str = J0 != null ? J0.field_fileFullPath : null;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                    if (!z17 && com.tencent.mm.vfs.w6.j(str)) {
                        return str;
                    }
                }
                z17 = true;
                if (!z17) {
                    return str;
                }
            }
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            java.lang.String c17 = m11.c0.c(f9Var, S1);
            return c17 == null ? "" : c17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageMsgHistoryGalleryMediaInfo", "getMidImagePath failed: " + e17.getMessage());
            return "";
        }
    }
}
