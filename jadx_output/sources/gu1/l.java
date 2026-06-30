package gu1;

/* loaded from: classes15.dex */
public class l implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public gu1.k f275897a;

    public l(gu1.k kVar) {
        this.f275897a = kVar;
    }

    @Override // tt1.i
    public tt1.j getItem(int i17) {
        gu1.k kVar = this.f275897a;
        if (kVar != null) {
            return (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) kVar.getItem(i17);
        }
        return null;
    }

    @Override // tt1.i
    public void onCreate() {
        if (this.f275897a != null) {
            xt1.t0.cj().add(this.f275897a);
        }
    }

    @Override // tt1.i
    public void onDestroy() {
        if (this.f275897a != null) {
            xt1.t0.cj().remove(this.f275897a);
            gu1.k kVar = this.f275897a;
            ((gu1.u) kVar.f275893p).release();
            kVar.f275893p = null;
            kVar.c();
            int i17 = (int) (kVar.f275896s - kVar.f275895r);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(24);
            iDKey.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(25);
            iDKey2.SetValue(i17);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            this.f275897a = null;
        }
    }

    @Override // tt1.i
    public void onNotify() {
        gu1.k kVar = this.f275897a;
        if (kVar != null) {
            kVar.f();
        }
    }
}
