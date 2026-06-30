package l72;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l72.j f316852h;

    public i(l72.j jVar, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f316852h = jVar;
        this.f316848d = str;
        this.f316849e = i17;
        this.f316850f = i18;
        this.f316851g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f316848d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        l72.j jVar = this.f316852h;
        if (K0) {
            jVar.f316853a.f100189v.setText(com.tencent.mm.R.string.c69);
        } else {
            jVar.f316853a.f100189v.setText(str);
            jVar.f316853a.G = 2;
        }
        if (this.f316849e == 1) {
            jVar.f316853a.f100187t.setText(com.tencent.mm.R.string.c7u);
            jVar.f316853a.f100187t.setOnClickListener(new l72.g(this));
        } else {
            jVar.f316853a.f100187t.setText(com.tencent.mm.R.string.c7t);
            jVar.f316853a.f100187t.setOnClickListener(new l72.h(this));
        }
        jVar.f316853a.f100185r.clearAnimation();
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = jVar.f316853a;
        faceActionUI.f100174d.setVisibility(8);
        faceActionUI.f100177g.setVisibility(0);
        faceActionUI.f100185r.clearAnimation();
        faceActionUI.f100181n.setVisibility(0);
        faceActionUI.f100175e.setVisibility(8);
        k72.u.B.f304767y = 3;
        jVar.f316853a.I = 3;
    }
}
