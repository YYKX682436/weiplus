package ni4;

/* loaded from: classes11.dex */
public abstract class z {
    public static final pj4.b0 a(mj4.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        pj4.b0 b0Var = new pj4.b0();
        mj4.k kVar = (mj4.k) hVar;
        b0Var.f354971J = kVar.g();
        mj4.a aVar = kVar.f327067b;
        b0Var.f354974f = aVar.field_MediaType;
        b0Var.f354976h = kVar.j();
        java.lang.String str = aVar.field_MediaAESKey;
        if (str == null) {
            str = "";
        }
        b0Var.f354977i = str;
        b0Var.f354978m = kVar.i();
        java.lang.String str2 = aVar.field_MediaThumbAESKey;
        if (str2 == null) {
            str2 = "";
        }
        b0Var.f354979n = str2;
        java.lang.String str3 = aVar.field_PoiID;
        if (str3 == null) {
            str3 = "";
        }
        b0Var.f354984s = str3;
        b0Var.f354985t = kVar.k();
        b0Var.f354973e = aVar.field_Latitude;
        b0Var.f354972d = aVar.field_Longitude;
        b0Var.f354980o = aVar.field_Visibility;
        b0Var.f354983r = aVar.field_ExpireTime;
        b0Var.f354982q = aVar.field_CreateTime;
        b0Var.f354989x = kVar.p();
        b0Var.f354986u = kVar.q();
        b0Var.f354987v = aVar.field_mediaWidth;
        b0Var.f354988w = aVar.field_mediaHeight;
        java.lang.String str4 = aVar.field_referenceUserName;
        if (str4 == null) {
            str4 = "";
        }
        b0Var.C = str4;
        java.lang.String str5 = aVar.field_referenceTextStatusId;
        if (str5 == null) {
            str5 = "";
        }
        b0Var.D = str5;
        b0Var.f354975g = xe0.j0.a(hVar, false, 1, null);
        java.lang.String str6 = aVar.field_duplicateUserName;
        if (str6 == null) {
            str6 = "";
        }
        b0Var.F = str6;
        java.lang.String str7 = aVar.field_duplicateTextStatusId;
        b0Var.G = str7 != null ? str7 : "";
        b0Var.E = aVar.field_sceneType;
        b0Var.K = kVar.e();
        b0Var.T = aVar.field_HasHb == 1;
        pj4.b0 b0Var2 = new pj4.b0();
        kVar.r();
        b0Var2.parseFrom(kVar.r());
        b0Var.M = b0Var2.M;
        b0Var.N = b0Var2.N;
        return b0Var;
    }
}
