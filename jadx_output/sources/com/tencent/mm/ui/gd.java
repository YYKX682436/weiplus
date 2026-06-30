package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class gd extends android.view.LayoutInflater {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.fd f208688a;

    public gd(android.view.LayoutInflater layoutInflater, android.content.Context context) {
        super(layoutInflater, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(int r24, android.view.ViewGroup r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.gd.a(int, android.view.ViewGroup, boolean):android.view.View");
    }

    @Override // android.view.LayoutInflater
    public android.view.LayoutInflater cloneInContext(android.content.Context context) {
        return new com.tencent.mm.ui.gd(this, context);
    }

    @Override // android.view.LayoutInflater
    public android.view.View inflate(int i17, android.view.ViewGroup viewGroup, boolean z17) {
        java.lang.String str;
        ((kh.n0) ((com.tencent.mm.matrix.k) i95.n0.c(com.tencent.mm.matrix.k.class))).getClass();
        try {
            str = "lid-" + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(i17);
        } catch (java.lang.Exception unused) {
            str = null;
        }
        if (str != null) {
            kh.t3.f307922f.g(str, str.hashCode());
        }
        try {
            return a(i17, viewGroup, z17);
        } finally {
            ((kh.n0) ((com.tencent.mm.matrix.k) i95.n0.c(com.tencent.mm.matrix.k.class))).getClass();
            r2 = str instanceof java.lang.String ? str : null;
            if (r2 != null) {
                kh.t3.f307922f.e(r2, r2.hashCode());
            }
        }
    }
}
