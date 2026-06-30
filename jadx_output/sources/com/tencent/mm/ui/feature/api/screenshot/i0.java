package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208485e;

    public i0(java.lang.String str, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208484d = str;
        this.f208485e = j1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        qj5.s sVar;
        if (((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d) {
            java.lang.String str = this.f208484d;
            qj5.r rVar = new qj5.r(str, com.tencent.mm.storage.z3.R4(str));
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208485e;
            java.lang.ref.WeakReference weakReference = j1Var.f208508q;
            if (weakReference != null && (sVar = (qj5.s) weakReference.get()) != null) {
                ((com.tencent.mm.plugin.finder.viewmodel.component.ry) sVar).a(kz5.b0.c(rVar));
            }
            j1Var.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208564f);
        }
    }
}
