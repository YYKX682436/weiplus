package wh3;

/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final dn.o a(java.lang.String mediaId, java.lang.String url, java.lang.String path) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(path, "path");
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_FinderUtil";
        oVar.field_mediaId = mediaId;
        oVar.M1 = url;
        oVar.A = 60;
        oVar.B = 60;
        oVar.H1 = 1;
        oVar.Z = 8;
        oVar.field_fullpath = path;
        oVar.f241809y0 = wh3.d.f445968e;
        oVar.X = wh3.d.f445970g;
        oVar.f241806x0 = wh3.d.f445969f;
        oVar.T1 = "finder-live-ad-video";
        return oVar;
    }
}
