package d04;

/* loaded from: classes15.dex */
public final class d3 implements e04.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f225405a;

    public d3(com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView) {
        this.f225405a = scanSharedMaskView;
    }

    @Override // e04.z2
    public void a() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f225405a;
        scanSharedMaskView.f159803w = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanSharedMaskView", "onShowTaskEnd isFlashShow: %b, showToast: %b", java.lang.Boolean.valueOf(scanSharedMaskView.f159804x), java.lang.Boolean.valueOf(scanSharedMaskView.B));
        if (scanSharedMaskView.f159804x) {
            return;
        }
        if (!scanSharedMaskView.B) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView.d(scanSharedMaskView, true, null, 2, null);
            return;
        }
        scanSharedMaskView.B = false;
        if (scanSharedMaskView.f159802v == null) {
            e04.c3 c3Var = new e04.c3();
            android.widget.TextView textView = scanSharedMaskView.f159790g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("scanToast");
                throw null;
            }
            c3Var.f245878a = textView;
            c3Var.f245879b = 2000L;
            c3Var.f245880c = new d04.e3(scanSharedMaskView);
            scanSharedMaskView.f159802v = c3Var;
        }
        e04.c3 c3Var2 = scanSharedMaskView.f159802v;
        if (c3Var2 != null) {
            c3Var2.b(true);
        }
    }

    @Override // e04.z2
    public void b(boolean z17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f225405a;
        android.widget.TextView textView = scanSharedMaskView.f159788e;
        if (textView != null) {
            textView.setShadowLayer(10.0f, 0.0f, 0.0f, scanSharedMaskView.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        } else {
            kotlin.jvm.internal.o.o("scanTitle");
            throw null;
        }
    }

    @Override // e04.z2
    public void c(boolean z17) {
        this.f225405a.f159803w = true;
    }

    @Override // e04.z2
    public void d(boolean z17) {
    }
}
