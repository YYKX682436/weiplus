package e33;

/* loaded from: classes10.dex */
public class j6 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager f247298n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager speedyLinearLayoutManager, android.content.Context context) {
        super(context);
        this.f247298n = speedyLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return this.f247298n.a(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return this.f247298n.f138638v / displayMetrics.densityDpi;
    }
}
