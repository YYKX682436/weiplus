package qe2;

/* loaded from: classes4.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f362057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f362059c;

    public i(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.content.Context context, java.util.List list) {
        this.f362057a = f4Var;
        this.f362058b = context;
        this.f362059c = list;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List list = this.f362059c;
        pm0.v.X(new qe2.h(this.f362057a, this.f362058b, (com.tencent.mm.modelbase.f) obj, list));
        return jz5.f0.f302826a;
    }
}
