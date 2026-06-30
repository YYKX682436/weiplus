package em;

/* loaded from: classes12.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254589a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254590b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f254591c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254592d;

    public m0(android.view.View view) {
        this.f254589a = view;
    }

    public android.widget.LinearLayout a() {
        if (this.f254591c == null) {
            this.f254591c = (android.widget.LinearLayout) this.f254589a.findViewById(com.tencent.mm.R.id.qak);
        }
        return this.f254591c;
    }
}
