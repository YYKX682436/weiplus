package wf4;

/* loaded from: classes12.dex */
public class c implements wf4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.g f445646a;

    public c(wf4.g gVar) {
        this.f445646a = gVar;
    }

    @Override // wf4.q
    public void b(final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink upload onFinish resultText is null? : %s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)));
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.c$$b
            @Override // java.lang.Runnable
            public final void run() {
                wf4.c cVar = wf4.c.this;
                java.lang.String str2 = str;
                if (cVar.f445646a.f445679n) {
                    return;
                }
                cVar.f445646a.b();
                wf4.g gVar = cVar.f445646a;
                gVar.A = 0;
                gVar.C = true;
                gVar.c(str2, wf4.f.FINISH, null);
            }
        });
    }

    @Override // wf4.q
    public void d(final int i17, final int i18, final java.lang.String str) {
        com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListener", "ilink upload onError errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                wf4.c cVar = wf4.c.this;
                int i19 = i18;
                int i27 = i17;
                java.lang.String str2 = str;
                if (cVar.f445646a.f445679n) {
                    return;
                }
                wf4.g gVar = cVar.f445646a;
                wf4.f fVar = wf4.f.SERVER_ERROR;
                r45.pv pvVar = new r45.pv();
                pvVar.f383412d = i19;
                pvVar.f383413e = i27;
                pvVar.f383414f = str2;
                gVar.f(fVar, pvVar);
            }
        });
    }
}
