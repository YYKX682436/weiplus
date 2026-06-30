package zx2;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f477081a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f477082b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f477083c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f477084d;

    /* renamed from: e, reason: collision with root package name */
    public int f477085e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f477086f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477087g;

    /* renamed from: h, reason: collision with root package name */
    public zx2.w f477088h;

    public boolean a() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477087g;
        if (finderTabLayout != null) {
            return finderTabLayout.getSelectedTabPosition() == this.f477085e;
        }
        throw new java.lang.IllegalArgumentException("Tab not attached to a CustomTabLayout");
    }

    public void b() {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477087g;
        if (finderTabLayout == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a CustomTabLayout");
        }
        finderTabLayout.m(this, true);
    }

    public zx2.u c(int i17) {
        this.f477086f = android.view.LayoutInflater.from(this.f477088h.getContext()).inflate(i17, (android.view.ViewGroup) this.f477088h, false);
        zx2.w wVar = this.f477088h;
        if (wVar != null) {
            wVar.b();
        }
        return this;
    }
}
