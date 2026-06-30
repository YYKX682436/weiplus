package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class LongVideoClientInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.LongVideoClientInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.LongVideoClientInfo();
    public boolean is_channel_ui = false;

    public static com.tencent.wechat.aff.newlife.LongVideoClientInfo create() {
        return new com.tencent.wechat.aff.newlife.LongVideoClientInfo();
    }

    public static com.tencent.wechat.aff.newlife.LongVideoClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.LongVideoClientInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.LongVideoClientInfo();
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.LongVideoClientInfo) && n51.f.a(java.lang.Boolean.valueOf(this.is_channel_ui), java.lang.Boolean.valueOf(((com.tencent.wechat.aff.newlife.LongVideoClientInfo) fVar).is_channel_ui));
    }

    public boolean getIsChannelUi() {
        return this.is_channel_ui;
    }

    public boolean getIs_channel_ui() {
        return this.is_channel_ui;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.LongVideoClientInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).a(1, this.is_channel_ui);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.is_channel_ui) + 0;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        this.is_channel_ui = aVar2.c(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo setIsChannelUi(boolean z17) {
        this.is_channel_ui = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo setIs_channel_ui(boolean z17) {
        this.is_channel_ui = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.LongVideoClientInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.LongVideoClientInfo) super.parseFrom(bArr);
    }
}
