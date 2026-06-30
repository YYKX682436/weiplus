package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class n4 extends wm3.a implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f201211d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f201212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f201213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f201211d = baseActivity;
        this.f201213f = "";
    }

    public final void T6() {
        if (this.f201212e) {
            this.f201212e = false;
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryRevokeUIC", "stopListening");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x006e, code lost:
    
        if ((r3 != null && r3.P2()) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0031 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r14, xg3.l0 r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.n4.c0(xg3.m0, xg3.l0):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        T6();
        super.onFinished();
    }
}
