package em;

/* loaded from: classes11.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254422a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomScrollView f254423b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f254424c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.TapToDismissFrameLayout f254425d;

    public i1(android.view.View view) {
        this.f254422a = view;
    }

    public com.tencent.mm.ui.chatting.TapToDismissFrameLayout a() {
        if (this.f254425d == null) {
            this.f254425d = (com.tencent.mm.ui.chatting.TapToDismissFrameLayout) this.f254422a.findViewById(com.tencent.mm.R.id.f485853uf3);
        }
        return this.f254425d;
    }

    public com.tencent.mm.ui.base.CustomScrollView b() {
        if (this.f254423b == null) {
            this.f254423b = (com.tencent.mm.ui.base.CustomScrollView) this.f254422a.findViewById(com.tencent.mm.R.id.f485855uf5);
        }
        return this.f254423b;
    }
}
