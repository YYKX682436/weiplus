package em;

/* loaded from: classes10.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254223a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254224b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.EditText f254225c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254226d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254227e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f254228f;

    public d2(android.view.View view) {
        this.f254223a = view;
    }

    public androidx.constraintlayout.widget.ConstraintLayout a() {
        if (this.f254228f == null) {
            this.f254228f = (androidx.constraintlayout.widget.ConstraintLayout) this.f254223a.findViewById(com.tencent.mm.R.id.v1c);
        }
        return this.f254228f;
    }

    public android.widget.TextView b() {
        if (this.f254227e == null) {
            this.f254227e = (android.widget.TextView) this.f254223a.findViewById(com.tencent.mm.R.id.v1e);
        }
        return this.f254227e;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView c() {
        if (this.f254224b == null) {
            this.f254224b = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254223a.findViewById(com.tencent.mm.R.id.v1f);
        }
        return this.f254224b;
    }

    public android.widget.EditText d() {
        if (this.f254225c == null) {
            this.f254225c = (android.widget.EditText) this.f254223a.findViewById(com.tencent.mm.R.id.v1g);
        }
        return this.f254225c;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView e() {
        if (this.f254226d == null) {
            this.f254226d = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254223a.findViewById(com.tencent.mm.R.id.meb);
        }
        return this.f254226d;
    }
}
