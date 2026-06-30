package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes12.dex */
public class SDStatusInfo extends com.tencent.mm.protobuf.f {
    public long eAvailableBlockCount_;
    public int eAvailablePer_;
    public long eAvailableSize_;
    public long eBlockCount_;
    public long eBlockSize_;
    public java.lang.String ePath_;
    public long eTotalSize_;
    public java.lang.String fSystem_;
    public int hasUnRemovable_;
    public int ratioHeavy_;
    public java.lang.String root_;
    public long sAvailableBlockCount_;
    public int sAvailablePer_;
    public long sAvailableSize_;
    public long sBlockCount_;
    public long sBlockSize_;
    public long sTotalSize_;
    public int sizeHeavy_;
    public int useExternal_;
    public int weChatPer_;
    public com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.SDStatusInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.SDStatusInfo sDStatusInfo = (com.tencent.mm.plugin.report.kvdata.SDStatusInfo) fVar;
        return n51.f.a(this.weChatSDInfo_, sDStatusInfo.weChatSDInfo_) && n51.f.a(java.lang.Integer.valueOf(this.weChatPer_), java.lang.Integer.valueOf(sDStatusInfo.weChatPer_)) && n51.f.a(java.lang.Integer.valueOf(this.sizeHeavy_), java.lang.Integer.valueOf(sDStatusInfo.sizeHeavy_)) && n51.f.a(java.lang.Integer.valueOf(this.ratioHeavy_), java.lang.Integer.valueOf(sDStatusInfo.ratioHeavy_)) && n51.f.a(java.lang.Integer.valueOf(this.useExternal_), java.lang.Integer.valueOf(sDStatusInfo.useExternal_)) && n51.f.a(java.lang.Integer.valueOf(this.hasUnRemovable_), java.lang.Integer.valueOf(sDStatusInfo.hasUnRemovable_)) && n51.f.a(java.lang.Long.valueOf(this.sBlockSize_), java.lang.Long.valueOf(sDStatusInfo.sBlockSize_)) && n51.f.a(java.lang.Long.valueOf(this.sBlockCount_), java.lang.Long.valueOf(sDStatusInfo.sBlockCount_)) && n51.f.a(java.lang.Long.valueOf(this.sTotalSize_), java.lang.Long.valueOf(sDStatusInfo.sTotalSize_)) && n51.f.a(java.lang.Long.valueOf(this.sAvailableBlockCount_), java.lang.Long.valueOf(sDStatusInfo.sAvailableBlockCount_)) && n51.f.a(java.lang.Long.valueOf(this.sAvailableSize_), java.lang.Long.valueOf(sDStatusInfo.sAvailableSize_)) && n51.f.a(java.lang.Integer.valueOf(this.sAvailablePer_), java.lang.Integer.valueOf(sDStatusInfo.sAvailablePer_)) && n51.f.a(java.lang.Long.valueOf(this.eBlockSize_), java.lang.Long.valueOf(sDStatusInfo.eBlockSize_)) && n51.f.a(java.lang.Long.valueOf(this.eBlockCount_), java.lang.Long.valueOf(sDStatusInfo.eBlockCount_)) && n51.f.a(java.lang.Long.valueOf(this.eTotalSize_), java.lang.Long.valueOf(sDStatusInfo.eTotalSize_)) && n51.f.a(java.lang.Long.valueOf(this.eAvailableBlockCount_), java.lang.Long.valueOf(sDStatusInfo.eAvailableBlockCount_)) && n51.f.a(java.lang.Long.valueOf(this.eAvailableSize_), java.lang.Long.valueOf(sDStatusInfo.eAvailableSize_)) && n51.f.a(java.lang.Integer.valueOf(this.eAvailablePer_), java.lang.Integer.valueOf(sDStatusInfo.eAvailablePer_)) && n51.f.a(this.ePath_, sDStatusInfo.ePath_) && n51.f.a(this.root_, sDStatusInfo.root_) && n51.f.a(this.fSystem_, sDStatusInfo.fSystem_);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo = this.weChatSDInfo_;
            if (weChatSDInfo != null) {
                fVar.i(1, weChatSDInfo.computeSize());
                this.weChatSDInfo_.writeFields(fVar);
            }
            fVar.e(2, this.weChatPer_);
            fVar.e(3, this.sizeHeavy_);
            fVar.e(4, this.ratioHeavy_);
            fVar.e(5, this.useExternal_);
            fVar.e(6, this.hasUnRemovable_);
            fVar.h(7, this.sBlockSize_);
            fVar.h(8, this.sBlockCount_);
            fVar.h(9, this.sTotalSize_);
            fVar.h(10, this.sAvailableBlockCount_);
            fVar.h(11, this.sAvailableSize_);
            fVar.e(12, this.sAvailablePer_);
            fVar.h(13, this.eBlockSize_);
            fVar.h(14, this.eBlockCount_);
            fVar.h(15, this.eTotalSize_);
            fVar.h(16, this.eAvailableBlockCount_);
            fVar.h(17, this.eAvailableSize_);
            fVar.e(18, this.eAvailablePer_);
            java.lang.String str = this.ePath_;
            if (str != null) {
                fVar.j(19, str);
            }
            java.lang.String str2 = this.root_;
            if (str2 != null) {
                fVar.j(20, str2);
            }
            java.lang.String str3 = this.fSystem_;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo2 = this.weChatSDInfo_;
            int i18 = (weChatSDInfo2 != null ? b36.f.i(1, weChatSDInfo2.computeSize()) + 0 : 0) + b36.f.e(2, this.weChatPer_) + b36.f.e(3, this.sizeHeavy_) + b36.f.e(4, this.ratioHeavy_) + b36.f.e(5, this.useExternal_) + b36.f.e(6, this.hasUnRemovable_) + b36.f.h(7, this.sBlockSize_) + b36.f.h(8, this.sBlockCount_) + b36.f.h(9, this.sTotalSize_) + b36.f.h(10, this.sAvailableBlockCount_) + b36.f.h(11, this.sAvailableSize_) + b36.f.e(12, this.sAvailablePer_) + b36.f.h(13, this.eBlockSize_) + b36.f.h(14, this.eBlockCount_) + b36.f.h(15, this.eTotalSize_) + b36.f.h(16, this.eAvailableBlockCount_) + b36.f.h(17, this.eAvailableSize_) + b36.f.e(18, this.eAvailablePer_);
            java.lang.String str4 = this.ePath_;
            if (str4 != null) {
                i18 += b36.f.j(19, str4);
            }
            java.lang.String str5 = this.root_;
            if (str5 != null) {
                i18 += b36.f.j(20, str5);
            }
            java.lang.String str6 = this.fSystem_;
            return str6 != null ? i18 + b36.f.j(21, str6) : i18;
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
        com.tencent.mm.plugin.report.kvdata.SDStatusInfo sDStatusInfo = (com.tencent.mm.plugin.report.kvdata.SDStatusInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo3 = new com.tencent.mm.plugin.report.kvdata.WeChatSDInfo();
                    if (bArr != null && bArr.length > 0) {
                        weChatSDInfo3.parseFrom(bArr);
                    }
                    sDStatusInfo.weChatSDInfo_ = weChatSDInfo3;
                }
                return 0;
            case 2:
                sDStatusInfo.weChatPer_ = aVar2.g(intValue);
                return 0;
            case 3:
                sDStatusInfo.sizeHeavy_ = aVar2.g(intValue);
                return 0;
            case 4:
                sDStatusInfo.ratioHeavy_ = aVar2.g(intValue);
                return 0;
            case 5:
                sDStatusInfo.useExternal_ = aVar2.g(intValue);
                return 0;
            case 6:
                sDStatusInfo.hasUnRemovable_ = aVar2.g(intValue);
                return 0;
            case 7:
                sDStatusInfo.sBlockSize_ = aVar2.i(intValue);
                return 0;
            case 8:
                sDStatusInfo.sBlockCount_ = aVar2.i(intValue);
                return 0;
            case 9:
                sDStatusInfo.sTotalSize_ = aVar2.i(intValue);
                return 0;
            case 10:
                sDStatusInfo.sAvailableBlockCount_ = aVar2.i(intValue);
                return 0;
            case 11:
                sDStatusInfo.sAvailableSize_ = aVar2.i(intValue);
                return 0;
            case 12:
                sDStatusInfo.sAvailablePer_ = aVar2.g(intValue);
                return 0;
            case 13:
                sDStatusInfo.eBlockSize_ = aVar2.i(intValue);
                return 0;
            case 14:
                sDStatusInfo.eBlockCount_ = aVar2.i(intValue);
                return 0;
            case 15:
                sDStatusInfo.eTotalSize_ = aVar2.i(intValue);
                return 0;
            case 16:
                sDStatusInfo.eAvailableBlockCount_ = aVar2.i(intValue);
                return 0;
            case 17:
                sDStatusInfo.eAvailableSize_ = aVar2.i(intValue);
                return 0;
            case 18:
                sDStatusInfo.eAvailablePer_ = aVar2.g(intValue);
                return 0;
            case 19:
                sDStatusInfo.ePath_ = aVar2.k(intValue);
                return 0;
            case 20:
                sDStatusInfo.root_ = aVar2.k(intValue);
                return 0;
            case 21:
                sDStatusInfo.fSystem_ = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
