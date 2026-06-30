package mg3;

/* loaded from: classes7.dex */
public abstract class p {
    public static final java.lang.String a(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "<this>");
        int action = motionEvent.getAction();
        int i17 = action & 255;
        int i18 = (action & 65280) >> 8;
        switch (i17) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MOVE";
            case 3:
                return "ACTION_CANCEL";
            case 4:
                return "ACTION_OUTSIDE";
            case 5:
                return "ACTION_POINTER_DOWN (pointer " + i18 + ')';
            case 6:
                return "ACTION_POINTER_UP (pointer " + i18 + ')';
            default:
                return "UNKNOWN_ACTION (" + i17 + ')';
        }
    }

    public static final java.lang.String b(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        return "{" + kz5.n0.g0(list, ",", null, null, 0, null, mg3.o.f326252d, 30, null) + '}';
    }
}
