package sc2;

/* loaded from: classes2.dex */
public final class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f406241g;

    public s5(xc2.p0 p0Var, sc2.d6 d6Var, android.view.View view, yz5.a aVar) {
        this.f406238d = p0Var;
        this.f406239e = d6Var;
        this.f406240f = view;
        this.f406241g = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (menuItem.getItemId() == 4) {
            xc2.p0 p0Var = this.f406238d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
            java.lang.String str = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.field_username;
            java.lang.String str2 = str == null ? "" : str;
            r45.h32 O = this.f406239e.O(str2, p0Var);
            i95.m c17 = i95.n0.c(c50.c1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327572g;
            android.view.View view = this.f406240f;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
            java.lang.String string = O.getString(3);
            java.lang.String str3 = string != null ? string : "";
            java.lang.String string2 = O.getString(4);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = p0Var.f453244f;
            long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0L;
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, str3, null, string2, null, itemId, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5), null, 38368, null);
            this.f406241g.invoke();
        }
    }
}
