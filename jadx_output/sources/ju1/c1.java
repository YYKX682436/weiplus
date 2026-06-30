package ju1;

/* loaded from: classes9.dex */
public final class c1 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301703a;

    public c1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301703a = historyCardListUI;
    }

    @Override // vl1.o
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301703a;
        ju1.j jVar = historyCardListUI.f95426o;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null) {
            return false;
        }
        int i18 = x17.f301688a;
        if (i18 != 3 && i18 != 4 && i18 != 5) {
            return false;
        }
        rl5.r rVar = new rl5.r(historyCardListUI.getContext(), view);
        rVar.f397351u = new ju1.g1(historyCardListUI);
        rVar.f397354x = new ju1.h1(historyCardListUI, x17, i17);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        return false;
    }
}
