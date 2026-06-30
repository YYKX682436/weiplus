package ot5;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f348879a = com.tencent.mapsdk.internal.rv.f51270c;

    /* renamed from: b, reason: collision with root package name */
    public final com.qq.taf.RequestPacket f348880b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f348881c;

    public k(boolean z17) {
        com.qq.taf.RequestPacket requestPacket = new com.qq.taf.RequestPacket();
        this.f348880b = requestPacket;
        this.f348881c = new java.util.HashMap();
        new java.util.HashMap();
        requestPacket.iVersion = (short) 3;
    }

    public byte[] a() {
        com.qq.taf.RequestPacket requestPacket = this.f348880b;
        if (requestPacket.sServantName == null) {
            requestPacket.sServantName = "";
        }
        if (requestPacket.sFuncName == null) {
            requestPacket.sFuncName = "";
        }
        com.qq.taf.jce.JceOutputStream jceOutputStream = new com.qq.taf.jce.JceOutputStream(0);
        jceOutputStream.setServerEncoding(this.f348879a);
        jceOutputStream.write((java.util.Map) this.f348881c, 0);
        requestPacket.sBuffer = com.qq.taf.jce.JceUtil.getJceBufArray(jceOutputStream.getByteBuffer());
        com.qq.taf.jce.JceOutputStream jceOutputStream2 = new com.qq.taf.jce.JceOutputStream(0);
        jceOutputStream2.setServerEncoding(this.f348879a);
        requestPacket.writeTo(jceOutputStream2);
        byte[] jceBufArray = com.qq.taf.jce.JceUtil.getJceBufArray(jceOutputStream2.getByteBuffer());
        int length = jceBufArray.length + 4;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length).put(jceBufArray).flip();
        return allocate.array();
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        if (str == null || str.startsWith(".") || obj == null || (obj instanceof java.util.Set)) {
            throw new java.lang.IllegalArgumentException("wup put err");
        }
        com.qq.taf.jce.JceOutputStream jceOutputStream = new com.qq.taf.jce.JceOutputStream();
        jceOutputStream.setServerEncoding(this.f348879a);
        jceOutputStream.write(obj, 0);
        this.f348881c.put(str, com.qq.taf.jce.JceUtil.getJceBufArray(jceOutputStream.getByteBuffer()));
    }
}
