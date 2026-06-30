package cw1;

/* loaded from: classes12.dex */
public abstract class i {
    public static java.util.Map a(int[][] iArr, int i17, long j17, long j18, boolean z17, long[] jArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        android.database.Cursor cursor;
        java.lang.String str;
        android.database.Cursor cursor2;
        android.database.Cursor cursor3;
        java.lang.String str2;
        java.util.HashMap hashMap;
        java.lang.String str3 = "MicroMsg.ChattingListResult";
        long[] jArr2 = jArr == null ? new long[3] : jArr;
        int i18 = 0;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = aw1.v.d();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingListResult", "SizePerMsg phase: " + (currentTimeMillis2 - currentTimeMillis));
            int length = iArr.length;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            int i19 = length + 1;
            cursor2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().S1(j17, j18, aw1.v.f14696b, cancellationSignal);
            int i27 = 0;
            while (cursor2.moveToNext()) {
                try {
                    try {
                        try {
                            try {
                                java.lang.String string = cursor2.getString(i18);
                                cw1.a aVar = new cw1.a(string, length);
                                long[] jArr3 = aVar.f222711b;
                                long j19 = cursor2.getInt(1);
                                jArr3[i17] = j19 * d17;
                                int size = aw1.v.f14695a.size();
                                long j27 = d17;
                                int i28 = 0;
                                while (i28 < size) {
                                    str2 = str3;
                                    int i29 = size;
                                    try {
                                        jArr3[i17] = jArr3[i17] + (cursor2.getInt(i28 + 3) * ((java.lang.Long) ((jz5.l) aw1.v.f14695a.get(i28)).f302834e).longValue());
                                        i28++;
                                        size = i29;
                                        str3 = str2;
                                    } catch (java.lang.Exception e17) {
                                        e = e17;
                                        cursor3 = cursor2;
                                        str = str2;
                                        cursor2 = cursor3;
                                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "Cannot list detail", new java.lang.Object[0]);
                                        com.tencent.mm.vfs.e8.d(cursor2);
                                        return null;
                                    }
                                }
                                java.lang.String str4 = str3;
                                aVar.f222712c[i17] = cursor2.getLong(2);
                                hashMap2.put(string, aVar);
                                if (z17) {
                                    ot1.d.b(string);
                                }
                                jArr2[1] = jArr2[1] + jArr3[i17];
                                jArr2[2] = jArr2[2] + j19;
                                i27++;
                                d17 = j27;
                                str3 = str4;
                                i18 = 0;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                str2 = str3;
                                cursor3 = cursor2;
                                str = str2;
                                cursor2 = cursor3;
                                com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "Cannot list detail", new java.lang.Object[0]);
                                com.tencent.mm.vfs.e8.d(cursor2);
                                return null;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            cursor = cursor2;
                            com.tencent.mm.vfs.e8.d(cursor);
                            throw th;
                        }
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        str = str3;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    cursor3 = cursor2;
                }
            }
            str2 = str3;
            cursor2.close();
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            str = str2;
            try {
                com.tencent.mars.xlog.Log.i(str, "TextSize phase: " + (currentTimeMillis3 - currentTimeMillis2) + ", count: " + i27);
                cursor3 = cursor2;
            } catch (java.lang.Exception e27) {
                e = e27;
                cursor3 = cursor2;
                cursor2 = cursor3;
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "Cannot list detail", new java.lang.Object[0]);
                com.tencent.mm.vfs.e8.d(cursor2);
                return null;
            }
            try {
                cursor2 = mt1.b0.f331191a.n().u1(iArr, true, false, false, j17, j18, null, false, cancellationSignal);
                int i37 = 0;
                while (cursor2.moveToNext()) {
                    try {
                        java.lang.String string2 = cursor2.getString(0);
                        cw1.a aVar2 = (cw1.a) hashMap2.get(string2);
                        if (aVar2 == null) {
                            aVar2 = new cw1.a(string2, length);
                            hashMap2.put(string2, aVar2);
                            if (z17) {
                                ot1.d.b(string2);
                            }
                        }
                        int i38 = 0;
                        while (i38 < length) {
                            long[] jArr4 = aVar2.f222711b;
                            long[] jArr5 = aVar2.f222712c;
                            int i39 = i38 + 1;
                            jArr4[i38] = jArr4[i38] + cursor2.getLong(i39);
                            jArr5[i38] = java.lang.Math.max(cursor2.getLong(i19 + i38), jArr5[i38]);
                            i38 = i39;
                            length = length;
                            hashMap2 = hashMap2;
                        }
                        jArr2[0] = jArr2[0] + cursor2.getLong(1);
                        i37++;
                        length = length;
                        hashMap2 = hashMap2;
                    } catch (java.lang.Exception e28) {
                        e = e28;
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "Cannot list detail", new java.lang.Object[0]);
                        com.tencent.mm.vfs.e8.d(cursor2);
                        return null;
                    }
                }
                java.util.HashMap hashMap3 = hashMap2;
                cursor2.close();
                com.tencent.mars.xlog.Log.i(str, "Media phase: " + (java.lang.System.currentTimeMillis() - currentTimeMillis3) + ", count: " + i37);
                if (z17) {
                    java.util.Iterator it = ((pm5.l) ot1.d.a("c2c_origin_image", null, null, ot1.b.f348829d)).iterator();
                    while (true) {
                        pm5.m mVar = (pm5.m) it;
                        if (!mVar.hasNext()) {
                            break;
                        }
                        ot1.h hVar = (ot1.h) mVar.next();
                        java.util.HashMap hashMap4 = hashMap3;
                        cw1.a aVar3 = (cw1.a) hashMap4.get(hVar.field_username);
                        if (aVar3 != null) {
                            long[] jArr6 = aVar3.f222711b;
                            long j28 = jArr6[0];
                            long j29 = hVar.field_diskSpace;
                            jArr6[0] = j28 + j29;
                            jArr6[1] = jArr6[1] + j29;
                        }
                        hashMap3 = hashMap4;
                    }
                    hashMap = hashMap3;
                    java.util.Iterator it6 = ((pm5.l) ot1.d.a("c2c_origin_video", null, null, ot1.c.f348830d)).iterator();
                    while (true) {
                        pm5.m mVar2 = (pm5.m) it6;
                        if (!mVar2.hasNext()) {
                            break;
                        }
                        ot1.h hVar2 = (ot1.h) mVar2.next();
                        cw1.a aVar4 = (cw1.a) hashMap.get(hVar2.field_username);
                        if (aVar4 != null) {
                            long[] jArr7 = aVar4.f222711b;
                            long j37 = jArr7[0];
                            long j38 = hVar2.field_diskSpace;
                            jArr7[0] = j37 + j38;
                            jArr7[2] = jArr7[2] + j38;
                        }
                    }
                } else {
                    hashMap = hashMap3;
                }
                com.tencent.mm.vfs.e8.d(cursor2);
                return hashMap;
            } catch (java.lang.Exception e29) {
                e = e29;
                cursor2 = cursor3;
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "Cannot list detail", new java.lang.Object[0]);
                com.tencent.mm.vfs.e8.d(cursor2);
                return null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                cursor = cursor3;
                com.tencent.mm.vfs.e8.d(cursor);
                throw th;
            }
        } catch (java.lang.Exception e37) {
            e = e37;
            str = "MicroMsg.ChattingListResult";
            cursor2 = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            cursor = null;
        }
    }
}
