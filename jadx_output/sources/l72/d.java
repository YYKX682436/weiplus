package l72;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l72.j f316842f;

    public d(l72.j jVar, int i17, java.lang.String str) {
        this.f316842f = jVar;
        this.f316840d = i17;
        this.f316841e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        l72.j jVar = this.f316842f;
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = jVar.f316853a;
        faceActionUI.f100191x = this.f316840d;
        faceActionUI.f100192y = this.f316841e;
        n72.q qVar = new n72.q(faceActionUI, faceActionUI.A);
        faceActionUI.f100193z = qVar;
        qVar.f335290y = faceActionUI.f100182o;
        qVar.f335291z = faceActionUI.f100179i;
        qVar.A = faceActionUI.f100178h;
        qVar.f335284s = faceActionUI.f100191x;
        qVar.f335285t = faceActionUI.f100192y;
        qVar.D = faceActionUI.f100184q;
        qVar.C = faceActionUI.f100181n;
        qVar.f(faceActionUI.f100180m);
        faceActionUI.f100193z.g();
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI2 = jVar.f316853a;
        faceActionUI2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "preview");
        n72.q qVar2 = faceActionUI2.f100193z;
        if (qVar2 != null) {
            qVar2.f335282q = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        faceActionUI2.f100182o.setText(com.tencent.mm.R.string.c7o);
        jVar.f316853a.D++;
    }
}
