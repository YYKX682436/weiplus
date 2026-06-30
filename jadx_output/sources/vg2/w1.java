package vg2;

/* loaded from: classes3.dex */
public final class w1 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.y1 f436614d;

    public w1(vg2.y1 y1Var) {
        this.f436614d = y1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f436614d.f436624c.invoke();
    }
}
