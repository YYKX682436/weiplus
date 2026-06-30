package iu4;

/* loaded from: classes9.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f295021a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f295022b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView f295023c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f295024d;

    public d0(android.app.Activity activity) {
        this.f295021a = null;
        this.f295022b = null;
        this.f295023c = null;
        this.f295024d = null;
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.bl8, null);
        this.f295021a = inflate;
        this.f295022b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.onj);
        this.f295023c = (com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView) this.f295021a.findViewById(com.tencent.mm.R.id.f486275kq5);
        this.f295024d = (android.widget.TextView) this.f295021a.findViewById(com.tencent.mm.R.id.omq);
    }
}
