package qy0;

/* loaded from: classes5.dex */
public final class w implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f367657e;

    public w(qy0.d0 d0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f367656d = d0Var;
        this.f367657e = c0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onPreview: recommend end");
        qy0.d0 d0Var = this.f367656d;
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = d0Var.f367583y;
        kotlin.jvm.internal.o.d(list);
        m7Var.d(list);
        kotlin.jvm.internal.c0 c0Var = this.f367657e;
        if (c0Var.f310112d) {
            qy0.d0.U6(d0Var);
            c0Var.f310112d = false;
        }
    }
}
