package fh1;

/* loaded from: classes7.dex */
public final class s0 {
    public s0(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator it = fh1.x0.N.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                java.util.Map.Entry entry = (java.util.Map.Entry) next;
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                if (fh1.x0.K.containsKey((java.lang.String) key) && fh1.x0.P != null) {
                    arrayList.add(entry.getValue());
                    it.remove();
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            try {
                ((java.lang.Runnable) it6.next()).run();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclMBFrameBiz", "Error executing runnable", e17);
            }
        }
    }
}
