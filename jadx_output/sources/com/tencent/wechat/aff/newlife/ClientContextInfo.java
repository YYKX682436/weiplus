package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class ClientContextInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.ClientContextInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.ClientContextInfo();
    public java.lang.String context_id = "";
    public java.lang.String click_tab_context_id = "";
    public java.lang.String client_report_buff = "";

    public static com.tencent.wechat.aff.newlife.ClientContextInfo create() {
        return new com.tencent.wechat.aff.newlife.ClientContextInfo();
    }

    public static com.tencent.wechat.aff.newlife.ClientContextInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.ClientContextInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.ClientContextInfo();
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.ClientContextInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo = (com.tencent.wechat.aff.newlife.ClientContextInfo) fVar;
        return n51.f.a(this.context_id, clientContextInfo.context_id) && n51.f.a(this.click_tab_context_id, clientContextInfo.click_tab_context_id) && n51.f.a(this.client_report_buff, clientContextInfo.client_report_buff);
    }

    public java.lang.String getClickTabContextId() {
        return this.click_tab_context_id;
    }

    public java.lang.String getClick_tab_context_id() {
        return this.click_tab_context_id;
    }

    public java.lang.String getClientReportBuff() {
        return this.client_report_buff;
    }

    public java.lang.String getClient_report_buff() {
        return this.client_report_buff;
    }

    public java.lang.String getContextId() {
        return this.context_id;
    }

    public java.lang.String getContext_id() {
        return this.context_id;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.ClientContextInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.context_id;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.click_tab_context_id;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.client_report_buff;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.context_id;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.click_tab_context_id;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.client_report_buff;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
            this.context_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.click_tab_context_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.client_report_buff = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setClickTabContextId(java.lang.String str) {
        this.click_tab_context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setClick_tab_context_id(java.lang.String str) {
        this.click_tab_context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setClientReportBuff(java.lang.String str) {
        this.client_report_buff = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setClient_report_buff(java.lang.String str) {
        this.client_report_buff = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setContextId(java.lang.String str) {
        this.context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo setContext_id(java.lang.String str) {
        this.context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.ClientContextInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.ClientContextInfo) super.parseFrom(bArr);
    }
}
