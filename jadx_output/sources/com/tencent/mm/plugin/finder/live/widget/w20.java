package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w20 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120120d;

    /* renamed from: e, reason: collision with root package name */
    public int f120121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f120122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f120123g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120122f = e30Var;
        this.f120123g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.w20(this.f120122f, this.f120123g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.w20) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x016e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0167 -> B:5:0x0169). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.w20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
