package e42;

/* loaded from: classes.dex */
public enum l0 {
    MM_DEFAULT(0),
    MMAppMgr_Activated(1),
    MMAppMgr_Deactivated(2),
    MMLifeCall_OnResume(3),
    MMLifeCall_OnPause(4),
    MMActivity_OnResume(5),
    MMActivity_OnPause(6),
    MMActivity_Back2Front(7),
    MMActivity_Front2Back(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f249342d;

    l0(int i17) {
        this.f249342d = i17;
    }

    public static e42.l0 a(int i17) {
        switch (i17) {
            case 1:
                return MMAppMgr_Activated;
            case 2:
                return MMAppMgr_Deactivated;
            case 3:
                return MMLifeCall_OnResume;
            case 4:
                return MMLifeCall_OnPause;
            case 5:
                return MMActivity_OnResume;
            case 6:
                return MMActivity_OnPause;
            case 7:
                return MMActivity_Back2Front;
            case 8:
                return MMActivity_Front2Back;
            default:
                return MM_DEFAULT;
        }
    }
}
