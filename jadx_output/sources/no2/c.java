package no2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f338741a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.a1 f338742b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f338743c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f338744d;

    public c(int i17, ir2.a1 a1Var, com.tencent.mm.ui.MMActivity activity, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f338741a = i17;
        this.f338742b = a1Var;
        this.f338743c = activity;
        this.f338744d = refreshLoadMoreLayout;
    }

    public final void a(java.util.List data, java.util.List local, int i17, int i18) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(local, "local");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            linkedList.add(java.lang.Long.valueOf(((so2.i) it.next()).f410411d.field_svrMentionId));
        }
        com.tencent.mm.ui.MMActivity context = this.f338743c;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        pq5.g l17 = new db2.t(linkedList, i18, nyVar != null ? nyVar.V6() : null).l();
        l17.f(context);
        l17.K(new no2.b(this, i17, local));
    }
}
