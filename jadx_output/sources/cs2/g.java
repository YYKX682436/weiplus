package cs2;

/* loaded from: classes2.dex */
public final class g implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.i f222069a;

    public g(cs2.i iVar) {
        this.f222069a = iVar;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        cs2.i.a(this.f222069a, i17, i18);
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        cs2.i.a(this.f222069a, i18, i19);
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(task, "task");
        cs2.i.a(this.f222069a, i17, i18);
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        cs2.i iVar = this.f222069a;
        if (iVar.f222075e) {
            return;
        }
        android.content.Context context = iVar.f222071a;
        jz5.f0 f0Var = null;
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null) {
            com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "onPreloadStart loading:" + i17 + " waiting:" + i18);
            android.app.Activity parentActivity = vASActivity.getParentActivity();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = parentActivity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) parentActivity : null;
            if (appCompatActivity != null) {
                if (appCompatActivity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                    pf5.z zVar = pf5.z.f353948a;
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
                    kotlin.jvm.internal.o.g(fragment, "fragment");
                    androidx.lifecycle.c1 a17 = zVar.b(fragment).a(cs2.k.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    ((cs2.k) a17).R6();
                } else {
                    androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(appCompatActivity).a(cs2.k.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    ((cs2.k) a18).R6();
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(vASActivity).a(cs2.k.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                ((cs2.k) a19).R6();
            }
            iVar.f222075e = true;
        }
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }
}
