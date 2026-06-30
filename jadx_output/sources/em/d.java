package em;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254188a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254189b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f254190c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254191d;

    public d(android.view.View view) {
        this.f254188a = view;
    }

    public android.widget.ImageView a() {
        if (this.f254190c == null) {
            this.f254190c = (android.widget.ImageView) this.f254188a.findViewById(com.tencent.mm.R.id.vgp);
        }
        return this.f254190c;
    }

    public android.widget.TextView b() {
        if (this.f254189b == null) {
            this.f254189b = (android.widget.TextView) this.f254188a.findViewById(com.tencent.mm.R.id.vgu);
        }
        return this.f254189b;
    }
}
