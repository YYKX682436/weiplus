package te5;

/* loaded from: classes5.dex */
public final class a2 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f418610d;

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(view, "view");
        if (booleanValue || this.f418610d != 0) {
            if (booleanValue) {
                this.f418610d = java.lang.System.currentTimeMillis();
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f418610d;
                this.f418610d = 0L;
                if (te5.d2.f418627a) {
                    com.tencent.mm.autogen.mmdata.rpt.ChatListTopLoadStruct chatListTopLoadStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatListTopLoadStruct();
                    chatListTopLoadStruct.f55638d = 0;
                    chatListTopLoadStruct.f55639e = (int) currentTimeMillis;
                    chatListTopLoadStruct.o();
                    chatListTopLoadStruct.k();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopLoadExpReport", "no need rpt");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
