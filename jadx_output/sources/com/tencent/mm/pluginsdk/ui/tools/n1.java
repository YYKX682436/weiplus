package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class n1 extends com.tencent.mm.pluginsdk.ui.tools.s1 implements o13.x {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f191780o;

    /* renamed from: p, reason: collision with root package name */
    public p13.c f191781p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f191782q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191783r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, com.tencent.mm.pluginsdk.ui.tools.a2 adapter) {
        super(fileSelectorUI, adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f191783r = fileSelectorUI;
        this.f191780o = new com.tencent.mm.sdk.platformtools.n3();
        this.f191782q = new java.util.ArrayList();
    }

    @Override // o13.x
    public void X2(p13.v ftsResult) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        int i17 = ftsResult.f351158c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "get msgId fail, errorCode:" + ftsResult.f351158c);
        } else if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onFTSSearchEnd, size:" + ftsResult.f351160e.size());
            java.util.Iterator it = ftsResult.f351160e.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) this.f191782q).add(java.lang.Long.valueOf(((p13.y) it.next()).f351186d));
            }
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.n1.d():void");
    }
}
