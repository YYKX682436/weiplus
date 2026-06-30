package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f137138d;

    /* renamed from: e, reason: collision with root package name */
    public int f137139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.j0 f137140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.flash.action.j0 j0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f137140f = j0Var;
        this.f137141g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.flash.action.g0(this.f137140f, this.f137141g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.flash.action.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.flash.action.j0 j0Var;
        java.lang.String str;
        java.lang.Object Hi;
        dn.m mVar;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f137139e;
        java.lang.String str3 = this.f137141g;
        com.tencent.mm.plugin.flash.action.j0 j0Var2 = this.f137140f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(j0Var2.f137150f);
            tz2.q qVar = j0Var2.f137148d;
            if (K0 || !com.tencent.mm.vfs.w6.j(j0Var2.f137150f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionRecordUIC", "cdn upload filePath is empty");
                com.tencent.mm.plugin.flash.action.j0.O6(j0Var2, "", "", str3);
                qVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
                h72.s.e().d();
            } else if (com.tencent.mm.vfs.w6.k(j0Var2.f137150f) <= j0Var2.f137154m) {
                java.lang.String str4 = j0Var2.f137150f;
                dn.m mVar2 = new dn.m();
                mVar2.f241785d = "task_FaceUploadVideoForPaySafetyService";
                mVar2.field_mediaId = com.tencent.mm.plugin.facedetect.model.s0.f(str4);
                mVar2.field_fullpath = str4;
                mVar2.field_thumbpath = "";
                mVar2.field_fileType = 5;
                mVar2.field_talker = "";
                mVar2.field_priority = 2;
                mVar2.field_needStorage = false;
                mVar2.field_isStreamMedia = false;
                mVar2.field_appType = 0;
                mVar2.field_bzScene = 0;
                mVar2.field_largesvideo = 0;
                i95.m c17 = i95.n0.c(sx.b0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                this.f137138d = mVar2;
                this.f137139e = 1;
                j0Var = j0Var2;
                str = "";
                Hi = sx.b0.Hi((sx.b0) c17, mVar2, 0L, null, this, 6, null);
                if (Hi == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionRecordUIC", "file size too big, cancel upload");
                com.tencent.mm.plugin.flash.action.j0.O6(j0Var2, "", "", str3);
                qVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
                h72.s.e().d();
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dn.m mVar3 = (dn.m) this.f137138d;
        kotlin.ResultKt.throwOnFailure(obj);
        mVar = mVar3;
        j0Var = j0Var2;
        str = "";
        Hi = obj;
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) Hi;
        if ((n1Var == null) || n1Var.f71103a != com.tencent.mm.modelcdntran.m1.f71079h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doUploadFailResult] cdn upload failed, mediaId: ");
            sb6.append(mVar.field_mediaId);
            sb6.append(", ret：");
            sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f71105c) : null);
            sb6.append(", action: ");
            sb6.append(n1Var != null ? n1Var.f71103a : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionRecordUIC", sb6.toString());
            str2 = str;
        } else {
            dn.h hVar = n1Var.f71108f;
            str2 = hVar != null ? hVar.field_fileId : null;
            if (str2 == null) {
                str2 = str;
            }
            java.lang.String str5 = hVar != null ? hVar.field_aesKey : null;
            if (str5 != null) {
                str = str5;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionRecordUIC", "[doUploadFailResult] cdn upload success, mediaId:" + mVar.field_mediaId + ", fileId: " + str2 + ", aesKey: " + str);
        }
        com.tencent.mm.plugin.flash.action.j0.O6(j0Var, str2, str, str3);
        j0Var.f137148d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
        h72.s.e().d();
        return jz5.f0.f302826a;
    }
}
