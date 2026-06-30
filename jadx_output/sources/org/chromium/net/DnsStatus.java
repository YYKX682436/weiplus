package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net::android")
/* loaded from: classes13.dex */
public class DnsStatus {
    private final java.util.List<java.net.InetAddress> mDnsServers;
    private final boolean mPrivateDnsActive;
    private final java.lang.String mPrivateDnsServerName;
    private final java.lang.String mSearchDomains;

    public DnsStatus(java.util.List<java.net.InetAddress> list, boolean z17, java.lang.String str, java.lang.String str2) {
        this.mDnsServers = list;
        this.mPrivateDnsActive = z17;
        this.mPrivateDnsServerName = str == null ? "" : str;
        this.mSearchDomains = str2 == null ? "" : str2;
    }

    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.mDnsServers.size()];
        for (int i17 = 0; i17 < this.mDnsServers.size(); i17++) {
            bArr[i17] = this.mDnsServers.get(i17).getAddress();
        }
        return bArr;
    }

    public boolean getPrivateDnsActive() {
        return this.mPrivateDnsActive;
    }

    public java.lang.String getPrivateDnsServerName() {
        return this.mPrivateDnsServerName;
    }

    public java.lang.String getSearchDomains() {
        return this.mSearchDomains;
    }
}
