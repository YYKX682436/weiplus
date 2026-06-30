package xn2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent f455516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f455517f;

    public j0(xn2.p0 p0Var, com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f455515d = p0Var;
        this.f455516e = finderLongVideoShowLastExitFeedHintEvent;
        this.f455517f = finderObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoPresenter$showLastExitFeedHintEventListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xn2.p0 p0Var = this.f455515d;
        java.lang.String str = p0Var.f455545c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click last exit feed, id:");
        com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent = this.f455516e;
        sb6.append(finderLongVideoShowLastExitFeedHintEvent.f54303g.f6936a);
        sb6.append(", feed:");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f455517f.getObjectDesc();
        sb6.append(objectDesc != null ? objectDesc.getDescription() : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        xn2.p0 p0Var2 = this.f455515d;
        android.app.Activity activity = p0Var2.f455543a;
        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderLongVideoShowLastExitFeedHintEvent.f54303g.f6937b;
        kotlin.jvm.internal.o.f(finderObject, "finderObject");
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 0);
        int i17 = qg3.g1.f362820d;
        p0Var2.n(4, activity, null, a17, 0, urgen.ur_54A4.UR_6075.UR_BC6E(), p0Var.h());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoPresenter$showLastExitFeedHintEventListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
