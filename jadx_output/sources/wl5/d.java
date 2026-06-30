package wl5;

/* loaded from: classes4.dex */
public class d implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447107d;

    public d(wl5.x xVar) {
        this.f447107d = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        wl5.x xVar = this.f447107d;
        xVar.f447165j.setOnTouchListener(xVar.H);
    }
}
