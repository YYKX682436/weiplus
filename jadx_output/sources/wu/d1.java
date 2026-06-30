package wu;

/* loaded from: classes9.dex */
public final class d1 extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f449557h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        com.tencent.mm.mvvm.MvvmView ecsShopWindowViewNew;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        s15.k z17 = item.f284997e.z();
        if (z17 == null) {
            com.tencent.mars.xlog.Log.i("RecordDetailShopCardItemConvert", "record item shop window share item == null");
            return;
        }
        if (this.f449557h == null) {
            z17.S();
            if (com.tencent.mm.sdk.platformtools.b8.a(z17.S()) > 0) {
                c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
                android.content.Context context = containerView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                b00.r rVar = (b00.r) z2Var;
                rVar.getClass();
                rVar.f16757d.getClass();
                ecsShopWindowViewNew = new com.tencent.mm.feature.ecs.card.view.EcsShopCardView(context, null, 0);
            } else {
                c00.z2 z2Var2 = (c00.z2) i95.n0.c(c00.z2.class);
                android.content.Context context2 = containerView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                b00.r rVar2 = (b00.r) z2Var2;
                rVar2.getClass();
                rVar2.f16757d.getClass();
                ecsShopWindowViewNew = new com.tencent.mm.feature.ecs.card.view.EcsShopWindowViewNew(context2, null, 0);
            }
            this.f449557h = ecsShopWindowViewNew;
            containerView.addView(ecsShopWindowViewNew, -2, -2);
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String avatarUsername = item.f284998f;
        kotlin.jvm.internal.o.g(avatarUsername, "avatarUsername");
        ((b00.r) ((c00.z2) c17)).f16757d.getClass();
        g00.f fVar = new g00.f(e00.l.e(z17), bw5.x8.ECS_REQ_SCENE_RECORD);
        fVar.f267400f = avatarUsername;
        fVar.f267404m = com.tencent.mm.R.drawable.d87;
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f449557h;
        if (mvvmView != null) {
            mvvmView.setViewModel(fVar);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f449557h;
        if (mvvmView2 != null) {
            mvvmView2.setBackgroundResource(com.tencent.mm.R.drawable.d87);
        }
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        kotlinx.coroutines.l.d(v65.m.a(view), null, null, new wu.c1(view, item, null), 3, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
    }
}
