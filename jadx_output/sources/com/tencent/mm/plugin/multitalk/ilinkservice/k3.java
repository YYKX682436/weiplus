package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d80 f149675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.u3 f149676e;

    public k3(com.tencent.mm.plugin.multitalk.ilinkservice.u3 u3Var, r45.d80 d80Var) {
        this.f149676e = u3Var;
        this.f149675d = d80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.multitalk.ilinkservice.u3 u3Var = this.f149676e;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = u3Var.f149832c.Y;
        java.lang.String str2 = u3Var.f149830a;
        cVar.getClass();
        dm.f8 O7 = com.tencent.mm.plugin.multitalk.model.e3.Vi().O7(str2);
        if (O7 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "getMultiTalkBannerCreator, roomid:" + O7.field_roomId + " wxgroupid:" + str2 + ", creatorName:" + O7.field_inviteUserName);
            str = O7.field_inviteUserName;
        } else {
            str = null;
        }
        r45.d80 d80Var = this.f149675d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "join success, imroomid:%d, roomid:%d, selfmemberid:%d, createName:%s", java.lang.Long.valueOf(d80Var.f372216d), java.lang.Long.valueOf(d80Var.f372217e), java.lang.Integer.valueOf(d80Var.f372219g), str);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = u3Var.f149832c;
        i4Var.f149637n = 1;
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
        c0Var.f149519c = d80Var.f372216d;
        c0Var.f149518b = d80Var.f372217e;
        c0Var.f149522f = str;
        c0Var.f149524h = u3Var.f149831b;
        c0Var.f149520d = u3Var.f149830a;
        c0Var.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = u3Var.f149832c;
        i4Var2.f149638n2 = true;
        if (i4Var2.f149636m2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: join success! launch activity first!!!");
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var3 = u3Var.f149832c;
            i4Var3.Y.b(i4Var3.f149623f);
        }
        u3Var.f149832c.W(new com.tencent.mm.plugin.multitalk.ilinkservice.j3(this));
    }
}
