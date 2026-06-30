package nv;

/* loaded from: classes12.dex */
public class y1 extends com.tencent.mm.sdk.event.n {
    public y1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17 = kn1.f.f309601g;
        synchronized (kn1.a.class) {
            java.util.Iterator it = kn1.a.f309600a.iterator();
            while (it.hasNext()) {
                ((kn1.a) it.next()).b();
            }
            kn1.a.f309600a.clear();
        }
        kn1.f.f309602h = "key".getBytes();
        kn1.f.f309601g = 0;
        kn1.f.f309603i = null;
        return false;
    }
}
