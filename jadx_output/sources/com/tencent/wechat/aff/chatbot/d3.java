package com.tencent.wechat.aff.chatbot;

/* loaded from: classes13.dex */
public enum d3 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_UNKNOWN(0),
    HANGUP_REASON_MANUAL(1),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_BUSY_PHONE(2),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_BUSY_OTHER(3),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_PHONE_BROKEN(6),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_APP_BROKEN(7),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_DEVICE_FAIL(8),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_REPLY_BY_OTHER(9),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_LAST_MEMBER(10),
    /* JADX INFO: Fake field, exist only in values array */
    HANGUP_REASON_OTHER(11);


    /* renamed from: d, reason: collision with root package name */
    public final int f216157d;

    d3(int i17) {
        this.f216157d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216157d;
    }
}
