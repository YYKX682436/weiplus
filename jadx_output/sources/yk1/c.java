package yk1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.CodingErrorAction f462779a = java.nio.charset.CodingErrorAction.REPORT;

    public static java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        java.nio.charset.CharsetDecoder newDecoder = java.nio.charset.Charset.forName("UTF8").newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction = f462779a;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        try {
            byteBuffer.mark();
            java.lang.String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (java.nio.charset.CharacterCodingException e17) {
            throw new vk1.b(1007, e17);
        }
    }

    public static byte[] b(java.lang.String str) {
        try {
            return str.getBytes("UTF8");
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetWork.Charsetfunctions", e17.toString());
            return new byte[0];
        }
    }
}
