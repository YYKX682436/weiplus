package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public y9.i f212309a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f212310b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f212311c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f212312d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212313e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f212314f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f212315g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f212316h;

    /* renamed from: i, reason: collision with root package name */
    public int f212317i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f212318j;

    /* renamed from: k, reason: collision with root package name */
    public db5.t4 f212319k;

    /* renamed from: l, reason: collision with root package name */
    public db5.g4 f212320l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f212321m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.n0 f212322n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.o0 f212323o;

    public p0(android.content.Context context) {
        this.f212311c = context;
        this.f212320l = new db5.g4(context);
        this.f212309a = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bys, null);
        this.f212310b = inflate;
        this.f212312d = (android.widget.ListView) inflate.findViewById(com.tencent.mm.R.id.juv);
        this.f212315g = (android.widget.Button) this.f212310b.findViewById(com.tencent.mm.R.id.khs);
        this.f212316h = (android.widget.Button) this.f212310b.findViewById(com.tencent.mm.R.id.b5i);
        this.f212313e = this.f212310b.findViewById(com.tencent.mm.R.id.gyr);
        this.f212314f = (android.widget.TextView) this.f212310b.findViewById(com.tencent.mm.R.id.gzd);
        this.f212309a.setContentView(this.f212310b);
        this.f212317i = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479578u) + com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479579v);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f212310b.getParent());
        this.f212318j = A;
        if (A != null) {
            A.C(this.f212317i);
            this.f212318j.f44443p = false;
        }
        this.f212309a.setOnDismissListener(new com.tencent.mm.ui.widget.picker.i0(this));
    }
}
