package qo1;

/* loaded from: classes5.dex */
public final class c1 extends qo1.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f365456y = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f365457w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f365458x;

    public /* synthetic */ c1(com.tencent.wechat.aff.affroam.g gVar, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(gVar, (i17 & 2) != 0 ? kz5.p0.f313996d : list);
    }

    @Override // qo1.j0
    public boolean b() {
        boolean z17;
        synchronized (this.f365484j) {
            com.tencent.wechat.aff.affroam.n0 n0Var = this.f365485k;
            if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING) {
                z17 = n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_IMPORTING;
            }
        }
        return z17;
    }

    @Override // qo1.f0
    public java.lang.String n() {
        return this.f365458x;
    }

    @Override // qo1.f0
    public void s() {
        if (k()) {
            return;
        }
        this.f365490p = false;
        this.f365492r = this.f365475a;
        this.f365491q = new qo1.b1(this);
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.wechat.aff.affroam.g pkgInfo, java.util.List restoreConvList) {
        super(pkgInfo, com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_RESTORE);
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(restoreConvList, "restoreConvList");
        this.f365457w = restoreConvList;
        this.f365458x = "MicroMsg.RoamRestoreTask";
    }
}
