package ln1;

/* loaded from: classes12.dex */
public class g implements sn1.e {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f319755i = "GSMW".getBytes();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f319757b;

    /* renamed from: c, reason: collision with root package name */
    public int f319758c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f319759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f319760e;

    /* renamed from: f, reason: collision with root package name */
    public int f319761f;

    /* renamed from: h, reason: collision with root package name */
    public ln1.e f319763h;

    /* renamed from: a, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicInteger f319756a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f319762g = null;

    public static void a(ln1.g gVar, byte[] bArr) {
        int i17;
        char c17;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        gVar.getClass();
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[4];
        dataInputStream.read(bArr2);
        byte[] bArr3 = f319755i;
        if (!java.util.Arrays.equals(bArr3, bArr2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCEngine", "read error: magicBuf");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(21019, -1, 0, -1, "read_error_magic");
            g0Var.d(17868, -1);
            return;
        }
        int readInt = dataInputStream.readInt();
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        int readInt2 = dataInputStream.readInt();
        if (readInt2 > 16777216) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupCEngine", java.lang.String.format("loopRead size too large, size:%d", java.lang.Integer.valueOf(readInt2)));
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(21019, -2, 0, -2, "read_error_size");
            g0Var2.d(17868, -2);
        }
        int readInt3 = dataInputStream.readInt();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCEngine", "read buf size[%d], seq[%d], version[%d], type[%d]", java.lang.Integer.valueOf(readInt2), java.lang.Integer.valueOf(readInt), java.lang.Short.valueOf(readShort), java.lang.Short.valueOf(readShort2));
        int i18 = readInt2 - 20;
        byte[] bArr4 = new byte[i18];
        if (dataInputStream.read(bArr4) != i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCEngine", "read error: len != buf.length");
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.d(21019, -3, 0, -3, "read_error_len");
            g0Var3.d(17868, -3);
            return;
        }
        if (readInt == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCEngine", "read error: seq == 0");
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.d(21019, -4, 0, -4, "read_error_seq");
            g0Var4.d(17868, -4);
            return;
        }
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sn1.i.H(i18);
        sn1.i.f410019p.f410087d += i18;
        int i19 = sn1.i.f410017n;
        if (readShort != 1) {
            java.lang.String format = java.lang.String.format("unpack failed, getVersion[%d]", java.lang.Short.valueOf(readShort));
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPacker", format);
            pByteArray.value = format.getBytes();
            c17 = 65535;
        } else {
            if (i19 == 1) {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byteArrayOutputStream.write(bArr3);
                    byteArrayOutputStream.write(kk.u.d(readInt));
                    byteArrayOutputStream.write(new byte[]{(byte) ((readShort >> 8) & 255), (byte) (readShort & 255)});
                    byteArrayOutputStream.write(new byte[]{(byte) ((readShort2 >> 8) & 255), (byte) (readShort2 & 255)});
                    byteArrayOutputStream.write(kk.u.d(readInt2));
                    byteArrayOutputStream.write(kk.u.d(0));
                    byteArrayOutputStream.write(bArr4);
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    crc32.update(byteArrayOutputStream.toByteArray());
                    i17 = (int) crc32.getValue();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPacker", e17, "BackupPacker getCheckSum error.", new java.lang.Object[0]);
                    i17 = 0;
                }
                if (readInt3 != i17) {
                    java.util.zip.CRC32 crc322 = new java.util.zip.CRC32();
                    crc322.update(bArr4);
                    java.lang.String str = "";
                    for (int i27 = i18 > 100 ? i18 - 100 : 0; i27 < i18; i27++) {
                        str = str + java.lang.Integer.toHexString(bArr4[i27] & 255) + " ";
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPacker", "dumpErr errBuf:%s", str);
                    java.lang.String format2 = java.lang.String.format("unpack failed, calcSum[%d], checkSum[%d], seq[%d], type[%d], size[%d], crc[%d], last 100 bytes:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(readInt3), java.lang.Integer.valueOf(readInt), java.lang.Short.valueOf(readShort2), java.lang.Integer.valueOf(readInt2), java.lang.Integer.valueOf((int) crc322.getValue()), str);
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPacker", format2);
                    pByteArray.value = format2.getBytes();
                    c17 = 65534;
                }
            }
            if (readShort2 != 1 && readShort2 != 2) {
                byte[] bArr5 = kn1.f.f309602h;
                bArr4 = bArr5 == null ? null : kk.p.a(bArr4, bArr5);
            }
            pByteArray.value = bArr4;
            c17 = 0;
        }
        if (c17 != 0) {
            byte[] bArr6 = pByteArray.value;
            gVar.b(true, readInt, 10007, (bArr6 != null ? new java.lang.String(bArr6) : "").getBytes());
            return;
        }
        ln1.e eVar = gVar.f319763h;
        if (eVar == null) {
            gVar.b(false, readInt, readShort2, pByteArray.value);
            return;
        }
        byte[] bArr7 = pByteArray.value;
        mn1.r rVar = (mn1.r) eVar;
        while (true) {
            mn1.e eVar2 = rVar.f329881b;
            boolean z18 = eVar2.f329848k;
            linkedBlockingQueue = rVar.f329880a;
            if (z18) {
                break;
            }
            try {
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse onBackupMoveRecoverDatapushCallback e:%s", e18.getMessage());
            }
            if (linkedBlockingQueue.offer(new mn1.u(eVar2, false, readInt, readShort2, bArr7), 500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse offer datapushQueue, datapushQueue size:%d", java.lang.Integer.valueOf(linkedBlockingQueue.size()));
    }

    public final void b(boolean z17, int i17, int i18, byte[] bArr) {
        com.tencent.mm.sdk.platformtools.u3.h(new ln1.d(this, z17, i17, i18, bArr));
    }

    public void c(int i17, byte[] bArr, int i18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f319762g;
        if (n3Var == null || n3Var.isQuit()) {
            this.f319762g = new com.tencent.mm.sdk.platformtools.n3("BackupCEngine_sendHandler");
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupCEngine", "BackupCEngine send seq:%d", java.lang.Integer.valueOf(i17));
        }
        this.f319762g.post(new ln1.c(this, i17, bArr, i18, currentTimeMillis));
    }

    public int d(int i17, byte[] bArr, int i18) {
        int i19;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f319756a.get() == 1) {
            i19 = com.tencent.mm.lan_cs.Server$Java2C.send(this.f319757b, this.f319758c, bArr);
        } else if (this.f319756a.get() == 2) {
            i19 = com.tencent.mm.lan_cs.Client$Java2C.send(this.f319757b, this.f319758c, bArr);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sn1.i.H(bArr == null ? -1 : bArr.length);
        } else {
            i19 = 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i19);
        objArr[1] = java.lang.Integer.valueOf(i17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
        objArr[3] = java.lang.Integer.valueOf(this.f319756a.get());
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], mode[%d], type[%d], time[%d]", objArr);
        return i19;
    }

    public void e() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCEngine", "BackupCEngine stop. %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f319762g;
        if (n3Var != null) {
            n3Var.removeCallbacks(null);
        }
        if (this.f319756a.get() == 1) {
            com.tencent.mm.lan_cs.Server$Java2C.stop();
            sn1.g gVar = sn1.i.f410023t;
            if (gVar != null) {
                gVar.a();
            }
            this.f319756a.set(0);
            return;
        }
        if (this.f319756a.get() == 2) {
            com.tencent.mm.lan_cs.Client$Java2C.disconnect();
            sn1.g gVar2 = sn1.i.f410023t;
            if (gVar2 != null) {
                gVar2.a();
            }
            this.f319756a.set(0);
        }
    }
}
