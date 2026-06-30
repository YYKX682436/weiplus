package yw3;

/* loaded from: classes4.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(1);
        this.f466910d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yw3.p pVar;
        o75.c event = (o75.c) obj;
        kotlin.jvm.internal.o.g(event, "event");
        o75.b bVar = o75.b.f343582c;
        o75.b bVar2 = event.f343587a;
        boolean b17 = kotlin.jvm.internal.o.b(bVar2, bVar);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f466910d;
        if (b17) {
            yw3.p pVar2 = (yw3.p) event.f343590d;
            if (pVar2 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.q((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) repairerMvvmDBDemoUI.f).getValue(), new yw3.j(pVar2), false, 2, null);
            }
        } else if (kotlin.jvm.internal.o.b(bVar2, o75.b.f343583d)) {
            yw3.p pVar3 = (yw3.p) event.f343590d;
            if (pVar3 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.A((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) repairerMvvmDBDemoUI.f).getValue(), new yw3.j(pVar3), false, 2, null);
            }
        } else if (kotlin.jvm.internal.o.b(bVar2, o75.b.f343584e) && (pVar = (yw3.p) event.f343590d) != null) {
            ((com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) repairerMvvmDBDemoUI.f).getValue()).u(new yw3.j(pVar));
        }
        return jz5.f0.f302826a;
    }
}
