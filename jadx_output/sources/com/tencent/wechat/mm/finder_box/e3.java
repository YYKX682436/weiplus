package com.tencent.wechat.mm.finder_box;

/* loaded from: classes4.dex */
public enum e3 implements com.tencent.mm.protobuf.h {
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE(1),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION(2),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY(3),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT(4),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE(5),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW(6),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG(99),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR(100),
    BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY(101);


    /* renamed from: d, reason: collision with root package name */
    public final int f219403d;

    e3(int i17) {
        this.f219403d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219403d;
    }
}
