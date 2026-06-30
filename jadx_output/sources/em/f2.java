package em;

/* loaded from: classes5.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254311a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254312b;

    public f2(android.view.View view) {
        this.f254311a = view;
    }

    public android.widget.TextView a() {
        if (this.f254312b == null) {
            this.f254312b = (android.widget.TextView) this.f254311a.findViewById(com.tencent.mm.R.id.vev);
        }
        return this.f254312b;
    }
}
