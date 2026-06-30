package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class ServiceNotifyHeaderView extends android.widget.LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f202857m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f202858d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f202859e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f202860f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f202861g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.s2 f202862h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f202863i;

    public ServiceNotifyHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f202863i = false;
        c();
    }

    public void a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        if (f9Var != null) {
            com.tencent.mm.storage.a9 a9Var = f9Var.f193927g2;
            if (a9Var instanceof com.tencent.mm.storage.oa) {
                b(dVar, (com.tencent.mm.storage.oa) a9Var, f9Var, map);
                return;
            }
        }
        b(dVar, null, f9Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final yb5.d r12, com.tencent.mm.storage.oa r13, final com.tencent.mm.storage.f9 r14, final java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView.b(yb5.d, com.tencent.mm.storage.oa, com.tencent.mm.storage.f9, java.util.Map):void");
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.eqg, this);
        this.f202858d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rte);
        this.f202859e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.uhf);
        this.f202860f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486002ui4);
        this.f202861g = findViewById(com.tencent.mm.R.id.vlu);
        setBackgroundResource(com.tencent.mm.R.drawable.czi);
    }

    @Override // android.view.ViewGroup
    public android.view.View getChildAt(int i17) {
        if (getChildCount() > 3 && this.f202863i) {
            if (i17 == 2) {
                i17 = 3;
            } else if (i17 == 3) {
                i17 = 2;
            }
        }
        return super.getChildAt(i17);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f202863i = true;
        super.onMeasure(i17, i18);
        this.f202863i = false;
    }

    public void setHeaderClickListener(com.tencent.mm.ui.chatting.view.s2 s2Var) {
        this.f202862h = s2Var;
    }

    public ServiceNotifyHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f202863i = false;
        c();
    }
}
