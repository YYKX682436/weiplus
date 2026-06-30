package z45;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f470145f = bm5.s1.a("\u0091´½\u00ad·\u0094©¼ú\u009d\u0082\u0083\u0080\u009f½§\u0080¢©¦¦\u009d£¥¯ ´\u0084¨¤¡¨");

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f470146g = {0};

    /* renamed from: d, reason: collision with root package name */
    public final y45.a f470147d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f35 f470148e;

    public a(r45.f35 f35Var, y45.a aVar) {
        this.f470148e = f35Var;
        this.f470147d = aVar;
    }

    public static void a(y45.a aVar, r45.f35 f35Var, int i17, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, java.lang.Throwable th6) {
        java.lang.Object[] objArr = {aVar, java.lang.Integer.valueOf(i17), tinkerSyncResponse, th6};
        java.lang.String str = f470145f;
        d55.u.b(str, "[+] doCallback called: %s,%s,%s,%s", objArr);
        if (aVar != null) {
            try {
                ((y45.p) aVar).a(f35Var, i17, tinkerSyncResponse, th6);
            } catch (java.lang.Throwable th7) {
                d55.u.c(str, "[!] exception occurred in doCallback.", th7, new java.lang.Object[0]);
            }
        }
    }

    public static void b(r45.f35 f35Var, y45.a aVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr = f470146g;
        synchronized (jArr) {
            if (currentTimeMillis - jArr[0] < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                d55.u.d(f470145f, "doCheck is called too often.", new java.lang.Object[0]);
            } else {
                jArr[0] = currentTimeMillis;
                y45.u.a().post(new z45.a(f35Var, aVar));
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0166 -> B:34:0x01cc). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mk0();
        lVar.f70665b = new r45.g35();
        lVar.f70666c = bm5.s1.a("Ë\u0086\u0081\u008eÍ\u0083\u008b\u008dó°·¼ª¶·¨³ø´¾¾þ¡¶¯¨ ¬º°º¿´·¥¨®§«¤");
        lVar.f70667d = 3824;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        a17.setRsaInfo(o45.pi.d());
        a17.f70714e = 1;
        r45.f35 f35Var = this.f470148e;
        y45.a aVar = this.f470147d;
        if (f35Var == null) {
            try {
                r45.f35 f35Var2 = new r45.f35();
                this.f470148e = f35Var2;
                java.lang.String str = lp0.a.f320256j;
                if (str == null) {
                    str = "";
                }
                f35Var2.f373987d = str;
                f35Var2.f373988e = lp0.a.a();
                this.f470148e.f373989f = b55.b.b();
                this.f470148e.f373994n = 1;
            } catch (java.lang.Throwable th6) {
                a(aVar, this.f470148e, -6, null, th6);
                return;
            }
        }
        r45.f35 f35Var3 = this.f470148e;
        java.lang.Object[] objArr = {f35Var3.f373987d, f35Var3.f373988e};
        java.lang.String str2 = f470145f;
        d55.u.b(str2, "start check request: %s,%s", objArr);
        try {
            r45.mk0 mk0Var = (r45.mk0) a17.f70710a.f70684a;
            r45.lk0 lk0Var = new r45.lk0();
            lk0Var.BaseRequest = o45.bh.a(a17.getReqObj());
            lk0Var.f379541d = this.f470148e;
            mk0Var.f380601e = lk0Var;
            r45.nk0 nk0Var = new r45.nk0();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
            nk0Var.f381457d = cu5Var;
            mk0Var.f380600d = nk0Var;
            byte[] byteArray = mk0Var.toByteArray();
            if (byteArray == null) {
                throw new java.lang.NullPointerException("reqBuf is null");
            }
            try {
                httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(bm5.s1.a("\u009a\u0087\u0098\u009d\u009dÕÇÆ\u009a\u0099\u0087\u008a\u0088\u0081\u0089\u0086Ì\u0094¹´¦¶¶÷«ªú¶¹ºÿ²µºá¯§¡ç¾¯©´·¥¨®§«¤")).openConnection();
                try {
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setRequestProperty(bm5.s1.a("\u008b¦¤¿¡«²ê\u0094¸²¦"), bm5.s1.a("³»½\u00ad¿·à§ª¾®°èµ³²¤£®"));
                    httpsURLConnection.setDoOutput(false);
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setFixedLengthStreamingMode(byteArray.length);
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
                    java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(byteArray);
                        outputStream.flush();
                        outputStream.close();
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            throw new java.io.IOException("HTTP request failed, code:" + responseCode + ", msg:" + com.tencent.mm.sdk.platformtools.t8.e(httpsURLConnection.getErrorStream()));
                        }
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(128);
                        java.io.InputStream inputStream = httpsURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            byteArrayOutputStream.flush();
                            inputStream.close();
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused) {
                            }
                            try {
                                r45.g35 g35Var = new r45.g35();
                                g35Var.parseFrom(byteArray2);
                                r45.j35 j35Var = g35Var.f374853d;
                                if (j35Var == null) {
                                    d55.u.d(str2, "empty node. code:%d", java.lang.Integer.valueOf(g35Var.f374858i));
                                    a(aVar, this.f470148e, -5, null, null);
                                } else {
                                    com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
                                    d55.u.b(str2, "get response successfully: %s,%s", g35Var.f374854e, g35Var.f374855f);
                                    a(aVar, this.f470148e, 0, tinkerSyncResponse, null);
                                }
                            } catch (java.lang.Throwable th7) {
                                a(aVar, this.f470148e, -2, null, th7);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    try {
                        a(aVar, this.f470148e, -1, null, th);
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused2) {
                            }
                        }
                    } catch (java.lang.Throwable th9) {
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused3) {
                            }
                        }
                        throw th9;
                    }
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                httpsURLConnection = null;
            }
        } catch (java.lang.Throwable th11) {
            a(aVar, this.f470148e, -6, null, th11);
        }
    }
}
