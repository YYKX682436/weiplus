package du3;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f243576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout f243577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout improveBaseEditPhotoLayout) {
        super(0);
        this.f243576d = context;
        this.f243577e = improveBaseEditPhotoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f243576d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(((androidx.appcompat.app.AppCompatActivity) context).getViewModel(), new hk0.a0(this.f243577e)).a(hk0.u0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (hk0.u0) a17;
    }
}
