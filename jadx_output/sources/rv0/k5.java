package rv0;

/* loaded from: classes5.dex */
public final class k5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f400085d;

    /* renamed from: e, reason: collision with root package name */
    public final ex0.a0 f400086e;

    /* renamed from: f, reason: collision with root package name */
    public final bx0.h f400087f;

    /* renamed from: g, reason: collision with root package name */
    public final dx0.n f400088g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f400089h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f400090i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f400091m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f400092n;

    /* renamed from: o, reason: collision with root package name */
    public rv0.g5 f400093o;

    public k5(android.content.Context context, ex0.a0 timelineVM, bx0.h timelineCalc, dx0.n thumbnailProviderManager) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(timelineCalc, "timelineCalc");
        kotlin.jvm.internal.o.g(thumbnailProviderManager, "thumbnailProviderManager");
        this.f400085d = context;
        this.f400086e = timelineVM;
        this.f400087f = timelineCalc;
        this.f400088g = thumbnailProviderManager;
        this.f400089h = jz5.h.b(new rv0.i5(this));
        this.f400090i = jz5.h.b(new rv0.j5(this));
        this.f400091m = jz5.h.b(new rv0.h5(this));
        this.f400092n = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f400092n.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        rv0.f5 holder = (rv0.f5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f400092n.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        yv0.p pVar = (yv0.p) obj;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.view.ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        android.graphics.Rect rect = pVar.f465989e;
        layoutParams.width = rect.width();
        layoutParams.height = rect.height();
        itemView.setLayoutParams(layoutParams);
        holder.f400002e.getClass();
        ug.m mVar = pVar.f465986b;
        java.util.Objects.toString(mVar);
        java.util.Objects.toString(pVar.f465985a);
        if (mVar == ug.m.Transition) {
            return;
        }
        com.tencent.maas.base.MJID mjid = pVar.f465985a;
        holder.f400003f = mjid;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer timelineAdapterInnerContainer = holder.f400002e;
        rv0.k5 k5Var = holder.f400004g;
        ex0.a0 a0Var = k5Var.f400086e;
        bx0.h hVar = k5Var.f400087f;
        dx0.n nVar = holder.f400001d;
        timelineAdapterInnerContainer.a(nVar, mjid, a0Var, hVar, nVar.b(), mVar == ug.m.ImageClip);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dfh, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new rv0.f5(this, inflate, this.f400088g);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        rv0.f5 holder = (rv0.f5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        com.tencent.maas.base.MJID mjid = holder.f400003f;
        if (mjid != null) {
            holder.f400001d.a(mjid);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer timelineAdapterInnerContainer = holder.f400002e;
        if (timelineAdapterInnerContainer.f69292h) {
            timelineAdapterInnerContainer.f69292h = false;
        }
    }

    public final void x(com.tencent.maas.base.MJID segmentID, com.tencent.maas.model.time.MJTime mJTime) {
        float intValue;
        com.tencent.maas.model.time.MJTime mJTime2;
        com.tencent.maas.model.time.MJTime ZeroTime;
        com.tencent.maas.model.time.MJTime duration;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.ArrayList arrayList = this.f400092n;
        arrayList.clear();
        bx0.h hVar = this.f400087f;
        hVar.a();
        ex0.a0 a0Var = this.f400086e;
        ex0.r K = a0Var.K(segmentID);
        if (K == null) {
            return;
        }
        ug.m mVar = ug.m.ImageClip;
        ug.m mVar2 = K.f257169c;
        jz5.g gVar = this.f400091m;
        if (mVar2 != mVar) {
            com.tencent.maas.model.time.MJTimeRange m17 = K.m();
            if (m17 == null || (duration = m17.getDuration()) == null) {
                return;
            } else {
                intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() / ((float) duration.toSeconds());
            }
        } else {
            intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() / ((float) K.j().toSeconds());
        }
        androidx.lifecycle.j0 j0Var = a0Var.f257113w;
        if (!kotlin.jvm.internal.o.a((java.lang.Float) j0Var.getValue(), intValue)) {
            j0Var.setValue(java.lang.Float.valueOf(intValue));
        }
        hVar.a();
        hVar.f36277d.b();
        ug.m mVar3 = K.f257169c;
        com.tencent.maas.base.MJID mjid = K.f257168b;
        arrayList.add(new yv0.p(mjid, mVar3, hVar.b(mjid, false), true, true));
        notifyDataSetChanged();
        rv0.g5 g5Var = this.f400093o;
        if (g5Var != null) {
            if (mJTime == null) {
                mJTime = K.k();
            }
            ex0.r K2 = a0Var.K(segmentID);
            if (K2 == null) {
                ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            } else if (K2.l().containsTime(mJTime)) {
                com.tencent.maas.model.time.MJTimeRange m18 = K2.m();
                if (m18 == null || (mJTime2 = m18.getStartTime()) == null) {
                    mJTime2 = com.tencent.maas.model.time.MJTime.ZeroTime;
                }
                ZeroTime = mJTime2.add(mJTime.sub(K2.k()));
                kotlin.jvm.internal.o.f(ZeroTime, "add(...)");
            } else {
                ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            }
            g5Var.a(ZeroTime, K.f257167a);
        }
    }
}
