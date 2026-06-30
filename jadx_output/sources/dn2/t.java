package dn2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uj1 f241979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.v f241980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ji1 f241981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241982g;

    public t(r45.uj1 uj1Var, dn2.v vVar, r45.ji1 ji1Var, android.view.View view) {
        this.f241979d = uj1Var;
        this.f241980e = vVar;
        this.f241981f = ji1Var;
        this.f241982g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f241979d.getCustom(4);
        if (finderJumpInfo != null) {
            r45.ji1 ji1Var = this.f241981f;
            java.lang.String string = ji1Var.getString(4);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.protobuf.g byteString = ji1Var.getByteString(5);
            dn2.v vVar = this.f241980e;
            vVar.g(2, 3, string, byteString);
            android.content.Context context = this.f241982g.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string2 = ji1Var.getString(6);
            dn2.v.e(vVar, context, finderJumpInfo, string2 != null ? string2 : "", "FinderLiveAppMsgGameGuessLikeInfo");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
