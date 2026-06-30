package en2;

/* loaded from: classes10.dex */
public final class b extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager f255280n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager finderLiveMsgLinearLayoutManager, android.content.Context context) {
        super(context);
        this.f255280n = finderLiveMsgLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.o1
    public int i(android.view.View view, int i17) {
        int i18 = super.i(view, i17);
        com.tencent.mars.xlog.Log.i(this.f255280n.f119057v, "[calculateDyToMakeVisible] dy = " + i18);
        return i18;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        int i17 = mm2.e5.f329001o;
        return mm2.e5.f329001o / displayMetrics.densityDpi;
    }
}
