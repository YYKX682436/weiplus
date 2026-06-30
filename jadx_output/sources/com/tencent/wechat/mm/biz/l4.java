package com.tencent.wechat.mm.biz;

/* loaded from: classes6.dex */
public enum l4 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    IAM_BIZ_AUDIO_PLAY_LIST_TYPE_INVALID(0),
    /* JADX INFO: Fake field, exist only in values array */
    IAM_BIZ_AUDIO_PLAY_LIST_TYPE_RECOMMEND(1),
    IAM_BIZ_AUDIO_PLAY_LIST_TYPE_LISTEN_LATER(2),
    /* JADX INFO: Fake field, exist only in values array */
    IAM_BIZ_AUDIO_PLAY_LIST_TYPE_HISTORY(3),
    /* JADX INFO: Fake field, exist only in values array */
    IAM_BIZ_AUDIO_PLAY_LIST_TYPE_STANDARD(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f218303d;

    l4(int i17) {
        this.f218303d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f218303d;
    }
}
