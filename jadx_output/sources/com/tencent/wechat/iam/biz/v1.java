package com.tencent.wechat.iam.biz;

/* loaded from: classes6.dex */
public enum v1 implements com.tencent.mm.protobuf.h {
    INTERACTIVE_GUIDE_SCENE_AFTER_FOLLOW(1),
    /* JADX INFO: Fake field, exist only in values array */
    INTERACTIVE_GUIDE_SCENE_NOTIFY_COMMENT(2),
    INTERACTIVE_GUIDE_SCENE_COMMENT_INPUT(3),
    /* JADX INFO: Fake field, exist only in values array */
    INTERACTIVE_GUIDE_SCENE_NOTIFY_SUBSCRIBE(4),
    /* JADX INFO: Fake field, exist only in values array */
    INTERACTIVE_GUIDE_SCENE_FANS_LIST(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f217800d;

    v1(int i17) {
        this.f217800d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217800d;
    }
}
