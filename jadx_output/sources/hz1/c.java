package hz1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f286306a = new java.util.ArrayList();

    public java.util.List a(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            synchronized (this.f286306a) {
                for (int size = ((java.util.ArrayList) this.f286306a).size() - 1; size >= 0; size--) {
                    hz1.a aVar = (hz1.a) ((java.util.ArrayList) this.f286306a).get(size);
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
            }
        } else {
            synchronized (this.f286306a) {
                for (int i17 = 0; i17 <= ((java.util.ArrayList) this.f286306a).size() - 1; i17++) {
                    hz1.a aVar2 = (hz1.a) ((java.util.ArrayList) this.f286306a).get(i17);
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean b(hz1.a aVar) {
        boolean remove;
        synchronized (this.f286306a) {
            remove = ((java.util.ArrayList) this.f286306a).remove(aVar);
        }
        return remove;
    }

    public int c() {
        int size;
        synchronized (this.f286306a) {
            size = ((java.util.ArrayList) this.f286306a).size();
        }
        return size;
    }
}
