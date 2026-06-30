package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.q f149382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.mmsight.ui.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f149382d = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mmsight.ui.p(this.f149382d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mmsight.ui.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mmsight.ui.q qVar = this.f149382d;
        com.tencent.mm.plugin.mmsight.ui.a aVar2 = qVar.f149403k;
        if (aVar2 == null) {
            return null;
        }
        float f17 = qVar.f149398f;
        com.tencent.mm.plugin.mmsight.ui.d dVar = (com.tencent.mm.plugin.mmsight.ui.d) aVar2;
        if (f17 <= 100.0f) {
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = dVar.f149306a;
            improveMMSightCircularProgressBar.f149142n = f17;
            improveMMSightCircularProgressBar.invalidate();
        }
        return jz5.f0.f302826a;
    }
}
