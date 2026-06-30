package mm3;

/* loaded from: classes10.dex */
public final class h implements sm3.u {

    /* renamed from: a, reason: collision with root package name */
    public int f329633a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f329634b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f329635c;

    /* renamed from: d, reason: collision with root package name */
    public int f329636d;

    /* renamed from: e, reason: collision with root package name */
    public long f329637e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f329638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f329639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f329641i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f329642j;

    public h(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, mm3.n nVar, kotlin.jvm.internal.c0 c0Var, android.widget.TextView textView) {
        this.f329639g = h6Var;
        this.f329640h = nVar;
        this.f329641i = c0Var;
        this.f329642j = textView;
    }

    public boolean a(float f17, sm3.v type, int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        kotlin.jvm.internal.c0 c0Var = this.f329641i;
        mm3.n nVar = this.f329640h;
        if (ordinal == 0) {
            android.view.ViewGroup viewGroup = nVar.f329656g;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("deleteItemContainer");
                throw null;
            }
            float top = viewGroup.getTop();
            android.widget.TextView textView = this.f329642j;
            if (f17 >= top) {
                c0Var.f310112d = true;
                textView.setText(i65.a.r(nVar.getActivity(), com.tencent.mm.R.string.h5e));
            } else {
                c0Var.f310112d = false;
                textView.setText(i65.a.r(nVar.getActivity(), com.tencent.mm.R.string.h5d));
            }
        } else if (ordinal == 1) {
            android.view.ViewGroup viewGroup2 = nVar.f329656g;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("deleteItemContainer");
                throw null;
            }
            viewGroup2.setVisibility(8);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("size：");
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = nVar.f329653d;
            if (mvTracksEditView == null) {
                kotlin.jvm.internal.o.o("tracksEditView");
                throw null;
            }
            sb6.append(mvTracksEditView.getTracks().size());
            sb6.append("， index: ");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
            if (c0Var.f310112d) {
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView2 = nVar.f329653d;
                if (mvTracksEditView2 == null) {
                    kotlin.jvm.internal.o.o("tracksEditView");
                    throw null;
                }
                if (mvTracksEditView2.getTracks().size() != 1) {
                    com.tencent.mm.plugin.mv.ui.uic.h6 h6Var = this.f329639g;
                    if (i17 == -1) {
                        h6Var.getClass();
                    } else {
                        java.util.LinkedList linkedList = h6Var.f151185m;
                        linkedList.remove(i17);
                        h6Var.S6(((jk4.f) linkedList.getLast()).f234478o);
                        pk4.c cVar = h6Var.f151186n;
                        if (cVar != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : linkedList) {
                                if (((jk4.f) obj).f234478o > 0) {
                                    arrayList.add(obj);
                                }
                            }
                            cVar.setMediaList(arrayList);
                        }
                        pk4.c cVar2 = h6Var.f151186n;
                        if (cVar2 != null) {
                            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).f();
                        }
                    }
                    java.util.LinkedList linkedList2 = nVar.f329657h;
                    if (linkedList2 == null) {
                        kotlin.jvm.internal.o.o("trackList");
                        throw null;
                    }
                    linkedList2.remove(i17);
                    if (nVar.f329657h == null) {
                        kotlin.jvm.internal.o.o("trackList");
                        throw null;
                    }
                    nVar.P6(((r45.jf2) r13.getLast()).getInteger(1));
                    nVar.f329659m = true;
                    h6Var.T6(0L);
                    kl3.t.g().a().c(0);
                    com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView3 = nVar.f329653d;
                    if (mvTracksEditView3 != null) {
                        mvTracksEditView3.c(i17, false);
                        return true;
                    }
                    kotlin.jvm.internal.o.o("tracksEditView");
                    throw null;
                }
                db5.t7.f(nVar.getActivity(), i65.a.r(nVar.getActivity(), com.tencent.mm.R.string.h57), mm3.c.f329611a);
            }
        }
        android.view.ViewGroup viewGroup3 = nVar.f329656g;
        if (viewGroup3 != null) {
            viewGroup3.getTop();
            return false;
        }
        kotlin.jvm.internal.o.o("deleteItemContainer");
        throw null;
    }

    public final void b(int i17, long j17) {
        this.f329636d = i17;
        this.f329637e = j17;
        kotlinx.coroutines.r2 r2Var = this.f329638f;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f329638f = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new mm3.g(this.f329639g, this, null), 2, null);
    }
}
