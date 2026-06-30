package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class s0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156312d;

    public s0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156312d = b1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable != null ? editable.length() : 0;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156312d;
        if (length <= 0) {
            android.widget.ImageView imageView = b1Var.f156175p;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            b1Var.f156181v = editable != null ? editable.toString() : null;
            b1Var.A();
            return;
        }
        android.widget.ImageView imageView2 = b1Var.f156175p;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        b1Var.f156181v = editable != null ? editable.toString() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f156181v)) {
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_music_search_direct_search_enabel, bm5.h0.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.XConfigUtil", "enableDirectSearch: " + z17);
        if (z17) {
            b1Var.A();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
