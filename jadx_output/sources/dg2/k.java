package dg2;

/* loaded from: classes2.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg2.m f232302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f232303e;

    public k(dg2.m mVar, kotlin.jvm.internal.c0 c0Var) {
        this.f232302d = mVar;
        this.f232303e = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        yz5.l lVar = this.f232302d.f232310e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(this.f232303e.f310112d));
        }
    }
}
