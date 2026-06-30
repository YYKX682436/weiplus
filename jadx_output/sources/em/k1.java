package em;

/* loaded from: classes12.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254498a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254499b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f254500c;

    public k1(android.view.View view) {
        this.f254498a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254500c == null) {
            this.f254500c = (android.widget.ImageView) this.f254498a.findViewById(com.tencent.mm.R.id.d3c);
        }
        return this.f254500c;
    }

    public android.widget.TextView b() {
        if (this.f254499b == null) {
            this.f254499b = (android.widget.TextView) this.f254498a.findViewById(com.tencent.mm.R.id.d3d);
        }
        return this.f254499b;
    }
}
