package mq1;

/* loaded from: classes11.dex */
public class r0 implements com.tencent.mm.modelbase.h2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f330685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq1.s0 f330686e;

    public r0(mq1.s0 s0Var, android.content.Context context) {
        this.f330686e = s0Var;
        this.f330685d = context;
    }

    @Override // com.tencent.mm.modelbase.h2
    public void n(com.tencent.mm.modelbase.r1 r1Var) {
        boolean z17 = l75.d1.f316945a;
        if (l75.d1.f316947c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMCoreInitTask", "onPrepareDispatcher, disable push");
        } else {
            this.f330686e.f330687d.a(this.f330685d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6.f54884h.f7671a) == false) goto L10;
     */
    @Override // com.tencent.mm.modelbase.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(com.tencent.mm.modelbase.r1 r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto La9
            boolean r6 = r6.f70771n
            if (r6 != 0) goto La9
            mq1.s0 r6 = r5.f330686e
            r6.getClass()
            boolean r6 = b21.m.c()
            r7 = 0
            if (r6 == 0) goto L13
            goto L2a
        L13:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r6 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r6.<init>()
            am.oy r0 = r6.f54883g
            r1 = 1
            r0.f7583a = r1
            r6.e()
            am.py r6 = r6.f54884h
            java.lang.String r6 = r6.f7671a
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 != 0) goto L2b
        L2a:
            r1 = r7
        L2b:
            java.lang.String r6 = "MicroMsg.MMCoreInitTask"
            if (r1 != 0) goto L35
            java.lang.String r7 = "can't kill the working process"
            com.tencent.mars.xlog.Log.w(r6, r7)
            return
        L35:
            com.tencent.mm.ui.vb.k()
            com.tencent.mars.xlog.Log.appenderClose()
            com.tencent.mars.WeChatMars.onSingalCrash(r7)
            boolean r0 = com.tencent.paymars.WeChatMars.isEnable()
            if (r0 == 0) goto L47
            com.tencent.paymars.WeChatMars.onSingalCrash(r7)
        L47:
            java.lang.String r0 = "now killing the working process...."
            com.tencent.mars.xlog.Log.e(r6, r0)
            java.util.HashSet r6 = x51.e.f451989a
            byte[] r6 = x51.d.f451977i
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.booter.NotifyReceiver$NotifyService> r1 = com.tencent.mm.booter.NotifyReceiver.NotifyService.class
            r0.<init>(r6, r1)
            j45.l.D(r0)
            mq1.q0 r6 = new mq1.q0
            r6.<init>(r5)
            java.util.List r0 = com.tencent.mm.modelavatar.b1.f70425a
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.m()
            if (r0 != 0) goto L6e
            goto La9
        L6e:
            com.tencent.mm.modelavatar.s0 r0 = com.tencent.mm.modelavatar.d1.Ni()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 2
            l75.k0 r0 = r0.f70539d
            java.lang.String r4 = "select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";"
            android.database.Cursor r0 = r0.f(r4, r2, r3)
        L84:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L92
            java.lang.String r2 = r0.getString(r7)
            r1.add(r2)
            goto L84
        L92:
            r0.close()
            com.tencent.mm.modelavatar.b1.f70425a = r1
            int r7 = r1.size()
            if (r7 > 0) goto L9e
            goto La9
        L9e:
            com.tencent.mm.modelavatar.z0 r7 = com.tencent.mm.modelavatar.b1.f70427c
            com.tencent.mm.modelavatar.a1 r0 = r7.f70581g
            r0.f70423d = r6
            r0 = 10
            r7.c(r0, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq1.r0.o(com.tencent.mm.modelbase.r1, boolean):void");
    }
}
