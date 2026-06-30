package wm3;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm3.j f447269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f447270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wm3.j jVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f447269d = jVar;
        this.f447270e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.widget.LinearLayout) com.tencent.mm.ui.id.b(this.f447270e).inflate(com.tencent.mm.R.layout.a1x, (android.view.ViewGroup) this.f447269d.findViewById(com.tencent.mm.R.id.jlt)).findViewById(com.tencent.mm.R.id.g9_);
    }
}
