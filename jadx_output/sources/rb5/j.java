package rb5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f393872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView f393873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393875g;

    public j(rb5.l lVar, int[] iArr, com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f393875g = lVar;
        this.f393872d = iArr;
        this.f393873e = fitSystemWindowLayoutView;
        this.f393874f = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View j17 = this.f393875g.f393881e.j();
        int[] iArr = this.f393872d;
        j17.getLocationInWindow(iArr);
        int i17 = iArr[1];
        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f393873e;
        if (i17 <= 0) {
            fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new rb5.i(this));
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, i17, 0, 0);
        fitSystemWindowLayoutView.setActionBarContainer(this.f393874f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }
}
