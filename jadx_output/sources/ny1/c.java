package ny1;

/* loaded from: classes13.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (ny1.b.f341399b == null) {
            ny1.b.f341399b = new ny1.b();
        }
        ny1.b.f341399b.b();
        return false;
    }
}
