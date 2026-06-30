package pp3;

/* loaded from: classes5.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.patmsg.ui.PatPopupWindow f357489e;

    public l(com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow, android.view.View view) {
        this.f357489e = patPopupWindow;
        this.f357488d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f357488d.postDelayed(new pp3.k(this), 175L);
    }
}
