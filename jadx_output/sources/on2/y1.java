package on2;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f347074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(on2.j1 j1Var, on2.a2 a2Var, android.content.Context context) {
        super(3);
        this.f347074d = a2Var;
        this.f347075e = context;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        rl5.r popupMenu;
        rl5.r popupMenu2;
        r45.dz1 item = (r45.dz1) obj;
        android.view.View itemView = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        on2.a2 a2Var = this.f347074d;
        int[] iArr = a2Var.f346839v;
        int i17 = iArr[0];
        int[] iArr2 = a2Var.f346839v;
        if (i17 == 0 || iArr[1] == 0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r4Var.M2("FinderLiveLotteryPanelWidget", "onItemLongClickCallback before change x:" + iArr2[0] + ", original y:" + iArr2[1]);
            itemView.getLocationOnScreen(iArr2);
            r4Var.M2("FinderLiveLotteryPanelWidget", "onItemLongClickCallback after change x:" + iArr2[0] + ", original y:" + iArr2[1]);
        }
        popupMenu = a2Var.getPopupMenu();
        popupMenu.a();
        popupMenu2 = a2Var.getPopupMenu();
        android.content.Context context = this.f347075e;
        popupMenu2.h(itemView, new on2.v1(context), new on2.x1(a2Var, item, context, intValue), iArr2[0], iArr2[1]);
        return jz5.f0.f302826a;
    }
}
