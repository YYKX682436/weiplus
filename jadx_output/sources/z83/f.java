package z83;

/* loaded from: classes14.dex */
public final class f implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470738a;

    public f(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470738a = kidsWatchRegGetInfoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(null);
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470738a;
        if (!K0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
            sb6.append((java.lang.Object) kidsWatchRegGetInfoUI.T6().f444002n.getText());
            java.lang.String sb7 = sb6.toString();
            int length = sb7.length() - 1;
            int i18 = 0;
            boolean z17 = false;
            while (i18 <= length) {
                boolean z18 = kotlin.jvm.internal.o.i(sb7.charAt(!z17 ? i18 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    }
                    length--;
                } else if (z18) {
                    i18++;
                } else {
                    z17 = true;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(sb7.subSequence(i18, length + 1).toString())) {
                kidsWatchRegGetInfoUI.T6().f444002n.setText((java.lang.CharSequence) null);
            }
        }
        if (!fp.i.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KidsWatchRegGetInfoUI", "SDcard is not available");
            return false;
        }
        android.graphics.Bitmap bitmap = kidsWatchRegGetInfoUI.f143148o;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (!bitmap.isRecycled() && !kidsWatchRegGetInfoUI.f143147n) {
                kidsWatchRegGetInfoUI.T6().f443991c.setImageBitmap(kidsWatchRegGetInfoUI.f143148o);
                kidsWatchRegGetInfoUI.T6().f443991c.setVisibility(0);
                kidsWatchRegGetInfoUI.T6().f443990b.setVisibility(8);
                kidsWatchRegGetInfoUI.f143147n = true;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|initView2";
    }
}
