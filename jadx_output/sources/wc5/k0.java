package wc5;

/* loaded from: classes10.dex */
public final class k0 extends wm3.a implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444589d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444589d = baseActivity;
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f444589d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r10, xg3.l0 r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.k0.c0(xg3.m0, xg3.l0):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        if (this.f444590e) {
            this.f444590e = false;
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryRevokeUIC", "stopListening");
        }
        super.onFinished();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (xc5.l.f453520q) {
            xc5.l.f453520q = false;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f444589d;
            db5.e1.y(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.pbs), "", this.f444589d.getString(com.tencent.mm.R.string.f490939bb1), null);
        }
    }
}
