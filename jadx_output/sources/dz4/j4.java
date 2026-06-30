package dz4;

/* loaded from: classes12.dex */
public final class j4 implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI f245315d;

    public j4(com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI weNoteFlutterUI) {
        this.f245315d = weNoteFlutterUI;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        dz4.j0 j0Var;
        com.tencent.wechat.aff.wenote.i iVar;
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f245315d.f188112u);
        if (wi6 == null || (j0Var = (dz4.j0) ((jz5.n) ((ez4.u) wi6).f257947f).getValue()) == null || (iVar = j0Var.f245310b) == null) {
            return;
        }
        iVar.p0();
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        return false;
    }

    @Override // al5.g3
    public boolean d0() {
        return false;
    }

    @Override // al5.g3
    public int e() {
        return 0;
    }

    @Override // al5.g3
    public boolean enableSwipeBack() {
        return true;
    }
}
