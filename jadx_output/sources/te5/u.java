package te5;

/* loaded from: classes9.dex */
public abstract class u {
    public static final z01.e a(l15.c cVar, android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String appName;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        z01.e eVar = new z01.e();
        v05.b k17 = cVar.k();
        java.lang.String str3 = "";
        if (k17 == null || (str = k17.getString(k17.f368365d + 0)) == null) {
            str = "";
        }
        eVar.f468995a = str;
        l15.b j17 = cVar.j();
        if (j17 == null || (str2 = j17.getVersion()) == null) {
            str2 = "";
        }
        eVar.f468996b = str2;
        l15.b j18 = cVar.j();
        if (j18 != null && (appName = j18.getAppName()) != null) {
            str3 = appName;
        }
        eVar.f468997c = str3;
        eVar.f468998d = i65.a.h(context, com.tencent.mm.R.dimen.f479642bh);
        return eVar;
    }

    public static final z01.i b(l15.c cVar) {
        java.lang.String str;
        r05.g gVar;
        java.lang.String string;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        z01.i iVar = new z01.i();
        v05.b k17 = cVar.k();
        java.lang.String str2 = "";
        if (k17 == null || (str = k17.getString(k17.f432315e + 11)) == null) {
            str = "";
        }
        iVar.f469053c = str;
        v05.b k18 = cVar.k();
        if (k18 != null && (string = k18.getString(k18.f368365d + 9)) != null) {
            str2 = string;
        }
        iVar.f469051a = str2;
        v05.b k19 = cVar.k();
        iVar.f469052b = (k19 == null || (gVar = (r05.g) k19.getCustom(k19.f432315e + 25)) == null) ? -1 : gVar.o();
        return iVar;
    }
}
