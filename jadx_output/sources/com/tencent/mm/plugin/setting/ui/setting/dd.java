package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes2.dex */
public final class dd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f160941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160942e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.dd(this.f160942e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.dd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f160941d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.dw3 dw3Var = new r45.dw3();
            dw3Var.f372776d = this.f160942e;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 9461;
            lVar.f70666c = "/cgi-bin/micromsg-bin/HearingAidModeSet";
            lVar.f70664a = dw3Var;
            lVar.f70665b = new r45.ew3();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f160941d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidModeCgi", "errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        return jz5.f0.f302826a;
    }
}
