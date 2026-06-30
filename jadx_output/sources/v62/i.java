package v62;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f433510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f433512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f433513d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f433514e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f433515f;

    public i(byte[] bArr, int i17, int i18, int i19, android.graphics.Rect rect, java.lang.String str) {
        this.f433510a = bArr;
        this.f433511b = i17;
        this.f433512c = i18;
        this.f433513d = i19;
        this.f433514e = rect;
        this.f433515f = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RetrieveResult{yuvDataLength=");
        byte[] bArr = this.f433510a;
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : "null");
        sb6.append(", previewWidth=");
        sb6.append(this.f433511b);
        sb6.append(", previewHeight=");
        sb6.append(this.f433512c);
        sb6.append(", rotate=");
        sb6.append(this.f433513d);
        sb6.append(", scanRect=");
        sb6.append(this.f433514e);
        sb6.append(", md5=");
        sb6.append(this.f433515f);
        sb6.append('}');
        return sb6.toString();
    }
}
