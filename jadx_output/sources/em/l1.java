package em;

/* loaded from: classes12.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254536a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.media.image.SwitchableImageContainer f254537b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f254538c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewStub f254539d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer f254540e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.media.live.LiveSwitchableContainer f254541f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.media.view.SampleHDImageView f254542g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f254543h;

    public l1(android.view.View view) {
        this.f254536a = view;
    }

    public com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer a() {
        if (this.f254540e == null) {
            this.f254540e = (com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) this.f254536a.findViewById(com.tencent.mm.R.id.sx_);
        }
        return this.f254540e;
    }

    public com.tencent.mm.ui.base.MultiTouchImageView b() {
        if (this.f254538c == null) {
            this.f254538c = (com.tencent.mm.ui.base.MultiTouchImageView) this.f254536a.findViewById(com.tencent.mm.R.id.um_);
        }
        return this.f254538c;
    }

    public com.tencent.mm.plugin.media.view.SampleHDImageView c() {
        if (this.f254542g == null) {
            this.f254542g = (com.tencent.mm.plugin.media.view.SampleHDImageView) this.f254536a.findViewById(com.tencent.mm.R.id.v07);
        }
        return this.f254542g;
    }

    public com.tencent.mm.plugin.media.image.SwitchableImageContainer d() {
        if (this.f254537b == null) {
            this.f254537b = (com.tencent.mm.plugin.media.image.SwitchableImageContainer) this.f254536a.findViewById(com.tencent.mm.R.id.vbr);
        }
        return this.f254537b;
    }
}
