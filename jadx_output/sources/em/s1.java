package em;

/* loaded from: classes12.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254772a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar f254773b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254774c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f254775d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f254776e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254777f;

    public s1(android.view.View view) {
        this.f254772a = view;
    }

    public android.widget.RelativeLayout a() {
        if (this.f254776e == null) {
            this.f254776e = (android.widget.RelativeLayout) this.f254772a.findViewById(com.tencent.mm.R.id.shw);
        }
        return this.f254776e;
    }

    public android.widget.FrameLayout b() {
        if (this.f254775d == null) {
            this.f254775d = (android.widget.FrameLayout) this.f254772a.findViewById(com.tencent.mm.R.id.f483758bz2);
        }
        return this.f254775d;
    }

    public com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c() {
        if (this.f254773b == null) {
            this.f254773b = (com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar) this.f254772a.findViewById(com.tencent.mm.R.id.mhc);
        }
        return this.f254773b;
    }
}
