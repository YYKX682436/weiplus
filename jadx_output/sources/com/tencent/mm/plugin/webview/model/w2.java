package com.tencent.mm.plugin.webview.model;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/r;", "callback", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w2<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.w2 f183166d = new com.tencent.mm.plugin.webview.model.w2();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("userName", c01.z1.l());
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        bundle.putString("userIcon", com.tencent.mm.modelavatar.g.c((java.lang.String) l17, false, false));
        rVar.a(bundle);
    }
}
