package em;

/* loaded from: classes12.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254593a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f254594b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f254595c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f254596d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254597e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f254598f;

    public m1(android.view.View view) {
        this.f254593a = view;
    }

    public android.widget.FrameLayout a() {
        if (this.f254596d == null) {
            this.f254596d = (android.widget.FrameLayout) this.f254593a.findViewById(com.tencent.mm.R.id.b0y);
        }
        return this.f254596d;
    }

    public android.widget.FrameLayout b() {
        if (this.f254598f == null) {
            this.f254598f = (android.widget.FrameLayout) this.f254593a.findViewById(com.tencent.mm.R.id.smw);
        }
        return this.f254598f;
    }

    public android.widget.FrameLayout c() {
        if (this.f254594b == null) {
            this.f254594b = (android.widget.FrameLayout) this.f254593a.findViewById(com.tencent.mm.R.id.f483505sn0);
        }
        return this.f254594b;
    }
}
