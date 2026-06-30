package xw2;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f457688n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner, android.content.Context context) {
        super(context);
        this.f457688n = mediaPlayBanner;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return this.f457688n.getSmoothScrollerSpeed() / displayMetrics.densityDpi;
    }
}
