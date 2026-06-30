package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public enum k3 implements com.tencent.mm.protobuf.h {
    BoxFinderShowType_DEFAULT(0),
    BoxFinderShowType_FINDER_NORMAL(1),
    BoxFinderShowType_FINDER_RECOMMEND_HORIZON(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f219588d;

    k3(int i17) {
        this.f219588d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219588d;
    }
}
