package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class z implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175119d;

    public z(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175119d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invoke() called with: result = [" + aVar + "]");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null && (jbVar = aVar.f105329c) != null && jbVar.f1()) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = this.f175119d.f174986d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.topstory.ui.home.d1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d1.class)).getClass();
            wn2.f fVar = (wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class));
            fVar.getClass();
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = fVar.f447522f;
            if (i0Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify reddot tipId=");
                sb6.append(jbVar.field_tipsId);
                sb6.append(" type=");
                r45.vs2 vs2Var = jbVar.field_ctrInfo;
                sb6.append(vs2Var != null ? java.lang.Integer.valueOf(vs2Var.f388487e) : null);
                sb6.append(" isShow=");
                sb6.append(aVar.f105327a);
                sb6.append(" path=");
                r45.f03 f03Var = aVar.f105328b;
                sb6.append(f03Var != null ? f03Var.f373892i : null);
                sb6.append(" showType=");
                sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null);
                sb6.append(" title=");
                sb6.append(f03Var != null ? f03Var.f373889f : null);
                sb6.append(" path:");
                sb6.append(aVar.f105331e);
                sb6.append(" count:");
                sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373888e) : null);
                com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", sb6.toString());
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = i0Var.f120939h;
                if (jVar != null) {
                    jVar.b(aVar);
                }
            }
        }
        return f0Var;
    }
}
