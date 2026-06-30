package ru1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final bv1.d f399730a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.OutputStream f399731b;

    /* renamed from: c, reason: collision with root package name */
    public gs0.b f399732c;

    /* renamed from: d, reason: collision with root package name */
    public long f399733d;

    public t(pu1.b bVar, bv1.d init) {
        gs0.b lVar;
        gs0.b lVar2;
        boolean fj6;
        kotlin.jvm.internal.o.g(init, "init");
        this.f399730a = init;
        this.f399733d = -1L;
        if (bVar != null) {
            boolean z17 = true;
            try {
                if (fp.h.c(23)) {
                    int i17 = wo.v1.f447833m.f447765w;
                    if (i17 == -1) {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                    } else if (i17 == 1) {
                        fj6 = true;
                    } else if (i17 != 2) {
                        fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                    } else {
                        fj6 = false;
                    }
                    if (fj6) {
                        lVar2 = new gs0.p(bVar, new ru1.j(this));
                        this.f399732c = lVar2;
                    }
                }
                lVar2 = new gs0.l(bVar, new ru1.m(this));
                this.f399732c = lVar2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenCastVideoEncoder", e17, "encoder  error", new java.lang.Object[0]);
                try {
                    bVar.c();
                    if (fp.h.c(23)) {
                        int i18 = wo.v1.f447833m.f447765w;
                        if (i18 == -1) {
                            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                        } else if (i18 != 1) {
                            if (i18 != 2) {
                                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                            } else {
                                z17 = false;
                            }
                        }
                        if (z17) {
                            lVar = new gs0.p(bVar, new ru1.p(this));
                            this.f399732c = lVar;
                        }
                    }
                    lVar = new gs0.l(bVar, new ru1.s(this));
                    this.f399732c = lVar;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenCastVideoEncoder", e18, "still happened crash %s", java.lang.String.valueOf(bVar));
                    com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 34L, 1L);
                    ((ku5.t0) ku5.t0.f312615d).B(new tu1.b(((tu1.d) this.f399730a).f422091a));
                }
            }
        }
    }

    public static final void a(ru1.t tVar, gs0.b bVar) {
        tVar.getClass();
        android.view.Surface c17 = bVar.c();
        tu1.d dVar = (tu1.d) tVar.f399730a;
        dVar.getClass();
        tu1.o oVar = dVar.f422091a;
        vu1.h hVar = oVar.f422117h;
        if (hVar != null) {
            hVar.f440193e = new tu1.c(oVar);
        }
        boolean z17 = true;
        if (hVar != null) {
            boolean z18 = hVar.f440201m;
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastRenderMgr", "use open gl renderer media projection");
                hVar.f440200l = rs0.i.f399296a.l(hVar.f440189a, hVar.f440190b, android.opengl.EGL14.EGL_NO_CONTEXT);
                hVar.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoRendererUseOpenGL");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 14L, 1L);
            } else if (!z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastRenderMgr", "use image reader render media projection");
                hVar.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoRendererUseImageReader");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 15L, 1L);
            }
        }
        vu1.h hVar2 = oVar.f422117h;
        if (hVar2 != null) {
            hVar2.f440192d = c17;
            if (hVar2.f440201m) {
                rs0.h hVar3 = hVar2.f440200l;
                if (hVar3 != null) {
                    hVar3.f399293b = rs0.i.f399296a.k(hVar3.f399292a, c17);
                }
            } else {
                vu1.b bVar2 = hVar2.f440196h;
                if (bVar2 != null) {
                    bVar2.f440181e = c17;
                }
            }
        }
        bv1.b bVar3 = new bv1.b();
        oVar.f422125p = bVar3;
        bVar3.a();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        oVar.f422124o = android.os.SystemClock.elapsedRealtime();
        int i17 = wo.v1.f447833m.f447764v;
        if (i17 == -1) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
        } else if (i17 != 1) {
            if (i17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
            } else {
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            com.tencent.mm.vfs.r6 h07 = lp0.b.h0("ScreenCastDebug");
            if (!h07.m()) {
                h07.J();
            }
            tVar.f399731b = com.tencent.mm.vfs.w6.K(h07.o() + "/video_" + android.os.SystemClock.elapsedRealtime() + ".h264", false);
        }
    }

    public static final void b(ru1.t tVar, android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
        tVar.getClass();
        if ((bufferInfo != null && bufferInfo.size == 0) || bufferInfo == null || byteBuffer == null) {
            return;
        }
        int i17 = bufferInfo.size;
        byte[] bArr = new byte[i17];
        byteBuffer.get(bArr);
        byteBuffer.position(bufferInfo.offset);
        tu1.d dVar = (tu1.d) tVar.f399730a;
        dVar.getClass();
        if (iq.b.E() || iq.b.F(dVar.f422092b, false) || iq.b.H() || com.tencent.mm.sdk.platformtools.l5.Bi()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send video ");
        } else {
            byte[] copyOf = java.util.Arrays.copyOf(bArr, i17);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByte("data_type", (byte) 1);
            bundle.putByteArray("data_data", copyOf);
            com.tencent.mm.sdk.platformtools.n3 n3Var = dVar.f422091a.f422119j;
            if (n3Var != null) {
                android.os.Message message = new android.os.Message();
                message.setData(bundle);
                n3Var.sendMessage(message);
            }
        }
        java.io.OutputStream outputStream = tVar.f399731b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
                java.io.OutputStream outputStream2 = tVar.f399731b;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
            }
        }
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if (oVar != null && oVar.f422122m == -1) {
            long j17 = tVar.f399733d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            tVar.f399733d = elapsedRealtime;
            if (nu1.n.f340170e == null) {
                nu1.n.f340170e = new tu1.o();
            }
            tu1.o oVar2 = nu1.n.f340170e;
            if (oVar2 == null) {
                return;
            }
            oVar2.f422122m = elapsedRealtime;
        }
    }

    public final void c() {
        gs0.b bVar = this.f399732c;
        if (bVar != null) {
            bVar.f();
        }
        java.io.OutputStream outputStream = this.f399731b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }
}
