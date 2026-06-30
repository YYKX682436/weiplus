package em;

/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254639a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254640b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254641c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f254642d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254643e;

    public n2(android.view.View view) {
        this.f254639a = view;
    }

    public android.widget.TextView a() {
        if (this.f254643e == null) {
            this.f254643e = (android.widget.TextView) this.f254639a.findViewById(com.tencent.mm.R.id.gzf);
        }
        return this.f254643e;
    }

    public android.widget.RelativeLayout b() {
        if (this.f254642d == null) {
            this.f254642d = (android.widget.RelativeLayout) this.f254639a.findViewById(com.tencent.mm.R.id.gzg);
        }
        return this.f254642d;
    }
}
