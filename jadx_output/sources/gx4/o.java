package gx4;

/* loaded from: classes8.dex */
public class o implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f277425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f277427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f277428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx4.t f277429f;

    public o(gx4.t tVar, java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f277429f = tVar;
        this.f277424a = str;
        this.f277425b = i17;
        this.f277426c = str2;
        this.f277427d = bundle;
        this.f277428e = z17;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f277429f.l(this.f277424a, this.f277425b, this.f277426c, this.f277427d, this.f277428e);
        this.f277429f.o(false);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
