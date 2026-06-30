package com.tencent.mm.plugin.transvoice.model;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f175358e = com.tencent.mm.storage.v3.f196273a + "voice_temp.silk";

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f175359a;

    /* renamed from: b, reason: collision with root package name */
    public yl.b f175360b;

    /* renamed from: c, reason: collision with root package name */
    public z21.a0 f175361c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f175362d;

    public a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f175359a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent>(a0Var) { // from class: com.tencent.mm.plugin.transvoice.model.CutShortSentence$1

            /* renamed from: d, reason: collision with root package name */
            public short[] f175356d;

            {
                this.__eventId = 822073171;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent sceneVoiceRcdDataEvent) {
                com.tencent.mm.autogen.events.SceneVoiceRcdDataEvent sceneVoiceRcdDataEvent2 = sceneVoiceRcdDataEvent;
                synchronized (com.tencent.mm.plugin.transvoice.model.a.this) {
                    am.dt dtVar = sceneVoiceRcdDataEvent2.f54740g;
                    byte[] bArr = dtVar.f6499a;
                    int i17 = dtVar.f6500b;
                    com.tencent.mars.xlog.Log.i("MicroMsg.CutShortSentence", "rec data, len: %s time: %s.", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    short[] sArr = this.f175356d;
                    if (sArr == null || sArr.length < i17 / 2) {
                        this.f175356d = new short[i17 / 2];
                    }
                    for (int i18 = 0; i18 < i17 / 2; i18++) {
                        int i19 = i18 * 2;
                        this.f175356d[i18] = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
                    }
                    com.tencent.mm.plugin.transvoice.model.a.a(com.tencent.mm.plugin.transvoice.model.a.this, this.f175356d, i17 / 2);
                }
                return false;
            }
        };
        com.tencent.mars.xlog.Log.i("MicroMsg.CutShortSentence", "init cut sentence, time %s.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        try {
            java.lang.String str = f175358e;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
            if (!r6Var.m()) {
                r6Var.k();
            }
            r6Var.l();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CutShortSentence", e17, "delete file failed", new java.lang.Object[0]);
        }
    }

    public static void a(com.tencent.mm.plugin.transvoice.model.a aVar, short[] sArr, int i17) {
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CutShortSentence", "saveTofile, size: %s", java.lang.Integer.valueOf(i17));
        byte[] bArr = aVar.f175362d;
        if (bArr == null || bArr.length < i17 * 2) {
            aVar.f175362d = new byte[i17 * 2];
        }
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr2 = aVar.f175362d;
            int i19 = i18 * 2;
            short s17 = sArr[i18];
            bArr2[i19] = (byte) (s17 & 255);
            bArr2[i19 + 1] = (byte) ((65280 & s17) >> 8);
        }
        yl.b bVar = aVar.f175360b;
        if (-1 == (bVar != null ? ((yl.g) bVar).e(new tl.h0(aVar.f175362d, i17 * 2), 0, true) : -1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CutShortSentence", "error localCode = %s.", 2);
            com.tencent.mars.xlog.Log.e("MicroMsg.CutShortSentence", "write to file failed");
        }
    }

    public void b(z21.a0 a0Var) {
        this.f175361c = a0Var;
        yl.g gVar = new yl.g(16000, 23900);
        this.f175360b = gVar;
        if (!gVar.b(f175358e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CutShortSentence", "init speex writer failed");
            ((yl.g) this.f175360b).d();
            this.f175360b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.CutShortSentence", "error localCode = %s.", 1);
        }
        z21.a0 a0Var2 = this.f175361c;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        this.f175359a.alive();
    }
}
