package y34;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.nio.ByteBuffer byteBuffer, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        if (j17 < 0 || j17 > 2147483647L) {
            java.lang.ArithmeticException arithmeticException = new java.lang.ArithmeticException("unsigned integer overflow");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
            throw arithmeticException;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Unsigned");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer.position((int) j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
    }

    public static short b(java.nio.ByteBuffer byteBuffer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        short s17 = (short) (byteBuffer.get() & 255);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readUByte", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return s17;
    }

    public static long c(java.nio.ByteBuffer byteBuffer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        long j17 = byteBuffer.getInt() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readUInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        return j17;
    }
}
