package ka5;

/* loaded from: classes15.dex */
public class b extends ka5.a {
    public static final l75.e0 K1 = ka5.a.initAutoDBInfo(ka5.b.class);

    @Override // ka5.a, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public com.tencent.mm.udr.api.WxUdrResource t0() {
        com.tencent.mm.udr.api.WxUdrResource wxUdrResource = new com.tencent.mm.udr.api.WxUdrResource();
        java.lang.String str = this.field_projectId;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        wxUdrResource.f196450d = str;
        java.lang.String str2 = this.field_name;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        wxUdrResource.f196451e = str2;
        wxUdrResource.f196452f = this.field_version;
        wxUdrResource.f196453g = this.field_url;
        java.lang.String str3 = this.field_md5;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        wxUdrResource.f196454h = str3;
        wxUdrResource.f196455i = this.field_size;
        java.lang.String str4 = this.field_path;
        kotlin.jvm.internal.o.g(str4, "<set-?>");
        wxUdrResource.f196456m = str4;
        wxUdrResource.f196457n = this.field_postPath;
        wxUdrResource.f196458o = this.field_category;
        wxUdrResource.f196459p = this.field_type;
        wxUdrResource.f196460q = this.field_createTime;
        wxUdrResource.f196461r = this.field_updateTime;
        wxUdrResource.f196462s = this.field_extId;
        wxUdrResource.f196463t = this.field_signatureKey;
        wxUdrResource.f196464u = this.field_fileKey;
        java.lang.String str5 = this.field_key;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        wxUdrResource.f196465v = str5;
        wxUdrResource.f196466w = this.field_expireTime;
        wxUdrResource.f196467x = this.field_extInfo;
        wxUdrResource.f196468y = this.field_specifiedExtInfo;
        wxUdrResource.f196469z = this.field_virtualPath;
        wxUdrResource.A = this.field_storageType;
        wxUdrResource.B = this.field_uinMd5;
        wxUdrResource.C = this.field_encryptAlgo;
        wxUdrResource.D = this.field_encryptFileSize;
        wxUdrResource.E = this.field_encryptMd5;
        wxUdrResource.F = this.field_encryptKey;
        wxUdrResource.G = this.field_encryptIv;
        wxUdrResource.H = this.field_encryptTag;
        wxUdrResource.I = this.field_encryptAad;
        return wxUdrResource;
    }
}
