package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s01.h f198792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f198793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f198795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198796i;

    public l(com.tencent.mm.ui.chatting.component.biz.a aVar, boolean z17, s01.h hVar, com.tencent.mm.storage.z3 z3Var, java.lang.String str, boolean z18) {
        this.f198796i = aVar;
        this.f198791d = z17;
        this.f198792e = hVar;
        this.f198793f = z3Var;
        this.f198794g = str;
        this.f198795h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        boolean z17 = this.f198791d;
        com.tencent.mm.storage.z3 z3Var = this.f198793f;
        s01.h hVar = this.f198792e;
        if (!z17 || hVar == null || z3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bizChatInfo:%s  talker:%s", hVar, z3Var);
        } else {
            com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198796i;
            java.lang.String str = this.f198794g;
            aVar.n0(true, str);
            r01.q3.Ri().getClass();
            java.lang.String format = java.lang.String.format("%s;%s;%d", hVar.field_brandUserName, hVar.field_bizChatServId, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str2 = hVar.field_brandUserName;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.g1.K(str2, 7, "EnterpriseChatStatus", format);
            if (this.f198795h) {
                if (hVar.z0()) {
                    s01.y Ni = r01.q3.Ni();
                    java.lang.String str3 = hVar.field_bizChatServId;
                    Ni.getClass();
                    gm0.j1.n().f273288b.g(new s01.h0(str3, str, true));
                } else {
                    java.lang.String str4 = s01.r.f401924a;
                    java.util.List<java.lang.String> w07 = hVar.w0();
                    if (w07 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
                    } else {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        for (java.lang.String str5 : w07) {
                            s01.a0 y07 = r01.q3.Vi().y0(str5);
                            if (y07 != null && y07.u0()) {
                                linkedList.add(str5);
                            }
                        }
                        if (linkedList.size() > 0) {
                            r01.q3.Ni().b(linkedList, hVar.field_brandUserName);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
                        }
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_brandUserName)) {
                java.lang.String z07 = r01.q3.Vi().z0(hVar.field_brandUserName);
                s01.a0 y08 = r01.q3.Vi().y0(z07);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = hVar.field_brandUserName;
                objArr[1] = z07;
                objArr[2] = java.lang.Boolean.valueOf(y08 == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07) || y08 == null || y08.u0() || com.tencent.mm.sdk.platformtools.t8.K0(y08.field_addMemberUrl)) {
                    r01.q3.Ni().h(hVar.field_brandUserName, aVar);
                }
            }
        }
        java.lang.System.currentTimeMillis();
    }
}
