package e72;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f249890j = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/fdv_v_");

    /* renamed from: d, reason: collision with root package name */
    public tl.w f249894d;

    /* renamed from: e, reason: collision with root package name */
    public yl.b f249895e;

    /* renamed from: a, reason: collision with root package name */
    public e72.d f249891a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f249892b = false;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f249893c = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f249896f = new java.util.ArrayList(5);

    /* renamed from: g, reason: collision with root package name */
    public int f249897g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f249898h = new e72.a(this);

    /* renamed from: i, reason: collision with root package name */
    public final tl.v f249899i = new e72.b(this);

    static {
        fp.m.b().getAbsolutePath();
    }

    public void a(tl.c cVar) {
        synchronized (this.f249896f) {
            this.f249896f.add(cVar);
        }
    }

    public void b() {
        this.f249892b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: face start reset");
        synchronized (this) {
            tl.w wVar = this.f249894d;
            if (wVar != null) {
                wVar.l();
                this.f249894d = null;
            }
            yl.b bVar = this.f249895e;
            if (bVar != null) {
                bVar.d();
                this.f249895e = null;
            }
        }
    }
}
