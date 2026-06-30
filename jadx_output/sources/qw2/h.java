package qw2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.sticker.StickerEffectView f367128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView) {
        super(2);
        this.f367128d = stickerEffectView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qw2.f fVar;
        qw2.f fVar2;
        ((java.lang.Number) obj).intValue();
        t85.d lensItem = (t85.d) obj2;
        kotlin.jvm.internal.o.g(lensItem, "lensItem");
        com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView = this.f367128d;
        r45.p64 p64Var = lensItem.f416456a;
        stickerEffectView.f130812y = p64Var;
        stickerEffectView.f130811x = p64Var.f382792d;
        qw2.l lVar = stickerEffectView.f130810w;
        java.util.Iterator it = lVar.f367135d.iterator();
        while (it.hasNext()) {
            qw2.k kVar = (qw2.k) it.next();
            if (kVar != null && (fVar2 = kVar.f367134c) != null) {
                java.lang.String str = stickerEffectView.f130811x;
                if (!kotlin.jvm.internal.o.b(fVar2.f367123f, str)) {
                    fVar2.f367123f = str;
                    java.util.Iterator it6 = fVar2.f367121d.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(((t85.d) it6.next()).f416456a.f382792d, str)) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = fVar2.f367122e;
                    if (i18 != i17) {
                        fVar2.f367124g = false;
                        fVar2.notifyItemChanged(i18);
                        fVar2.f367122e = i17;
                        fVar2.notifyItemChanged(i17);
                    }
                }
            }
        }
        fp0.u c17 = stickerEffectView.f130811x == null ? fp0.u.f265290f : u85.i.f425707a.c(p64Var);
        if (c17 == fp0.u.f265290f) {
            com.tencent.mm.plugin.finder.video.sticker.StickerEffectView.A(stickerEffectView, c17);
        } else {
            java.util.Iterator it7 = lVar.f367135d.iterator();
            while (it7.hasNext()) {
                qw2.k kVar2 = (qw2.k) it7.next();
                if (kVar2 != null && (fVar = kVar2.f367134c) != null) {
                    if (kotlin.jvm.internal.o.b(fVar.f367123f, stickerEffectView.f130811x) && !fVar.f367124g) {
                        fVar.f367124g = true;
                        fVar.notifyItemChanged(fVar.f367122e);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
