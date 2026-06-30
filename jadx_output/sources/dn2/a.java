package dn2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.b f241879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f241881f;

    public a(dn2.b bVar, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f241879d = bVar;
        this.f241880e = str;
        this.f241881f = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.nm nmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/CommentTopAreaBulletItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f241879d.getClass();
        com.tencent.mars.xlog.Log.i("CommentTopAreaBulletItem", "click FinderLiveEnterRoomBulletAppMsg, tips:" + this.f241880e + '}');
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (nmVar = (df2.nm) liveRoomControllerStore.controller(df2.nm.class)) != null) {
            nmVar.Z6(this.f241881f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/CommentTopAreaBulletItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
