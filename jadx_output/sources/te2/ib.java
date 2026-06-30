package te2;

/* loaded from: classes3.dex */
public final class ib extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f418121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(androidx.appcompat.app.AppCompatActivity appCompatActivity, te2.hc hcVar) {
        super(0);
        this.f418121d = appCompatActivity;
        this.f418122e = hcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f418121d.findViewById(com.tencent.mm.R.id.tmt);
        kotlin.jvm.internal.o.d(findViewById);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setOnClickListener(new te2.hb(this.f418122e));
        return textView;
    }
}
