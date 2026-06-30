package x32;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f451605a = new java.util.HashMap();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, x32.f fVar) {
        fp.d0.s(str3);
        ((java.util.HashMap) f451605a).put(str + "#" + str2, java.lang.Boolean.TRUE);
        k32.a aVar = (k32.a) fVar;
        aVar.getClass();
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onCreate();
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.initBluetoothAccessoryLib();
        aVar.f303854a.countDown();
    }
}
