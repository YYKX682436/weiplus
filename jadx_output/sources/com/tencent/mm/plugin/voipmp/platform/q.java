package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes6.dex */
public enum q implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN_STATE_UNSPECIFIED(0),
    SCREEN_STATE_SCREEN_ON(1),
    SCREEN_STATE_SCREEN_OFF(2),
    SCREEN_STATE_USER_PRESENT(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f177283d;

    q(int i17) {
        this.f177283d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177283d;
    }
}
