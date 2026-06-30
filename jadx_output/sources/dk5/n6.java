package dk5;

/* loaded from: classes8.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f234767e;

    public n6(java.lang.String str, yz5.p pVar) {
        this.f234766d = str;
        this.f234767e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zo3.p.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zo3.p.Ai());
        sb6.append("content_");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "doCheckAndCopyFile filename: " + sb7 + ", ret: " + com.tencent.mm.vfs.w6.d(this.f234766d, sb7, false));
        this.f234767e.invoke(2, sb7);
    }
}
