package x51;

/* loaded from: classes10.dex */
public class e0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451992e;

    public e0(android.content.Context context, java.lang.String str) {
        this.f451991d = context;
        this.f451992e = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return com.tencent.mm.platformtools.ExportFileUtil.b(this.f451991d, this.f451992e, null);
    }
}
