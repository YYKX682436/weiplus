package com.tencent.wechat.aff;

/* loaded from: classes4.dex */
public class IlinkAddMsgCmd extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkAddMsgCmd DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkAddMsgCmd();
    private java.lang.String Content;
    private long CreateTime;
    private java.lang.String FromUsername;
    private long Id;
    private int MsgType;
    private java.lang.String PushContent;
    private java.lang.String RoomName;
    private long Seq;
    private long Status;
    private java.lang.String ToUsername;
    private final boolean[] hasSetFields = new boolean[11];

    public static com.tencent.wechat.aff.IlinkAddMsgCmd create() {
        return new com.tencent.wechat.aff.IlinkAddMsgCmd();
    }

    public static com.tencent.wechat.aff.IlinkAddMsgCmd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkAddMsgCmd newBuilder() {
        return new com.tencent.wechat.aff.IlinkAddMsgCmd();
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkAddMsgCmd)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkAddMsgCmd ilinkAddMsgCmd = (com.tencent.wechat.aff.IlinkAddMsgCmd) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.Id), java.lang.Long.valueOf(ilinkAddMsgCmd.Id)) && n51.f.a(this.FromUsername, ilinkAddMsgCmd.FromUsername) && n51.f.a(this.ToUsername, ilinkAddMsgCmd.ToUsername) && n51.f.a(this.RoomName, ilinkAddMsgCmd.RoomName) && n51.f.a(java.lang.Integer.valueOf(this.MsgType), java.lang.Integer.valueOf(ilinkAddMsgCmd.MsgType)) && n51.f.a(this.Content, ilinkAddMsgCmd.Content) && n51.f.a(this.PushContent, ilinkAddMsgCmd.PushContent) && n51.f.a(java.lang.Long.valueOf(this.Seq), java.lang.Long.valueOf(ilinkAddMsgCmd.Seq)) && n51.f.a(java.lang.Long.valueOf(this.CreateTime), java.lang.Long.valueOf(ilinkAddMsgCmd.CreateTime)) && n51.f.a(java.lang.Long.valueOf(this.Status), java.lang.Long.valueOf(ilinkAddMsgCmd.Status));
    }

    public java.lang.String getContent() {
        return this.hasSetFields[6] ? this.Content : "";
    }

    public long getCreateTime() {
        return this.CreateTime;
    }

    public java.lang.String getFromUsername() {
        return this.hasSetFields[2] ? this.FromUsername : "";
    }

    public long getId() {
        return this.Id;
    }

    public int getMsgType() {
        return this.MsgType;
    }

    public java.lang.String getPushContent() {
        return this.hasSetFields[7] ? this.PushContent : "";
    }

    public java.lang.String getRoomName() {
        return this.hasSetFields[4] ? this.RoomName : "";
    }

    public long getSeq() {
        return this.Seq;
    }

    public long getStatus() {
        return this.Status;
    }

    public java.lang.String getToUsername() {
        return this.hasSetFields[3] ? this.ToUsername : "";
    }

    public boolean hasContent() {
        return hasFieldNumber(6);
    }

    public boolean hasCreateTime() {
        return hasFieldNumber(9);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFromUsername() {
        return hasFieldNumber(2);
    }

    public boolean hasId() {
        return hasFieldNumber(1);
    }

    public boolean hasMsgType() {
        return hasFieldNumber(5);
    }

    public boolean hasPushContent() {
        return hasFieldNumber(7);
    }

    public boolean hasRoomName() {
        return hasFieldNumber(4);
    }

    public boolean hasSeq() {
        return hasFieldNumber(8);
    }

    public boolean hasStatus() {
        return hasFieldNumber(10);
    }

    public boolean hasToUsername() {
        return hasFieldNumber(3);
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkAddMsgCmd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.Id);
            }
            java.lang.String str = this.FromUsername;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.ToUsername;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.RoomName;
            if (str3 != null && this.hasSetFields[4]) {
                fVar.j(4, str3);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.MsgType);
            }
            java.lang.String str4 = this.Content;
            if (str4 != null && this.hasSetFields[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.PushContent;
            if (str5 != null && this.hasSetFields[7]) {
                fVar.j(7, str5);
            }
            if (this.hasSetFields[8]) {
                fVar.h(8, this.Seq);
            }
            if (this.hasSetFields[9]) {
                fVar.h(9, this.CreateTime);
            }
            if (this.hasSetFields[10]) {
                fVar.h(10, this.Status);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.Id) : 0;
            java.lang.String str6 = this.FromUsername;
            if (str6 != null && this.hasSetFields[2]) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.ToUsername;
            if (str7 != null && this.hasSetFields[3]) {
                h17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.RoomName;
            if (str8 != null && this.hasSetFields[4]) {
                h17 += b36.f.j(4, str8);
            }
            if (this.hasSetFields[5]) {
                h17 += b36.f.e(5, this.MsgType);
            }
            java.lang.String str9 = this.Content;
            if (str9 != null && this.hasSetFields[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.PushContent;
            if (str10 != null && this.hasSetFields[7]) {
                h17 += b36.f.j(7, str10);
            }
            if (this.hasSetFields[8]) {
                h17 += b36.f.h(8, this.Seq);
            }
            if (this.hasSetFields[9]) {
                h17 += b36.f.h(9, this.CreateTime);
            }
            return this.hasSetFields[10] ? h17 + b36.f.h(10, this.Status) : h17;
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
        switch (intValue) {
            case 1:
                this.Id = aVar2.i(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.FromUsername = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.ToUsername = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.RoomName = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.MsgType = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.Content = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.PushContent = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.Seq = aVar2.i(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.CreateTime = aVar2.i(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.Status = aVar2.i(intValue);
                this.hasSetFields[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setContent(java.lang.String str) {
        this.Content = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setCreateTime(long j17) {
        this.CreateTime = j17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setFromUsername(java.lang.String str) {
        this.FromUsername = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setId(long j17) {
        this.Id = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setMsgType(int i17) {
        this.MsgType = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setPushContent(java.lang.String str) {
        this.PushContent = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setRoomName(java.lang.String str) {
        this.RoomName = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setSeq(long j17) {
        this.Seq = j17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setStatus(long j17) {
        this.Status = j17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd setToUsername(java.lang.String str) {
        this.ToUsername = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAddMsgCmd mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkAddMsgCmd parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkAddMsgCmd) super.parseFrom(bArr);
    }
}
