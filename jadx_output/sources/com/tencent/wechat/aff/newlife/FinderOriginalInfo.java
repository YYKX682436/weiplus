package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderOriginalInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderOriginalInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderOriginalInfo();
    public int rest_repost_count = 0;
    public int rest_apply_original_count = 0;
    public int rest_punish_day = 0;
    public int punish_year_flag = 0;
    public int post_need_check_flag = 0;

    public static com.tencent.wechat.aff.newlife.FinderOriginalInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderOriginalInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderOriginalInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderOriginalInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderOriginalInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderOriginalInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderOriginalInfo finderOriginalInfo = (com.tencent.wechat.aff.newlife.FinderOriginalInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.rest_repost_count), java.lang.Integer.valueOf(finderOriginalInfo.rest_repost_count)) && n51.f.a(java.lang.Integer.valueOf(this.rest_apply_original_count), java.lang.Integer.valueOf(finderOriginalInfo.rest_apply_original_count)) && n51.f.a(java.lang.Integer.valueOf(this.rest_punish_day), java.lang.Integer.valueOf(finderOriginalInfo.rest_punish_day)) && n51.f.a(java.lang.Integer.valueOf(this.punish_year_flag), java.lang.Integer.valueOf(finderOriginalInfo.punish_year_flag)) && n51.f.a(java.lang.Integer.valueOf(this.post_need_check_flag), java.lang.Integer.valueOf(finderOriginalInfo.post_need_check_flag));
    }

    public int getPostNeedCheckFlag() {
        return this.post_need_check_flag;
    }

    public int getPost_need_check_flag() {
        return this.post_need_check_flag;
    }

    public int getPunishYearFlag() {
        return this.punish_year_flag;
    }

    public int getPunish_year_flag() {
        return this.punish_year_flag;
    }

    public int getRestApplyOriginalCount() {
        return this.rest_apply_original_count;
    }

    public int getRestPunishDay() {
        return this.rest_punish_day;
    }

    public int getRestRepostCount() {
        return this.rest_repost_count;
    }

    public int getRest_apply_original_count() {
        return this.rest_apply_original_count;
    }

    public int getRest_punish_day() {
        return this.rest_punish_day;
    }

    public int getRest_repost_count() {
        return this.rest_repost_count;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderOriginalInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.rest_repost_count);
            fVar.e(2, this.rest_apply_original_count);
            fVar.e(3, this.rest_punish_day);
            fVar.e(4, this.punish_year_flag);
            fVar.e(5, this.post_need_check_flag);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.rest_repost_count) + 0 + b36.f.e(2, this.rest_apply_original_count) + b36.f.e(3, this.rest_punish_day) + b36.f.e(4, this.punish_year_flag) + b36.f.e(5, this.post_need_check_flag);
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
            this.rest_repost_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.rest_apply_original_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.rest_punish_day = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.punish_year_flag = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.post_need_check_flag = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setPostNeedCheckFlag(int i17) {
        this.post_need_check_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setPost_need_check_flag(int i17) {
        this.post_need_check_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setPunishYearFlag(int i17) {
        this.punish_year_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setPunish_year_flag(int i17) {
        this.punish_year_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRestApplyOriginalCount(int i17) {
        this.rest_apply_original_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRestPunishDay(int i17) {
        this.rest_punish_day = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRestRepostCount(int i17) {
        this.rest_repost_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRest_apply_original_count(int i17) {
        this.rest_apply_original_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRest_punish_day(int i17) {
        this.rest_punish_day = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo setRest_repost_count(int i17) {
        this.rest_repost_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderOriginalInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderOriginalInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderOriginalInfo) super.parseFrom(bArr);
    }
}
