package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class s2 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f191891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oa.i f191892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f191894d;

    public s2(java.lang.Object obj, oa.i iVar, com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, int i17) {
        this.f191891a = obj;
        this.f191892b = iVar;
        this.f191893c = fileSelectorUI;
        this.f191894d = i17;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        boolean z17 = !(iArr.length == 0);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191893c;
        if (!z17 || iArr[0] != 0) {
            db5.e1.C(fileSelectorUI.getContext(), fileSelectorUI.getContext().getString(com.tencent.mm.R.string.hhp), fileSelectorUI.getContext().getString(com.tencent.mm.R.string.hht), fileSelectorUI.getContext().getString(com.tencent.mm.R.string.g6z), fileSelectorUI.getContext().getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.pluginsdk.ui.tools.q2(fileSelectorUI), new com.tencent.mm.pluginsdk.ui.tools.r2(fileSelectorUI));
            return;
        }
        ((com.tencent.mm.pluginsdk.ui.tools.j7) this.f191891a).a(true);
        this.f191892b.b();
        com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
        fileSelectorUI.j7(this.f191894d);
    }
}
