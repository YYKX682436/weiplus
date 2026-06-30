package k72;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f304701d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304701d = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k72.a(this.f304701d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        k72.a aVar = (k72.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.String readLine;
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!k72.b.f304705b) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tpcs");
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/facedetectaction/model/DevSecurityScan", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj2, "com/tencent/mm/plugin/facedetectaction/model/DevSecurityScan", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            k72.b.f304705b = true;
        }
        int i18 = this.f304701d;
        if ((i18 & 1) == 0) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            int i19 = -1;
            int i27 = L != null ? L.getInt("PAY_DEV_SE_01", -1) : -1;
            com.tencent.mm.sdk.platformtools.o4 L2 = com.tencent.mm.sdk.platformtools.o4.L();
            java.lang.String str = "";
            if (L2 != null && (string = L2.getString("PAY_DEV_SE_02", "")) != null) {
                str = string;
            }
            if (i27 != -1) {
                k72.c.f304706a = i27;
                k72.c.f304708c = str;
                i19 = 0;
            }
            k72.c.f304707b = i19;
            if (i19 != 0) {
                try {
                    k72.b bVar = k72.b.f304704a;
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(bVar.a("\fSQL@\fPFOE\fNBSP")));
                    if (!r6Var.m()) {
                        i17 = -2;
                    } else if (r6Var.h()) {
                        java.lang.String a17 = bVar.a("OJAKLVGJMJ");
                        java.lang.String a18 = bVar.a("\f[\u001b\u0015\f");
                        java.lang.String a19 = bVar.a("\f[\u001b\u0015|\u0015\u0017\f");
                        com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(r6Var);
                        try {
                            java.io.Reader inputStreamReader = new java.io.InputStreamReader(u6Var, r26.c.f368865a);
                            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                            do {
                                try {
                                    readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        vz5.b.a(bufferedReader, null);
                                        vz5.b.a(u6Var, null);
                                        break;
                                    }
                                    if (r26.n0.B(readLine, a17, true) || r26.n0.B(readLine, a18, true)) {
                                        break;
                                    }
                                } finally {
                                }
                            } while (!r26.n0.B(readLine, a19, true));
                            k72.c.f304706a = 1;
                            java.util.List g17 = new r26.t("\\s+").g(readLine, 0);
                            java.lang.String str2 = g17.size() >= 6 ? (java.lang.String) g17.get(5) : null;
                            if (str2 == null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(14);
                                for (int i28 = 0; i28 < 14; i28++) {
                                    arrayList2.add(java.lang.Character.valueOf((char) ("OJAKLVGJMJ|[\u001b\u0015".charAt(i28) ^ '#')));
                                }
                                str2 = kz5.n0.g0(arrayList2, "", null, null, 0, null, null, 62, null);
                            }
                            k72.c.f304708c = str2;
                            vz5.b.a(bufferedReader, null);
                            vz5.b.a(u6Var, null);
                            i17 = 0;
                        } finally {
                        }
                    } else {
                        i17 = -3;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("ScanEngine01", e17, "DoScan failed!", new java.lang.Object[0]);
                    i17 = -4;
                }
                k72.c.f304707b = i17;
                if (i17 == 0) {
                    com.tencent.mm.sdk.platformtools.o4 L3 = com.tencent.mm.sdk.platformtools.o4.L();
                    if (L3 != null) {
                        L3.putInt("PAY_DEV_SE_01", k72.c.f304706a);
                    }
                    com.tencent.mm.sdk.platformtools.o4 L4 = com.tencent.mm.sdk.platformtools.o4.L();
                    if (L4 != null) {
                        L4.putString("PAY_DEV_SE_02", k72.c.f304708c);
                    }
                }
            }
        }
        if ((i18 & 16) == 0 && k72.c.f304706a != 1) {
            int checkByNative = com.tencent.mm.plugin.facedetect.FaceProNative.checkByNative();
            if (checkByNative == 1) {
                java.lang.String vAScanResult = com.tencent.mm.plugin.facedetect.FaceProNative.getVAScanResult();
                kotlin.jvm.internal.o.f(vAScanResult, "getVAScanResult(...)");
                k72.e0.f304722c = vAScanResult;
                k72.e0.f304720a = 1;
                k72.e0.f304721b = 0;
            } else {
                k72.e0.f304720a = 0;
                k72.e0.f304721b = checkByNative;
            }
        }
        return jz5.f0.f302826a;
    }
}
