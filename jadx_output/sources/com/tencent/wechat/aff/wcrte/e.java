package com.tencent.wechat.aff.wcrte;

/* loaded from: classes6.dex */
public enum e implements com.tencent.mm.protobuf.h {
    RTEditorScene_Chat(1),
    RTEditorScene_TimeLine(2),
    RTEditorScene_Fav(3),
    /* JADX INFO: Fake field, exist only in values array */
    RTEditorScene_GroupNotice(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f217652d;

    e(int i17) {
        this.f217652d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217652d;
    }
}
