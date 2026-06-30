package ex5;

/* loaded from: classes7.dex */
public class f implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.weui.base.preference.WeUIPreference f257250d;

    public f(com.tencent.weui.base.preference.WeUIPreference weUIPreference) {
        this.f257250d = weUIPreference;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        android.view.View currentFocus;
        if (1 != i17 || (currentFocus = this.f257250d.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
    }
}
