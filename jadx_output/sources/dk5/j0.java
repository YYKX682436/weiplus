package dk5;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f234682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f234683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.ui.widget.dialog.u3 u3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, java.util.List list) {
        super(0);
        this.f234682d = u3Var;
        this.f234683e = appCompatActivity;
        this.f234684f = i17;
        this.f234685g = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f234682d.setMessage(this.f234683e.getString(com.tencent.mm.R.string.oa6, java.lang.Integer.valueOf(this.f234684f + 1), java.lang.Integer.valueOf(this.f234685g.size())));
        return jz5.f0.f302826a;
    }
}
