package yf1;

/* loaded from: classes7.dex */
public class c implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f461633d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f461634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.w f461635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf1.e f461636g;

    public c(yf1.e eVar, androidx.lifecycle.y yVar, tf.w wVar) {
        this.f461636g = eVar;
        this.f461634e = yVar;
        this.f461635f = wVar;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        wf.b bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "checkCanInsertLivePlayer, onStatusChange, status: %s", cVar);
        if ((cVar instanceof fb1.b) && (bVar = this.f461636g.f461638a) != null && bVar.B) {
            final wf.b bVar2 = this.f461636g.f461638a;
            bVar2.getClass();
            bVar2.L(new java.lang.Runnable() { // from class: wf.b$$f
                @Override // java.lang.Runnable
                public final void run() {
                    wf.b bVar3 = wf.b.this;
                    if (bVar3.B) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "unMutePlayInHighPriorityTask");
                        bVar3.B = false;
                        if (bVar3.C) {
                            bVar3.P();
                        }
                    }
                }
            });
        } else if (cVar instanceof fb1.a) {
            this.f461635f.m();
            this.f461633d = true;
        } else if (this.f461633d) {
            this.f461633d = false;
            this.f461635f.o();
        }
    }

    @Override // fb1.h
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f461634e;
    }
}
