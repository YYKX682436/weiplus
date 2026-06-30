package fl;

/* loaded from: classes12.dex */
public final class c extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f263693k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f263694l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f263695m;

    public c(yz5.l onStartRecord) {
        kotlin.jvm.internal.o.g(onStartRecord, "onStartRecord");
        this.f263693k = onStartRecord;
        i();
        ym1.f.f463134h.h(this, "record");
        this.f263694l = new com.tencent.mm.sdk.platformtools.n3(new fl.b(this));
    }

    public final void C() {
        this.f263694l.removeCallbacksAndMessages(null);
        if (this.f263695m) {
            q("record");
            this.f263695m = false;
        }
        ym1.f.f463134h.o("record");
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (i17 == 2 || i17 == 3) {
            java.lang.Object obj = null;
            this.f263694l.removeCallbacksAndMessages(null);
            java.util.Iterator it = this.f455170b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b((java.lang.String) next, "record")) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceRecorderAudioManager", "checkIfSomeRequestAvailable available");
                this.f263693k.invoke(java.lang.Boolean.TRUE);
            }
        }
    }
}
