package kj;

/* loaded from: classes12.dex */
public class o extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f308258d = new java.util.HashMap();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        if (!(obj instanceof android.os.MessageQueue.IdleHandler)) {
            return super.add(obj);
        }
        android.os.MessageQueue.IdleHandler idleHandler = (android.os.MessageQueue.IdleHandler) obj;
        kj.p pVar = new kj.p(idleHandler);
        ((java.util.HashMap) this.f308258d).put(idleHandler, pVar);
        return super.add(pVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        boolean z17 = obj instanceof kj.p;
        java.util.Map map = this.f308258d;
        if (z17) {
            ((java.util.HashMap) map).remove(((kj.p) obj).f308259d);
            return super.remove(obj);
        }
        kj.p pVar = (kj.p) ((java.util.HashMap) map).remove(obj);
        return pVar != null ? super.remove(pVar) : super.remove(obj);
    }
}
