package yt2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f465291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yt2.g f465292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, yt2.g gVar) {
        super(0);
        this.f465291d = context;
        this.f465292e = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return android.view.LayoutInflater.from(this.f465291d).inflate(com.tencent.mm.R.layout.f488691e42, this.f465292e.f465296a, false);
    }
}
