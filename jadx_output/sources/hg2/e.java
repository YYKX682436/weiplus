package hg2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f281343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f281346h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, hg2.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f281342d = bitmap;
        this.f281343e = imageView;
        this.f281344f = hVar;
        this.f281345g = str;
        this.f281346h = continuation;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f281342d;
        if (bitmap != null) {
            this.f281343e.setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i(this.f281344f.f281352m, this.f281345g + " resource is null");
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        this.f281346h.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
