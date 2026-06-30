package x51;

/* loaded from: classes5.dex */
public class g0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452009e;

    public g0(android.content.Context context, java.lang.String str) {
        this.f452008d = context;
        this.f452009e = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return com.tencent.mm.platformtools.ExportFileUtil.g(this.f452008d, this.f452009e, null, null);
    }
}
