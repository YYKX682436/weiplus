package cw5;

/* loaded from: classes6.dex */
public enum d implements com.tencent.mm.protobuf.h {
    BoxOther(0),
    BoxSwitchTab(1),
    BoxAppStateChange(2),
    BoxEnterChatting(3),
    BoxEnterNotifyService(4),
    BoxEnterEcs(5),
    BoxEnterReaderApp(6),
    BoxDoSearch(7),
    BoxShowAppBrandBox(8),
    BoxClickFloatBall(9);


    /* renamed from: d, reason: collision with root package name */
    public final int f224346d;

    d(int i17) {
        this.f224346d = i17;
    }

    public static cw5.d a(int i17) {
        switch (i17) {
            case 0:
                return BoxOther;
            case 1:
                return BoxSwitchTab;
            case 2:
                return BoxAppStateChange;
            case 3:
                return BoxEnterChatting;
            case 4:
                return BoxEnterNotifyService;
            case 5:
                return BoxEnterEcs;
            case 6:
                return BoxEnterReaderApp;
            case 7:
                return BoxDoSearch;
            case 8:
                return BoxShowAppBrandBox;
            case 9:
                return BoxClickFloatBall;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f224346d;
    }
}
