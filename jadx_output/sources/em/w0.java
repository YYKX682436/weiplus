package em;

/* loaded from: classes5.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254883a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254884b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f254885c;

    public w0(android.view.View view) {
        this.f254883a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254885c == null) {
            this.f254885c = (android.widget.ImageView) this.f254883a.findViewById(com.tencent.mm.R.id.r_n);
        }
        return this.f254885c;
    }
}
