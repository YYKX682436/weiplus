package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderMentionContact extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderMentionContact DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderMentionContact();
    public com.tencent.wechat.aff.newlife.FinderContact contact = com.tencent.wechat.aff.newlife.FinderContact.getDefaultInstance();
    public boolean isSelf = false;
    public long fans_id = 0;
    public int relation_type = 0;

    public static com.tencent.wechat.aff.newlife.FinderMentionContact create() {
        return new com.tencent.wechat.aff.newlife.FinderMentionContact();
    }

    public static com.tencent.wechat.aff.newlife.FinderMentionContact getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderMentionContact newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderMentionContact();
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderMentionContact)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact = (com.tencent.wechat.aff.newlife.FinderMentionContact) fVar;
        return n51.f.a(this.contact, finderMentionContact.contact) && n51.f.a(java.lang.Boolean.valueOf(this.isSelf), java.lang.Boolean.valueOf(finderMentionContact.isSelf)) && n51.f.a(java.lang.Long.valueOf(this.fans_id), java.lang.Long.valueOf(finderMentionContact.fans_id)) && n51.f.a(java.lang.Integer.valueOf(this.relation_type), java.lang.Integer.valueOf(finderMentionContact.relation_type));
    }

    public com.tencent.wechat.aff.newlife.FinderContact getContact() {
        return this.contact;
    }

    public long getFansId() {
        return this.fans_id;
    }

    public long getFans_id() {
        return this.fans_id;
    }

    public boolean getIsSelf() {
        return this.isSelf;
    }

    public int getRelationType() {
        return this.relation_type;
    }

    public int getRelation_type() {
        return this.relation_type;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderMentionContact();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.FinderContact finderContact = this.contact;
            if (finderContact != null) {
                fVar.i(1, finderContact.computeSize());
                this.contact.writeFields(fVar);
            }
            fVar.a(2, this.isSelf);
            fVar.h(3, this.fans_id);
            fVar.e(4, this.relation_type);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.FinderContact finderContact2 = this.contact;
            return (finderContact2 != null ? 0 + b36.f.i(1, finderContact2.computeSize()) : 0) + b36.f.a(2, this.isSelf) + b36.f.h(3, this.fans_id) + b36.f.e(4, this.relation_type);
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
            if (intValue == 2) {
                this.isSelf = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.fans_id = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.relation_type = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderContact finderContact3 = new com.tencent.wechat.aff.newlife.FinderContact();
            if (bArr != null && bArr.length > 0) {
                finderContact3.parseFrom(bArr);
            }
            this.contact = finderContact3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setContact(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.contact = finderContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setFansId(long j17) {
        this.fans_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setFans_id(long j17) {
        this.fans_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setIsSelf(boolean z17) {
        this.isSelf = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setRelationType(int i17) {
        this.relation_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact setRelation_type(int i17) {
        this.relation_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderMentionContact parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderMentionContact) super.parseFrom(bArr);
    }
}
