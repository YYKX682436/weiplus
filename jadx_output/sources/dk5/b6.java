package dk5;

/* loaded from: classes2.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.y0 f234531e;

    public b6(dk5.s5 s5Var, android.content.Context context, tg3.y0 y0Var) {
        this.f234530d = context;
        this.f234531e = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean i17 = com.tencent.mm.ui.chatting.hd.i(this.f234530d);
        android.content.Context context = this.f234530d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean e17 = com.tencent.wework.api.WWAPIFactory.a(context).e();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "isSupportBufferMsgForward:%s costTime:%s", java.lang.Boolean.valueOf(e17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMgr", "isSupportForwardToWeWork: isSupportForwardToWeWork:%s isSupportBufferMsgForward:%s", java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(e17));
        ((ku5.t0) ku5.t0.f312615d).B(new dk5.a6(this, e17, i17));
    }
}
