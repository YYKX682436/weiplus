package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderObjectBaseInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderObjectBaseInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderObjectBaseInfo();

    /* renamed from: id, reason: collision with root package name */
    public long f217401id = 0;
    public java.lang.String session_buffer = "";
    public long client_recv_time_ms = 0;
    public long client_expose_time_ms = 0;
    public int client_expose_count = 0;
    public java.lang.String client_udf_kv = "";

    public static com.tencent.wechat.aff.newlife.FinderObjectBaseInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderObjectBaseInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectBaseInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectBaseInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderObjectBaseInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderObjectBaseInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderObjectBaseInfo finderObjectBaseInfo = (com.tencent.wechat.aff.newlife.FinderObjectBaseInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217401id), java.lang.Long.valueOf(finderObjectBaseInfo.f217401id)) && n51.f.a(this.session_buffer, finderObjectBaseInfo.session_buffer) && n51.f.a(java.lang.Long.valueOf(this.client_recv_time_ms), java.lang.Long.valueOf(finderObjectBaseInfo.client_recv_time_ms)) && n51.f.a(java.lang.Long.valueOf(this.client_expose_time_ms), java.lang.Long.valueOf(finderObjectBaseInfo.client_expose_time_ms)) && n51.f.a(java.lang.Integer.valueOf(this.client_expose_count), java.lang.Integer.valueOf(finderObjectBaseInfo.client_expose_count)) && n51.f.a(this.client_udf_kv, finderObjectBaseInfo.client_udf_kv);
    }

    public int getClientExposeCount() {
        return this.client_expose_count;
    }

    public long getClientExposeTimeMs() {
        return this.client_expose_time_ms;
    }

    public long getClientRecvTimeMs() {
        return this.client_recv_time_ms;
    }

    public java.lang.String getClientUdfKv() {
        return this.client_udf_kv;
    }

    public int getClient_expose_count() {
        return this.client_expose_count;
    }

    public long getClient_expose_time_ms() {
        return this.client_expose_time_ms;
    }

    public long getClient_recv_time_ms() {
        return this.client_recv_time_ms;
    }

    public java.lang.String getClient_udf_kv() {
        return this.client_udf_kv;
    }

    public long getId() {
        return this.f217401id;
    }

    public java.lang.String getSessionBuffer() {
        return this.session_buffer;
    }

    public java.lang.String getSession_buffer() {
        return this.session_buffer;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderObjectBaseInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f217401id);
            java.lang.String str = this.session_buffer;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.client_recv_time_ms);
            fVar.h(4, this.client_expose_time_ms);
            fVar.e(5, this.client_expose_count);
            java.lang.String str2 = this.client_udf_kv;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f217401id) + 0;
            java.lang.String str3 = this.session_buffer;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int h18 = h17 + b36.f.h(3, this.client_recv_time_ms) + b36.f.h(4, this.client_expose_time_ms) + b36.f.e(5, this.client_expose_count);
            java.lang.String str4 = this.client_udf_kv;
            return str4 != null ? h18 + b36.f.j(6, str4) : h18;
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
                this.f217401id = aVar2.i(intValue);
                return 0;
            case 2:
                this.session_buffer = aVar2.k(intValue);
                return 0;
            case 3:
                this.client_recv_time_ms = aVar2.i(intValue);
                return 0;
            case 4:
                this.client_expose_time_ms = aVar2.i(intValue);
                return 0;
            case 5:
                this.client_expose_count = aVar2.g(intValue);
                return 0;
            case 6:
                this.client_udf_kv = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClientExposeCount(int i17) {
        this.client_expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClientExposeTimeMs(long j17) {
        this.client_expose_time_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClientRecvTimeMs(long j17) {
        this.client_recv_time_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClientUdfKv(java.lang.String str) {
        this.client_udf_kv = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClient_expose_count(int i17) {
        this.client_expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClient_expose_time_ms(long j17) {
        this.client_expose_time_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClient_recv_time_ms(long j17) {
        this.client_recv_time_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setClient_udf_kv(java.lang.String str) {
        this.client_udf_kv = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setId(long j17) {
        this.f217401id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setSessionBuffer(java.lang.String str) {
        this.session_buffer = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo setSession_buffer(java.lang.String str) {
        this.session_buffer = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderObjectBaseInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderObjectBaseInfo) super.parseFrom(bArr);
    }
}
