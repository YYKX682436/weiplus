package nm4;

/* loaded from: classes3.dex */
public final class r implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f338508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView f338509b;

    public r(boolean z17, com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView tingSpaceCoverMvvmView) {
        this.f338508a = z17;
        this.f338509b = tingSpaceCoverMvvmView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (!this.f338508a || !z17 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        int i17 = com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView.f174882g;
        this.f338509b.a(str, bitmap);
    }
}
