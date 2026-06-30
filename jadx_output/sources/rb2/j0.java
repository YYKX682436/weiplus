package rb2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f393660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f393661f;

    public j0(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, yz5.l lVar) {
        this.f393659d = str;
        this.f393660e = finderJumpInfo;
        this.f393661f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "onItemClick click comment ref " + this.f393659d + ", jumpInfo=" + hc2.g0.d(this.f393660e));
        kotlin.jvm.internal.o.d(view);
        this.f393661f.invoke(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$setFollowPatBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
