package tx4;

/* loaded from: classes8.dex */
public enum h {
    HVGAME_MENU_ACTION_DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_JUMP_H5(1),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_EXIT(2),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_SHARE_TO_FRIEND(3),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_COLLECT(4),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_REFRESH(7),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_ADD_TO_DESKTOP(8),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_COMPLAINT(9),
    /* JADX INFO: Fake field, exist only in values array */
    HVGAME_MENU_ACTION_CUSTOM(10);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.EnumMap f422687f = new java.util.EnumMap(tx4.h.class);

    /* renamed from: d, reason: collision with root package name */
    public final int f422689d;

    static {
        java.util.Iterator it = java.util.EnumSet.allOf(tx4.h.class).iterator();
        while (it.hasNext()) {
            tx4.h hVar = (tx4.h) it.next();
            f422687f.put((java.util.EnumMap) hVar, (tx4.h) java.lang.Integer.valueOf(hVar.f422689d));
        }
    }

    h(int i17) {
        this.f422689d = i17;
    }
}
