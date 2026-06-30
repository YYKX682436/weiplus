package sb2;

/* loaded from: classes2.dex */
public final class b extends tc2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        in5.s0 s0Var = this.f417141d.f417149i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        if (s0Var != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = s0Var.hashCode();
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            long j17 = 0;
            long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (liveInfo = feedObject.getLiveInfo()) != null) {
                j17 = liveInfo.getLong(0);
            }
            ((b92.d2) d8Var).wi(hashCode, "FinderFeedFullLive", str2, context, window, itemId, j17);
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = s0Var.hashCode();
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                str = "";
            }
            ((b92.d2) d8Var).Ai(hashCode, "FinderFeedFullLive", str);
        }
    }
}
