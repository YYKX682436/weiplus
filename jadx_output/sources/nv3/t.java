package nv3;

/* loaded from: classes5.dex */
public final class t implements iv3.a {

    /* renamed from: o, reason: collision with root package name */
    public static final nv3.n f340702o = new nv3.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f340703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340704b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f340705c;

    /* renamed from: d, reason: collision with root package name */
    public final dv3.c f340706d;

    /* renamed from: e, reason: collision with root package name */
    public final ev3.d f340707e;

    /* renamed from: f, reason: collision with root package name */
    public final cv3.d f340708f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i0 f340709g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f340710h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f340711i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f340712j;

    /* renamed from: k, reason: collision with root package name */
    public final nv3.r f340713k;

    /* renamed from: l, reason: collision with root package name */
    public rv3.h f340714l;

    /* renamed from: m, reason: collision with root package name */
    public in5.s0 f340715m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f340716n;

    public t(android.content.Context context, int i17, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, dv3.c cVar, ev3.d dVar, cv3.d dVar2, com.tencent.mm.plugin.vlog.model.i0 scene, boolean z17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f340703a = context;
        this.f340704b = i17;
        this.f340705c = wxRecyclerView;
        this.f340706d = cVar;
        this.f340707e = dVar;
        this.f340708f = dVar2;
        this.f340709g = scene;
        this.f340710h = z17;
        this.f340711i = "MusicPickerFeedHelper#" + i17;
        this.f340712j = jz5.h.b(new nv3.p(this));
        nv3.r rVar = new nv3.r(this);
        this.f340713k = rVar;
        new nv3.o().b(wxRecyclerView);
        if (wxRecyclerView != null) {
            wxRecyclerView.O(rVar);
        }
        if (dVar != null) {
            dVar.c(i17, new nv3.m(this));
        }
    }

    @Override // iv3.a
    public void a(boolean z17, lv3.a musicData) {
        java.lang.Object obj;
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlin.jvm.internal.o.g(musicData, "musicData");
        long j17 = musicData.f321508a;
        dv3.c cVar = this.f340706d;
        if (cVar == null || (arrayList = cVar.I) == null) {
            obj = null;
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                in5.c cVar2 = (in5.c) obj2;
                rv3.h hVar = cVar2 instanceof rv3.h ? (rv3.h) cVar2 : null;
                boolean z18 = false;
                if (hVar != null && (audioCacheInfo2 = hVar.f400395d) != null && (finderObject = audioCacheInfo2.f155728y) != null && finderObject.getId() == j17) {
                    z18 = true;
                }
            }
            obj = (in5.c) obj2;
        }
        rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
        if (hVar2 == null) {
            return;
        }
        rv3.h hVar3 = this.f340714l;
        if (hVar3 == null || (audioCacheInfo = hVar3.f400395d) == null || (str = audioCacheInfo.a()) == null) {
            str = "";
        }
        java.lang.String a17 = hVar2.f400395d.a();
        com.tencent.mars.xlog.Log.i(this.f340711i, "[onFinishDownload] musicKey:" + a17 + " curSelectMusicKey:" + str + " feedId:" + pm0.v.u(j17) + " musicUrl:" + musicData.f321509b + " duration:" + musicData.f321510c);
        if (kotlin.jvm.internal.o.b(str, a17)) {
            pm0.v.X(new nv3.s(z17, this, hVar2, musicData));
        }
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        rv3.h hVar;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        int abs;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f340705c;
        if (!z17) {
            if (!(wxRecyclerView == null ? false : wxRecyclerView.getGlobalVisibleRect(new android.graphics.Rect()))) {
                return;
            }
        }
        if (this.f340710h) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView != null ? wxRecyclerView.getLayoutManager() : null;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            int height = (wxRecyclerView != null ? wxRecyclerView.getHeight() : 0) / 2;
            int i17 = -1;
            if (w17 <= y17) {
                int i18 = Integer.MAX_VALUE;
                int i19 = w17;
                while (true) {
                    androidx.recyclerview.widget.k3 p07 = wxRecyclerView != null ? wxRecyclerView.p0(i19) : null;
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null && (abs = java.lang.Math.abs((s0Var.itemView.getTop() + (s0Var.itemView.getHeight() / 2)) - height)) < i18) {
                        i17 = i19;
                        i18 = abs;
                    }
                    if (i19 == y17) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(this.f340711i, "[autoPlayVisibleVideo] firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " closestItemPos:" + i17);
            if (i17 >= 0) {
                androidx.recyclerview.widget.k3 p08 = wxRecyclerView != null ? wxRecyclerView.p0(i17) : null;
                in5.s0 s0Var2 = p08 instanceof in5.s0 ? (in5.s0) p08 : null;
                if (s0Var2 != null) {
                    in5.s0 s0Var3 = this.f340715m;
                    long id6 = (s0Var3 == null || (hVar = (rv3.h) s0Var3.f293125i) == null || (audioCacheInfo3 = hVar.f400395d) == null || (finderObject3 = audioCacheInfo3.f155728y) == null) ? 0L : finderObject3.getId();
                    rv3.h hVar2 = (rv3.h) s0Var2.f293125i;
                    java.lang.Long valueOf = (hVar2 == null || (audioCacheInfo2 = hVar2.f400395d) == null || (finderObject2 = audioCacheInfo2.f155728y) == null) ? null : java.lang.Long.valueOf(finderObject2.getId());
                    if (valueOf == null || id6 != valueOf.longValue()) {
                        f("autoPlayVisibleVideo");
                    }
                    this.f340715m = s0Var2;
                    ev3.d dVar = this.f340707e;
                    if (dVar != null) {
                        dVar.a();
                    }
                    pv3.m mVar = (pv3.m) ((jz5.n) this.f340712j).getValue();
                    mVar.getClass();
                    rv3.h hVar3 = (rv3.h) s0Var2.f293125i;
                    if (hVar3 != null && (audioCacheInfo = hVar3.f400395d) != null && (finderObject = audioCacheInfo.f155728y) != null) {
                        long id7 = finderObject.getId();
                        nv3.l lVar = (nv3.l) ((jz5.n) mVar.f358618e).getValue();
                        if (lVar != null) {
                            lVar.b(id7);
                        }
                        kotlinx.coroutines.r2 r2Var = mVar.f358617d;
                        if (r2Var != null) {
                            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                        }
                        mVar.f358617d = kotlinx.coroutines.l.d(mVar.f358616c, null, null, new pv3.l(s0Var2, id7, mVar, finderObject, audioCacheInfo, null), 3, null);
                    }
                    this.f340716n = true;
                }
            }
        }
    }

