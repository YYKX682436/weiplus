package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class ReddotInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.ReddotInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.ReddotInfo();
    public long expose_interval = 0;
    public int ctrl_type = 0;
    public com.tencent.mm.protobuf.g bypass_info = com.tencent.mm.protobuf.g.f192155b;
    public long mention_count = 0;

    public static com.tencent.wechat.aff.newlife.ReddotInfo create() {
        return new com.tencent.wechat.aff.newlife.ReddotInfo();
    }

    public static com.tencent.wechat.aff.newlife.ReddotInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.ReddotInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.ReddotInfo();
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.ReddotInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo = (com.tencent.wechat.aff.newlife.ReddotInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.expose_interval), java.lang.Long.valueOf(reddotInfo.expose_interval)) && n51.f.a(java.lang.Integer.valueOf(this.ctrl_type), java.lang.Integer.valueOf(reddotInfo.ctrl_type)) && n51.f.a(this.bypass_info, reddotInfo.bypass_info) && n51.f.a(java.lang.Long.valueOf(this.mention_count), java.lang.Long.valueOf(reddotInfo.mention_count));
    }

    public com.tencent.mm.protobuf.g getBypassInfo() {
        return this.bypass_info;
    }

    public com.tencent.mm.protobuf.g getBypass_info() {
        return this.bypass_info;
    }

    public int getCtrlType() {
        return this.ctrl_type;
    }

    public int getCtrl_type() {
        return this.ctrl_type;
    }

    public long getExposeInterval() {
        return this.expose_interval;
    }

    public long getExpose_interval() {
        return this.expose_interval;
    }

    public long getMentionCount() {
        return this.mention_count;
    }

    public long getMention_count() {
        return this.mention_count;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.ReddotInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.expose_interval);
            fVar.e(2, this.ctrl_type);
            com.tencent.mm.protobuf.g gVar = this.bypass_info;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.mention_count);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.expose_interval) + 0 + b36.f.e(2, this.ctrl_type);
            com.tencent.mm.protobuf.g gVar2 = this.bypass_info;
            if (gVar2 != null) {
                h17 += b36.f.b(3, gVar2);
            }
            return h17 + b36.f.h(4, this.mention_count);
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
        if (intValue == 1) {
            this.expose_interval = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.ctrl_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.bypass_info = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.mention_count = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setBypassInfo(com.tencent.mm.protobuf.g gVar) {
        this.bypass_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setBypass_info(com.tencent.mm.protobuf.g gVar) {
        this.bypass_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setCtrlType(int i17) {
        this.ctrl_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setCtrl_type(int i17) {
        this.ctrl_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setExposeInterval(long j17) {
        this.expose_interval = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setExpose_interval(long j17) {
        this.expose_interval = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setMentionCount(long j17) {
        this.mention_count = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo setMention_count(long j17) {
        this.mention_count = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.ReddotInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.ReddotInfo) super.parseFrom(bArr);
    }
}
