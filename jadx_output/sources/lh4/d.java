package lh4;

/* loaded from: classes8.dex */
public final class d implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh4.h f318703d;

    public d(lh4.h hVar) {
        this.f318703d = hVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) this.f318703d.getCallback()).F2 = false;
    }
}
