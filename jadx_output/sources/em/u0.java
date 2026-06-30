package em;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254829a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f254830b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254831c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254832d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254833e;

    public u0(android.view.View view) {
        this.f254829a = view;
    }

    public android.widget.TextView a() {
        if (this.f254832d == null) {
            this.f254832d = (android.widget.TextView) this.f254829a.findViewById(com.tencent.mm.R.id.g4e);
        }
        return this.f254832d;
    }

    public android.widget.ImageView b() {
        if (this.f254830b == null) {
            this.f254830b = (android.widget.ImageView) this.f254829a.findViewById(com.tencent.mm.R.id.twa);
        }
        return this.f254830b;
    }
}
