package em1;

/* loaded from: classes7.dex */
public class e extends android.util.SparseArray {
    public e(em1.d dVar, int i17) {
        super(i17);
    }

    @Override // android.util.SparseArray
    public synchronized void clear() {
        super.clear();
    }

    @Override // android.util.SparseArray
    public java.lang.Object get(int i17, java.lang.Object obj) {
        com.tencent.luggage.sdk.jsapi.component.service.e eVar;
        com.tencent.luggage.sdk.jsapi.component.service.e eVar2 = (com.tencent.luggage.sdk.jsapi.component.service.e) obj;
        synchronized (this) {
            eVar = (com.tencent.luggage.sdk.jsapi.component.service.e) super.get(i17, eVar2);
        }
        return eVar;
    }

    @Override // android.util.SparseArray
    public void put(int i17, java.lang.Object obj) {
        com.tencent.luggage.sdk.jsapi.component.service.e eVar = (com.tencent.luggage.sdk.jsapi.component.service.e) obj;
        synchronized (this) {
            super.put(i17, eVar);
        }
    }

    @Override // android.util.SparseArray
    public synchronized void remove(int i17) {
        super.remove(i17);
    }
}
