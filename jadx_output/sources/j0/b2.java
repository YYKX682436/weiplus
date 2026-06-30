package j0;

/* loaded from: classes16.dex */
public final class b2 implements j0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296218a;

    public b2(yz5.l lVar) {
        this.f296218a = lVar;
    }

    @Override // j0.a2
    public j0.z1 a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        n1.b bVar = new n1.b(event);
        yz5.l lVar = this.f296218a;
        if (((java.lang.Boolean) lVar.invoke(bVar)).booleanValue() && event.isShiftPressed()) {
            long a17 = n1.c.a(event);
            int i17 = j0.y2.f296669w;
            if (n1.a.a(a17, j0.y2.f296652f)) {
                return j0.z1.REDO;
            }
            return null;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.invoke(new n1.b(event))).booleanValue();
        j0.z1 z1Var = j0.z1.CUT;
        j0.z1 z1Var2 = j0.z1.PASTE;
        if (booleanValue) {
            long a18 = n1.c.a(event);
            int i18 = j0.y2.f296669w;
            if (n1.a.a(a18, j0.y2.f296648b) ? true : n1.a.a(a18, j0.y2.f296662p)) {
                return j0.z1.COPY;
            }
            if (!n1.a.a(a18, j0.y2.f296650d)) {
                if (!n1.a.a(a18, j0.y2.f296651e)) {
                    if (n1.a.a(a18, j0.y2.f296647a)) {
                        return j0.z1.SELECT_ALL;
                    }
                    if (n1.a.a(a18, j0.y2.f296652f)) {
                        return j0.z1.UNDO;
                    }
                    return null;
                }
                return z1Var;
            }
            return z1Var2;
        }
        if (event.isCtrlPressed()) {
            return null;
        }
        if (event.isShiftPressed()) {
            long a19 = n1.c.a(event);
            int i19 = j0.y2.f296669w;
            if (n1.a.a(a19, j0.y2.f296654h)) {
                return j0.z1.SELECT_LEFT_CHAR;
            }
            if (n1.a.a(a19, j0.y2.f296655i)) {
                return j0.z1.SELECT_RIGHT_CHAR;
            }
            if (n1.a.a(a19, j0.y2.f296656j)) {
                return j0.z1.SELECT_UP;
            }
            if (n1.a.a(a19, j0.y2.f296657k)) {
                return j0.z1.SELECT_DOWN;
            }
            if (n1.a.a(a19, j0.y2.f296658l)) {
                return j0.z1.SELECT_PAGE_UP;
            }
            if (n1.a.a(a19, j0.y2.f296659m)) {
                return j0.z1.SELECT_PAGE_DOWN;
            }
            if (n1.a.a(a19, j0.y2.f296660n)) {
                return j0.z1.SELECT_LINE_START;
            }
            if (n1.a.a(a19, j0.y2.f296661o)) {
                return j0.z1.SELECT_LINE_END;
            }
            if (!n1.a.a(a19, j0.y2.f296662p)) {
                return null;
            }
        } else {
            long a27 = n1.c.a(event);
            int i27 = j0.y2.f296669w;
            if (n1.a.a(a27, j0.y2.f296654h)) {
                return j0.z1.LEFT_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f296655i)) {
                return j0.z1.RIGHT_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f296656j)) {
                return j0.z1.UP;
            }
            if (n1.a.a(a27, j0.y2.f296657k)) {
                return j0.z1.DOWN;
            }
            if (n1.a.a(a27, j0.y2.f296658l)) {
                return j0.z1.PAGE_UP;
            }
            if (n1.a.a(a27, j0.y2.f296659m)) {
                return j0.z1.PAGE_DOWN;
            }
            if (n1.a.a(a27, j0.y2.f296660n)) {
                return j0.z1.LINE_START;
            }
            if (n1.a.a(a27, j0.y2.f296661o)) {
                return j0.z1.LINE_END;
            }
            if (n1.a.a(a27, j0.y2.f296663q)) {
                return j0.z1.NEW_LINE;
            }
            if (n1.a.a(a27, j0.y2.f296664r)) {
                return j0.z1.DELETE_PREV_CHAR;
            }
            if (n1.a.a(a27, j0.y2.f296665s)) {
                return j0.z1.DELETE_NEXT_CHAR;
            }
            if (!n1.a.a(a27, j0.y2.f296666t)) {
                if (!n1.a.a(a27, j0.y2.f296667u)) {
                    if (n1.a.a(a27, j0.y2.f296668v)) {
                        return j0.z1.TAB;
                    }
                    return null;
                }
                return z1Var;
            }
        }
        return z1Var2;
    }
}
