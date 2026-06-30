package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ld implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f118926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f118927e;

    public ld(com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f118926d = finderLiveDescEditView;
        this.f118927e = mMEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f118926d;
        int i17 = finderLiveDescEditView.f117609i ? 200 : 120;
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        if (com.tencent.mm.ui.tools.v4.e(valueOf, t4Var) > i17) {
            java.lang.String h17 = com.tencent.mm.ui.tools.v4.h(valueOf, i17);
            if (editable != null) {
                try {
                    editable.replace(h17.length(), valueOf.length(), "");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderLiveDescEditView", "etDesc replace: " + e17.getMessage());
                }
            }
        }
        com.tencent.mm.ui.widget.MMEditText this_apply = this.f118927e;
        kotlin.jvm.internal.o.f(this_apply, "$this_apply");
        android.widget.TextView liveDescTextCountTipsTv = finderLiveDescEditView.f117608h.f262255i;
        kotlin.jvm.internal.o.f(liveDescTextCountTipsTv, "liveDescTextCountTipsTv");
        ck5.f b17 = ck5.f.b(this_apply);
        b17.f42561f = 0;
        b17.f42560e = i17;
        b17.f42562g = t4Var;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.finder.live.widget.jd(liveDescTextCountTipsTv, i17));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
