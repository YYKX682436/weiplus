package hq0;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hq0.b0 b0Var, java.lang.String str) {
        super(0);
        this.f283062d = b0Var;
        this.f283063e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.b0 b0Var = this.f283062d;
        java.lang.String str = b0Var.f282971y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerRemoveAllView rootConfigId: ");
        java.lang.String str2 = this.f283063e;
        sb6.append(str2);
        sb6.append(" size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.D;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(str2);
        sb6.append(copyOnWriteArrayList != null ? java.lang.Integer.valueOf(copyOnWriteArrayList.size()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(str2);
        if (copyOnWriteArrayList2 != null) {
            java.util.Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                java.util.Collection<com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer> values = ((java.util.HashMap) it.next()).values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                for (com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer : values) {
                    kotlin.jvm.internal.o.d(magicSclViewContainer);
                    d75.b.g(new hq0.y(magicSclViewContainer, b0Var));
                    magicSclViewContainer.f();
                }
            }
        }
        concurrentHashMap.remove(str2);
        b0Var.U1(str2);
        b0Var.C.remove(str2);
        return jz5.f0.f302826a;
    }
}
