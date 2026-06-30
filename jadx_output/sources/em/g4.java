package em;

/* loaded from: classes5.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254355a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254356b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254357c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254358d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254359e;

    public g4(android.view.View view) {
        this.f254355a = view;
    }

    public android.widget.TextView a() {
        if (this.f254357c == null) {
            this.f254357c = (android.widget.TextView) this.f254355a.findViewById(com.tencent.mm.R.id.u_h);
        }
        return this.f254357c;
    }

    public android.widget.TextView b() {
        if (this.f254358d == null) {
            this.f254358d = (android.widget.TextView) this.f254355a.findViewById(com.tencent.mm.R.id.u_j);
        }
        return this.f254358d;
    }
}
