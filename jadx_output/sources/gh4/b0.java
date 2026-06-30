package gh4;

/* loaded from: classes.dex */
public final class b0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public static final gh4.b0 f271914d = new gh4.b0();

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
    }
}
