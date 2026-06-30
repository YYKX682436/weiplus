package qw2;

/* loaded from: classes10.dex */
public final class i implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.sticker.StickerEffectView f367129a;

    public i(com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView) {
        this.f367129a = stickerEffectView;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        qw2.f fVar;
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView = this.f367129a;
        if (kotlin.jvm.internal.o.b(stickerEffectView.f130811x, task.f425719f.f193690e)) {
            com.tencent.mars.xlog.Log.i(stickerEffectView.f130809v, "onLoaderFin: " + stickerEffectView.f130811x + ", " + status);
            com.tencent.mm.plugin.finder.video.sticker.StickerEffectView.A(stickerEffectView, status);
            java.util.Iterator it = stickerEffectView.f130810w.f367135d.iterator();
            while (it.hasNext()) {
                qw2.k kVar = (qw2.k) it.next();
                if (kVar != null && (fVar = kVar.f367134c) != null) {
                    if (kotlin.jvm.internal.o.b(fVar.f367123f, stickerEffectView.f130811x) && fVar.f367124g) {
                        fVar.f367124g = false;
                        fVar.notifyItemChanged(fVar.f367122e);
                    }
                }
            }
        }
    }
}
