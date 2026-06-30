package z12;

/* loaded from: classes12.dex */
public class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.l f469317d;

    public k(z12.l lVar) {
        this.f469317d = lVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        z12.l lVar = this.f469317d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar.f469329r) && str.equals(lVar.f469329r)) {
            if (i17 == -21006) {
                lVar.I(lVar.f469320f, 6, 0, lVar.f469329r);
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "download emoji pack failed. mProductId:%s:", lVar.f469320f);
                lVar.I(lVar.f469320f, -1, 0, lVar.f469329r);
                return 0;
            }
            if (gVar != null) {
                long j17 = gVar.field_finishedLength;
                long j18 = gVar.field_toltalLength;
                if (j17 == j18) {
                    return 0;
                }
                java.lang.String str2 = lVar.f469329r;
                if (!lVar.f469330s) {
                    lVar.I(lVar.f469320f, 6, (int) ((((float) j17) / ((float) j18)) * 100.0f), str2);
                }
                return 0;
            }
            if (hVar != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10625, 2, hVar.field_fileId, lVar.f469320f, hVar.field_transInfo);
                int i18 = hVar.field_retCode;
                if (i18 == 0) {
                    java.lang.String productId = lVar.f469320f;
                    kotlin.jvm.internal.o.g(productId, "productId");
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "checkPack: ".concat(productId));
                    pm0.v.K(null, new pr.j(productId, pr.k.f357722d));
                    try {
                        if (y12.c.f458852b == null) {
                            synchronized (y12.c.class) {
                                y12.c.f458852b = new y12.c();
                            }
                        }
                        y12.c cVar = y12.c.f458852b;
                        java.lang.String str3 = lVar.f469320f;
                        java.util.ArrayList arrayList = cVar.f458853a;
                        if (arrayList != null && arrayList.contains(str3)) {
                            cVar.f458853a.remove(str3);
                        }
                        com.tencent.mm.plugin.emoji.model.EmojiLogic.w(lVar.f469320f, lVar.f469321g, lVar.f469323i, lVar.f469324m, lVar.f469332u);
                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                        com.tencent.mm.storage.n5.f().c().doNotify();
                        gr.p.a(((r45.ql0) lVar.f469318d.f70711b.f70700a).f384083e);
                        lVar.I(lVar.f469320f, 7, 100, lVar.f469329r);
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.t() + lVar.f469320f);
                        if (r6Var.A() && r6Var.m()) {
                            r6Var.l();
                        }
                        z12.l.H(lVar, lVar.f469320f, true);
                        return 0;
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Error." + new com.tencent.mm.sdk.platformtools.z3());
                        lVar.I(lVar.f469320f, -1, 0, lVar.f469329r);
                        z12.l.H(lVar, lVar.f469320f, false);
                        return 0;
                    } catch (java.lang.OutOfMemoryError unused2) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Out Of Memory Error." + new com.tencent.mm.sdk.platformtools.z3());
                        lVar.I(lVar.f469320f, -1, 0, lVar.f469329r);
                        z12.l.H(lVar, lVar.f469320f, false);
                        return 0;
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji pack faild. ProductId:%s code:%d ", lVar.f469320f, java.lang.Integer.valueOf(i18));
                lVar.I(lVar.f469320f, -1, 0, lVar.f469329r);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
