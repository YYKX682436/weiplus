package r50;

/* loaded from: classes5.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392612d;

    public t(r50.j0 j0Var) {
        this.f392612d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392612d.f392588g;
        if (chatFooterPanel == null) {
            return;
        }
        chatFooterPanel.setVisibility(8);
    }
}
