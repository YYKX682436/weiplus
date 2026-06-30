package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class o0 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f184555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.p0 f184561g;

    public o0(com.tencent.mm.plugin.webview.ui.tools.fts.p0 p0Var, com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f184561g = p0Var;
        this.f184555a = iEmojiInfo;
        this.f184556b = str;
        this.f184557c = str2;
        this.f184558d = i17;
        this.f184559e = str3;
        this.f184560f = str4;
    }

    @Override // dr.q
    public void a(boolean z17) {
        java.lang.String str = this.f184557c;
        java.lang.String str2 = this.f184556b;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s fail", str2, str);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.p0 p0Var = this.f184561g;
        java.lang.String z96 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.z9(p0Var.f184581b, this.f184555a);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s emojiPath %s exist %b", str2, str, z96, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(z96)));
        p0Var.f184581b.s9().G(this.f184556b, this.f184557c, this.f184558d, !z17 ? 1 : 0, this.f184559e, this.f184560f);
    }
}
