package if0;

/* loaded from: classes9.dex */
public final class t implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ if0.w f291043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f291045c;

    public t(if0.w wVar, android.view.View view, r45.zs4 zs4Var) {
        this.f291043a = wVar;
        this.f291044b = view;
        this.f291045c = zs4Var;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        r45.zs4 zs4Var = this.f291045c;
        android.view.View view2 = this.f291044b;
        if0.w wVar = this.f291043a;
        if (bitmap != null && !bitmap.isRecycled()) {
            wVar.Ai(zs4Var, str, view2, bitmap);
        } else {
            wVar.getClass();
            pm0.v.X(new if0.s(view2, zs4Var, wVar));
        }
    }
}
