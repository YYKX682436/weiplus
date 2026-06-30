package com.tencent.mm.protobuf;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f192160a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f192161b;

    /* renamed from: d, reason: collision with root package name */
    public int f192163d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f192164e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f192166g;

    /* renamed from: c, reason: collision with root package name */
    public boolean f192162c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f192165f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f192167h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f192168i = "";

    public java.lang.String toString() {
        int i17 = this.f192163d;
        java.lang.String str = "Unknown";
        if (i17 != 8) {
            switch (i17) {
                case 1:
                    str = "String";
                    break;
                case 2:
                    str = "int";
                    break;
                case 3:
                    str = "long";
                    break;
                case 4:
                    str = "double";
                    break;
                case 5:
                    str = "float";
                    break;
                case 6:
                    str = "ByteString";
                    break;
                case 7:
                    str = com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN;
                    break;
                case 8:
                    str = "ProtoBuf";
                    break;
            }
        } else {
            java.lang.Class cls = this.f192164e;
            if (cls != null) {
                str = cls.getSimpleName();
            }
        }
        if (this.f192165f) {
            str = "Map";
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f192162c ? "repeated " : "";
        objArr[1] = this.f192161b;
        objArr[2] = java.lang.Integer.valueOf(this.f192160a);
        objArr[3] = str;
        return java.lang.String.format("%s%s(%s): %s", objArr);
    }
}
