package hx1;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx1.g f285620a;

    public e(hx1.g gVar) {
        this.f285620a = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        hx1.g gVar = this.f285620a;
        if (gVar.f285635m.f295350x.booleanValue()) {
            qx1.q qVar = (qx1.q) gVar.f285634l;
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = qVar.f367309c;
            db5.e1.H(weImageButton.getContext(), weImageButton.getContext().getString(com.tencent.mm.R.string.hub), "", true, new qx1.e(qVar), new qx1.f(qVar));
            gVar.f285635m.f295350x = java.lang.Boolean.FALSE;
        }
        ix1.n nVar = gVar.f285635m;
        long j17 = gVar.f285624b;
        long j18 = 0;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j18 = android.os.SystemClock.elapsedRealtime() - j17;
        }
        nVar.f295343t = (int) com.tencent.mm.plugin.component.editor.u1.j(j18);
        sendEmptyMessageDelayed(4096, 250L);
    }
}
