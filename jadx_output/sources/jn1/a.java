package jn1;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljn1/a;", "Lg75/f0;", "Lhn1/a;", "Lhn1/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class a extends g75.f0<hn1.a, hn1.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        hn1.b bVar2;
        hn1.a aVar = (hn1.a) bVar;
        int g17 = zVar.g("Avatar_HdFlag");
        com.tencent.mm.modelavatar.r0 r0Var = (com.tencent.mm.modelavatar.r0) zVar.d("Avatar_ImgFlag");
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not exist " + aVar.f282444b);
            return new hn1.b(hn1.u.f282493g, "");
        }
        boolean z17 = true;
        java.lang.String c17 = g17 == 1 ? r0Var.c() : r0Var.d();
        if (c17 == null || r26.n0.N(c17)) {
            if (r0Var.f70530b == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag url is empty username:" + aVar.f282444b + " hdFlag:" + g17);
                return new hn1.b(hn1.u.f282492f, "");
            }
            java.lang.String d17 = com.tencent.mm.modelavatar.g.d(r0Var, g17);
            java.lang.String o17 = new com.tencent.mm.vfs.r6(aVar.f282445c, d17).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            if (com.tencent.mm.vfs.w6.j(o17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but exist head img and expired " + r0Var.f70530b + ' ' + aVar.f282444b + ' ' + d17);
                return new hn1.b(hn1.u.f282490d, d17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but not exist head img " + r0Var.f70530b + ' ' + aVar.f282444b + ' ' + d17);
            return new hn1.b(hn1.u.f282491e, d17);
        }
        java.lang.String d18 = com.tencent.mm.modelavatar.g.d(r0Var, g17);
        java.lang.String o18 = new com.tencent.mm.vfs.r6(aVar.f282445c, d18).o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        if (com.tencent.mm.vfs.w6.j(o18)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not expired " + aVar.f282444b + ' ' + d18);
            bVar2 = new hn1.b(hn1.u.f282490d, d18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag expired " + aVar.f282444b + ' ' + d18 + ", remove cache by username");
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            java.lang.String str = aVar.f282444b;
            ((hn1.s) b0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarImageLoaderFeatureService", "removeFromCacheByUsername: " + str);
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String prefix = "key_" + str;
                com.tencent.mm.modelavatar.d1.Ai().getClass();
                com.tencent.mm.modelavatar.a aVar2 = com.tencent.mm.modelavatar.z.f70577d;
                aVar2.getClass();
                kotlin.jvm.internal.o.g(prefix, "prefix");
                jt0.a aVar3 = aVar2.f70422a;
                aVar3.getClass();
                kk.j imp = aVar3.f321167b;
                kotlin.jvm.internal.o.f(imp, "imp");
                synchronized (imp) {
                    java.util.Iterator it = new java.util.ArrayList(aVar3.f321167b.keySet()).iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (str2 != null && r26.i0.y(str2, prefix, false)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarResource", "remove prefix: " + prefix + ", key: " + str2);
                            aVar3.f321167b.remove(str2);
                        }
                    }
                }
            }
            bVar2 = new hn1.b(hn1.u.f282491e, d18);
        }
        return bVar2;
    }
}
