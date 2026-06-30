package ko2;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko2.f f309927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ik4 f309928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f309929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ko2.f fVar, r45.ik4 ik4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f309927d = fVar;
        this.f309928e = ik4Var;
        this.f309929f = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.ui.MMActivity f122643d;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        mo2.q qVar = (mo2.q) this.f309927d;
        qVar.getClass();
        r45.ik4 user = this.f309928e;
        kotlin.jvm.internal.o.g(user, "user");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f309929f;
        kotlin.jvm.internal.o.g(item, "item");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            java.lang.String string = user.getString(3);
            if (string == null || string.length() == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Nickname", user.getString(0));
                intent.putExtra("FeedId", item.getFeedObject().getId());
                intent.putExtra("DupFlag", item.w());
                intent.putExtra("memberProviderUsername", qVar.f330390g);
                intent.putExtra("showInteraction", true);
                intent.putExtra("Username", user.getString(1));
                if (user.getInteger(2) == 2) {
                    intent.putExtra("V5UserName", user.getString(1));
                }
                com.tencent.mm.plugin.finder.member.question.c cVar = qVar.f330388e;
                if (cVar != null && (f122643d = cVar.getF122643d()) != null) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c17, f122643d, null, intent, 9, null, 16, null);
                }
            } else {
                androidx.appcompat.app.AppCompatActivity appCompatActivity = qVar.f330389f;
                if (appCompatActivity != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("finder_username", user.getString(3));
                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, appCompatActivity, intent2, item.getFeedObject().getId(), null, 0, 5, false, 0, item.w(), 192, null);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(appCompatActivity, intent2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
