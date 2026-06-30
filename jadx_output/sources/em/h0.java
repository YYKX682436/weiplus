package em;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254377a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f254378b;

    public h0(android.view.View view) {
        this.f254377a = view;
    }

    public androidx.recyclerview.widget.RecyclerView a() {
        if (this.f254378b == null) {
            this.f254378b = (androidx.recyclerview.widget.RecyclerView) this.f254377a.findViewById(com.tencent.mm.R.id.f486718v01);
        }
        return this.f254378b;
    }
}
