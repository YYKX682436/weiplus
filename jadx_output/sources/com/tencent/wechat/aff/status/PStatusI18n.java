package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusI18n extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusI18n DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusI18n();
    public java.lang.String locale = "";
    public java.lang.String text = "";

    public static com.tencent.wechat.aff.status.PStatusI18n create() {
        return new com.tencent.wechat.aff.status.PStatusI18n();
    }

    public static com.tencent.wechat.aff.status.PStatusI18n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusI18n newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusI18n();
    }

    public com.tencent.wechat.aff.status.PStatusI18n build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusI18n)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusI18n pStatusI18n = (com.tencent.wechat.aff.status.PStatusI18n) fVar;
        return n51.f.a(this.locale, pStatusI18n.locale) && n51.f.a(this.text, pStatusI18n.text);
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public java.lang.String getText() {
        return this.text;
    }

    public com.tencent.wechat.aff.status.PStatusI18n mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusI18n();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.locale;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.text;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.locale;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.text;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
            this.locale = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.text = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.status.PStatusI18n setLocale(java.lang.String str) {
        this.locale = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusI18n setText(java.lang.String str) {
        this.text = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusI18n mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusI18n parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusI18n) super.parseFrom(bArr);
    }
}
