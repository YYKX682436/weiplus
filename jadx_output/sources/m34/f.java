package m34;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView f323350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f323351e;

    public f(m34.g gVar, com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f323350d = sightPlayImageView;
        this.f323351e = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f323350d.setLayoutParams(this.f323351e);
    }
}
