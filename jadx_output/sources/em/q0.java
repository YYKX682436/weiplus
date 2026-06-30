package em;

/* loaded from: classes12.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254714a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f254715b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254716c;

    public q0(android.view.View view) {
        this.f254714a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254715b == null) {
            this.f254715b = (android.widget.ImageView) this.f254714a.findViewById(com.tencent.mm.R.id.f485401rs0);
        }
        return this.f254715b;
    }

    public android.widget.TextView b() {
        if (this.f254716c == null) {
            this.f254716c = (android.widget.TextView) this.f254714a.findViewById(com.tencent.mm.R.id.s9_);
        }
        return this.f254716c;
    }
}
