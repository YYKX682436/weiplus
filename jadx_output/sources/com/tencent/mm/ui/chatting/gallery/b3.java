package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.b3 f200810a = new com.tencent.mm.ui.chatting.gallery.b3();

    public final boolean a(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z17) {
        java.lang.Object obj;
        com.tencent.mm.ui.chatting.gallery.d1 d1Var;
        if (sourceImgInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryImgSourceHelper", "resolveImgSource, failed: sourceImgInfo is null");
            return false;
        }
        java.lang.Iterable all = ((fs.c) fs.g.f(com.tencent.mm.ui.chatting.gallery.d1.class)).all();
        kotlin.jvm.internal.o.f(all, "all(...)");
        java.util.Iterator it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.mm.ui.chatting.gallery.d1 d1Var2 = (com.tencent.mm.ui.chatting.gallery.d1) ((fs.q) obj).get();
            if (d1Var2 != null ? d1Var2.Fc(sourceImgInfo) : false) {
                break;
            }
        }
        fs.q qVar = (fs.q) obj;
        if (qVar == null || (d1Var = (com.tencent.mm.ui.chatting.gallery.d1) qVar.get()) == null) {
            return false;
        }
        d1Var.Ob(sourceImgInfo, z17);
        return true;
    }
}
