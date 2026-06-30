package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f154064d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f154065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f154068h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.List list, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f154066f = list;
        this.f154067g = i0Var;
        this.f154068h = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h0 h0Var = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h0(this.f154066f, this.f154067g, this.f154068h, continuation);
        h0Var.f154065e = obj;
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f154064d
            com.tencent.mm.ui.widget.dialog.f4 r2 = r8.f154068h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 != r4) goto L15
            java.lang.Object r0 = r8.f154065e
            kotlinx.coroutines.y0 r0 = (kotlinx.coroutines.y0) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5a
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f154065e
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            r1 = 0
            java.util.List r5 = r8.f154066f
            if (r5 == 0) goto L5b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r5.next()
            com.tencent.mm.choosemsgfile.compat.MsgFile r7 = (com.tencent.mm.choosemsgfile.compat.MsgFile) r7
            if (r7 == 0) goto L43
            java.lang.String r7 = r7.f64762e
            goto L44
        L43:
            r7 = r1
        L44:
            if (r7 == 0) goto L32
            r6.add(r7)
            goto L32
        L4a:
            kotlin.jvm.internal.o.d(r2)
            r8.f154065e = r9
            r8.f154064d = r4
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 r9 = r8.f154067g
            java.lang.Object r9 = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0.l7(r9, r2, r6, r4, r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            r1 = r3
        L5b:
            if (r1 != 0) goto L67
            java.lang.String r9 = "MicroMsg.ModProfile.ModImageDescriptionUI"
            java.lang.String r0 = "onGetChatImage tempSelectImagePathList is null"
            com.tencent.mars.xlog.Log.e(r9, r0)
            r2.dismiss()
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