    public final void c(rv3.h item, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = item.f400395d;
        audioCacheInfo2.f155726w = i17;
        java.lang.String a17 = audioCacheInfo2.a();
        g(this.f340714l, rv3.z.f400420d);
        rv3.h hVar = this.f340714l;
        if (hVar == null || (audioCacheInfo = hVar.f400395d) == null || (str = audioCacheInfo.a()) == null) {
            str = "";
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, a17);
        ev3.d dVar = this.f340707e;
        java.lang.String str2 = this.f340711i;
        if (b17) {
            rv3.h hVar2 = this.f340714l;
            if (hVar2 != null) {
                com.tencent.mars.xlog.Log.i(str2, "[unSelectMusic] musicKey:" + hVar2.f400395d.a());
                if (dVar != null) {
                    dVar.g();
                }
            }
            this.f340714l = null;
        } else {
            this.f340714l = item;
            com.tencent.mars.xlog.Log.i(str2, "[selectMusic] musicKey:" + item.f400395d.a());
            if (dVar != null) {
                ev3.d.e(dVar, this.f340704b, item.f400395d, true, true, false, 16, null);
            }
            g(item, rv3.z.f400422f);
            pv3.f.f358589a.b(audioCacheInfo2, this);
        }
        com.tencent.mars.xlog.Log.i(str2, "onMusicItemClick: position=" + i17 + " feedMusicKey=" + a17 + " enablePlay=" + audioCacheInfo2.B);
    }

    public final void d() {
        java.util.List list;
        f("onDeactivate");
        java.util.Collection<dn.m> values = pv3.f.f358592d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (dn.m mVar : values) {
            pv3.f fVar = pv3.f.f358589a;
            c50.y0 y0Var = (c50.y0) ((jz5.n) pv3.f.f358591c).getValue();
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            ((mn2.q0) y0Var).c(field_mediaId);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f340705c;
        if (wxRecyclerView != null && (list = wxRecyclerView.H) != null) {
            ((java.util.ArrayList) list).remove(this.f340713k);
        }
        this.f340715m = null;
    }

    public final void e(java.lang.String musicKey) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        java.lang.String a17;
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        rv3.h hVar = this.f340714l;
        if (hVar == null || (audioCacheInfo = hVar.f400395d) == null || (a17 = audioCacheInfo.a()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f340711i, "[onUnSelectMusic] musicKey:" + musicKey + " curMusicKey:" + a17);
        if (kotlin.jvm.internal.o.b(musicKey, a17)) {
            g(this.f340714l, rv3.z.f400420d);
            this.f340714l = null;
        }
    }

    public final void f(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f340711i, "[stopCurrentVideo] source:".concat(source));
        ((pv3.m) ((jz5.n) this.f340712j).getValue()).c(this.f340715m);
        this.f340716n = false;
    }

    public final void g(rv3.h hVar, rv3.z useStatus) {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        if (hVar == null || (audioCacheInfo = hVar.f400395d) == null || (str = audioCacheInfo.a()) == null) {
            str = "";
        }
        dv3.c cVar = this.f340706d;
        if (cVar != null) {
            kotlin.jvm.internal.o.g(useStatus, "useStatus");
            int K0 = cVar.K0(str);
            cVar.N0();
            useStatus.toString();
            if (K0 >= 0) {
                java.lang.Object obj = cVar.I.get(K0);
                rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
                if (hVar2 != null) {
                    hVar2.f400399h = useStatus;
                }
                cVar.notifyItemChanged(K0, new jz5.l(rv3.f.f400389d, useStatus));
            }
        }
    }
}
