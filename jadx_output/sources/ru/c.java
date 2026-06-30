package ru;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru.j f399552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ru.j jVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f399552d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ru.c(this.f399552d, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ru.c) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ru.j jVar = this.f399552d;
        oi3.e eVar = jVar.f399580i.f412188j;
        java.lang.String string = eVar != null ? eVar.getString(eVar.f345617d + 3) : null;
        oi3.e eVar2 = jVar.f399580i.f412188j;
        com.tencent.mm.storage.f9 k17 = e0Var.k(string, eVar2 != null ? eVar2.getLong(eVar2.f345617d + 0) : 0L);
        if (k17 == null) {
            return null;
        }
        k17.r1(1);
        oi3.e eVar3 = jVar.f399580i.f412188j;
        if (eVar3 == null || (str = eVar3.getString(eVar3.f345617d + 3)) == null) {
            str = "";
        }
        k17.e1(c01.w9.o(str));
        k17.j1(1);
        e0Var.s(k17.Q0(), k17.getMsgId(), k17);
        com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent updateFailedMsgIdEvent = new com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent();
        long msgId = k17.getMsgId();
        am.vz vzVar = updateFailedMsgIdEvent.f54916g;
        vzVar.f8228a = msgId;
        vzVar.f8230c = k17.Q0();
        vzVar.f8229b = k17.getMsgId();
        vzVar.f8231d = k17.Q0();
        return java.lang.Boolean.valueOf(updateFailedMsgIdEvent.e());
    }
}
