package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class nx implements x91.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135370a;

    public nx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135370a = sxVar;
    }

    @Override // x91.i
    public void a(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onStop device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        if (kotlin.jvm.internal.o.b(hVar, sxVar.f135941w)) {
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.mx(sxVar));
        }
    }

    @Override // x91.i
    public void b(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onPause device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        kotlin.jvm.internal.o.b(hVar, sxVar.f135941w);
    }

    @Override // x91.i
    public void c(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onProgress progress=");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        kotlin.jvm.internal.o.b(hVar, sxVar.f135941w);
    }

    @Override // x91.i
    public void d(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onVolume vol=");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        kotlin.jvm.internal.o.b(hVar, sxVar.f135941w);
    }

    @Override // x91.i
    public void e(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onPlay device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        kotlin.jvm.internal.o.b(hVar, sxVar.f135941w);
    }

    @Override // x91.i
    public void f(x91.h hVar, boolean z17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subEventListener: onMute mute=");
        sb6.append(z17);
        sb6.append(" device[");
        java.lang.String str = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] selectedDevice[");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135370a;
        x91.h hVar2 = sxVar.f135941w;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str = cVar.f452641i;
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        kotlin.jvm.internal.o.b(hVar, sxVar.f135941w);
    }
}
