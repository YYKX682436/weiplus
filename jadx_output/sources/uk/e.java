package uk;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Properties f428492a = new java.util.Properties();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f428493b;

    public e(uk.d dVar) {
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        uk.o oVar = uk.f.f428494a;
        oVar.a();
        byte[] bArr2 = new byte[4];
        wrap.get(bArr2);
        java.lang.System.out.println("securityPart: " + new uk.o(bArr2).f428509d);
        boolean equals = oVar.equals(new uk.o(bArr2));
        uk.o oVar2 = uk.f.f428495b;
        if (!equals) {
            if (!oVar2.equals(new uk.o(bArr2))) {
                throw new java.net.ProtocolException("unknow protocl [" + java.util.Arrays.toString(bArr) + "]");
            }
            oVar2.a();
            if (bArr.length - 4 <= 2) {
                java.lang.System.err.println("data.length - oriMarkLength <= 2");
                return;
            }
            byte[] bArr3 = new byte[2];
            wrap.get(bArr3);
            int i17 = ((bArr3[1] << 8) & 65280) + (bArr3[0] & 255);
            if ((bArr.length - 4) - 2 < i17) {
                java.lang.System.err.println("data.length - oriMarkLength - 2 < len");
                java.lang.System.err.println("exit");
                return;
            } else {
                byte[] bArr4 = new byte[i17];
                this.f428493b = bArr4;
                wrap.get(bArr4);
                return;
            }
        }
        if (bArr.length - 4 <= 2) {
            java.lang.System.err.println("data.length - securityMarkLength <= 2");
            return;
        }
        byte[] bArr5 = new byte[2];
        wrap.get(bArr5);
        int i18 = ((bArr5[1] << 8) & 65280) + (bArr5[0] & 255);
        if ((bArr.length - 4) - 2 < i18) {
            java.lang.System.err.println("data.length - securityMarkLength - 2 < len");
            java.lang.System.err.println("exit");
            return;
        }
        byte[] bArr6 = new byte[i18];
        wrap.get(bArr6);
        this.f428492a.load(new java.io.ByteArrayInputStream(bArr6));
        int length = ((bArr.length - 4) - i18) - 2;
        if (length > 0) {
            oVar2.a();
            byte[] bArr7 = new byte[4];
            wrap.get(bArr7);
            if (oVar2.equals(new uk.o(bArr7))) {
                int i19 = length - 4;
                if (i19 <= 2) {
                    java.lang.System.err.println("data.length - oriMarkLength <= 2");
                    return;
                }
                byte[] bArr8 = new byte[2];
                wrap.get(bArr8);
                int i27 = ((bArr8[1] << 8) & 65280) + (bArr8[0] & 255);
                if (i19 - 2 < i27) {
                    java.lang.System.err.println("data.length - oriMarkLength - 2 < len");
                    java.lang.System.err.println("exit");
                } else {
                    byte[] bArr9 = new byte[i27];
                    this.f428493b = bArr9;
                    wrap.get(bArr9);
                }
            }
        }
    }

    public byte[] b() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.Properties properties = this.f428492a;
        if (properties.size() > 0) {
            byteArrayOutputStream.write(new byte[]{(byte) (84298576 & 255), (byte) ((84298576 & 65280) >> 8), (byte) ((84298576 & 16711680) >> 16), (byte) ((84298576 & 4278190080L) >> 24)});
            java.lang.String str = "";
            for (java.lang.Object obj : properties.keySet()) {
                str = str + obj + "=" + properties.getProperty((java.lang.String) obj) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
            }
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
            byteArrayOutputStream.write(bytes);
        }
        byte[] bArr = this.f428493b;
        if (bArr != null && bArr.length > 0) {
            byteArrayOutputStream.write(new byte[]{(byte) (50613072 & 255), (byte) ((50613072 & 65280) >> 8), (byte) ((50613072 & 16711680) >> 16), (byte) ((50613072 & 4278190080L) >> 24)});
            int length2 = this.f428493b.length;
            byteArrayOutputStream.write(new byte[]{(byte) (length2 & 255), (byte) ((length2 & 65280) >> 8)});
            byteArrayOutputStream.write(this.f428493b);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
