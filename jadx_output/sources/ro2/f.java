package ro2;

/* loaded from: classes2.dex */
public final class f implements com.tencent.mm.ui.ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f398041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398044e;

    public f(android.content.Context context, com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f398040a = context;
        this.f398041b = finderMileStoneView;
        this.f398042c = qeVar;
        this.f398043d = s0Var;
        this.f398044e = baseFinderFeed;
    }

    @Override // com.tencent.mm.ui.ea
    public final boolean onBackPressed() {
        android.content.Context context = this.f398040a;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        boolean z17 = mMFinderUI != null ? mMFinderUI.f128814p : false;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398044e;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398042c;
        if (z17) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            lb2.j jVar = (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Z5).getValue();
            jVar.l();
            if (((java.lang.Boolean) jVar.r()).booleanValue() && this.f398041b.getVisibility() == 0) {
                ro2.r.c(qeVar, this.f398043d);
                ro2.t tVar = ro2.t.f398097h;
                kotlin.jvm.internal.o.f(context, "$context");
                kotlin.jvm.internal.o.f(item, "$item");
                ro2.r.h(qeVar, tVar, context, item);
                return true;
            }
        }
        ro2.t tVar2 = ro2.t.f398099m;
        kotlin.jvm.internal.o.f(context, "$context");
        kotlin.jvm.internal.o.f(item, "$item");
        ro2.r.h(qeVar, tVar2, context, item);
        return false;
    }
}
