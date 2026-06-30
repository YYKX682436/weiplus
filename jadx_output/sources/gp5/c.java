package gp5;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx3.i f274452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f274453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f274454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gp5.e f274456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vx3.i iVar, yz5.l lVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, gp5.e eVar) {
        super(1);
        this.f274452d = iVar;
        this.f274453e = lVar;
        this.f274454f = appCompatActivity;
        this.f274455g = str;
        this.f274456h = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.z2 dialog = (com.tencent.mm.ui.widget.dialog.z2) obj;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        if (this.f274452d.j()) {
            this.f274453e.invoke(new gp5.b(this.f274454f, this.f274455g, this.f274452d, dialog, this.f274456h));
        }
        return jz5.f0.f302826a;
    }
}
