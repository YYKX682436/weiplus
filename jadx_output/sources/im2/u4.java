package im2;

/* loaded from: classes2.dex */
public final class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.v4 f292573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f292574e;

    public u4(im2.v4 v4Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f292573d = v4Var;
        this.f292574e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderOrderCenter");
        androidx.appcompat.app.AppCompatActivity context = this.f292573d.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f292574e;
        if (finderJumpInfo != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.SOURCE, 1);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453235a0 = hashMap;
            xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
