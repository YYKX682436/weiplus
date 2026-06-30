package te5;

/* loaded from: classes5.dex */
public abstract class y0 {
    public static final java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.pluginsdk.model.app.d d76;
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || (d76 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.d7(v17.f348666i, f9Var.getMsgId(), f9Var.Q0(), v17.f348694p, f9Var.j())) == null) {
            return null;
        }
        return d76.field_fileFullPath;
    }

    public static final boolean b(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        boolean c17 = ez.v0.f257777a.c(f9Var, null);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "isMessageExpired, msgId=" + f9Var.getMsgId() + ", msgSvrId=" + f9Var.I0() + ", talker=" + f9Var.Q0() + ", isExpired=" + c17);
        }
        return c17;
    }
}
