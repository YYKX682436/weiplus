package x51;

/* loaded from: classes12.dex */
public class s0 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public int f452081d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f452082e = null;

    /* renamed from: f, reason: collision with root package name */
    public final x51.o0 f452083f;

    public s0(x51.o0 o0Var) {
        if (!x51.w0.b(o0Var)) {
            throw new java.lang.IllegalArgumentException("from net, picture strategy here must be validity");
        }
        this.f452083f = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        java.lang.Throwable th6;
        java.io.OutputStream outputStream;
        java.io.InputStream inputStream;
        android.graphics.Bitmap b17;
        android.graphics.Bitmap bitmap;
        x51.o0 o0Var = this.f452083f;
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "picStrategy == null");
            return true;
        }
        java.io.InputStream inputStream2 = null;
        android.graphics.Bitmap bitmap2 = null;
        r7 = null;
        r7 = null;
        inputStream2 = null;
        java.lang.String str = null;
        try {
            o0Var.f();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o0Var.k());
            outputStream = com.tencent.mm.vfs.w6.K(r6Var.o() + "_tmp", false);
            try {
                com.tencent.mm.network.h2 d17 = com.tencent.mm.network.n.d(o0Var.g(), null);
                if (m11.n1.g() && m11.n1.h(o0Var.g())) {
                    d17.d(m11.n1.a(o45.wf.f343029g));
                }
                d17.g(10000);
                d17.k(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
                d17.c("GET");
                inputStream = com.tencent.mm.network.n.a(d17) == 0 ? d17.getInputStream() : null;
                try {
                    try {
                        java.lang.String e17 = d17.e();
                        try {
                            if (inputStream == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.MMPictureLogic", "download %s error, can not open http stream", o0Var.g());
                                o0Var.j(e17, false);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (java.io.IOException e18) {
                                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                                    }
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (java.io.IOException e19) {
                                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                                    }
                                }
                                return true;
                            }
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                this.f452081d += read;
                                outputStream.write(bArr, 0, read);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMPictureLogic", "get url[%s] ok, bufSize[%d]", o0Var.g(), java.lang.Integer.valueOf(this.f452081d));
                            o0Var.j(e17, true);
                            try {
                                inputStream.close();
                            } catch (java.io.IOException e27) {
                                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e28) {
                                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
                                }
                            }
                            try {
                                com.tencent.mm.vfs.w6.p(r6Var.o() + "_tmp");
                                x51.n0 b18 = o0Var.b();
                                if (b18 != null) {
                                    b17 = b18.a(r6Var.o() + "_tmp");
                                } else {
                                    b17 = x51.v0.b(r6Var.o() + "_tmp");
                                }
                                x51.m0 m0Var = x51.m0.NET;
                                if (b17 != null) {
                                    bitmap = o0Var.l(b17, m0Var, r6Var.o() + "_tmp");
                                } else {
                                    o0Var.h(m0Var, e17);
                                    bitmap = null;
                                }
                                if (bitmap != b17 && !b17.isRecycled()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", b17.toString());
                                    b17.recycle();
                                }
                                x51.v0.INSTANCE.f(o0Var, bitmap);
                                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(r6Var.o() + "_tmp");
                                java.lang.String str2 = a17.f213279f;
                                if (str2 != null) {
                                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                                    if (!str2.equals(l17)) {
                                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                    }
                                }
                                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                                if (m17.a()) {
                                    m17.f213266a.d(m17.f213267b);
                                }
                                bitmap2 = bitmap;
                            } catch (java.lang.Exception e29) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.MMPictureLogic", "update pic for %s, error", o0Var.g());
                                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e29));
                            }
                            this.f452082e = bitmap2;
                            return true;
                        } catch (java.lang.Exception e37) {
                            e = e37;
                            str = e17;
                            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e));
                            com.tencent.mars.xlog.Log.w("MicroMsg.MMPictureLogic", "get url:%s failed.", o0Var.g());
                            o0Var.j(str, false);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (java.io.IOException e38) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e38));
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e39) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e39));
                                }
                            }
                            return true;
                        }
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.io.IOException e47) {
                                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e47));
                            }
                        }
                        if (outputStream == null) {
                            throw th6;
                        }
                        try {
                            outputStream.close();
                            throw th6;
                        } catch (java.io.IOException e48) {
                            boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e48));
                            throw th6;
                        }
                    }
                } catch (java.lang.Exception e49) {
                    e = e49;
                }
            } catch (java.lang.Exception e57) {
                e = e57;
                inputStream = null;
            } catch (java.lang.Throwable th8) {
                th6 = th8;
            }
        } catch (java.lang.Exception e58) {
            e = e58;
            outputStream = null;
            inputStream = null;
        } catch (java.lang.Throwable th9) {
            th6 = th9;
            outputStream = null;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        try {
            ((com.tencent.mm.modelstat.s0) c01.n8.f37348a).a(this.f452081d, 0, 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPictureLogic", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        x51.v0 v0Var = x51.v0.INSTANCE;
        x51.o0 o0Var = this.f452083f;
        x51.v0.a(v0Var, o0Var.g(), o0Var.c(), this.f452082e);
        this.f452082e = null;
        return false;
    }
}
