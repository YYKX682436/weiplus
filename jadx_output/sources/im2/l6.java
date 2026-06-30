package im2;

/* loaded from: classes2.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.o6 f292433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSquareRefreshedEvent f292434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(im2.o6 o6Var, com.tencent.mm.autogen.events.FinderLiveSquareRefreshedEvent finderLiveSquareRefreshedEvent) {
        super(0);
        this.f292433d = o6Var;
        this.f292434e = finderLiveSquareRefreshedEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        im2.o6 o6Var = this.f292433d;
        java.util.List list = o6Var.f292473i;
        java.lang.Object obj = null;
        if (list == null) {
            kotlin.jvm.internal.o.o("pageList");
            throw null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.tencent.mm.plugin.finder.live.viewmodel.c4) next).f116969a == 1) {
                obj = next;
                break;
            }
        }
        com.tencent.mm.plugin.finder.live.viewmodel.c4 c4Var = (com.tencent.mm.plugin.finder.live.viewmodel.c4) obj;
        if (c4Var != null) {
            c4Var.f116971c = this.f292434e.f54293g.f8371a;
        }
        o6Var.f292470f.notifyItemChanged(1);
        return jz5.f0.f302826a;
    }
}
