package em;

/* loaded from: classes10.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254849a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ProgressBar f254850b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254851c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254852d;

    public u3(android.view.View view) {
        this.f254849a = view;
    }

    public com.tencent.mm.ui.widget.MMTextView a() {
        if (this.f254851c == null) {
            this.f254851c = (com.tencent.mm.ui.widget.MMTextView) this.f254849a.findViewById(com.tencent.mm.R.id.v0o);
        }
        return this.f254851c;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView b() {
        if (this.f254852d == null) {
            this.f254852d = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254849a.findViewById(com.tencent.mm.R.id.v0p);
        }
        return this.f254852d;
    }
}
