package oc5;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.b f344388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f344391g;

    public c(oc5.b bVar, int i17, int i18, long j17) {
        this.f344388d = bVar;
        this.f344389e = i17;
        this.f344390f = i18;
        this.f344391g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] N;
        oc5.b bVar = this.f344388d;
        bVar.getClass();
        if (com.tencent.mm.vfs.w6.j("") && (N = com.tencent.mm.vfs.w6.N("", 0, -1)) != null) {
            try {
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(N);
                kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
                bVar.f344384a = b17;
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
            bVar.getClass();
            chatImageWebSearchActionStruct.t("");
            chatImageWebSearchActionStruct.f55627e = this.f344389e;
            chatImageWebSearchActionStruct.f55628f = this.f344390f;
            chatImageWebSearchActionStruct.f55629g = 0;
            chatImageWebSearchActionStruct.r(java.lang.String.valueOf(0L));
            chatImageWebSearchActionStruct.f55632j = 0;
            chatImageWebSearchActionStruct.p("");
            chatImageWebSearchActionStruct.s(bVar.f344384a);
            chatImageWebSearchActionStruct.f55635m = this.f344391g;
            chatImageWebSearchActionStruct.k();
        }
    }
}
