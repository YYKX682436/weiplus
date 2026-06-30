package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class g8 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206724d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f206725e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f206726f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.e8 f206727g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.contact.f8 f206728h;

    public g8(android.content.Context context, com.tencent.mm.ui.contact.e8 e8Var) {
        super(context);
        this.f206725e = null;
        this.f206724d = context;
        this.f206727g = e8Var;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.d8(this));
    }

    public int getOpenIMCount() {
        java.util.List list = this.f206726f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setOnVisibilityChangeListener(com.tencent.mm.ui.contact.f8 f8Var) {
        this.f206728h = f8Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (this.f206728h != null && i17 != getVisibility()) {
            this.f206728h.a(i17 == 0);
        }
        super.setVisibility(i17);
    }
}
