package w95;

/* loaded from: classes11.dex */
public class a {
    public void a(w95.d dVar) {
        java.lang.String str;
        x95.b bVar = dVar.f444091r;
        if (bVar != null) {
            y45.o oVar = (y45.o) bVar;
            java.io.File file = dVar.f444083g;
            d55.u.b("MicroMsg.recovery.operator", "#onComplete, file = " + file, new java.lang.Object[0]);
            d55.u.b("MicroMsg.recovery.operator", "download tinker path success", new java.lang.Object[0]);
            boolean exists = file.exists();
            m3.a aVar = oVar.f459382d;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = oVar.f459381c;
            if (!exists) {
                atomicInteger.set(2);
                aVar.accept(java.lang.Integer.valueOf(atomicInteger.get()));
                return;
            }
            if (oVar.f459379a) {
                java.lang.String file2 = file.getAbsolutePath();
                if (new java.io.File(file2).isFile()) {
                    kotlin.jvm.internal.o.g(file2, "file");
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(file2)));
                    try {
                        long readLong = dataInputStream.readLong();
                        vz5.b.a(dataInputStream, null);
                        if (readLong == 96093072812398L) {
                            d55.u.b("MicroMsg.recovery.operator", "[+] It's a compressed file, %s", file2);
                            android.content.Context context = oVar.f459380b;
                            java.lang.String dir = new java.io.File(context.getCacheDir(), "recovery/TPCFileTemp").getAbsolutePath();
                            kotlin.jvm.internal.o.g(dir, "dir");
                            t95.h.f416594b = dir;
                            t95.d.f416589a = new y45.q();
                            try {
                                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("RecoveryPatchUncompress", e17, "", new java.lang.Object[0]);
                                str = null;
                            }
                            if (str != null) {
                                java.lang.String outPatchFilePath = file2.concat(".zip");
                                y45.m$$c m__c = new y45.m$$c();
                                kotlin.jvm.internal.o.g(outPatchFilePath, "outPatchFilePath");
                                int a17 = t95.f.f416590a.a(str, file2, outPatchFilePath, m__c);
                                if (a17 == 0) {
                                    file2 = outPatchFilePath;
                                } else {
                                    d55.u.d("MicroMsg.recovery.operator", "Process tinker compressed file fail: %d", java.lang.Integer.valueOf(a17));
                                    file2 = null;
                                }
                                java.io.File[] listFiles = new java.io.File(new java.io.File(context.getCacheDir(), "recovery/TPCFileTemp").getAbsolutePath()).listFiles();
                                if (listFiles != null) {
                                    for (java.io.File file3 : listFiles) {
                                        file3.delete();
                                    }
                                }
                            } else {
                                d55.u.d("MicroMsg.recovery.operator", "Get base apk failed", new java.lang.Object[0]);
                                file2 = null;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(dataInputStream, th6);
                            throw th7;
                        }
                    }
                }
                d55.u.b("MicroMsg.recovery.operator", "Processed patch file: %s", file2);
                if (file2 == null) {
                    atomicInteger.set(30);
                } else {
                    int d17 = ak0.n.d(new java.io.File(file2));
                    if (d17 == 0) {
                        d55.u.b("MicroMsg.recovery.operator", "[+] Apply patch triggered.", new java.lang.Object[0]);
                        atomicInteger.set(0);
                    } else {
                        d55.u.d("MicroMsg.recovery.operator", "[!] Failed to apply patch, code = %s", java.lang.Integer.valueOf(d17));
                        atomicInteger.set(32);
                    }
                }
            }
            aVar.accept(java.lang.Integer.valueOf(atomicInteger.get()));
        }
    }

    public void b(w95.d dVar, int i17, java.lang.String str) {
        x95.b bVar = dVar.f444091r;
        if (bVar != null) {
            y45.o oVar = (y45.o) bVar;
            d55.u.d("MicroMsg.recovery.operator", "#onFailed, code = " + i17 + ", msg = " + str, new java.lang.Object[0]);
            int i18 = i17 == 1001 ? 3 : (i17 < 1101 || i17 > 1106) ? 2 : (i17 - 1101) + 4;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = oVar.f459381c;
            atomicInteger.set(i18);
            oVar.f459382d.accept(java.lang.Integer.valueOf(atomicInteger.get()));
        }
    }
}
