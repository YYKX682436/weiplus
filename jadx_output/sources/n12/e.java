package n12;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n12.a f334072a;

    public e(n12.a aVar) {
        this.f334072a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n12.e.a(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    public final java.lang.Object b(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, kotlin.coroutines.Continuation continuation) {
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoji-editor");
        if (!com.tencent.mm.vfs.w6.j(c17)) {
            com.tencent.mm.vfs.w6.u(c17);
        }
        java.lang.String str = c17 + '/' + com.tencent.mm.sdk.platformtools.w2.a(finderMedia.getUrl());
        if (com.tencent.mm.vfs.w6.j(str)) {
            return str;
        }
        java.util.LinkedList<r45.vf2> spec = finderMedia.getSpec();
        kotlin.jvm.internal.o.f(spec, "getSpec(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = spec.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((r45.vf2) next).getInteger(2) * 8) * 1024 < 1000000) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            java.util.LinkedList<r45.vf2> spec2 = finderMedia.getSpec();
            kotlin.jvm.internal.o.f(spec2, "getSpec(...)");
            java.util.Iterator it6 = spec2.iterator();
            if (it6.hasNext()) {
                ?? next2 = it6.next();
                if (it6.hasNext()) {
                    int integer = ((r45.vf2) next2).getInteger(2);
                    do {
                        java.lang.Object next3 = it6.next();
                        int integer2 = ((r45.vf2) next3).getInteger(2);
                        next2 = next2;
                        if (integer > integer2) {
                            next2 = next3;
                            integer = integer2;
                        }
                    } while (it6.hasNext());
                }
                vf2Var2 = next2;
            } else {
                vf2Var2 = null;
            }
            vf2Var = vf2Var2;
        } else {
            java.util.Iterator it7 = arrayList.iterator();
            if (!it7.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object next4 = it7.next();
            if (it7.hasNext()) {
                int integer3 = ((r45.vf2) next4).getInteger(2);
                do {
                    java.lang.Object next5 = it7.next();
                    int integer4 = ((r45.vf2) next5).getInteger(2);
                    if (integer3 < integer4) {
                        next4 = next5;
                        integer3 = integer4;
                    }
                } while (it7.hasNext());
            }
            vf2Var = (r45.vf2) next4;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.String str2 = str + ".tmp";
        com.tencent.mm.vfs.w6.e(str2);
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a("emoji_editor-finder-" + finderMedia.getUrl());
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_VideoPreloadWorker";
        oVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.a(finderMedia.getUrl());
        oVar.M1 = finderMedia.getUrl() + finderMedia.getUrl_token();
        oVar.field_fullpath = str2;
        oVar.Y1 = finderMedia.getDecodeKey();
        oVar.f241798q = finderMedia.getHot_flag() == 1;
        oVar.Y = 0;
        oVar.H1 = 0;
        oVar.Z = 8;
        oVar.V1 = 100;
        oVar.X = 0L;
        oVar.f241809y0 = zy2.u.f477581a;
        oVar.f241806x0 = 1;
        oVar.field_fileType = 20302;
        oVar.field_requestVideoFormat = 0;
        oVar.Z1 = true;
        oVar.f241813a2 = true;
        if (vf2Var != null) {
            oVar.X1 = vf2Var.getString(0);
        }
        oVar.f241815c2 = new n12.d(this, str2, str, rVar);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().e(oVar, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "start downloading, path: " + str + ", url: " + finderMedia.getUrl() + finderMedia.getUrl_token());
        rVar.m(new n12.c(a17, str2));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
