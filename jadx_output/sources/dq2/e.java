package dq2;

/* loaded from: classes2.dex */
public final class e extends hp2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List feedList, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, int i17) {
        super(feedList, wxRecyclerAdapter, i17);
        kotlin.jvm.internal.o.g(feedList, "feedList");
    }

    @Override // hp2.g
    public boolean i(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int i17) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        int i18 = i17 % 2;
        return i18 == 0 ? !(h(i17 + 1) instanceof so2.h1) : i18 == 1 ? !(h(i17 - 1) instanceof so2.h1) : super.i(layoutManager, i17);
    }
}
