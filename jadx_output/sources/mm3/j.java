package mm3;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f329645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.ss4 ss4Var, mm3.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329645e = ss4Var;
        this.f329646f = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm3.j(this.f329645e, this.f329646f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.hf2 hf2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329644d;
        mm3.n nVar = this.f329646f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            mm3.i iVar = new mm3.i(nVar, null);
            this.f329644d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List tracks = (java.util.List) obj;
        r45.ef2 ef2Var = (r45.ef2) this.f329645e.getCustom(5);
        java.lang.Long l17 = (ef2Var == null || (hf2Var = (r45.hf2) ef2Var.getCustom(1)) == null) ? null : new java.lang.Long(hf2Var.getInteger(14));
        if (l17 == null) {
            throw new java.lang.IllegalStateException("Couldn't get the duration of song".toString());
        }
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = nVar.f329653d;
        if (mvTracksEditView == null) {
            kotlin.jvm.internal.o.o("tracksEditView");
            throw null;
        }
        long longValue = l17.longValue();
        kotlin.jvm.internal.o.g(tracks, "tracks");
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "update: " + tracks.size() + " tracks, songDuration=" + longValue + ", thumbDuration=" + (mvTracksEditView.f152013f / mvTracksEditView.getWidthPerMills()));
        mvTracksEditView.f152017m = tracks;
        mvTracksEditView.f152028x = longValue;
        mvTracksEditView.f152025u.f409858n = longValue;
        mvTracksEditView.b();
        mvTracksEditView.f152024t.a(mvTracksEditView.f152029y);
        mvTracksEditView.e();
        mvTracksEditView.f152027w.f409831p.clear();
        mvTracksEditView.f152012e.setVisibility(0);
        mvTracksEditView.f152011d.D0();
        mvTracksEditView.f152014g.notifyDataSetChanged();
        int i18 = 0;
        for (java.lang.Object obj2 : tracks) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView2 = nVar.f329653d;
            if (mvTracksEditView2 == null) {
                kotlin.jvm.internal.o.o("tracksEditView");
                throw null;
            }
            java.util.LinkedList linkedList = nVar.f329657h;
            if (linkedList == null) {
                kotlin.jvm.internal.o.o("trackList");
                throw null;
            }
            java.lang.String string = ((r45.jf2) linkedList.get(i18)).getString(10);
            mvTracksEditView2.c(i18, !(string == null || string.length() == 0));
            i18 = i19;
        }
        return jz5.f0.f302826a;
    }
}
