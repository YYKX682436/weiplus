package mz4;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f333277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f333278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333279g;

    public f(mz4.d dVar, int i17, boolean z17, boolean z18) {
        this.f333279g = dVar;
        this.f333276d = i17;
        this.f333277e = z17;
        this.f333278f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        lz4.a aVar;
        lz4.a aVar2;
        synchronized (this) {
            if (this.f333279g.f333229a == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "setHighLightStatus, post:%d, isHighLight:%s, needNotify:%s", java.lang.Integer.valueOf(this.f333276d), java.lang.Boolean.valueOf(this.f333277e), java.lang.Boolean.valueOf(this.f333278f));
            int i17 = this.f333276d;
            if (i17 >= 0 && i17 < this.f333279g.f333229a.size()) {
                iz4.c cVar = (iz4.c) this.f333279g.f333229a.get(this.f333276d);
                if (cVar != null) {
                    boolean z17 = cVar.f296111i;
                    boolean z18 = this.f333277e;
                    if (z17 != z18) {
                        cVar.f296111i = z18;
                        if (this.f333278f && (aVar2 = this.f333279g.f333230b) != null) {
                            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar2).j3(this.f333276d, 0L);
                        }
                    }
                }
            } else if (this.f333276d == -1) {
                for (int i18 = 0; i18 < this.f333279g.f333229a.size(); i18++) {
                    iz4.c cVar2 = (iz4.c) this.f333279g.f333229a.get(i18);
                    if (cVar2 != null) {
                        boolean z19 = cVar2.f296111i;
                        boolean z27 = this.f333277e;
                        if (z19 != z27) {
                            cVar2.f296111i = z27;
                            if (this.f333278f && (aVar = this.f333279g.f333230b) != null) {
                                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).j3(i18, 0L);
                            }
                        }
                    }
                }
            }
        }
    }
}
