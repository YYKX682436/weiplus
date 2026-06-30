package vb2;

/* loaded from: classes2.dex */
public final class q implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f434704a;

    /* renamed from: b, reason: collision with root package name */
    public final vb2.l f434705b;

    /* renamed from: c, reason: collision with root package name */
    public final vb2.l f434706c;

    /* renamed from: d, reason: collision with root package name */
    public final vb2.l f434707d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f434708e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f434709f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f434710g;

    public q(android.widget.LinearLayout linearLayout, vb2.l lVar, vb2.l lVar2, vb2.l lVar3, android.widget.TextView textView, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2) {
        this.f434704a = linearLayout;
        this.f434705b = lVar;
        this.f434706c = lVar2;
        this.f434707d = lVar3;
        this.f434708e = textView;
        this.f434709f = linearLayout2;
        this.f434710g = textView2;
    }

    public static vb2.q a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.b6z;
        android.view.View a17 = x4.b.a(view, com.tencent.mm.R.id.b6z);
        if (a17 != null) {
            vb2.l a18 = vb2.l.a(a17);
            i17 = com.tencent.mm.R.id.f483549b70;
            android.view.View a19 = x4.b.a(view, com.tencent.mm.R.id.f483549b70);
            if (a19 != null) {
                vb2.l a27 = vb2.l.a(a19);
                i17 = com.tencent.mm.R.id.f483550b71;
                android.view.View a28 = x4.b.a(view, com.tencent.mm.R.id.f483550b71);
                if (a28 != null) {
                    vb2.l a29 = vb2.l.a(a28);
                    i17 = com.tencent.mm.R.id.i2p;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.i2p);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.i2q;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.i2q);
                        if (linearLayout != null) {
                            i17 = com.tencent.mm.R.id.obc;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.obc);
                            if (textView2 != null) {
                                return new vb2.q((android.widget.LinearLayout) view, a18, a27, a29, textView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434704a;
    }
}
