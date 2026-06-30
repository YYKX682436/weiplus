package nm4;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView f338510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338511e;

    public s(com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView tingSpaceCoverMvvmView, int i17) {
        this.f338510d = tingSpaceCoverMvvmView;
        this.f338511e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f338510d.setBackgroundColor(this.f338511e);
    }
}
