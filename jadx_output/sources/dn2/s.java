package dn2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uj1 f241975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.v f241976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hi1 f241977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241978g;

    public s(r45.uj1 uj1Var, dn2.v vVar, r45.hi1 hi1Var, android.view.View view) {
        this.f241975d = uj1Var;
        this.f241976e = vVar;
        this.f241977f = hi1Var;
        this.f241978g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f241975d.getCustom(4);
        if (finderJumpInfo != null) {
            r45.hi1 hi1Var = this.f241977f;
            java.lang.String string = hi1Var.getString(4);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.protobuf.g byteString = hi1Var.getByteString(5);
            dn2.v vVar = this.f241976e;
            vVar.g(2, 2, string, byteString);
            android.content.Context context = this.f241978g.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string2 = hi1Var.getString(6);
            dn2.v.e(vVar, context, finderJumpInfo, string2 != null ? string2 : "", "FinderLiveAppMsgGameAllPlayingInfo");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
