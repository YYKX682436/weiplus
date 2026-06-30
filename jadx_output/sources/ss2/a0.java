package ss2;

/* loaded from: classes10.dex */
public final class a0 implements ry2.n, ut3.d {
    public android.os.Bundle A;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f411905d;

    /* renamed from: e, reason: collision with root package name */
    public final ry2.o f411906e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f411907f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout f411908g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f411909h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f411910i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f411911m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f411912n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f411913o;

    /* renamed from: p, reason: collision with root package name */
    public int f411914p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f411915q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f411916r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f411917s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f411918t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f411919u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f411920v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f411921w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f411922x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f411923y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f411924z;

    public a0(com.tencent.mm.ui.MMActivity activity, ry2.o postDataManager) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(postDataManager, "postDataManager");
        this.f411905d = activity;
        this.f411906e = postDataManager;
        this.f411912n = "";
        this.f411913o = "";
        this.f411915q = new java.util.ArrayList();
        new java.util.LinkedList();
        this.f411917s = new java.util.ArrayList();
        this.f411919u = new java.util.ArrayList();
        this.f411922x = jz5.h.b(new ss2.o(this));
        this.f411923y = jz5.h.b(ss2.x.f411992d);
        this.f411924z = kz5.c0.d(new ss2.m());
    }

    public static final void c(ss2.a0 a0Var, int i17) {
        java.lang.Object obj = a0Var.f411924z.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        in5.c cVar = (in5.c) obj;
        boolean z17 = cVar instanceof ss2.m;
        boolean z18 = true;
        com.tencent.mm.ui.MMActivity mMActivity = a0Var.f411905d;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 1, true);
            k0Var.f211872n = ss2.y.f411993d;
            k0Var.f211881s = new ss2.z(a0Var);
            k0Var.v();
            return;
        }
        if (cVar instanceof ss2.n) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(mMActivity, "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            intent.putExtra("sns_gallery_position", i17);
            java.util.ArrayList arrayList = a0Var.f411911m;
            if (arrayList != null && !arrayList.isEmpty()) {
                z18 = false;
            }
            if (z18) {
                intent.putExtra("sns_gallery_temp_paths", a0Var.f411916r);
            } else {
                intent.putExtra("sns_gallery_temp_paths", a0Var.f411911m);
            }
            intent.putExtra("key_from_scene", 7);
            mMActivity.startActivityForResult(intent, 8485);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    @Override // ry2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ry2.r0 a() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss2.a0.a():ry2.r0");
    }

    @Override // ry2.n
    public android.view.View b() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f411905d).inflate(com.tencent.mm.R.layout.dcf, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f411907f = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pyu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f411908g = (com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout) findViewById;
        android.view.View view = this.f411907f;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.pyw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f411909h = (android.view.ViewGroup) findViewById2;
        android.view.View view2 = this.f411907f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.pyv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f411910i = (android.widget.ImageView) findViewById3;
        com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout = this.f411908g;
        if (finderMultiPhotoLayout == null) {
            kotlin.jvm.internal.o.o("photoGridView");
            throw null;
        }
        finderMultiPhotoLayout.setAddMode(true);
        e();
        android.view.View view3 = this.f411907f;
        if (view3 != null) {
            return view3;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final int d() {
        java.util.ArrayList arrayList = this.f411911m;
        if (!(arrayList == null || arrayList.isEmpty())) {
            return 4;
        }
        java.util.ArrayList arrayList2 = this.f411916r;
        return !(arrayList2 == null || arrayList2.isEmpty()) ? 2 : 1;
    }

    public final void e() {
        com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout = this.f411908g;
        if (finderMultiPhotoLayout == null) {
            kotlin.jvm.internal.o.o("photoGridView");
            throw null;
        }
        java.util.ArrayList arrayList = this.f411924z;
        finderMultiPhotoLayout.b(arrayList.size());
        com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout2 = this.f411908g;
        if (finderMultiPhotoLayout2 == null) {
            kotlin.jvm.internal.o.o("photoGridView");
            throw null;
        }
        java.util.List<android.view.View> childList = finderMultiPhotoLayout2.getChildList();
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) obj;
            android.view.View view = childList.get(i17);
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
            com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) view;
            if (cVar instanceof ss2.n) {
                mMImageView.setColorFilter(0);
                mMImageView.setAlpha(1.0f);
                android.graphics.drawable.Drawable drawable = mMImageView.getDrawable();
                android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
                if (mutate != null) {
                    mutate.setAlpha(255);
                }
                mMImageView.setPadding(0, 0, 0, 0);
                mMImageView.setOnClickListener(new ss2.s(this, i17));
            } else if (cVar instanceof ss2.m) {
                mMImageView.setOnClickListener(new ss2.t(this, i17));
                float q17 = i65.a.q(this.f411905d);
                if (q17 > 1.4f) {
                    q17 = 1.4f;
                }
                int intValue = (int) (((java.lang.Number) ((jz5.n) this.f411922x).getValue()).intValue() / q17);
                mMImageView.setPadding(intValue, intValue, intValue, intValue);
                mMImageView.setImageDrawable(com.tencent.mm.ui.uk.e(mMImageView.getContext(), com.tencent.mm.R.raw.plus_regular, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_1)));
            }
            i17 = i18;
        }
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
