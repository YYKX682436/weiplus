package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class w0 implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175094d;

    public w0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175094d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r1 != 20001) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(oa.i r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.home.w0.h0(oa.i):void");
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175094d;
        for (wm4.y yVar : jVar.f174999q) {
            if (yVar.f447329m.equals(iVar)) {
                jVar.K = yVar.f447318b;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tab unselected, " + yVar.f447317a);
                yVar.f447331o.setTextColor(jVar.f174986d.getResources().getColor(com.tencent.mm.R.color.a9_));
                if (pm4.w.k(yVar.f447318b)) {
                    com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = jVar.f174986d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((com.tencent.mm.plugin.topstory.ui.home.d1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d1.class)).getClass();
                    com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).f447522f;
                    if (i0Var != null) {
                        i0Var.f120943o = false;
                        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "unselect");
                        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar2 = i0Var.f120939h;
                        if (jVar2 != null) {
                            jVar2.c();
                        }
                        vn2.q qVar = i0Var.f120942n;
                        if (qVar != null) {
                            qVar.c();
                        }
                        vn2.q qVar2 = i0Var.f120942n;
                        if (qVar2 != null) {
                            qVar2.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        this.f175094d.v(iVar, false);
    }
}
