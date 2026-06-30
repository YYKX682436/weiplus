package gw5;

/* loaded from: classes11.dex */
public enum a implements com.tencent.mm.protobuf.h {
    BOX_ACTION_UNKNOWN(0),
    BOX_ACTION_APP_FOREGROUND(1),
    BOX_ACTION_APP_BACKGROUND(2),
    BOX_ACTION_MAIN_TAB_EXPOSE(3),
    BOX_ACTION_MAIN_TAB_HIDE(4),
    BOX_ACTION_LOCK_SCREEN(5),
    BOX_ACTION_RECEIVE_NEW_MSG(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f276166d;

    a(int i17) {
        this.f276166d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f276166d;
    }
}
