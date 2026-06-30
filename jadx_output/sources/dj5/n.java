package dj5;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.r f233086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f233087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(dj5.r rVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f233086d = rVar;
        this.f233087e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f233086d.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new pi5.y(this.f233087e, stringExtra, false, 4, null);
    }
}
