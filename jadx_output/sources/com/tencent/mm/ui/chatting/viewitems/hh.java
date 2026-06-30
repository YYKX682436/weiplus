package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hh implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f204111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f204112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204113c;

    public hh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, boolean z17, boolean z18) {
        this.f204113c = chattingItemDyeingTemplate;
        this.f204111a = z17;
        this.f204112b = z18;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "onSubscribeMsgStateChang onError");
        yb5.d dVar = this.f204113c.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // e31.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r8, e31.j r9) {
        /*
            r7 = this;
            boolean r8 = r9.f247075a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r0 = r9.f247076b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r9.f247078d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r9 = r9.f247080f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0, r1, r9}
            java.lang.String r9 = "MicroMsg.ChattingItemDyeingTemplate"
            java.lang.String r0 = "onSubscribeMsgStateChang onFinish isSubscribed: %b, switchOpen: %b, isAcceptWithAudio: %b, isAcceptWithForceNotify: %b"
            com.tencent.mars.xlog.Log.i(r9, r0, r8)
            boolean r8 = r7.f204111a
            if (r8 == 0) goto Lbd
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r8 = r7.f204113c
            boolean r9 = r7.f204112b
            r0 = 0
            if (r9 == 0) goto La4
            yb5.d r1 = r8.f203175s
            com.tencent.mm.ui.chatting.manager.c r1 = r1.f460708c
            java.lang.Class<sb5.g0> r2 = sb5.g0.class
            yn.e r1 = r1.a(r2)
            sb5.g0 r1 = (sb5.g0) r1
            com.tencent.mm.ui.chatting.component.n7 r1 = (com.tencent.mm.ui.chatting.component.n7) r1
            yb5.d r2 = r1.f198580d
            android.app.Activity r2 = r2.g()
            if (r2 != 0) goto L45
            goto La4
        L45:
            com.tencent.mm.sdk.platformtools.o4 r2 = com.tencent.mm.sdk.platformtools.o4.L()
            java.lang.String r3 = "appbrand_subscribe_msg_force_notify_template_show_guide"
            boolean r2 = r2.getBoolean(r3, r0)
            if (r2 != 0) goto La4
            fl1.c0 r2 = new fl1.c0
            yb5.d r4 = r1.f198580d
            android.app.Activity r4 = r4.g()
            r5 = 0
            r2.<init>(r4, r5)
            m31.c0 r4 = new m31.c0
            yb5.d r5 = r1.f198580d
            android.app.Activity r5 = r5.g()
            r4.<init>(r5)
            db5.d5 r5 = new db5.d5
            r5.<init>(r2)
            r1.f199563v = r5
            r6 = -1
            r5.setWidth(r6)
            db5.d5 r5 = r1.f199563v
            r5.setHeight(r6)
            com.tencent.mm.ui.chatting.component.n7$$a r5 = new com.tencent.mm.ui.chatting.component.n7$$a
            r5.<init>()
            r4.f323128g = r5
            r2.c(r4)
            db5.d5 r2 = r1.f199563v
            yb5.d r1 = r1.f198580d
            android.app.Activity r1 = r1.g()
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.View r1 = r1.getRootView()
            r4 = 48
            r2.showAtLocation(r1, r4, r0, r0)
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.L()
            r2 = 1
            r1.putBoolean(r3, r2)
            goto La5
        La4:
            r2 = r0
        La5:
            if (r2 != 0) goto Lbd
            if (r9 == 0) goto Lad
            r9 = 2131772714(0x7f10452a, float:1.9176795E38)
            goto Lb0
        Lad:
            r9 = 2131772713(0x7f104529, float:1.9176793E38)
        Lb0:
            yb5.d r8 = r8.f203175s
            android.app.Activity r8 = r8.g()
            android.widget.Toast r8 = db5.t7.makeText(r8, r9, r0)
            r8.show()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.hh.b(java.lang.String, e31.j):void");
    }
}
