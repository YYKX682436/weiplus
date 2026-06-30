package rk2;

/* loaded from: classes3.dex */
public final class m implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f396463a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f396464b;

    /* renamed from: c, reason: collision with root package name */
    public float f396465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f396466d;

    public m(rk2.q qVar) {
        this.f396466d = qVar;
    }

    @Override // gc2.c
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MultiStreamWidget", "selectItemView onPageSelected position:" + i17);
        rk2.q qVar = this.f396466d;
        qVar.f396476g = false;
        qVar.getClass();
    }

    @Override // gc2.c
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        rk2.q qVar = this.f396466d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            qVar.f396479j = true;
            return;
        }
        this.f396463a = true;
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = qVar.f396474e;
        int w17 = finderLiveMultiStreamWidget$liveLayoutManager$1 != null ? finderLiveMultiStreamWidget$liveLayoutManager$1.w() : -1;
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$12 = qVar.f396474e;
        int y17 = finderLiveMultiStreamWidget$liveLayoutManager$12 != null ? finderLiveMultiStreamWidget$liveLayoutManager$12.y() : -1;
        if (qVar.f396476g) {
            com.tencent.mars.xlog.Log.i("MultiStreamWidget", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " lastPlayPos: " + qVar.f396475f);
            if (w17 != y17 || w17 == (i18 = qVar.f396475f)) {
                return;
            }
            rk2.q.b(qVar, i18);
        }
    }

    @Override // gc2.c
    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, float f17, int i18) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        rk2.q qVar = this.f396466d;
        if (i18 != 0) {
            boolean z17 = false;
            if (this.f396463a || java.lang.Math.abs(this.f396465c - f17) > 0.5f) {
                this.f396464b = f17 > 0.5f;
                this.f396463a = false;
            }
            this.f396465c = f17;
            boolean z18 = this.f396464b;
            if (z18) {
                f17 = 1 - f17;
            }
            int size = qVar.f396482m + (qVar.f396472c.size() * 1000);
            int c17 = qVar.c(z18 ? size - 1 : size + 1);
            java.lang.Float valueOf = java.lang.Float.valueOf(f17 * 2.0f);
            java.lang.Boolean bool2 = null;
            if (!(valueOf.floatValue() <= 1.0f)) {
                valueOf = null;
            }
            float floatValue = 1.0f - (valueOf != null ? valueOf.floatValue() : 1.0f);
            com.tencent.mm.plugin.finder.live.plugin.zz zzVar = (com.tencent.mm.plugin.finder.live.plugin.zz) qVar.f396470a;
            zzVar.getClass();
            ((mm2.h7) zzVar.P0(mm2.h7.class)).f329122q.postValue(java.lang.Float.valueOf(floatValue));
            int c18 = qVar.c(size);
            rk2.b bVar = qVar.f396473d;
            uk2.b x17 = bVar.x(c18);
            if (x17 != null) {
                r45.ka4 ka4Var = x17.f428522b.f379273d;
                bool = java.lang.Boolean.valueOf(ka4Var != null && ka4Var.V >= ka4Var.W);
            } else {
                bool = null;
            }
            uk2.b x18 = bVar.x(c17);
            if (x18 != null) {
                r45.ka4 ka4Var2 = x18.f428522b.f379273d;
                if (ka4Var2 != null && ka4Var2.V >= ka4Var2.W) {
                    z17 = true;
                }
                bool2 = java.lang.Boolean.valueOf(z17);
            }
            if (!kotlin.jvm.internal.o.b(bool, bool2) && !zzVar.x0()) {
                ((mm2.h7) zzVar.P0(mm2.h7.class)).f329121p.postValue(java.lang.Float.valueOf(floatValue));
            }
        }
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = qVar.f396474e;
        int w17 = finderLiveMultiStreamWidget$liveLayoutManager$1.w();
        int y17 = finderLiveMultiStreamWidget$liveLayoutManager$1.y();
        if (w17 != y17 && qVar.f396479j) {
            int i19 = qVar.f396477h;
            if (w17 < i19) {
                int i27 = qVar.f396478i;
                if (y17 < i27) {
                    rk2.q.b(qVar, i27);
                }
                qVar.f396475f = w17;
                rk2.q.a(qVar, w17);
            } else if (y17 > qVar.f396478i) {
                if (w17 > i19) {
                    rk2.q.b(qVar, i19);
                }
                qVar.f396475f = y17;
                rk2.q.a(qVar, y17);
            }
        }
        qVar.f396477h = w17;
        qVar.f396478i = y17;
    }
}
