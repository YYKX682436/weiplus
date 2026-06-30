package f32;

/* loaded from: classes10.dex */
public final class j implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259298a;

    public j(com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView) {
        this.f259298a = stickerPreviewView;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.String str = task.f425719f.f193694i;
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259298a;
        if (kotlin.jvm.internal.o.b(str, stickerPreviewView.f98791J)) {
            com.tencent.mars.xlog.Log.i(stickerPreviewView.f98792v, "onLoaderFin: " + status);
            if (status != fp0.u.f265290f) {
                stickerPreviewView.A(null);
                return;
            }
            t85.j jVar = new t85.j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = u85.i.f425710d;
            sb6.append(str2);
            sb6.append("preview/");
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.g(sb7, "<set-?>");
            jVar.f416476c = sb7;
            jVar.b(str2 + "preview/");
            stickerPreviewView.A(jVar);
        }
    }
}
