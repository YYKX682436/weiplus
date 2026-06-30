package ud5;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements fb0.i {
    public nm5.b wi(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = f9Var.j();
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && f9Var.A0() == 0) {
            j17 = c01.w9.u(f9Var.j());
        }
        java.lang.String str2 = j17;
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgCompatService", "getFilePathAndExt fail, msgContent is null");
            return null;
        }
        java.lang.String str3 = v17.f348690o;
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str3.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mm.pluginsdk.model.app.d d76 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.d7(v17.f348666i, f9Var.getMsgId(), f9Var.Q0(), v17.f348694p, str2);
        if (d76 != null && (str = d76.field_fileFullPath) != null) {
            str4 = str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(lowerCase)) {
            return nm5.j.c(str4, lowerCase);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgCompatService", "filePath:" + str4 + " getFilePathAndExt fail, fileExt is null");
        return null;
    }
}
