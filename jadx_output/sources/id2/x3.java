package id2;

/* loaded from: classes3.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.z3 f290878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(id2.z3 z3Var) {
        super(6);
        this.f290878d = z3Var;
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        android.app.Activity context = (android.app.Activity) obj;
        kotlin.jvm.internal.o.g(context, "context");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        int i17 = this.f290878d.f290902e;
        ((c61.p2) ybVar).getClass();
        com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE.showCreateFinderUserDialogOnLiveWithCallback(context, i17, (android.content.Intent) obj2, ((java.lang.Number) obj3).intValue(), (android.content.DialogInterface.OnClickListener) obj4, (android.content.DialogInterface.OnClickListener) obj5, (android.content.DialogInterface.OnDismissListener) obj6);
        return jz5.f0.f302826a;
    }
}
