package ik1;

/* loaded from: classes7.dex */
public abstract class g {
    public static final long a(java.lang.String str) {
        long j17;
        com.tencent.mm.vfs.x1 m17;
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        long j18 = 0;
        if (str != null) {
            if (!(str.length() == 0)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String fileCrc32 = new com.tencent.mm.weapp_core.FileDigestUtil().getFileCrc32(str);
                try {
                    j17 = java.lang.Long.parseLong(fileCrc32, 16);
                } catch (java.lang.NumberFormatException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChecksumUtil", "crc32 parseLong failed, hexString(%s), e(%s)", fileCrc32, e17.getMessage());
                    j17 = 0;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.lang.String str3 = a17.f213279f;
                int lastIndexOf = str3.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str3 = str3.substring(lastIndexOf + 1);
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                    j18 = m17.f213233c;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChecksumUtil", "crc32: file(%s), checksum(%d), size(%.2f)KB, cost(%d)ms", str3, valueOf, java.lang.Double.valueOf(j18 / 1024.0d), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                return j17;
            }
        }
        return 0L;
    }
}
