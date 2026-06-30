package wu;

/* loaded from: classes9.dex */
public abstract class p extends in5.r {

    /* renamed from: g, reason: collision with root package name */
    public static final int f449609g = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479718db);

    /* renamed from: e, reason: collision with root package name */
    public final hu.f f449610e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mvvmlist.MvvmList f449611f;

    public p(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        this.f449610e = uiParams;
        this.f449611f = mvvmList;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489380em2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04ae  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r28, in5.c r29, int r30, int r31, boolean r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 2051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.p.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(frameLayout, "getContentContainer(...)");
        p(frameLayout, i17);
    }

    public abstract void n(android.widget.FrameLayout frameLayout, hu.b bVar, int i17, int i18);

    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public abstract void p(android.widget.FrameLayout frameLayout, int i17);
}
