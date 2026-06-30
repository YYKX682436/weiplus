package jm3;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvRouterUI f300312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300312d = musicMvRouterUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jm3.d1(this.f300312d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jm3.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] byteArrayExtra;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = false;
        try {
            byteArrayExtra = this.f300312d.getIntent().getByteArrayExtra("key_track_data");
        } catch (java.lang.Exception unused) {
        }
        if (byteArrayExtra == null) {
            return java.lang.Boolean.FALSE;
        }
        r45.ss4 ss4Var = new r45.ss4();
        ss4Var.parseFrom(byteArrayExtra);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (mvInfo = objectDesc.getMvInfo()) != null && mvInfo.getInteger(6) == 1) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
