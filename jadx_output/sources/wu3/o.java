package wu3;

/* loaded from: classes5.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449785d;

    public o(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449785d = editorAudioSearchView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable != null ? editable.length() : 0;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449785d;
        if (length <= 0) {
            android.widget.ImageView imageView = editorAudioSearchView.f155962s;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        android.widget.ImageView imageView2 = editorAudioSearchView.f155962s;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        editorAudioSearchView.f155968y = editable != null ? editable.toString() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(editorAudioSearchView.f155968y)) {
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_music_search_direct_search_enabel, bm5.h0.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.XConfigUtil", "enableDirectSearch: " + z17);
        if (z17) {
            editorAudioSearchView.e();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
