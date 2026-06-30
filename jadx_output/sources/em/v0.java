package em;

/* loaded from: classes9.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254859a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f254860b;

    public v0(android.view.View view) {
        this.f254859a = view;
    }

    public static em.v0 a(android.content.Context context) {
        return new em.v0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehq, (android.view.ViewGroup) null));
    }

    public android.widget.FrameLayout b() {
        if (this.f254860b == null) {
            this.f254860b = (android.widget.FrameLayout) this.f254859a.findViewById(com.tencent.mm.R.id.cgz);
        }
        return this.f254860b;
    }
}
