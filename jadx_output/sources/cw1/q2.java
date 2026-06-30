package cw1;

/* loaded from: classes12.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f223256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f223257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f223258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f223259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f223261i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f223262m;

    public q2(com.tencent.mm.ui.widget.dialog.u3 u3Var, cw1.o0 o0Var, byte[] bArr, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI, long j17, boolean z17) {
        this.f223256d = u3Var;
        this.f223257e = o0Var;
        this.f223258f = bArr;
        this.f223259g = h0Var;
        this.f223260h = cleanCacheUI;
        this.f223261i = j17;
        this.f223262m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        this.f223256d.dismiss();
        this.f223257e.d(false);
        byte[] bArr = this.f223258f;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI = this.f223260h;
        int length = bArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            j17 = 0;
            if (i17 >= length) {
                break;
            }
            int i19 = i18 + 1;
            if (bArr[i17] != Byte.MAX_VALUE) {
                cleanCacheUI.f95693h[i18] = 0;
            }
            i17++;
            i18 = i19;
        }
        java.lang.Object obj = this.f223259g.f310123d;
        if (obj != null) {
            long[] jArr = this.f223260h.f95693h;
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                j17 += ((cw1.j) it.next()).f223011c;
            }
            jArr[6] = j17;
            this.f223257e.g(3, (java.util.List) this.f223259g.f310123d);
        }
        this.f223257e.h(this.f223260h.f95693h);
        this.f223260h.f95694i.invoke();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI2 = this.f223260h;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("tagsResult", this.f223260h.f95693h);
        cleanCacheUI2.setResult(-1, intent);
        yv1.f1 f1Var = yv1.g1.f466040p;
        java.lang.String string = this.f223260h.getString(com.tencent.mm.R.string.b8q, fp.n0.a(this.f223261i));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!this.f223262m) {
            db5.t7.h(this.f223260h, string);
            return;
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI3 = this.f223260h;
        cleanCacheUI3.getClass();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(cleanCacheUI3);
        u1Var.g(string + '\n' + cleanCacheUI3.getString(com.tencent.mm.R.string.b7s, 5));
        u1Var.a(false);
        u1Var.m(com.tencent.mm.R.string.b7r);
        u1Var.e(new cw1.j2(cleanCacheUI3));
        u1Var.q(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        cw1.k2 k2Var = new cw1.k2(j0Var, (android.widget.TextView) j0Var.getContentView().findViewById(com.tencent.mm.R.id.jlg), string, cleanCacheUI3);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(k2Var, 1000L, false);
    }
}
