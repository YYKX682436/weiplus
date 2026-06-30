package com.tencent.wechat.aff.wcrte;

/* loaded from: classes4.dex */
public enum g implements com.tencent.mm.protobuf.h {
    FavNoteFrom_Unknow(0),
    FavNoteFrom_Chat(1),
    FavNoteFrom_Fav(2),
    FavNoteFrom_Anno(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f217659d;

    g(int i17) {
        this.f217659d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217659d;
    }
}
