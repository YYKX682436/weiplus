package pm;

/* loaded from: classes9.dex */
public abstract class h {
    public static java.io.Serializable a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c).getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
        java.io.Serializable serializable = (java.io.Serializable) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        java.lang.System.currentTimeMillis();
        return serializable;
    }

    public static java.lang.String b(java.io.Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        java.lang.System.currentTimeMillis();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        java.lang.String encode = java.net.URLEncoder.encode(byteArrayOutputStream.toString(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET), com.tencent.mapsdk.internal.rv.f51270c);
        objectOutputStream.close();
        byteArrayOutputStream.close();
        java.lang.System.currentTimeMillis();
        return encode;
    }
}
