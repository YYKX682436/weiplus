package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f136451e;

    /* renamed from: f, reason: collision with root package name */
    public int f136452f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f136453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f136454h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f136455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136454h = z17;
        this.f136455i = yeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.xe xeVar = new com.tencent.mm.plugin.finder.viewmodel.component.xe(this.f136454h, this.f136455i, continuation);
        xeVar.f136453g = obj;
        return xeVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.xe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0124 -> B:7:0x0127). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.xe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
