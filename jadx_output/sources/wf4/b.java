package wf4;

/* loaded from: classes12.dex */
public class b implements wf4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.g f445636a;

    public b(wf4.g gVar) {
        this.f445636a = gVar;
    }

    public void a(final int i17, final int i18, final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink check result: error, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$c
            @Override // java.lang.Runnable
            public final void run() {
                wf4.b bVar = wf4.b.this;
                int i19 = i18;
                int i27 = i17;
                java.lang.String str2 = str;
                if (bVar.f445636a.f445679n) {
                    return;
                }
                wf4.g gVar = bVar.f445636a;
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
