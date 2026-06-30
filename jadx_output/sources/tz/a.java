package tz;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.io.InputStream inputStream;
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        if (r2Var.f7759a == 47 && r2Var.f7760b == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckRegionCodeListener", "going to update region code.");
            java.lang.String str = checkResUpdateCacheFileEvent.f54053g.f7761c;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.io.InputStream inputStream2 = null;
                java.lang.String str2 = null;
                inputStream2 = null;
                try {
                    try {
                        inputStream = com.tencent.mm.vfs.w6.C(r6Var);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream = inputStream2;
                }
                try {
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        java.lang.String[] split = readLine.trim().split("\\|");
                        if (split.length >= 2 && !com.tencent.mm.sdk.platformtools.t8.K0(split[0]) && !com.tencent.mm.sdk.platformtools.t8.K0(split[1])) {
                            java.io.BufferedWriter bufferedWriter = (java.io.BufferedWriter) hashMap.get(split[0]);
                            if (bufferedWriter == null) {
                                str2 = com.tencent.mm.storage.ha.k().c(split[0]);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str2);
                                    if (!r6Var2.m()) {
                                        r6Var2.k();
                                    }
                                    java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new com.tencent.mm.vfs.a7(r6Var2));
                                    hashMap.put(split[0], bufferedWriter2);
                                    bufferedWriter = bufferedWriter2;
                                }
                            }
                            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                            stringBuffer.append(split[1]);
                            stringBuffer.append('|');
                            stringBuffer.append(split[2]);
                            stringBuffer.append('\n');
                            bufferedWriter.write(stringBuffer.toString());
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.SubCorePacakge", "dispatch regioncode, error line = " + readLine);
                    }
                    for (java.io.BufferedWriter bufferedWriter3 : hashMap.values()) {
                        if (bufferedWriter3 != null) {
                            bufferedWriter3.flush();
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        for (com.tencent.mm.vfs.r6 r6Var3 : new com.tencent.mm.vfs.r6(str2).s().H(new f21.q0())) {
                            com.tencent.mm.storage.ha.k().d(r6Var3, r6Var3.s());
                        }
                        com.tencent.mm.storage.ha.k().a();
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    r6Var.l();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCorePacakge", e18, "", new java.lang.Object[0]);
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter4 : hashMap.values()) {
                        if (bufferedWriter4 != null) {
                            bufferedWriter4.close();
                        }
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    inputStream2 = inputStream;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCorePacakge", e, "", new java.lang.Object[0]);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.io.IOException e27) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCorePacakge", e27, "", new java.lang.Object[0]);
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter5 : hashMap.values()) {
                        if (bufferedWriter5 != null) {
                            bufferedWriter5.close();
                        }
                    }
                    return false;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e28) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCorePacakge", e28, "", new java.lang.Object[0]);
                            throw th;
                        }
                    }
                    for (java.io.BufferedWriter bufferedWriter6 : hashMap.values()) {
                        if (bufferedWriter6 != null) {
                            bufferedWriter6.close();
                        }
                    }
                    throw th;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SubCorePacakge", "update regioncode failed, file not exist, packagePath:".concat(str));
            }
        }
        return false;
    }
}
