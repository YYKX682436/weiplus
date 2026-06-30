package ew5;

/* loaded from: classes11.dex */
public enum a implements com.tencent.mm.protobuf.h {
    ACTION_UNKNOWN(0),
    ACTION_APP_FOREGROUND(1),
    ACTION_APP_BACKGROUND(2),
    ACTION_MAIN_TAB_EXPOSE(3),
    ACTION_MAIN_TAB_HIDE(4),
    ACTION_LOCK_SCREEN(5),
    ACTION_RECEIVE_NEW_MSG(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f257089d;

    a(int i17) {
        this.f257089d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f257089d;
    }
}
