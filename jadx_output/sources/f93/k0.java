package f93;

/* loaded from: classes11.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260369d;

    public k0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260369d = contactEditLabel;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.h4 wi6 = b93.r.wi();
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260369d;
        java.util.ArrayList P1 = wi6.P1(contactEditLabel.f143196i);
        if (P1 == null) {
            com.tencent.mars.xlog.Log.w(contactEditLabel.f143191d, "result is null");
            return;
        }
        int size = P1.size();
        for (int i17 = 0; i17 < size; i17++) {
            kotlin.jvm.internal.o.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) P1.get(i17), true), "get(...)");
        }
        contactEditLabel.f143201q = P1;
        java.util.ArrayList arrayList = contactEditLabel.f143202r;
        if (arrayList == null) {
            contactEditLabel.f143202r = new java.util.ArrayList();
        } else {
            arrayList.clear();
        }
        contactEditLabel.f143202r.addAll(P1);
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactEditLabel.E;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(contactEditLabel.f143193f);
        }
    }
}
