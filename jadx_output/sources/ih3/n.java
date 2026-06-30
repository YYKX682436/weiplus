package ih3;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f291595d;

    public n(ih3.m mVar) {
        this.f291595d = null;
        iz5.a.d(null, mVar);
        this.f291595d = new java.lang.ref.WeakReference(mVar);
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        java.lang.String a17 = a();
        ih3.k kVar = new ih3.k(this);
        java.util.HashMap hashMap = (java.util.HashMap) ((ih3.e) k1Var).f291566d;
        if (!hashMap.containsKey(a17)) {
            hashMap.put(a17, new java.util.LinkedList());
        }
        java.util.List list = (java.util.List) hashMap.get(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateImp", "hy: adding template listener: %s list=%s", a17, list);
        if (list == null || list.contains(kVar)) {
            return;
        }
        ((java.util.LinkedList) hashMap.get(a17)).add(kVar);
    }

    public abstract java.lang.String a();

    public abstract java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2);

    public void c() {
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        java.lang.String a17 = a();
        ih3.e eVar = (ih3.e) k1Var;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateImp", "hy: removing template listener: %s", a17);
        java.util.HashMap hashMap = (java.util.HashMap) eVar.f291566d;
        if (!hashMap.containsKey(a17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] mHandleListener is not contains this linkName:%s", a17);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(a17);
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemplateImp", "list is null!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] linkName(%s) list size:%s", a17, java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.size() > 0) {
            linkedList.removeLast();
        }
    }

    public void d(long j17, java.util.LinkedList linkedList, int i17) {
        java.lang.ref.WeakReference weakReference = this.f291595d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.yh yhVar = (com.tencent.mm.ui.chatting.component.yh) ((ih3.m) weakReference.get());
        yhVar.getClass();
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        yhVar.o0(j17, linkedList, i17);
    }
}
