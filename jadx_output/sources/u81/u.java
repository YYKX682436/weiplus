package u81;

/* loaded from: classes7.dex */
public enum u {
    NONE(0),
    TO_BACKGROUND(1),
    TO_FOREGROUND(3),
    /* JADX INFO: Fake field, exist only in values array */
    TO_SUSPEND_FROM_BACKGROUND(4),
    AWAKE_IN_BACKGROUND(5),
    CHECK_PROCESS_IMPORTANCE(6),
    ON_SYSTEM_SCREEN_OFF(10),
    /* JADX INFO: Fake field, exist only in values array */
    ON_SUSPEND_TIMEOUT(11),
    ON_DETACH_FROM_STACK(12),
    ON_STOP_BACKGROUND_LOCATION_LISTENING(13),
    ON_STOP_BACKGROUND_LIVE_VOIP(14),
    ON_STOP_AUDIO_BACKGROUND_PLAY(15),
    ON_STOP_BACKGROUND_VOIP_1v1(16),
    ON_STOP_BACKGROUND_BLUETOOTH(17),
    ON_CONTAINER_FORCED_MOVE_TO_BACK(18),
    ON_START_BACKGROUND_BLUETOOTH(19),
    ON_RESET_TO_TOP_OF_STACK(20),
    ON_CONTAINER_ACTIVITY_STOPPED(21),
    ON_SYSTEM_SCREEN_ON(22),
    ON_BACKGROUND_AUDIO_RESUMED(23),
    ON_BACKGROUND_AUDIO_PREEMPTED(24),
    ON_BACKGROUND_AUDIO_STOPPED(25),
    ON_REMOVE_CONTENT_FLOAT_WINDOW(26),
    ON_ADDED_CONTENT_FLOAT_WINDOW(27),
    ON_BACKGROUND_KEEP_FLAGS_CLEARED(100),
    /* JADX INFO: Fake field, exist only in values array */
    AWAKE_MSG_QUEUE(1000);


    /* renamed from: d, reason: collision with root package name */
    public final int f425481d;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(values().length);
        for (u81.u uVar : values()) {
            if (sparseIntArray.indexOfKey(uVar.f425481d) >= 0) {
                iz5.a.h(java.lang.String.format(java.util.Locale.ENGLISH, "duplicated defined intValue in %s", uVar.name()));
                throw null;
            }
            sparseIntArray.put(uVar.f425481d, 1);
        }
    }

    u(int i17) {
        this.f425481d = i17;
    }

    public static u81.u a(int i17) {
        for (u81.u uVar : values()) {
            if (uVar.f425481d == i17) {
                return uVar;
            }
        }
        return NONE;
    }
}
