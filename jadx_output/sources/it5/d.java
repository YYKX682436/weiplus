package it5;

/* loaded from: classes13.dex */
public final class d extends com.qq.taf.jce.JceStruct {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f294641d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f294642e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f294643f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f294644g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f294645h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f294646i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f294647m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f294648n = 0;

    @Override // com.qq.taf.jce.JceStruct
    public com.qq.taf.jce.JceStruct newInit() {
        return new it5.d();
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f294641d = jceInputStream.readString(0, false);
        this.f294642e = jceInputStream.readString(1, false);
        this.f294643f = jceInputStream.readString(2, false);
        this.f294644g = jceInputStream.readString(3, false);
        this.f294645h = jceInputStream.read(this.f294645h, 4, false);
        this.f294646i = jceInputStream.readString(5, false);
        this.f294647m = jceInputStream.readString(6, false);
        this.f294648n = jceInputStream.read(this.f294648n, 7, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.f294641d;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        java.lang.String str2 = this.f294642e;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        java.lang.String str3 = this.f294643f;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        java.lang.String str4 = this.f294644g;
        if (str4 != null) {
            jceOutputStream.write(str4, 3);
        }
        int i17 = this.f294645h;
        if (i17 != 0) {
            jceOutputStream.write(i17, 4);
        }
        java.lang.String str5 = this.f294646i;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        java.lang.String str6 = this.f294647m;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        int i18 = this.f294648n;
        if (i18 != 0) {
            jceOutputStream.write(i18, 7);
        }
    }
}
