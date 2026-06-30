package yo3;

/* loaded from: classes9.dex */
public class i implements c01.qa {
    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null || sVar.G() == null) {
            return;
        }
        if (yo3.m.f464154a != null) {
            sVar.G().l1("offline_token", yo3.m.f464154a.getBytes());
        }
        if (yo3.m.f464155b != null) {
            sVar.G().l1("offline_token_V2", yo3.m.f464155b.getBytes());
        }
        if (yo3.m.f464157d != null) {
            sVar.G().l1("offline_key_list", yo3.m.f464157d.getBytes());
        }
    }
}
