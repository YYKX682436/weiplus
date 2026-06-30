package cw1;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f223016g;

    public j0(android.widget.TextView textView, com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, int i17, int i18) {
        this.f223013d = textView;
        this.f223014e = cleanAllMessagesUI;
        this.f223015f = i17;
        this.f223016g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f223013d.setText(this.f223014e.getString(com.tencent.mm.R.string.a_y, java.lang.Integer.valueOf((this.f223015f * 100) / this.f223016g)));
    }
}
