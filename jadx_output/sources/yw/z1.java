package yw;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f466519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f466519d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.vfs.w6.j(str)) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = (android.content.Context) this.f466519d.get();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str, context, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSaveImg file not exist:" + str);
        }
        return jz5.f0.f302826a;
    }
}
