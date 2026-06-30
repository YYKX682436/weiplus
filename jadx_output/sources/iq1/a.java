package iq1;

/* loaded from: classes13.dex */
public abstract class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public long f293667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f293668e;

    /* renamed from: f, reason: collision with root package name */
    public int f293669f;

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x003b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:71:0x003b */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static iq1.a b(byte[] r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq1.a.b(byte[]):iq1.a");
    }

    public abstract byte[] a();

    public byte[] c() {
        java.io.ObjectOutputStream objectOutputStream;
        java.io.IOException e17;
        byte[] bArr;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream2 = null;
        byte[] bArr2 = null;
        objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            } catch (java.io.IOException e18) {
                e17 = e18;
                bArr = null;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            objectOutputStream = objectOutputStream2;
        }
        try {
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            bArr2 = byteArrayOutputStream.toByteArray();
            if (bArr2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "object2bytes result is null");
            }
            try {
                objectOutputStream.close();
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e19, "", new java.lang.Object[0]);
            }
            try {
                byteArrayOutputStream.close();
                return bArr2;
            } catch (java.io.IOException e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e27, "", new java.lang.Object[0]);
                return bArr2;
            }
        } catch (java.io.IOException e28) {
            e17 = e28;
            bArr = bArr2;
            objectOutputStream2 = objectOutputStream;
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "object2bytes IOException:" + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e17, "", new java.lang.Object[0]);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException e29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e29, "", new java.lang.Object[0]);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e37) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e37, "", new java.lang.Object[0]);
            }
            return bArr;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (java.io.IOException e38) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e38, "", new java.lang.Object[0]);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (java.io.IOException e39) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.Util", e39, "", new java.lang.Object[0]);
                throw th;
            }
        }
    }
}
