package if0;

/* loaded from: classes9.dex */
public final class u implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ if0.w f291046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f291047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291049d;

    public u(if0.w wVar, r45.zs4 zs4Var, java.lang.String str, android.view.View view) {
        this.f291046a = wVar;
        this.f291047b = zs4Var;
        this.f291048c = str;
        this.f291049d = view;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (!z17 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f291046a.Ai(this.f291047b, this.f291048c, this.f291049d, bitmap);
    }
}
