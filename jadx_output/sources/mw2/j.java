package mw2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f331722a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f331723b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mb4 f331724c;

    /* renamed from: d, reason: collision with root package name */
    public long f331725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f331726e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f331727f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f331728g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f331729h;

    public j(android.content.Context context, android.widget.ImageView imageView, r45.mb4 mb4Var) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f331722a = context;
        this.f331723b = imageView;
        this.f331724c = mb4Var;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f331726e = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127808lb).getValue()).r()).booleanValue();
        this.f331727f = new com.tencent.mm.sdk.platformtools.c0(10);
        this.f331729h = new java.util.concurrent.ConcurrentHashMap();
    }

    public final r45.ir2 a() {
        r45.mb4 mb4Var = this.f331724c;
        if (mb4Var != null) {
            return (r45.ir2) mb4Var.getCustom(68);
        }
        return null;
    }

    public final void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (this.f331726e) {
            android.widget.ImageView imageView = this.f331723b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            }
            r45.ir2 a17 = a();
            if (a17 == null || a17.getInteger(10) <= 0 || a17.getInteger(9) <= 0) {
                return;
            }
            int integer = a17.getInteger(10);
            int integer2 = a17.getInteger(9);
            android.content.Context context = this.f331722a;
            if (integer > integer2) {
                android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480491ap0);
                }
                layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480492ap1);
                }
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.width = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480492ap1);
                }
                layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480491ap0);
                }
            }
            if (imageView != null) {
                imageView.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mw2.j.c(long, long):void");
    }
}
