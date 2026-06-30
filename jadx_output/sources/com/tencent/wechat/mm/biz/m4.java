package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public enum m4 implements com.tencent.mm.protobuf.h {
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE(1),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION(2),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY(3),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT(4),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE(5),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW(6),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG(99),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR(100),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY(101),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_WORKS_ENTRY(102),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_PROFILE(103),
    IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_GREET_MSG(104);


    /* renamed from: d, reason: collision with root package name */
    public final int f218354d;

    m4(int i17) {
        this.f218354d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f218354d;
    }
}
