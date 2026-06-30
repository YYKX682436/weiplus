package ub3;

/* loaded from: classes15.dex */
public class k0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView f426116d;

    public k0(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView) {
        this.f426116d = shuffleView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.util.DisplayMetrics displayMetrics = com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.E;
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = this.f426116d;
        shuffleView.l();
        for (int i39 = 0; i39 < shuffleView.f145127v; i39++) {
            shuffleView.k((android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i39), i39);
        }
        shuffleView.removeOnLayoutChangeListener(this);
    }
}
