package em;

/* loaded from: classes9.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254164a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254165b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254166c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f254167d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254168e;

    public c1(android.view.View view) {
        this.f254164a = view;
    }

    public com.tencent.mm.ui.widget.MMTextView a() {
        if (this.f254168e == null) {
            this.f254168e = (com.tencent.mm.ui.widget.MMTextView) this.f254164a.findViewById(com.tencent.mm.R.id.brd);
        }
        return this.f254168e;
    }
}
