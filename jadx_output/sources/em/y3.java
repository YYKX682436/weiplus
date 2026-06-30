package em;

/* loaded from: classes11.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254945a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f254946b;

    public y3(android.view.View view) {
        this.f254945a = view;
    }

    public androidx.recyclerview.widget.RecyclerView a() {
        if (this.f254946b == null) {
            this.f254946b = (androidx.recyclerview.widget.RecyclerView) this.f254945a.findViewById(com.tencent.mm.R.id.m5r);
        }
        return this.f254946b;
    }
}
