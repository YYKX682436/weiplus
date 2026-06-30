package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class k0 implements nv2.i1 {
    @Override // nv2.i1
    public void a(com.tencent.mm.plugin.finder.storage.yj0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f491304lw3, 0).show();
    }

    @Override // nv2.i1
    public void b(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, errMsg);
    }
}
