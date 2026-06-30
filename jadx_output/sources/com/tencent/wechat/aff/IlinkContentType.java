package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum IlinkContentType implements com.tencent.mm.protobuf.h {
    kIlinkContentTypeDefault(0),
    kIlinkContentTypeProtobuf(1),
    kIlinkContentTypeJson(2);

    public static final int kIlinkContentTypeDefault_VALUE = 0;
    public static final int kIlinkContentTypeJson_VALUE = 2;
    public static final int kIlinkContentTypeProtobuf_VALUE = 1;
    public final int value;

    IlinkContentType(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkContentType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkContentTypeDefault;
        }
        if (i17 == 1) {
            return kIlinkContentTypeProtobuf;
        }
        if (i17 != 2) {
            return null;
        }
        return kIlinkContentTypeJson;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkContentType valueOf(int i17) {
        return forNumber(i17);
    }
}
