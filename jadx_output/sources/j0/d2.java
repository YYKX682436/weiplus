package j0;

/* loaded from: classes16.dex */
public final class d2 implements j0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.a2 f296259a;

    public d2(j0.a2 a2Var) {
        this.f296259a = a2Var;
    }

    @Override // j0.a2
    public j0.z1 a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        j0.z1 z1Var = null;
        if (event.isShiftPressed() && event.isCtrlPressed()) {
            long a17 = n1.c.a(event);
            int i17 = j0.y2.f296669w;
            if (n1.a.a(a17, j0.y2.f296654h)) {
                z1Var = j0.z1.SELECT_LEFT_WORD;
            } else if (n1.a.a(a17, j0.y2.f296655i)) {
                z1Var = j0.z1.SELECT_RIGHT_WORD;
            } else if (n1.a.a(a17, j0.y2.f296656j)) {
                z1Var = j0.z1.SELECT_PREV_PARAGRAPH;
            } else if (n1.a.a(a17, j0.y2.f296657k)) {
                z1Var = j0.z1.SELECT_NEXT_PARAGRAPH;
            }
        } else if (event.isCtrlPressed()) {
            long a18 = n1.c.a(event);
            int i18 = j0.y2.f296669w;
            if (n1.a.a(a18, j0.y2.f296654h)) {
                z1Var = j0.z1.LEFT_WORD;
            } else if (n1.a.a(a18, j0.y2.f296655i)) {
                z1Var = j0.z1.RIGHT_WORD;
            } else if (n1.a.a(a18, j0.y2.f296656j)) {
                z1Var = j0.z1.PREV_PARAGRAPH;
            } else if (n1.a.a(a18, j0.y2.f296657k)) {
                z1Var = j0.z1.NEXT_PARAGRAPH;
            } else if (n1.a.a(a18, j0.y2.f296649c)) {
                z1Var = j0.z1.DELETE_PREV_CHAR;
            } else if (n1.a.a(a18, j0.y2.f296665s)) {
                z1Var = j0.z1.DELETE_NEXT_WORD;
            } else if (n1.a.a(a18, j0.y2.f296664r)) {
                z1Var = j0.z1.DELETE_PREV_WORD;
            } else if (n1.a.a(a18, j0.y2.f296653g)) {
                z1Var = j0.z1.DESELECT;
            }
        } else if (event.isShiftPressed()) {
            long a19 = n1.c.a(event);
            int i19 = j0.y2.f296669w;
            if (n1.a.a(a19, j0.y2.f296660n)) {
                z1Var = j0.z1.SELECT_HOME;
            } else if (n1.a.a(a19, j0.y2.f296661o)) {
                z1Var = j0.z1.SELECT_END;
            }
        }
        return z1Var == null ? this.f296259a.a(event) : z1Var;
    }
}
