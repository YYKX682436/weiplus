package sg1;

/* loaded from: classes7.dex */
public class e extends r45.vb5 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f407878h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f407879i;

    /* renamed from: m, reason: collision with root package name */
    public long f407880m;

    public final void b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.io.IOException("Invalid bytes");
        }
        super.parseFrom(bArr);
    }

    public final byte[] c() {
        return super.toByteArray();
    }

    public java.lang.String toString() {
        return "PrefetchPkgDownloadInfo{packageMD5='" + this.f407878h + "', packageURL='" + this.f407879i + "', urlLifespan=" + this.f407880m + ", appId='" + this.f388073d + "', packageKey='" + this.f388074e + "', packageType=" + this.f388075f + ", packageVersion=" + this.f388076g + '}';
    }
}
