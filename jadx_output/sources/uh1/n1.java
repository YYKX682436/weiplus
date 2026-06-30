package uh1;

/* loaded from: classes15.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f427842a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427843b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427844c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f427845d;

    /* renamed from: e, reason: collision with root package name */
    public final int f427846e;

    public n1(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        java.net.InetAddress host = nsdServiceInfo.getHost();
        if (host != null) {
            this.f427845d = host.getHostAddress();
        }
        this.f427846e = nsdServiceInfo.getPort();
        this.f427843b = nsdServiceInfo.getServiceName();
        this.f427844c = nsdServiceInfo.getServiceType();
        java.util.Map<java.lang.String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes != null) {
            for (java.lang.String str : attributes.keySet()) {
                byte[] bArr = attributes.get(str);
                if (bArr != null) {
                    this.f427842a.put(str, new java.lang.String(android.util.Base64.encode(bArr, 2)));
                }
            }
        }
    }
}
