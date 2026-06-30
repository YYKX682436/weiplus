package uf5;

/* loaded from: classes10.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.FinderBlockListUI f427207d;

    public c1(com.tencent.mm.ui.contact.privacy.FinderBlockListUI finderBlockListUI) {
        this.f427207d = finderBlockListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.tencent.mm.modelbase.m1 m1Var : this.f427207d.f207120J) {
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var);
        }
    }
}
