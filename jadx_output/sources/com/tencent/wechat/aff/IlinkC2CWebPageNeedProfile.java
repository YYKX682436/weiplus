package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkC2CWebPageNeedProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile();
    private long connect_end;
    private long connect_start;
    private long domain_lookup_end;
    private long domain_lookup_start;
    private int downstream_throughput_kbps_estimate;
    private long fetch_start;
    private final boolean[] hasSetFields = new boolean[27];
    private int http_rtt_estimate;
    private int network_estimate_type;
    private com.tencent.mm.protobuf.g peer_ip;
    private int peer_port;
    private com.tencent.mm.protobuf.g protocol;
    private long received_bytes_count;
    private long redirect_end;
    private long redirect_start;
    private long request_end;
    private long request_start;
    private long response_end;
    private long response_start;
    private int rtt;
    private long secure_connection_end;
    private long secure_connection_start;
    private long sent_bytes_count;
    private boolean socket_reused;
    private int status_code;
    private int throughput_kbps;
    private int transport_rtt_estimate;

    public static com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile create() {
        return new com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile();
    }

    public static com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile();
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile ilinkC2CWebPageNeedProfile = (com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.redirect_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.redirect_start)) && n51.f.a(java.lang.Long.valueOf(this.redirect_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.redirect_end)) && n51.f.a(java.lang.Long.valueOf(this.fetch_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.fetch_start)) && n51.f.a(java.lang.Long.valueOf(this.domain_lookup_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.domain_lookup_start)) && n51.f.a(java.lang.Long.valueOf(this.domain_lookup_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.domain_lookup_end)) && n51.f.a(java.lang.Long.valueOf(this.connect_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.connect_start)) && n51.f.a(java.lang.Long.valueOf(this.connect_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.connect_end)) && n51.f.a(java.lang.Long.valueOf(this.secure_connection_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.secure_connection_start)) && n51.f.a(java.lang.Long.valueOf(this.secure_connection_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.secure_connection_end)) && n51.f.a(java.lang.Long.valueOf(this.request_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.request_start)) && n51.f.a(java.lang.Long.valueOf(this.request_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.request_end)) && n51.f.a(java.lang.Long.valueOf(this.response_start), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.response_start)) && n51.f.a(java.lang.Long.valueOf(this.response_end), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.response_end)) && n51.f.a(this.protocol, ilinkC2CWebPageNeedProfile.protocol) && n51.f.a(java.lang.Integer.valueOf(this.rtt), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.rtt)) && n51.f.a(java.lang.Integer.valueOf(this.status_code), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.status_code)) && n51.f.a(java.lang.Integer.valueOf(this.network_estimate_type), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.network_estimate_type)) && n51.f.a(java.lang.Integer.valueOf(this.http_rtt_estimate), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.http_rtt_estimate)) && n51.f.a(java.lang.Integer.valueOf(this.transport_rtt_estimate), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.transport_rtt_estimate)) && n51.f.a(java.lang.Integer.valueOf(this.downstream_throughput_kbps_estimate), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.downstream_throughput_kbps_estimate)) && n51.f.a(java.lang.Integer.valueOf(this.throughput_kbps), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.throughput_kbps)) && n51.f.a(this.peer_ip, ilinkC2CWebPageNeedProfile.peer_ip) && n51.f.a(java.lang.Integer.valueOf(this.peer_port), java.lang.Integer.valueOf(ilinkC2CWebPageNeedProfile.peer_port)) && n51.f.a(java.lang.Boolean.valueOf(this.socket_reused), java.lang.Boolean.valueOf(ilinkC2CWebPageNeedProfile.socket_reused)) && n51.f.a(java.lang.Long.valueOf(this.sent_bytes_count), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.sent_bytes_count)) && n51.f.a(java.lang.Long.valueOf(this.received_bytes_count), java.lang.Long.valueOf(ilinkC2CWebPageNeedProfile.received_bytes_count));
    }

    public long getConnectEnd() {
        return this.connect_end;
    }

    public long getConnectStart() {
        return this.connect_start;
    }

    public long getDomainLookupEnd() {
        return this.domain_lookup_end;
    }

    public long getDomainLookupStart() {
        return this.domain_lookup_start;
    }

    public int getDownstreamThroughputKbpsEstimate() {
        return this.downstream_throughput_kbps_estimate;
    }

    public long getFetchStart() {
        return this.fetch_start;
    }

    public int getHttpRttEstimate() {
        return this.http_rtt_estimate;
    }

    public int getNetworkEstimateType() {
        return this.network_estimate_type;
    }

    public com.tencent.mm.protobuf.g getPeerIp() {
        return this.hasSetFields[22] ? this.peer_ip : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getPeerPort() {
        return this.peer_port;
    }

    public com.tencent.mm.protobuf.g getProtocol() {
        return this.hasSetFields[14] ? this.protocol : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getReceivedBytesCount() {
        return this.received_bytes_count;
    }

    public long getRedirectEnd() {
        return this.redirect_end;
    }

    public long getRedirectStart() {
        return this.redirect_start;
    }

    public long getRequestEnd() {
        return this.request_end;
    }

    public long getRequestStart() {
        return this.request_start;
    }

    public long getResponseEnd() {
        return this.response_end;
    }

    public long getResponseStart() {
        return this.response_start;
    }

    public int getRtt() {
        return this.rtt;
    }

    public long getSecureConnectionEnd() {
        return this.secure_connection_end;
    }

    public long getSecureConnectionStart() {
        return this.secure_connection_start;
    }

    public long getSentBytesCount() {
        return this.sent_bytes_count;
    }

    public boolean getSocketReused() {
        return this.socket_reused;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getThroughputKbps() {
        return this.throughput_kbps;
    }

    public int getTransportRttEstimate() {
        return this.transport_rtt_estimate;
    }

    public boolean hasConnectEnd() {
        return hasFieldNumber(7);
    }

    public boolean hasConnectStart() {
        return hasFieldNumber(6);
    }

    public boolean hasDomainLookupEnd() {
        return hasFieldNumber(5);
    }

    public boolean hasDomainLookupStart() {
        return hasFieldNumber(4);
    }

    public boolean hasDownstreamThroughputKbpsEstimate() {
        return hasFieldNumber(20);
    }

    public boolean hasFetchStart() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHttpRttEstimate() {
        return hasFieldNumber(18);
    }

    public boolean hasNetworkEstimateType() {
        return hasFieldNumber(17);
    }

    public boolean hasPeerIp() {
        return hasFieldNumber(22);
    }

    public boolean hasPeerPort() {
        return hasFieldNumber(23);
    }

    public boolean hasProtocol() {
        return hasFieldNumber(14);
    }

    public boolean hasReceivedBytesCount() {
        return hasFieldNumber(26);
    }

    public boolean hasRedirectEnd() {
        return hasFieldNumber(2);
    }

    public boolean hasRedirectStart() {
        return hasFieldNumber(1);
    }

    public boolean hasRequestEnd() {
        return hasFieldNumber(11);
    }

    public boolean hasRequestStart() {
        return hasFieldNumber(10);
    }

    public boolean hasResponseEnd() {
        return hasFieldNumber(13);
    }

    public boolean hasResponseStart() {
        return hasFieldNumber(12);
    }

    public boolean hasRtt() {
        return hasFieldNumber(15);
    }

    public boolean hasSecureConnectionEnd() {
        return hasFieldNumber(9);
    }

    public boolean hasSecureConnectionStart() {
        return hasFieldNumber(8);
    }

    public boolean hasSentBytesCount() {
        return hasFieldNumber(25);
    }

    public boolean hasSocketReused() {
        return hasFieldNumber(24);
    }

    public boolean hasStatusCode() {
        return hasFieldNumber(16);
    }

    public boolean hasThroughputKbps() {
        return hasFieldNumber(21);
    }

    public boolean hasTransportRttEstimate() {
        return hasFieldNumber(19);
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.redirect_start);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.redirect_end);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.fetch_start);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.domain_lookup_start);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.domain_lookup_end);
            }
            if (this.hasSetFields[6]) {
                fVar.h(6, this.connect_start);
            }
            if (this.hasSetFields[7]) {
                fVar.h(7, this.connect_end);
            }
            if (this.hasSetFields[8]) {
                fVar.h(8, this.secure_connection_start);
            }
            if (this.hasSetFields[9]) {
                fVar.h(9, this.secure_connection_end);
            }
            if (this.hasSetFields[10]) {
                fVar.h(10, this.request_start);
            }
            if (this.hasSetFields[11]) {
                fVar.h(11, this.request_end);
            }
            if (this.hasSetFields[12]) {
                fVar.h(12, this.response_start);
            }
            if (this.hasSetFields[13]) {
                fVar.h(13, this.response_end);
            }
            com.tencent.mm.protobuf.g gVar = this.protocol;
            if (gVar != null && this.hasSetFields[14]) {
                fVar.b(14, gVar);
            }
            if (this.hasSetFields[15]) {
                fVar.e(15, this.rtt);
            }
            if (this.hasSetFields[16]) {
                fVar.e(16, this.status_code);
            }
            if (this.hasSetFields[17]) {
                fVar.e(17, this.network_estimate_type);
            }
            if (this.hasSetFields[18]) {
                fVar.e(18, this.http_rtt_estimate);
            }
            if (this.hasSetFields[19]) {
                fVar.e(19, this.transport_rtt_estimate);
            }
            if (this.hasSetFields[20]) {
                fVar.e(20, this.downstream_throughput_kbps_estimate);
            }
            if (this.hasSetFields[21]) {
                fVar.e(21, this.throughput_kbps);
            }
            com.tencent.mm.protobuf.g gVar2 = this.peer_ip;
            if (gVar2 != null && this.hasSetFields[22]) {
                fVar.b(22, gVar2);
            }
            if (this.hasSetFields[23]) {
                fVar.e(23, this.peer_port);
            }
            if (this.hasSetFields[24]) {
                fVar.a(24, this.socket_reused);
            }
            if (this.hasSetFields[25]) {
                fVar.h(25, this.sent_bytes_count);
            }
            if (this.hasSetFields[26]) {
                fVar.h(26, this.received_bytes_count);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? b36.f.h(1, this.redirect_start) + 0 : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.h(2, this.redirect_end);
            }
            if (this.hasSetFields[3]) {
                h17 += b36.f.h(3, this.fetch_start);
            }
            if (this.hasSetFields[4]) {
                h17 += b36.f.h(4, this.domain_lookup_start);
            }
            if (this.hasSetFields[5]) {
                h17 += b36.f.h(5, this.domain_lookup_end);
            }
            if (this.hasSetFields[6]) {
                h17 += b36.f.h(6, this.connect_start);
            }
            if (this.hasSetFields[7]) {
                h17 += b36.f.h(7, this.connect_end);
            }
            if (this.hasSetFields[8]) {
                h17 += b36.f.h(8, this.secure_connection_start);
            }
            if (this.hasSetFields[9]) {
                h17 += b36.f.h(9, this.secure_connection_end);
            }
            if (this.hasSetFields[10]) {
                h17 += b36.f.h(10, this.request_start);
            }
            if (this.hasSetFields[11]) {
                h17 += b36.f.h(11, this.request_end);
            }
            if (this.hasSetFields[12]) {
                h17 += b36.f.h(12, this.response_start);
            }
            if (this.hasSetFields[13]) {
                h17 += b36.f.h(13, this.response_end);
            }
            com.tencent.mm.protobuf.g gVar3 = this.protocol;
            if (gVar3 != null && this.hasSetFields[14]) {
                h17 += b36.f.b(14, gVar3);
            }
            if (this.hasSetFields[15]) {
                h17 += b36.f.e(15, this.rtt);
            }
            if (this.hasSetFields[16]) {
                h17 += b36.f.e(16, this.status_code);
            }
            if (this.hasSetFields[17]) {
                h17 += b36.f.e(17, this.network_estimate_type);
            }
            if (this.hasSetFields[18]) {
                h17 += b36.f.e(18, this.http_rtt_estimate);
            }
            if (this.hasSetFields[19]) {
                h17 += b36.f.e(19, this.transport_rtt_estimate);
            }
            if (this.hasSetFields[20]) {
                h17 += b36.f.e(20, this.downstream_throughput_kbps_estimate);
            }
            if (this.hasSetFields[21]) {
                h17 += b36.f.e(21, this.throughput_kbps);
            }
            com.tencent.mm.protobuf.g gVar4 = this.peer_ip;
            if (gVar4 != null && this.hasSetFields[22]) {
                h17 += b36.f.b(22, gVar4);
            }
            if (this.hasSetFields[23]) {
                h17 += b36.f.e(23, this.peer_port);
            }
            if (this.hasSetFields[24]) {
                h17 += b36.f.a(24, this.socket_reused);
            }
            if (this.hasSetFields[25]) {
                h17 += b36.f.h(25, this.sent_bytes_count);
            }
            return this.hasSetFields[26] ? h17 + b36.f.h(26, this.received_bytes_count) : h17;
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
                this.redirect_start = aVar2.i(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.redirect_end = aVar2.i(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.fetch_start = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.domain_lookup_start = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.domain_lookup_end = aVar2.i(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.connect_start = aVar2.i(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.connect_end = aVar2.i(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.secure_connection_start = aVar2.i(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.secure_connection_end = aVar2.i(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.request_start = aVar2.i(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.request_end = aVar2.i(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.response_start = aVar2.i(intValue);
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.response_end = aVar2.i(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.protocol = aVar2.d(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.rtt = aVar2.g(intValue);
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.status_code = aVar2.g(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                this.network_estimate_type = aVar2.g(intValue);
                this.hasSetFields[17] = true;
                return 0;
            case 18:
                this.http_rtt_estimate = aVar2.g(intValue);
                this.hasSetFields[18] = true;
                return 0;
            case 19:
                this.transport_rtt_estimate = aVar2.g(intValue);
                this.hasSetFields[19] = true;
                return 0;
            case 20:
                this.downstream_throughput_kbps_estimate = aVar2.g(intValue);
                this.hasSetFields[20] = true;
                return 0;
            case 21:
                this.throughput_kbps = aVar2.g(intValue);
                this.hasSetFields[21] = true;
                return 0;
            case 22:
                this.peer_ip = aVar2.d(intValue);
                this.hasSetFields[22] = true;
                return 0;
            case 23:
                this.peer_port = aVar2.g(intValue);
                this.hasSetFields[23] = true;
                return 0;
            case 24:
                this.socket_reused = aVar2.c(intValue);
                this.hasSetFields[24] = true;
                return 0;
            case 25:
                this.sent_bytes_count = aVar2.i(intValue);
                this.hasSetFields[25] = true;
                return 0;
            case 26:
                this.received_bytes_count = aVar2.i(intValue);
                this.hasSetFields[26] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setConnectEnd(long j17) {
        this.connect_end = j17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setConnectStart(long j17) {
        this.connect_start = j17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setDomainLookupEnd(long j17) {
        this.domain_lookup_end = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setDomainLookupStart(long j17) {
        this.domain_lookup_start = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setDownstreamThroughputKbpsEstimate(int i17) {
        this.downstream_throughput_kbps_estimate = i17;
        this.hasSetFields[20] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setFetchStart(long j17) {
        this.fetch_start = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setHttpRttEstimate(int i17) {
        this.http_rtt_estimate = i17;
        this.hasSetFields[18] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setNetworkEstimateType(int i17) {
        this.network_estimate_type = i17;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setPeerIp(com.tencent.mm.protobuf.g gVar) {
        this.peer_ip = gVar;
        this.hasSetFields[22] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setPeerPort(int i17) {
        this.peer_port = i17;
        this.hasSetFields[23] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setProtocol(com.tencent.mm.protobuf.g gVar) {
        this.protocol = gVar;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setReceivedBytesCount(long j17) {
        this.received_bytes_count = j17;
        this.hasSetFields[26] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setRedirectEnd(long j17) {
        this.redirect_end = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setRedirectStart(long j17) {
        this.redirect_start = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setRequestEnd(long j17) {
        this.request_end = j17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setRequestStart(long j17) {
        this.request_start = j17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setResponseEnd(long j17) {
        this.response_end = j17;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setResponseStart(long j17) {
        this.response_start = j17;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setRtt(int i17) {
        this.rtt = i17;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setSecureConnectionEnd(long j17) {
        this.secure_connection_end = j17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setSecureConnectionStart(long j17) {
        this.secure_connection_start = j17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setSentBytesCount(long j17) {
        this.sent_bytes_count = j17;
        this.hasSetFields[25] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setSocketReused(boolean z17) {
        this.socket_reused = z17;
        this.hasSetFields[24] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setStatusCode(int i17) {
        this.status_code = i17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setThroughputKbps(int i17) {
        this.throughput_kbps = i17;
        this.hasSetFields[21] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile setTransportRttEstimate(int i17) {
        this.transport_rtt_estimate = i17;
        this.hasSetFields[19] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile) super.parseFrom(bArr);
    }
}
