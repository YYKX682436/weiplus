package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f118936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f118937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(r45.kv1 kv1Var, com.tencent.mm.plugin.finder.live.widget.xh xhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118936e = kv1Var;
        this.f118937f = xhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.lh(this.f118936e, this.f118937f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.lh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a1, code lost:
    
        if ((r0.length() > 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cb, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c9, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.lh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
