package vx2;

/* loaded from: classes2.dex */
public final class f implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vx2.k f441242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f441243b;

    public f(vx2.k kVar, int i17) {
        this.f441242a = kVar;
        this.f441243b = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        java.util.HashMap hashMap = new java.util.HashMap();
        vx2.k kVar = this.f441242a;
        android.content.Context context = kVar.f441249a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        hashMap.put("comment_scene", java.lang.String.valueOf(nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(5)) : null));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = kVar.f441254f;
        hashMap.put("feed_id", pm0.v.u((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject3.getId()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = kVar.f441254f;
        hashMap.put("session_buffer", java.lang.String.valueOf((baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.getSessionBuffer()));
        android.content.Context context2 = kVar.f441249a;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        hashMap.put("finder_tab_context_id", java.lang.String.valueOf(nyVar2 != null ? nyVar2.V6().getString(2) : null));
        hashMap.put("expose_playpercent", java.lang.String.valueOf(vx2.k.c(kVar)));
        hashMap.put("feed_play_back_interval", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        hashMap.put("screen_type", java.lang.String.valueOf(this.f441243b));
        hashMap.put("feed_play_forward_back_button_show_position", "2");
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            hashMap.put("before_click_playpercent", java.lang.String.valueOf(vx2.k.c(kVar)));
            hashMap.put("after_click_playpercent", java.lang.String.valueOf(vx2.k.a(kVar, false)));
        }
        return kz5.c1.s(hashMap);
    }
}
