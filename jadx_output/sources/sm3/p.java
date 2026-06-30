package sm3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f409900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f409901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f409902g;

    public p(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView, int i17, long j17, long j18) {
        this.f409899d = mvTracksEditView;
        this.f409900e = i17;
        this.f409901f = j17;
        this.f409902g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f409899d.d(this.f409900e, this.f409901f, this.f409902g, true);
    }
}
