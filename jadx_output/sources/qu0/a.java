package qu0;

/* loaded from: classes5.dex */
public final class a extends qu0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu0.i f366719a;

    public a(qu0.i iVar) {
        this.f366719a = iVar;
    }

    @Override // uu0.b
    public void a(byte[] bArr, int i17, boolean z17) {
        if (bArr == null) {
            return;
        }
        vu0.k kVar = this.f366719a.f366730a;
        kVar.getClass();
        ru0.g gVar = kVar.f440111f;
        pp0.s0 s0Var = null;
        if (gVar == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            gVar = null;
        }
        if (gVar == null) {
            return;
        }
        int length = gVar.f399674e.length;
        int i18 = length - gVar.f399672c;
        com.tencent.mars.xlog.Log.i("SpeechRequestData", "putBufferInfo: containerSize = " + length + ", bufferSize = " + gVar.f399672c + " size " + i17);
        if (i18 < i17) {
            int i19 = gVar.f399672c;
            if (length != i19) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            byte[] bArr2 = new byte[i19 + i17];
            if (i19 != 0) {
                java.lang.System.arraycopy(gVar.f399674e, 0, bArr2, 0, i19);
                com.tencent.mars.xlog.Log.i("SpeechRequestData", "putBufferInfo: copy old bufferSize " + gVar.f399672c);
            }
            gVar.f399674e = bArr2;
        }
        java.lang.System.arraycopy(bArr, 0, gVar.f399674e, gVar.f399672c, i17);
        com.tencent.mars.xlog.Log.i("SpeechRequestData", "putBufferInfo: copy new destPos " + gVar.f399672c + " size " + i17);
        gVar.f399672c = gVar.f399672c + i17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z18 = uptimeMillis - gVar.f399673d >= 500;
        if (z18) {
            gVar.f399673d = uptimeMillis;
        }
        if (z18 || z17) {
            pp0.s0 s0Var2 = kVar.f440106a;
            if (s0Var2 == null) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                s0Var = s0Var2;
            }
            if (s0Var == null) {
                return;
            }
            java.lang.String str4 = gVar.f399670a;
            int i27 = gVar.f399671b;
            gVar.f399671b = i27 + 1;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(gVar.f399672c);
            allocateDirect.put(gVar.f399674e, 0, gVar.f399672c);
            com.tencent.mars.xlog.Log.i("SpeechRequestData", "getByteBuffer: reset bufferSize " + gVar.f399672c);
            gVar.f399672c = 0;
            kVar.f440109d.put("session_id", str4);
            kVar.f440109d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, java.lang.String.valueOf(i27));
            kVar.f440109d.put("is_session_end", z17 ? "1" : "0");
            if (z17) {
                kVar.f440112g.put(str4, java.lang.Integer.valueOf(i27));
                kVar.f440110e.c(str4, vu0.u.f440162g);
            } else {
                kVar.f440112g.put(str4, -1);
                kVar.f440110e.c(str4, vu0.u.f440161f);
            }
            java.util.HashMap postParams = kVar.f440109d;
            com.tencent.maas.speech.MJILinkAppRequest iLinkAppRequest = kVar.f440108c;
            vu0.d dVar = new vu0.d(kVar, str4, gVar, z17);
            dz0.s2 s2Var = (dz0.s2) s0Var;
            kotlin.jvm.internal.o.g(postParams, "postParams");
            kotlin.jvm.internal.o.g(iLinkAppRequest, "iLinkAppRequest");
            synchronized (s2Var) {
                if (s2Var.f245006b) {
                    return;
                }
                s2Var.f245005a.g(allocateDirect, postParams, iLinkAppRequest, "getspeechrecognition", dVar);
            }
        }
    }

    @Override // uu0.b
    public void b(byte[] bArr, int i17, boolean z17) {
        if (bArr == null) {
            return;
        }
        vu0.r0 r0Var = this.f366719a.f366731b;
        r0Var.getClass();
        int i18 = i17 / 2;
        int i19 = i18 / 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i27 = 0;
        int i28 = 0;
        while (i27 < i18) {
            int i29 = i27 * 2;
            int abs = java.lang.Math.abs((bArr[i29 + 1] << 8) | (bArr[i29] & 255));
            if (abs > i28) {
                i28 = abs;
            }
            i27++;
            if (i27 % i19 == 0) {
                arrayList.add(java.lang.Integer.valueOf(i28));
                i28 = 0;
            }
        }
        java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(arrayList);
        int intValue = num != null ? num.intValue() : 0;
        int i37 = r0Var.f440147b;
        float f17 = intValue / i37;
        if (intValue > i37) {
            r0Var.f440147b = intValue;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = r0Var.f440148c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf((((java.lang.Number) it.next()).intValue() * 1.0f) / r0Var.f440147b));
        }
        copyOnWriteArrayList.addAll(arrayList2);
        float[] P0 = kz5.n0.P0(copyOnWriteArrayList);
        if (fy0.i.a()) {
            r0Var.f440146a.J4(P0, f17);
        } else {
            fy0.i.b(new vu0.q0(r0Var, P0, f17));
        }
    }

    @Override // uu0.b
    public void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        ru0.b bVar;
        boolean booleanValue = bool.booleanValue();
        qu0.i iVar = this.f366719a;
        iVar.f366731b.getClass();
        iVar.f366730a.f440111f = null;
        com.tencent.mars.xlog.Log.i("MJAudioManager", "onStop: filePath " + str + "  silkFilePath " + str2);
        java.lang.String str3 = iVar.a().f431248f;
        if (!kotlin.jvm.internal.o.b(uu0.c.e().f431209d.f431247e, "wav") || str == null) {
            bVar = new ru0.b(str3, str, str2, null);
        } else {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m() && r6Var.A() && r6Var.C() > 0) {
                java.lang.String a17 = uu0.l.a("wav", r6Var.getName() + "_quality");
                boolean bj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).bj();
                com.tencent.maas.moviecomposing.VocalEnhancementParams vocalEnhancementParams = new com.tencent.maas.moviecomposing.VocalEnhancementParams();
                vocalEnhancementParams.f48435a = true;
                vocalEnhancementParams.f48436b = com.tencent.maas.moviecomposing.h.Points;
                vocalEnhancementParams.f48438d = new com.tencent.maas.base.Vec2[]{new com.tencent.maas.base.Vec2(80.0f, 6.0f), new com.tencent.maas.base.Vec2(120.0f, 0.0f), new com.tencent.maas.base.Vec2(2400.0f, 0.0f), new com.tencent.maas.base.Vec2(2800.0f, 6.0f)};
                vocalEnhancementParams.f48439e = true;
                vocalEnhancementParams.f48440f = com.tencent.maas.moviecomposing.g.NewPeak;
                vocalEnhancementParams.f48441g = 0.0d;
                vocalEnhancementParams.f48442h = false;
                vocalEnhancementParams.f48443i = true;
                vocalEnhancementParams.f48444j = -12.0f;
                vocalEnhancementParams.f48445k = -40.0f;
                vocalEnhancementParams.f48446l = 2.0f;
                vocalEnhancementParams.f48447m = 0.2f;
                vocalEnhancementParams.f48448n = 1.0f;
                vocalEnhancementParams.f48449o = true;
                vocalEnhancementParams.f48450p = false;
                vocalEnhancementParams.f48451q = true;
                vocalEnhancementParams.f48452r = com.tencent.maas.moviecomposing.i.EBUR128;
                vocalEnhancementParams.f48453s = -18.0d;
                ru0.c[] cVarArr = ru0.c.f399659d;
                vocalEnhancementParams.f48454t = 1 == iVar.f366736g;
                vocalEnhancementParams.f48455u = bj6;
                vocalEnhancementParams.f48456v = -18.0f;
                vocalEnhancementParams.f48457w = -40.0f;
                vocalEnhancementParams.f48458x = -10.0f;
                bVar = new ru0.b(str3, a17, str2, com.tencent.maas.moviecomposing.VocalEnhancementProcessor.b(str, a17, vocalEnhancementParams));
            } else {
                bVar = new ru0.b(str3, str, str2, null);
            }
        }
        java.lang.String str4 = iVar.a().f431248f;
        if (str4 != null) {
            iVar.f366734e.put(str4, bVar);
        }
        iVar.f366735f.c(i17, bVar.f399656b, bVar.f399657c, java.lang.Boolean.valueOf(booleanValue));
    }

    @Override // uu0.b
    public void j(int i17) {
        com.tencent.mars.xlog.Log.e("MJAudioManager", "onError: errType " + i17);
        this.f366719a.f366735f.getClass();
    }

    @Override // uu0.b
    public void onStart() {
        qu0.i iVar = this.f366719a;
        qu0.g gVar = iVar.f366735f;
        uu0.k kVar = uu0.c.e().f431209d;
        kotlin.jvm.internal.o.f(kVar, "getRecordParam(...)");
        gVar.d(kVar);
        java.lang.String str = uu0.c.e().f431209d.f431248f;
        if (str != null) {
            vu0.r0 r0Var = iVar.f366731b;
            r0Var.getClass();
            r0Var.f440148c.clear();
            vu0.k kVar2 = iVar.f366730a;
            kVar2.getClass();
            kVar2.f440111f = new ru0.g(str);
            kVar2.f440110e.c(str, vu0.u.f440161f);
        }
    }
}
