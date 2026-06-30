package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class u4 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.AnonymousClass1 f191943a;

    public u4(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.AnonymousClass1 anonymousClass1) {
        this.f191943a = anonymousClass1;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.this;
        dp.a.makeText(miniQBReaderUI, miniQBReaderUI.getString(com.tencent.mm.R.string.jzm, q75.c.c(str2)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.this;
        dp.a.makeText(miniQBReaderUI, miniQBReaderUI.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
