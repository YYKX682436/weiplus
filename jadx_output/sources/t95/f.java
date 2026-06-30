package t95;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final t95.f f416590a = new t95.f();

    public final int a(java.lang.String apkFilePath, java.lang.String cPatchPath, java.lang.String outPatchFilePath, t95.a patcher) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.Iterable<t95.b> iterable;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(apkFilePath, "apkFilePath");
        kotlin.jvm.internal.o.g(cPatchPath, "cPatchPath");
        kotlin.jvm.internal.o.g(outPatchFilePath, "outPatchFilePath");
        kotlin.jvm.internal.o.g(patcher, "patcher");
        java.io.File a17 = t95.h.a();
        java.io.File a18 = t95.h.a();
        java.io.File a19 = t95.h.a();
        java.lang.String msg = "apkFriendFile = " + ((java.lang.Object) a17.getAbsolutePath()) + ' ';
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str2 = "MicroMsg.PatchCompressor";
        t95.d.f416589a.i("MicroMsg.PatchCompressor", msg);
        java.lang.String msg2 = "patchFriendFile = " + ((java.lang.Object) a18.getAbsolutePath()) + ' ';
        kotlin.jvm.internal.o.g(msg2, "msg");
        t95.d.f416589a.i("MicroMsg.PatchCompressor", msg2);
        java.lang.String msg3 = "hPatchFileNoMagic = " + ((java.lang.Object) a19.getAbsolutePath()) + ' ';
        kotlin.jvm.internal.o.g(msg3, "msg");
        t95.d.f416589a.i("MicroMsg.PatchCompressor", msg3);
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(new java.io.File(apkFilePath));
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(a17);
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                kotlin.jvm.internal.o.f(entries, "zf.entries()");
                java.util.ArrayList list = java.util.Collections.list(entries);
                kotlin.jvm.internal.o.f(list, "list(this)");
                java.util.Iterator it = list.iterator();
                while (true) {
                    i17 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.io.InputStream inputStream = zipFile.getInputStream((java.util.zip.ZipEntry) it.next());
                    kotlin.jvm.internal.o.f(inputStream, "zf.getInputStream(it)");
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read >= 0) {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileOutputStream.flush();
                }
                vz5.b.a(fileOutputStream, null);
                vz5.b.a(zipFile, null);
                java.lang.String msg4 = kotlin.jvm.internal.o.m("apk mergeFile len: ", java.lang.Long.valueOf(a17.length()));
                kotlin.jvm.internal.o.g(msg4, "msg");
                t95.d.f416589a.i("MicroMsg.ZipUncompress", msg4);
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(cPatchPath)));
                try {
                    if (dataInputStream.readLong() != 96093072812398L) {
                        vz5.b.a(dataInputStream, null);
                    } else {
                        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(a19);
                        try {
                            vz5.a.b(dataInputStream, fileOutputStream2, 0, 2, null);
                            fileOutputStream2.flush();
                            vz5.b.a(fileOutputStream2, null);
                            vz5.b.a(dataInputStream, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    java.lang.String absolutePath = a17.getAbsolutePath();
                    kotlin.jvm.internal.o.f(absolutePath, "apkFriendFile.absolutePath");
                    java.lang.String absolutePath2 = a19.getAbsolutePath();
                    kotlin.jvm.internal.o.f(absolutePath2, "hPatchFileNoMagic.absolutePath");
                    java.lang.String absolutePath3 = a18.getAbsolutePath();
                    kotlin.jvm.internal.o.f(absolutePath3, "patchFriendFile.absolutePath");
                    int a27 = patcher.a(absolutePath, absolutePath2, absolutePath3);
                    java.lang.String absolutePath4 = a18.getAbsolutePath();
                    kotlin.jvm.internal.o.f(absolutePath4, "patchFriendFile.absolutePath");
                    t95.d.f416589a.d("MicroMsg.ZipUncompress", "friendlyToZipFile");
                    java.io.File a28 = t95.h.a();
                    t95.h.a();
                    dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(absolutePath4)));
                    try {
                        if (dataInputStream.readLong() != 96093072812398L) {
                            vz5.b.a(dataInputStream, null);
                            iterable = kz5.p0.f313996d;
                            i18 = a27;
                            str = "MicroMsg.PatchCompressor";
                        } else {
                            int readInt = dataInputStream.readInt();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i19 = 0;
                            while (i19 < readInt) {
                                i19++;
                                int readInt2 = dataInputStream.readInt();
                                byte[] bArr2 = new byte[readInt2];
                                dataInputStream.read(bArr2, i17, readInt2);
                                arrayList.add(new t95.b(new java.lang.String(bArr2, r26.c.f368865a), new t95.g(dataInputStream.readLong(), dataInputStream.readLong()), dataInputStream.readBoolean()));
                                a27 = a27;
                                str2 = str2;
                                i17 = 0;
                            }
                            i18 = a27;
                            str = str2;
                            fileOutputStream = new java.io.FileOutputStream(a28);
                            try {
                                vz5.a.b(dataInputStream, fileOutputStream, 0, 2, null);
                                fileOutputStream.flush();
                                vz5.b.a(fileOutputStream, null);
                                vz5.b.a(dataInputStream, null);
                                iterable = arrayList;
                            } finally {
                            }
                        }
                        java.io.File file = new java.io.File(outPatchFilePath);
                        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(file));
                        try {
                            u95.a aVar = new u95.a(a28);
                            try {
                                kz5.n0.F0(iterable, new t95.j());
                                for (t95.b bVar : iterable) {
                                    java.lang.String str3 = bVar.f416585a;
                                    t95.g gVar = bVar.f416586b;
                                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(str3);
                                    zipEntry.setMethod(8);
                                    zipOutputStream.putNextEntry(zipEntry);
                                    java.lang.Iterable iterable2 = iterable;
                                    aVar.a(gVar.f416591a, gVar.f416592b);
                                    java.lang.String msg5 = bVar.f416585a + "before DEFLATED: " + gVar;
                                    kotlin.jvm.internal.o.g(msg5, "msg");
                                    t95.d.f416589a.i("MicroMsg.ZipUncompress", msg5);
                                    byte[] bArr3 = new byte[16384];
                                    while (true) {
                                        int read2 = aVar.read(bArr3);
                                        if (read2 < 0) {
                                            break;
                                        }
                                        zipOutputStream.write(bArr3, 0, read2);
                                    }
                                    zipOutputStream.flush();
                                    zipOutputStream.flush();
                                    zipOutputStream.closeEntry();
                                    iterable = iterable2;
                                }
                                java.lang.Iterable<t95.b> iterable3 = iterable;
                                vz5.b.a(aVar, null);
                                vz5.b.a(zipOutputStream, null);
                                u95.a aVar2 = new u95.a(file);
                                try {
                                    java.util.List a29 = v95.c.a(aVar2);
                                    aVar2.close();
                                    kz5.n0.F0(a29, new t95.i());
                                    for (t95.b bVar2 : iterable3) {
                                        java.util.Iterator it6 = ((java.util.ArrayList) a29).iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it6.next();
                                            if (kotlin.jvm.internal.o.b(((v95.a) obj).f434177i, bVar2.f416585a)) {
                                                break;
                                            }
                                        }
                                        v95.a aVar3 = (v95.a) obj;
                                        if (aVar3 != null) {
                                            t95.g gVar2 = new t95.g(aVar3.f434176h, aVar3.f434171c);
                                            bVar2.getClass();
                                            bVar2.f416588d = gVar2;
                                            java.lang.String msg6 = bVar2.f416585a + "after DEFLATED: " + bVar2.f416588d;
                                            kotlin.jvm.internal.o.g(msg6, "msg");
                                            t95.d.f416589a.i("MicroMsg.ZipUncompress", msg6);
                                        }
                                    }
                                    java.lang.String msg7 = kotlin.jvm.internal.o.m("inFriendlyFile length=", java.lang.Long.valueOf(a28.length()));
                                    kotlin.jvm.internal.o.g(msg7, "msg");
                                    t95.d.f416589a.i("MicroMsg.ZipUncompress", msg7);
                                    java.lang.String msg8 = kotlin.jvm.internal.o.m("tmpFile length=", java.lang.Long.valueOf(file.length()));
                                    kotlin.jvm.internal.o.g(msg8, "msg");
                                    t95.d.f416589a.i("MicroMsg.ZipUncompress", msg8);
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uncompressor: result:");
                                    int i27 = i18;
                                    sb6.append(i27);
                                    sb6.append(' ');
                                    java.lang.String msg9 = sb6.toString();
                                    kotlin.jvm.internal.o.g(msg9, "msg");
                                    java.lang.String str4 = str;
                                    t95.d.f416589a.i(str4, msg9);
                                    java.lang.String msg10 = "filePath:" + outPatchFilePath + " len:" + new java.io.File(outPatchFilePath).length();
                                    kotlin.jvm.internal.o.g(msg10, "msg");
                                    t95.d.f416589a.i(str4, msg10);
                                    return i27;
                                } finally {
                                }
                            } finally {
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(zipOutputStream, th6);
                                throw th7;
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                    vz5.b.a(fileOutputStream, th);
                }
            }
        } catch (java.lang.Throwable th8) {
            try {
                throw th8;
            } catch (java.lang.Throwable th9) {
                vz5.b.a(zipFile, th8);
                throw th9;
            }
        }
    }
}
