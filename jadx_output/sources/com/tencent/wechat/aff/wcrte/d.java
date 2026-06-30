package com.tencent.wechat.aff.wcrte;

/* loaded from: classes16.dex */
public enum d implements com.tencent.mm.protobuf.h {
    RTEAttributeNodeType_Unknown(0),
    RTEAttributeNodeType_Image(1),
    RTEAttributeNodeType_Video(2),
    RTEAttributeNodeType_File(3),
    RTEAttributeNodeType_Location(4),
    RTEAttributeNodeType_Voice(5),
    RTEAttributeNodeType_ChatVoice(6),
    RTEAttributeNodeType_Gif(7),
    RTEAttributeNodeType_WebPage(8),
    RTEAttributeNodeType_Font(10000),
    RTEAttributeNodeType_UnorderList(10001),
    RTEAttributeNodeType_OrderList(10002),
    RTEAttributeNodeType_Todo(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL),
    RTEAttributeNodeType_ListContent(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID),
    RTEAttributeNodeType_Hr(10005),
    RTEAttributeNodeType_Quote(10006),
    RTEAttributeNodeType_Tab(10007),
    RTEAttributeNodeType_Wemoji(11000),
    RTEAttributeNodeType_ConvertedText(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL),
    RTEAttributeNodeType_MD_Unknown(30000);


    /* renamed from: d, reason: collision with root package name */
    public final int f217647d;

    d(int i17) {
        this.f217647d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217647d;
    }
}
