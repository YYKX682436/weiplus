package tz4;

/* loaded from: classes3.dex */
public class m extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423371v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tz4.l lVar, android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f423371v = lVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f423371v.f423357c.f423351n;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return false;
    }
}
