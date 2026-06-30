package vf5;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f436409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f436409d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f436409d;
        java.lang.String stringExtra = appCompatActivity.getIntent().getStringExtra("titile");
        return java.lang.Boolean.valueOf((stringExtra != null) && stringExtra.equals(appCompatActivity.getString(com.tencent.mm.R.string.ix6)));
    }
}
