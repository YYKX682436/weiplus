package r35;

/* loaded from: classes9.dex */
public abstract class f4 {
    public static final r45.zs4 a(java.lang.String str, v05.b bVar) {
        java.lang.String str2;
        java.lang.String string;
        java.lang.String str3;
        e15.c cVar;
        e15.b bVar2;
        e15.c cVar2;
        l15.d dVar;
        l15.e j17;
        e15.b bVar3;
        e15.b bVar4;
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        if (bVar == null || (str2 = bVar.getString(bVar.f368365d + 2)) == null) {
            str2 = "";
        }
        zs4Var.f392349d = str2;
        java.lang.String str4 = null;
        java.lang.String x17 = (bVar == null || (bVar4 = (e15.b) bVar.getCustom(bVar.f432315e + 49)) == null) ? null : bVar4.x();
        if (x17 == null || x17.length() == 0) {
            string = bVar != null ? bVar.getString(bVar.f368365d + 3) : null;
        } else if (bVar == null || (bVar3 = (e15.b) bVar.getCustom(bVar.f432315e + 49)) == null || (string = bVar3.x()) == null) {
            string = "";
        }
        zs4Var.f392350e = string;
        zs4Var.f392354i = (bVar == null || (dVar = (l15.d) bVar.getCustom(bVar.f432315e + 30)) == null || (j17 = dVar.j()) == null || j17.k() != 1) ? false : true;
        zs4Var.f392355m = true;
        zs4Var.f392356n = false;
        zs4Var.f392358p = il4.l.g((bVar == null || (cVar2 = (e15.c) bVar.getCustom(bVar.f432315e + 48)) == null) ? 0 : cVar2.getType());
        if (bVar == null || (str3 = bVar.getString(bVar.f432315e + 46)) == null) {
            str3 = "";
        }
        if ((str3.length() == 0) && (bVar == null || (bVar2 = (e15.b) bVar.getCustom(bVar.f432315e + 49)) == null || (str3 = bVar2.n()) == null)) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareViewHelper", "initMusicPieceDialog imagePath: " + str + ", exist: " + com.tencent.mm.vfs.w6.j(str) + ", coverUrl: %s", str3);
        zs4Var.f392351f = str3;
        if (str == null) {
            str = "";
        }
        zs4Var.f392352g = str;
        if (bVar != null && (cVar = (e15.c) bVar.getCustom(bVar.f432315e + 48)) != null) {
            str4 = cVar.k();
        }
        zs4Var.f392362t = rk4.l5.b(rk4.l5.c(str4));
        return zs4Var;
    }

    public static final android.view.View b(android.content.Context context, java.lang.String str, ot0.q content, com.tencent.mm.pluginsdk.ui.tools.i0 musicPiece) {
        java.lang.String k17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(musicPiece, "musicPiece");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = new com.tencent.mm.plugin.ting.widget.MusicView(context);
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        zs4Var.f392349d = content.m();
        java.lang.String str2 = musicPiece.f191696h;
        if (str2 == null || str2.length() == 0) {
            k17 = content.k();
        } else {
            k17 = musicPiece.f191696h;
            if (k17 == null) {
                k17 = "";
            }
        }
        zs4Var.f392350e = k17;
        ot0.p pVar = content.f348638b;
        zs4Var.f392354i = pVar != null && pVar.f348622b == 1;
        zs4Var.f392355m = false;
        zs4Var.f392356n = false;
        zs4Var.f392358p = il4.l.g(musicPiece.f191706r);
        java.lang.String str3 = musicPiece.f191690b;
        if (str3 == null) {
            str3 = "";
        }
        if ((str3.length() == 0) && (str3 = musicPiece.f191694f) == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareViewHelper", "initMusicPieceDialog imagePath: " + str + ", exist: " + com.tencent.mm.vfs.w6.j(str) + ", coverUrl: %s", str3);
        zs4Var.f392351f = str3;
        if (str == null) {
            str = "";
        }
        zs4Var.f392352g = str;
        zs4Var.f392362t = rk4.l5.b(rk4.l5.c(musicPiece.f191707s));
        musicView.c(zs4Var);
        return musicView;
    }
}
