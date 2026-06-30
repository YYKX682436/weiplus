package com.tencent.wechat.aff.ovc;

/* loaded from: classes6.dex */
public enum c implements com.tencent.mm.protobuf.h {
    Normal(0),
    /* JADX INFO: Fake field, exist only in values array */
    TalkFail(-1),
    ServerDisable(-2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217476d;

    c(int i17) {
        this.f217476d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217476d;
    }
}
