package pv3;

/* loaded from: classes2.dex */
public final class a extends in5.p {
    @Override // in5.p
    public float a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.1f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            pv3.f fVar = pv3.f.f358589a;
            in5.c cVar = jVar.f293070a;
            rv3.h hVar = cVar instanceof rv3.h ? (rv3.h) cVar : null;
            if (hVar != null && (audioCacheInfo = hVar.f400395d) != null && (finderObject = audioCacheInfo.f155728y) != null) {
                com.tencent.mars.xlog.Log.i("MusicCacheManager", "[onVideoExposeEnd]");
                c50.x0 x0Var = pv3.f.f358594f;
                if (x0Var != null) {
                    long id6 = finderObject.getId();
                    pm0.v.u(id6);
                    es2.h0 h0Var = ((cs2.i) x0Var).f222073c;
                    h0Var.getClass();
                    h0Var.j("cancel", new es2.s(h0Var, id6, "itemExposeEnd"));
                }
            }
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlin.jvm.internal.o.g(item, "item");
        pv3.f fVar = pv3.f.f358589a;
        in5.c cVar = item.f293070a;
        rv3.h hVar = cVar instanceof rv3.h ? (rv3.h) cVar : null;
        if (hVar == null || (audioCacheInfo = hVar.f400395d) == null || (finderObject = audioCacheInfo.f155728y) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MusicCacheManager", "[onVideoExposeStart]");
        c50.x0 x0Var = pv3.f.f358594f;
        if (x0Var != null) {
            ((cs2.i) x0Var).e(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0)));
        }
    }
}
