package com.tencent.mm.plugin.zero;

/* loaded from: classes12.dex */
public final class k1 extends pq5.c implements a25.r {
    @Override // a25.r
    public void g(final com.tencent.mm.booter.y0 y0Var, final int i17, final byte[] bArr, final byte[] bArr2, final r45.cx4 cx4Var) {
        w(new com.tencent.mm.plugin.zero.l1(this, y0Var, i17, bArr, bArr2, cx4Var));
        fs.g.b(a25.t.class, new fs.o(y0Var, i17, bArr, bArr2, cx4Var) { // from class: com.tencent.mm.plugin.zero.k1$$a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f188645a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ byte[] f188646b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f188647c;

            {
                this.f188645a = i17;
                this.f188646b = bArr;
                this.f188647c = bArr2;
            }

            @Override // fs.o
            public final boolean a(fs.n nVar) {
                final int i18 = this.f188645a;
                final byte[] bArr3 = this.f188646b;
                final byte[] bArr4 = this.f188647c;
                final com.tencent.mm.plugin.messenger.foundation.q2 q2Var = (com.tencent.mm.plugin.messenger.foundation.q2) ((a25.t) nVar);
                q2Var.getClass();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.messenger.foundation.q2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte[] bArr5;
                        com.tencent.mm.network.s sVar;
                        byte[] bArr6 = bArr4;
                        com.tencent.mm.plugin.messenger.foundation.q2.this.getClass();
                        if (i18 == 321 && (bArr5 = bArr3) != null) {
                            r45.jy5 jy5Var = new r45.jy5();
                            try {
                                jy5Var.parseFrom(bArr5);
                                byte[] bArr7 = jy5Var.f378218d.f192156a;
                                if (jy5Var.f378219e != null) {
                                    r45.o1 o1Var = new r45.o1();
                                    o1Var.parseFrom(jy5Var.f378219e.f192156a);
                                    if (o1Var.f381808d) {
                                        r45.p1 p1Var = o1Var.f381809e;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", java.lang.Integer.valueOf(p1Var.f382652e), java.lang.Integer.valueOf(p1Var.f382653f), java.lang.Integer.valueOf(p1Var.f382654g), java.lang.Integer.valueOf(p1Var.f382655h), java.lang.Integer.valueOf(p1Var.f382656i), java.lang.Integer.valueOf(p1Var.f382657m));
                                        int i19 = p1Var.f382652e;
                                        if (i19 == 13) {
                                            gm0.j1.i();
                                            byte[] c17 = gm0.j1.n().c(3);
                                            bArr7 = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecryptWithUncompress(c17, bArr7);
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            int i27 = -1;
                                            objArr[0] = java.lang.Integer.valueOf(c17 == null ? -1 : c17.length);
                                            if (bArr7 != null) {
                                                i27 = bArr7.length;
                                            }
                                            objArr[1] = java.lang.Integer.valueOf(i27);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]", objArr);
                                        } else {
                                            bArr7 = com.tencent.mm.protocal.MMProtocalJni.decodeSecureNotifyData(bArr6, i19, p1Var.f382653f, p1Var.f382654g, p1Var.f382655h, p1Var.f382656i, p1Var.f382657m, p1Var.f382658n, bArr7);
                                        }
                                    }
                                }
                                r45.yw4 yw4Var = new r45.yw4();
                                yw4Var.parseFrom(bArr7);
                                vg3.w3 w3Var = (vg3.w3) i95.n0.c(vg3.w3.class);
                                com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(yw4Var.f391450d, null);
                                pq5.d dVar = vg3.b5.f436650b;
                                vg3.z4 z4Var = dVar != null ? (vg3.z4) dVar.get() : null;
                                if (z4Var == null) {
                                    z4Var = new com.tencent.mm.plugin.messenger.foundation.u2();
                                }
                                ((com.tencent.mm.plugin.messenger.foundation.b2) w3Var).getClass();
                                com.tencent.mm.plugin.messenger.foundation.a2.b(p0Var, com.tencent.mm.booter.x1.e(), z4Var);
                                gm0.j1.d().f70764d.ackActionNotify("", jy5Var.f378220f, com.tencent.mars.mm.MMStnManagerCallback.ACTION_ACK_OK);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "deal succ, taskid:%d", java.lang.Long.valueOf(jy5Var.f378220f));
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SecurityNotifyReceiverCallback", e17, "taskid:%d", java.lang.Long.valueOf(jy5Var.f378220f));
                                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                                if (d17 == null || (sVar = d17.f70764d) == null) {
                                    return;
                                }
                                sVar.ackActionNotify("", jy5Var.f378220f, com.tencent.mars.mm.MMStnManagerCallback.ACTION_ACK_FAILED);
                            }
                        }
                    }
                };
                ((ku5.t0) ku5.t0.f312615d).h(runnable, w11.h2.f442050f);
                return false;
            }
        });
    }
}
