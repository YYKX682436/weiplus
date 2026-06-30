package x51;

/* loaded from: classes12.dex */
public class u implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452089f;

    public u(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f452087d = context;
        this.f452088e = str;
        this.f452089f = str2;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return com.tencent.mm.platformtools.ExportFileUtil.d(this.f452087d, this.f452088e, this.f452089f);
    }
}
