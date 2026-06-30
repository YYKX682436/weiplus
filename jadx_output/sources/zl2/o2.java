package zl2;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f473909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f473910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f473911f;

    public o2(android.app.Activity activity, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f473909d = activity;
        this.f473910e = finderJumpInfo;
        this.f473911f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "eligibilityJumpInfo click ok");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f473910e;
        kotlin.jvm.internal.o.f(jumpInfo, "$jumpInfo");
        android.app.Activity context = this.f473909d;
        kotlin.jvm.internal.o.g(context, "context");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(jumpInfo);
        p0Var.f453252n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        this.f473911f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
