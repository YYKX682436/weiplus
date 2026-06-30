package xc5;

/* loaded from: classes12.dex */
public final class e3 extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f453438f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f453439g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f453440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f453438f = jz5.h.b(xc5.b3.f453398d);
        this.f453439g = new java.util.HashMap();
        this.f453440h = new java.util.HashMap();
    }

    @Override // gg3.b
    public void H5(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.String id6 = mediaInfo.getId();
        java.lang.String str = id6 + "_origin";
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f453439g.remove(id6);
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        Z6().remove(str);
        this.f453440h.remove(id6);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "cancelOriginDownload mediaId: " + id6);
    }

    @Override // jg3.b
    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks, loadingIdSet size: ");
        sb6.append(Z6().size());
        sb6.append(", originJobs size: ");
        java.util.HashMap hashMap = this.f453439g;
        sb6.append(hashMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", sb6.toString());
        Z6().clear();
        this.f453440h.clear();
        java.util.Collection<kotlinx.coroutines.r2> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (kotlinx.coroutines.r2 r2Var : values) {
            kotlin.jvm.internal.o.d(r2Var);
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        hashMap.clear();
    }

    public final boolean Y6(mf3.k kVar, gg3.c cVar, boolean z17) {
        java.lang.String id6 = kVar.getId();
        java.lang.String str = z17 + '|' + cVar.f271728c;
        java.util.HashMap hashMap = this.f453440h;
        if (kotlin.jvm.internal.o.b(hashMap.get(id6), str)) {
            return false;
        }
        hashMap.put(id6, str);
        jg3.b.X6(this, kVar, gg3.d.f271733e, cVar, null, 4, null);
        return true;
    }

    public final java.util.HashSet Z6() {
        return (java.util.HashSet) ((jz5.n) this.f453438f).getValue();
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        int i17;
        java.lang.String str;
        xf0.i iVar;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        uh5.i iVar2 = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "updateState failed, not IChatMsgMediaInfo. mediaId: " + mediaInfo.getId());
            return;
        }
        gg3.c a17 = mediaInfo.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "updateState failed, loadParam null. mediaId: " + mediaInfo.getId());
            return;
        }
        com.tencent.mm.storage.f9 b17 = iVar2.b();
        java.lang.String id6 = mediaInfo.getId();
        boolean z17 = mediaInfo.getLevel() == mf3.w.f326129e;
        if (z17) {
            try {
                i17 = ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(b17).f302833d).intValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "getC2COriginVideoStatus failed: " + e17.getMessage());
                i17 = -1;
            }
            if (i17 == 2 || i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video ready (strict). mediaId: " + id6 + ", status: " + i17);
                Y6(mediaInfo, a17, z17);
                return;
            }
            try {
                str = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(b17, false);
            } catch (java.lang.Exception unused) {
                str = "";
            }
            if ((!r26.n0.N(str)) && com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video file exists on disk (status=" + i17 + "). mediaId: " + id6 + ", path: " + str);
                Y6(mediaInfo, a17, z17);
                return;
            }
        } else {
            java.lang.String str2 = a17.f271728c;
            if (!r26.n0.N(str2)) {
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str2);
                java.lang.String str3 = a18.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "video already exists. mediaId: " + id6 + " path: " + str2);
                    Y6(mediaInfo, a17, z17);
                    return;
                }
            }
        }
        boolean e18 = com.tencent.mm.ui.chatting.component.z4.e(b17);
        java.util.HashMap hashMap = this.f453440h;
        if (e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "video expired. mediaId: " + id6 + ", msgCreateTime: " + b17.getCreateTime() + ", serverTime: " + c01.id.a());
            hashMap.remove(id6);
            jg3.b.X6(this, mediaInfo, gg3.d.f271734f, a17, null, 4, null);
            return;
        }
        xf0.f fVar = z17 ? xf0.f.f454164e : xf0.f.f454163d;
        hashMap.remove(id6);
        jg3.b.X6(this, mediaInfo, gg3.d.f271732d, a17, null, 4, null);
        java.lang.String id7 = mediaInfo.getId();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "tryStartDownload mediaId: " + id7 + ", transitType: " + fVar);
        try {
            iVar = xf0.s.f454216f.a().U6(b17, fVar, true);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "genDownloadParams failed: " + e19.getMessage());
            iVar = null;
        }
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "tryStartDownload failed, downloadParams null. mediaId: " + id7);
            jg3.b.X6(this, mediaInfo, gg3.d.f271734f, a17, null, 4, null);
            return;
        }
        if (Z6().add(id7)) {
            iVar.f454185m = new xc5.c3(id7, this, mediaInfo, a17);
            v65.i.b(this.f299654e, null, new xc5.d3(iVar, this, id7, mediaInfo, a17, z17, null), 1, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "already downloading. mediaId: " + id7);
        }
    }

    @Override // gg3.b
    public void f4(mf3.k mediaInfo, yz5.l lVar, yz5.l lVar2) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadOriginVideo failed, not IChatMsgMediaInfo");
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        com.tencent.mm.storage.f9 b17 = iVar.b();
        java.lang.String id6 = mediaInfo.getId();
        java.lang.String str = id6 + "_origin";
        if (Z6().contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video already downloading, skip. mediaId: " + id6);
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadOriginVideo start. mediaId: " + id6);
        this.f453440h.remove(id6);
        Z6().add(str);
        this.f453439g.put(id6, v65.i.b(this.f299654e, null, new xc5.a3(b17, id6, this, str, lVar2, lVar, null), 1, null));
    }
}
