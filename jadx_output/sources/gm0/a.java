package gm0;

/* loaded from: classes10.dex */
public final class a extends jm0.s {
    public a(gm0.b bVar) {
        super(bVar);
    }

    @Override // jm0.s, androidx.lifecycle.o
    public void a(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.a(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", sb6.toString());
    }

    @Override // jm0.s, androidx.lifecycle.o
    public void c(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.c(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f300288d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", sb6.toString());
    }
}
