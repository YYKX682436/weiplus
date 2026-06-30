package gc1;

/* loaded from: classes7.dex */
public final class g {
    public java.lang.Object a(android.os.Parcel parcel) {
        byte[] bArr;
        java.lang.String readString = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString)) {
            return null;
        }
        java.lang.String readString2 = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString2)) {
            bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
        } else {
            com.tencent.mm.sdk.platformtools.o4 o4Var = gc1.f.f270400a;
            try {
                bArr = o4Var.j(readString2);
                if (bArr == null) {
                    try {
                        com.tencent.mars.xlog.Log.e("MicroMsg.XIPC.MMProtoBufTransfer", "readFromParcel, NULL bytes, gProtoBufXProcessStore[%s]", o4Var);
                        try {
                            o4Var.W(readString2);
                            if (bArr != null && bArr.length >= 1048576) {
                                o4Var.a0();
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                        return null;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        try {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XIPC.MMProtoBufTransfer", th, "readFromParcel", new java.lang.Object[0]);
                            try {
                                o4Var.W(readString2);
                                if (bArr != null && bArr.length >= 1048576) {
                                    o4Var.a0();
                                }
                            } catch (java.lang.Throwable unused2) {
                            }
                            return null;
                        } finally {
                            try {
                                o4Var.W(readString2);
                                if (bArr != null && bArr.length >= 1048576) {
                                    o4Var.a0();
                                }
                            } catch (java.lang.Throwable unused3) {
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                bArr = null;
            }
        }
        try {
            com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) d56.b.i(readString).c().f226632b;
            fVar.parseFrom(bArr);
            return fVar;
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XIPC.MMProtoBufTransfer", "readFromParcel, e = %s", th8);
            return null;
        }
    }

    public void b(java.lang.Object obj, android.os.Parcel parcel) {
        byte[] bArr;
        if (obj == null) {
            parcel.writeString(null);
            return;
        }
        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) obj;
        parcel.writeString(fVar.getClass().getName());
        int i17 = 0;
        try {
            bArr = fVar.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XIPC.MMProtoBufTransfer", "writeToParcel, e = %s", e17);
            bArr = new byte[0];
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = gc1.f.f270400a;
        if (bArr.length > 102400 && o4Var != null) {
            try {
                long Y = o4Var.Y();
                if (Y >= 20971520) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.XIPC.MMProtoBufTransfer", "mmkv totalSize[%d] too large, skip use mmkv", java.lang.Long.valueOf(Y));
                } else {
                    java.lang.String k17 = u46.l.k(new java.lang.String[]{bm5.f1.a(), obj.getClass().getName(), obj.hashCode() + "", android.os.SystemClock.elapsedRealtimeNanos() + ""}, "$");
                    o4Var.H(k17, bArr);
                    if (o4Var.f(k17)) {
                        parcel.writeString(k17);
                        i17 = 1;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XIPC.MMProtoBufTransfer", th6, "encode bytes to mmkv", new java.lang.Object[i17]);
            }
        }
        if (i17 == 0) {
            parcel.writeString(null);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }
}
