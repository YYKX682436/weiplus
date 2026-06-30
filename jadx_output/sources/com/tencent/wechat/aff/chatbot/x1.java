package com.tencent.wechat.aff.chatbot;

/* loaded from: classes6.dex */
public enum x1 implements com.tencent.mm.protobuf.h {
    ResponseState_None(0),
    /* JADX INFO: Fake field, exist only in values array */
    ResponseState_ASRStreamingText(1),
    /* JADX INFO: Fake field, exist only in values array */
    ResponseState_Text(2),
    ResponseState_Voice(4),
    /* JADX INFO: Fake field, exist only in values array */
    ResponseState_IgnoreError(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f216545d;

    x1(int i17) {
        this.f216545d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216545d;
    }
}
