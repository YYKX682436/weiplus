package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f160848d;

    /* renamed from: e, reason: collision with root package name */
    public int f160849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd0.j2 f160850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f160851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kd0.j2 j2Var, com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160850f = j2Var;
        this.f160851g = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.b0(this.f160850f, this.f160851g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
