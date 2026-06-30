package xc5;

/* loaded from: classes12.dex */
public final class l0 extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f453532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f453532g = jz5.h.b(xc5.j0.f453493d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String mediaId = mediaInfo.getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407405g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            W6(mediaInfo, sf3.k.f407399g, a17);
        } else {
            W6(mediaInfo, sf3.k.f407398f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks, size: ");
        jz5.g gVar = this.f453532g;
        sb6.append(((java.util.HashSet) ((jz5.n) gVar).getValue()).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", sb6.toString());
        ((java.util.HashSet) ((jz5.n) gVar).getValue()).clear();
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        com.tencent.mm.storage.f9 b17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "refreshState mediaId: " + mediaInfo.getId());
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "updateStateInternal failed, param null");
            return;
        }
        sf3.g b18 = e17.b(sf3.m.f407403e);
        sf3.m mVar = b18.f407391e;
        sf3.m mVar2 = sf3.m.f407402d;
        if (mVar != mVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "origin image exists. mediaId: " + mediaInfo.getId() + " path: " + b18.c());
            W6(mediaInfo, sf3.k.f407397e, b18);
            return;
        }
        sf3.m mVar3 = sf3.m.f407404f;
        sf3.g b19 = e17.b(mVar3);
        if (b19.f407391e != mVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "mid image exists. mediaId: " + mediaInfo.getId() + " path: " + b19.c());
            W6(mediaInfo, sf3.k.f407397e, b19);
            return;
        }
        sf3.g b27 = e17.b(sf3.m.f407406h);
        if (b27.f407391e == mVar2) {
            uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
            b17 = iVar != null ? iVar.b() : null;
            if (b17 != null && com.tencent.mm.ui.chatting.component.z4.e(b17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image expired. mediaId: " + mediaInfo.getId() + ", msgCreateTime: " + b17.getCreateTime());
                W6(mediaInfo, sf3.k.f407398f, e17);
                return;
            }
            sf3.g a17 = e17.a(mVar3);
            if (a17.f407391e == mVar2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "no downloadable type found. mediaId: " + mediaInfo.getId());
                W6(mediaInfo, sf3.k.f407398f, e17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image not found, try download mid. mediaId: " + mediaInfo.getId());
            W6(mediaInfo, sf3.k.f407396d, a17);
            X6(mediaInfo, a17);
            return;
        }
        boolean z17 = mediaInfo instanceof uh5.i;
        uh5.i iVar2 = z17 ? (uh5.i) mediaInfo : null;
        com.tencent.mm.storage.f9 b28 = iVar2 != null ? iVar2.b() : null;
        if (b28 != null && com.tencent.mm.ui.chatting.component.z4.e(b28)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image expired with thumb. mediaId: " + mediaInfo.getId() + ", msgCreateTime: " + b28.getCreateTime());
            W6(mediaInfo, sf3.k.f407398f, b27);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "thumb image exists. mediaId: " + mediaInfo.getId() + " path: " + b27.c() + ", try silent mid download");
        W6(mediaInfo, sf3.k.f407397e, b27);
        uh5.i iVar3 = z17 ? (uh5.i) mediaInfo : null;
        b17 = iVar3 != null ? iVar3.b() : null;
        if (b17 != null && com.tencent.mm.ui.chatting.component.z4.e(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "skip silent mid download: expired. mediaId: " + mediaInfo.getId() + ", msgCreateTime: " + b17.getCreateTime());
            return;
        }
        sf3.g a18 = e17.a(mVar3);
        if (a18.f407391e != mVar2) {
            X6(mediaInfo, a18);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "skip silent mid download: no downloadable mid. mediaId: " + mediaInfo.getId());
    }

    public final void X6(mf3.k kVar, sf3.g gVar) {
        l70.d dVar;
        uh5.i iVar = kVar instanceof uh5.i ? (uh5.i) kVar : null;
        com.tencent.mm.storage.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "tryStartDownload failed, not IChatMsgMediaInfo. mediaId: " + kVar.getId());
            W6(kVar, sf3.k.f407398f, gVar);
            return;
        }
        try {
            dVar = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(b17, s70.c.f403919g, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "genDownloadParams failed: " + e17.getMessage());
            dVar = null;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "tryStartDownload failed, downloadParams null. mediaId: " + kVar.getId());
            W6(kVar, sf3.k.f407398f, gVar);
            return;
        }
        java.lang.String id6 = kVar.getId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryStartDownload mediaId: ");
        sb6.append(id6);
        sb6.append(" path: ");
        sb6.append(dVar.f316805f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", sb6.toString());
        if (((java.util.HashSet) ((jz5.n) this.f453532g).getValue()).add(id6) && (!r26.n0.N(r3))) {
            v65.i.b(this.f418948f, null, new xc5.k0(dVar, this, id6, kVar, gVar, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "already downloading. mediaId: " + id6);
    }
}
