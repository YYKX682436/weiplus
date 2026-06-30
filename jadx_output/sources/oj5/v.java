package oj5;

/* loaded from: classes8.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f345894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.w f345895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f345896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj5.b0 f345897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f345898h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345899i;

    public v(java.util.List list, oj5.w wVar, kotlin.jvm.internal.c0 c0Var, oj5.b0 b0Var, androidx.recyclerview.widget.f2 f2Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f345894d = list;
        this.f345895e = wVar;
        this.f345896f = c0Var;
        this.f345897g = b0Var;
        this.f345898h = f2Var;
        this.f345899i = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        oj5.b0 b0Var = this.f345897g;
        java.util.List<int[]> list = this.f345894d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            for (int[] iArr : list) {
                if (this.f345896f.f310112d) {
                    return;
                }
                int i17 = iArr[1];
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) b0Var.f345836c.get(java.lang.Integer.valueOf(iArr[0]));
                int size = concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0;
                if (i17 > 0 && size < i17) {
                    int i18 = i17 - size;
                    for (int i19 = 0; i19 < i18; i19++) {
                        androidx.recyclerview.widget.k3 createViewHolder = this.f345898h.createViewHolder(this.f345899i, iArr[0]);
                        kotlin.jvm.internal.o.f(createViewHolder, "createViewHolder(...)");
                        b0Var.d(createViewHolder);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[supportPreCreateView] cost=");
            sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb6.append("ms types=");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (int[] iArr2 : list) {
                arrayList.add(iArr2[0] + " => " + iArr2[1]);
            }
            sb6.append(arrayList);
            sb6.append(" tag=");
            sb6.append(this.f345895e.hashCode());
            com.tencent.mars.xlog.Log.i("DynamicViewCacheEx", sb6.toString());
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("DynamicViewCacheEx", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
    }
}
