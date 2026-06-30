package pt2;

/* loaded from: classes2.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f358243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f358244b;

    public c(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f358243a = context;
        this.f358244b = baseFinderFeed;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[5];
        android.content.Context context = this.f358243a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        boolean z17 = false;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p));
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s);
        r45.nw1 liveInfo = this.f358244b.getFeedObject().getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
