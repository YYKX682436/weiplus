package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ct extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str) {
        super(0);
        this.f112196d = etVar;
        this.f112197e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f112196d;
        boolean requestFocus = etVar.f112461y.requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) etVar.f365323d.getContext().getSystemService("input_method");
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(etVar.f112461y, 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "[showKVB] imm:" + inputMethodManager + ", result:" + valueOf + ", inputEtFocused:" + requestFocus);
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.FALSE)) {
            pm0.z.b(xy2.b.f458155b, "finder_live_show_soft_input_failed", false, null, null, false, false, new com.tencent.mm.plugin.finder.live.plugin.bt(this.f112197e), 60, null);
            android.content.Context context = etVar.R;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
        }
        nk2.l.f338021a.b(nk2.a.f337958n);
        return jz5.f0.f302826a;
    }
}
