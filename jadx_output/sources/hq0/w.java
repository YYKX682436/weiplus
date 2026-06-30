package hq0;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq0.e f283067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hq0.b0 b0Var, iq0.e eVar, java.lang.String str) {
        super(0);
        this.f283066d = b0Var;
        this.f283067e = eVar;
        this.f283068f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.b0 b0Var = this.f283066d;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) b0Var.D.get(this.f283067e.a());
        if (copyOnWriteArrayList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.util.HashMap hashMap = (java.util.HashMap) it.next();
                java.lang.String str = this.f283068f;
                com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = (com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) hashMap.get(str);
                if (magicSclViewContainer != null) {
                    d75.b.g(new hq0.y(magicSclViewContainer, b0Var));
                    magicSclViewContainer.f();
                    com.tencent.mars.xlog.Log.i(b0Var.f282971y, "innerRemoveViewInViewCacheByFrameSetId with frameSetId = " + str);
                    arrayList.add(hashMap);
                }
            }
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList));
        }
        return jz5.f0.f302826a;
    }
}
