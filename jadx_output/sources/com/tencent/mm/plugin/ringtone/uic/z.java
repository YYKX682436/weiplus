package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158553d;

    /* renamed from: e, reason: collision with root package name */
    public int f158554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b0 f158556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158557h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, com.tencent.mm.plugin.ringtone.uic.b0 b0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158555f = str;
        this.f158556g = b0Var;
        this.f158557h = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.z(this.f158555f, this.f158556g, this.f158557h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        vx3.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158554e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vx3.i d17 = mx3.i0.d(this.f158555f);
            java.lang.String str = this.f158555f;
            this.f158553d = d17;
            this.f158554e = 1;
            c17 = xx3.h.f458024a.c(2, 3, 0L, null, 0, 0, str, (r26 & 128) != 0 ? 0 : 0, (r26 & 256) != 0 ? "" : null, this);
            if (c17 == aVar) {
                return aVar;
            }
            iVar = d17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vx3.i iVar2 = (vx3.i) this.f158553d;
            kotlin.ResultKt.throwOnFailure(obj);
            iVar = iVar2;
            c17 = obj;
        }
        rm0.i iVar3 = (rm0.i) c17;
        if (iVar3 != null) {
            java.lang.String str2 = this.f158555f;
            com.tencent.mm.plugin.ringtone.uic.b0 b0Var = this.f158556g;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f158557h;
            if (iVar3.f397421a) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.ringtone.uic.x(u3Var, b0Var, iVar, str2, null), 3, null);
                mx3.i0.m(str2, null, 0L, 4, null);
                px3.j jVar = b0Var.f158346g;
                if (jVar != null) {
                    jVar.f358954i = kotlinx.coroutines.l.d(jVar.f358950e, null, null, new px3.i(str2, jVar, null), 3, null);
                }
                mx3.i0.k(str2, null);
            } else {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.ringtone.uic.y(u3Var, b0Var, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
