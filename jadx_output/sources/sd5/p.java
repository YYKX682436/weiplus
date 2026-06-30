package sd5;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f406725a = new java.util.LinkedHashMap();

    public static final java.lang.Object a(java.lang.String message, yz5.a block) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(block, "block");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", message + " start:[" + currentTimeMillis + ']');
        java.lang.Object invoke = block.invoke();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        f406725a.put(message, java.lang.Long.valueOf(currentTimeMillis2));
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", message + " cost:[" + currentTimeMillis2 + ']');
        return invoke;
    }
}
