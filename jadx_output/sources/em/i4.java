package em;

/* loaded from: classes5.dex */
public class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254437a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f254438b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254439c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f254440d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.progress.RoundCornerProgressBar f254441e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f254442f;

    public i4(android.view.View view) {
        this.f254437a = view;
    }

    public com.tencent.mm.ui.widget.button.WeButton a() {
        if (this.f254442f == null) {
            this.f254442f = (com.tencent.mm.ui.widget.button.WeButton) this.f254437a.findViewById(com.tencent.mm.R.id.utl);
        }
        return this.f254442f;
    }

    public com.tencent.mm.ui.widget.button.WeButton b() {
        if (this.f254440d == null) {
            this.f254440d = (com.tencent.mm.ui.widget.button.WeButton) this.f254437a.findViewById(com.tencent.mm.R.id.v1n);
        }
        return this.f254440d;
    }

    public android.widget.TextView c() {
        if (this.f254439c == null) {
            this.f254439c = (android.widget.TextView) this.f254437a.findViewById(com.tencent.mm.R.id.va9);
        }
        return this.f254439c;
    }

    public com.tencent.mm.ui.widget.progress.RoundCornerProgressBar d() {
        if (this.f254441e == null) {
            this.f254441e = (com.tencent.mm.ui.widget.progress.RoundCornerProgressBar) this.f254437a.findViewById(com.tencent.mm.R.id.vgw);
        }
        return this.f254441e;
    }
}
