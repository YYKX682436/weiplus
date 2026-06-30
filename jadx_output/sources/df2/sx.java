package df2;

/* loaded from: classes3.dex */
public final class sx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f231382e;

    public sx(df2.cy cyVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f231381d = cyVar;
        this.f231382e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$setupBottomSheetAppealButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "3", null, 4, null);
        df2.cy cyVar = this.f231381d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = cyVar.f229916n;
        if (y1Var != null) {
            y1Var.q();
        }
        df2.nm nmVar = (df2.nm) cyVar.controller(df2.nm.class);
        if (nmVar != null) {
            nmVar.Z6(this.f231382e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$setupBottomSheetAppealButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
