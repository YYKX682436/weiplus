package vn2;

/* loaded from: classes2.dex */
public final class w0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f438408d;

    public w0(android.view.View view, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, float f17) {
        this.f438405a = view;
        this.f438406b = context;
        this.f438407c = baseFinderFeed;
        this.f438408d = f17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        android.widget.TextView textView = (android.widget.TextView) this.f438405a.findViewById(com.tencent.mm.R.id.qgl);
        boolean b17 = kotlin.jvm.internal.o.b(textView != null ? textView.getText() : null, this.f438406b.getResources().getString(com.tencent.mm.R.string.lqi));
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438407c;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject3.getId()));
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str2 = feedObject2.getSessionBuffer()) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        lVarArr[2] = new jz5.l("click_playpercent", java.lang.Float.valueOf(this.f438408d));
        lVarArr[3] = new jz5.l("watch_later_status", java.lang.Integer.valueOf(b17 ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
